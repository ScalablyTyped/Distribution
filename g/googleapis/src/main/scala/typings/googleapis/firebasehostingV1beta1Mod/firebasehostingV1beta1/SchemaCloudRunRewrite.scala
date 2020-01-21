package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A configured rewrite that will direct any requests to a Cloud Run service.
  * If the Cloud Run service does not exist when setting or updating your
  * Firebase Hosting configuration then the request will fail. Any errors from
  * the Cloud Run service (including when the service has been deleted) will be
  * passed back down to the end user.
  */
@js.native
trait SchemaCloudRunRewrite extends js.Object {
  /**
    * Optional. The region where the Cloud Run service is hosted.  Defaults to
    * `us-central1` if not supplied.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Required. User supplied ID of the Cloud Run service.
    */
  var serviceId: js.UndefOr[String] = js.native
}

object SchemaCloudRunRewrite {
  @scala.inline
  def apply(region: String = null, serviceId: String = null): SchemaCloudRunRewrite = {
    val __obj = js.Dynamic.literal()
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCloudRunRewrite]
  }
}

