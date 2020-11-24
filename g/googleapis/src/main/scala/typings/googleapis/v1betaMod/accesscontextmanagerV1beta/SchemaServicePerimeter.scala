package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `ServicePerimeter` describes a set of GCP resources which can freely import
  * and export data amongst themselves, but not export outside of the
  * `ServicePerimeter`. If a request with a source within this
  * `ServicePerimeter` has a target outside of the `ServicePerimeter`, the
  * request will be blocked. Otherwise the request is allowed. There are two
  * types of Service Perimeter - Regular and Bridge. Regular Service Perimeters
  * cannot overlap, a single GCP project can only belong to a single regular
  * Service Perimeter. Service Perimeter Bridges can contain only GCP projects
  * as members, a single GCP project may belong to multiple Service Perimeter
  * Bridges.
  */
@js.native
trait SchemaServicePerimeter extends js.Object {
  
  /**
    * Output only. Time the `ServicePerimeter` was created in UTC.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Description of the `ServicePerimeter` and its use. Does not affect
    * behavior.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Required. Resource name for the ServicePerimeter.  The `short_name`
    * component must begin with a letter and only include alphanumeric and
    * &#39;_&#39;. Format:
    * `accessPolicies/{policy_id}/servicePerimeters/{short_name}`
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Perimeter type indicator. A single project is allowed to be a member of
    * single regular perimeter, but multiple service perimeter bridges. A
    * project cannot be a included in a perimeter bridge without being included
    * in regular perimeter. For perimeter bridges, restricted/unrestricted
    * service lists as well as access lists must be empty.
    */
  var perimeterType: js.UndefOr[String] = js.native
  
  /**
    * Current ServicePerimeter configuration. Specifies sets of resources,
    * restricted/unrestricted services and access levels that determine
    * perimeter content and boundaries.
    */
  var status: js.UndefOr[SchemaServicePerimeterConfig] = js.native
  
  /**
    * Human readable title. Must be unique within the Policy.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Output only. Time the `ServicePerimeter` was updated in UTC.
    */
  var updateTime: js.UndefOr[String] = js.native
}
object SchemaServicePerimeter {
  
  @scala.inline
  def apply(): SchemaServicePerimeter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServicePerimeter]
  }
  
  @scala.inline
  implicit class SchemaServicePerimeterOps[Self <: SchemaServicePerimeter] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPerimeterType(value: String): Self = this.set("perimeterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerimeterType: Self = this.set("perimeterType", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaServicePerimeterConfig): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
