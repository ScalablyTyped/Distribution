package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaCloudRunRewrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudRunRewrite]
  }
  
  @scala.inline
  implicit class SchemaCloudRunRewriteOps[Self <: SchemaCloudRunRewrite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setServiceId(value: String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceId: Self = this.set("serviceId", js.undefined)
  }
}
