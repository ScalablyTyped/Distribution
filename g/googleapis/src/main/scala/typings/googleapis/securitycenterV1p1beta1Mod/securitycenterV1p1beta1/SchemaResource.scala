package typings.googleapis.securitycenterV1p1beta1Mod.securitycenterV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResource extends StObject {
  
  /**
    * The full resource name of the resource. See: https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The human readable name of resource&#39;s parent.
    */
  var parentDisplayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full resource name of resource&#39;s parent.
    */
  var parentName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The human readable name of project that the resource belongs to.
    */
  var projectDisplayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full resource name of project that the resource belongs to.
    */
  var projectName: js.UndefOr[String | Null] = js.undefined
}
object SchemaResource {
  
  inline def apply(): SchemaResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResource]
  }
  
  extension [Self <: SchemaResource](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentDisplayName(value: String): Self = StObject.set(x, "parentDisplayName", value.asInstanceOf[js.Any])
    
    inline def setParentDisplayNameNull: Self = StObject.set(x, "parentDisplayName", null)
    
    inline def setParentDisplayNameUndefined: Self = StObject.set(x, "parentDisplayName", js.undefined)
    
    inline def setParentName(value: String): Self = StObject.set(x, "parentName", value.asInstanceOf[js.Any])
    
    inline def setParentNameNull: Self = StObject.set(x, "parentName", null)
    
    inline def setParentNameUndefined: Self = StObject.set(x, "parentName", js.undefined)
    
    inline def setProjectDisplayName(value: String): Self = StObject.set(x, "projectDisplayName", value.asInstanceOf[js.Any])
    
    inline def setProjectDisplayNameNull: Self = StObject.set(x, "projectDisplayName", null)
    
    inline def setProjectDisplayNameUndefined: Self = StObject.set(x, "projectDisplayName", js.undefined)
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameNull: Self = StObject.set(x, "projectName", null)
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
  }
}
