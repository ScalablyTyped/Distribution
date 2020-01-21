package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaApksAddExternallyHostedRequest extends js.Object {
  /**
    * The definition of the externally-hosted APK and where it is located.
    */
  var externallyHostedApk: js.UndefOr[SchemaExternallyHostedApk] = js.native
}

object SchemaApksAddExternallyHostedRequest {
  @scala.inline
  def apply(externallyHostedApk: SchemaExternallyHostedApk = null): SchemaApksAddExternallyHostedRequest = {
    val __obj = js.Dynamic.literal()
    if (externallyHostedApk != null) __obj.updateDynamic("externallyHostedApk")(externallyHostedApk.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApksAddExternallyHostedRequest]
  }
}

