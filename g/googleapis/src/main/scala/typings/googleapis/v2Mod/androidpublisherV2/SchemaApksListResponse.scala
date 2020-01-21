package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaApksListResponse extends js.Object {
  var apks: js.UndefOr[js.Array[SchemaApk]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#apksListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaApksListResponse {
  @scala.inline
  def apply(apks: js.Array[SchemaApk] = null, kind: String = null): SchemaApksListResponse = {
    val __obj = js.Dynamic.literal()
    if (apks != null) __obj.updateDynamic("apks")(apks.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApksListResponse]
  }
}

