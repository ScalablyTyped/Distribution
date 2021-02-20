package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import org.scalablytyped.runtime.StObject
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
trait SchemaServicePerimeter extends StObject {
  
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
  implicit class SchemaServicePerimeterMutableBuilder[Self <: SchemaServicePerimeter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPerimeterType(value: String): Self = StObject.set(x, "perimeterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerimeterTypeUndefined: Self = StObject.set(x, "perimeterType", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaServicePerimeterConfig): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
