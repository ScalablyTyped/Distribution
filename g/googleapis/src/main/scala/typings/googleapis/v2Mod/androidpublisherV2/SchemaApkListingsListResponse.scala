package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaApkListingsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#apkListingsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var listings: js.UndefOr[js.Array[SchemaApkListing]] = js.native
}

object SchemaApkListingsListResponse {
  @scala.inline
  def apply(kind: String = null, listings: js.Array[SchemaApkListing] = null): SchemaApkListingsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (listings != null) __obj.updateDynamic("listings")(listings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApkListingsListResponse]
  }
}

