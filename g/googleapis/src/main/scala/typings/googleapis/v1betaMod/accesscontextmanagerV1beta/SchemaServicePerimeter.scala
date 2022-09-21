package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServicePerimeter extends StObject {
  
  /**
    * Description of the `ServicePerimeter` and its use. Does not affect behavior.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Resource name for the ServicePerimeter. The `short_name` component must begin with a letter and only include alphanumeric and '_'. Format: `accessPolicies/{policy_id\}/servicePerimeters/{short_name\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Perimeter type indicator. A single project is allowed to be a member of single regular perimeter, but multiple service perimeter bridges. A project cannot be a included in a perimeter bridge without being included in regular perimeter. For perimeter bridges, restricted/unrestricted service lists as well as access lists must be empty.
    */
  var perimeterType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Current ServicePerimeter configuration. Specifies sets of resources, restricted/unrestricted services and access levels that determine perimeter content and boundaries.
    */
  var status: js.UndefOr[SchemaServicePerimeterConfig] = js.undefined
  
  /**
    * Human readable title. Must be unique within the Policy.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaServicePerimeter {
  
  inline def apply(): SchemaServicePerimeter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServicePerimeter]
  }
  
  extension [Self <: SchemaServicePerimeter](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPerimeterType(value: String): Self = StObject.set(x, "perimeterType", value.asInstanceOf[js.Any])
    
    inline def setPerimeterTypeNull: Self = StObject.set(x, "perimeterType", null)
    
    inline def setPerimeterTypeUndefined: Self = StObject.set(x, "perimeterType", js.undefined)
    
    inline def setStatus(value: SchemaServicePerimeterConfig): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
