package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.googleapis.AnonAdsAppearOn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCustomChannel extends js.Object {
  /**
    * Code of this custom channel, not necessarily unique across ad clients.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Unique identifier of this custom channel. This should be considered an
    * opaque identifier; it is not safe to rely on it being in any particular
    * format.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is, in this case adsense#customChannel.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this custom channel.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The targeting information of this custom channel, if activated.
    */
  var targetingInfo: js.UndefOr[AnonAdsAppearOn] = js.native
}

object SchemaCustomChannel {
  @scala.inline
  def apply(
    code: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    targetingInfo: AnonAdsAppearOn = null
  ): SchemaCustomChannel = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (targetingInfo != null) __obj.updateDynamic("targetingInfo")(targetingInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomChannel]
  }
}

