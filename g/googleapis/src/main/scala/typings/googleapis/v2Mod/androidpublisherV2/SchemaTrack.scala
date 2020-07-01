package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTrack extends js.Object {
  /**
    * Identifier for this track.
    */
  var track: js.UndefOr[String] = js.native
  var userFraction: js.UndefOr[Double] = js.native
  /**
    * Version codes to make active on this track. Note that this list should
    * contain all versions you wish to be active, including those you wish to
    * retain from previous releases.
    */
  var versionCodes: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaTrack {
  @scala.inline
  def apply(
    track: String = null,
    userFraction: js.UndefOr[Double] = js.undefined,
    versionCodes: js.Array[Double] = null
  ): SchemaTrack = {
    val __obj = js.Dynamic.literal()
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    if (!js.isUndefined(userFraction)) __obj.updateDynamic("userFraction")(userFraction.get.asInstanceOf[js.Any])
    if (versionCodes != null) __obj.updateDynamic("versionCodes")(versionCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTrack]
  }
}

