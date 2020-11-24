package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicePerimeterConfig extends js.Object {
  
  /**
    * A list of `AccessLevel` resource names that allow resources within the `ServicePerimeter` to be accessed from the internet. `AccessLevels` listed must be in the same policy as this
    * `ServicePerimeter`. Referencing a nonexistent `AccessLevel` is a syntax error. If no `AccessLevel` names are listed, resources within the perimeter can only be accessed via Google
    * Cloud calls with request origins within the perimeter. Example: `"accessPolicies/MY_POLICY/accessLevels/MY_LEVEL"`. For Service Perimeter Bridge, must be empty.
    */
  var accessLevels: js.UndefOr[js.Array[String]] = js.native
  
  /** A list of Google Cloud resources that are inside of the service perimeter. Currently only projects are allowed. Format: `projects/{project_number}` */
  var resources: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Google Cloud services that are subject to the Service Perimeter restrictions. For example, if `storage.googleapis.com` is specified, access to the storage buckets inside the
    * perimeter must meet the perimeter's access restrictions.
    */
  var restrictedServices: js.UndefOr[js.Array[String]] = js.native
  
  /** Configuration for APIs allowed within Perimeter. */
  var vpcAccessibleServices: js.UndefOr[VpcAccessibleServices] = js.native
}
object ServicePerimeterConfig {
  
  @scala.inline
  def apply(): ServicePerimeterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServicePerimeterConfig]
  }
  
  @scala.inline
  implicit class ServicePerimeterConfigOps[Self <: ServicePerimeterConfig] (val x: Self) extends AnyVal {
    
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
    def setAccessLevelsVarargs(value: String*): Self = this.set("accessLevels", js.Array(value :_*))
    
    @scala.inline
    def setAccessLevels(value: js.Array[String]): Self = this.set("accessLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessLevels: Self = this.set("accessLevels", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: String*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setRestrictedServicesVarargs(value: String*): Self = this.set("restrictedServices", js.Array(value :_*))
    
    @scala.inline
    def setRestrictedServices(value: js.Array[String]): Self = this.set("restrictedServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictedServices: Self = this.set("restrictedServices", js.undefined)
    
    @scala.inline
    def setVpcAccessibleServices(value: VpcAccessibleServices): Self = this.set("vpcAccessibleServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcAccessibleServices: Self = this.set("vpcAccessibleServices", js.undefined)
  }
}
