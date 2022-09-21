package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCategory extends StObject {
  
  /**
    * Output only. The human-readable name of the category. This is set when reading the location. When modifying the location, `category_id` must be set.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. More hours types that are available for this business category.
    */
  var moreHoursTypes: js.UndefOr[js.Array[SchemaMoreHoursType]] = js.undefined
  
  /**
    * Required. A stable ID (provided by Google) for this category. The value must be specified when modifying the category (when creating or updating a location).
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A list of all the service types that are available for this business category.
    */
  var serviceTypes: js.UndefOr[js.Array[SchemaServiceType]] = js.undefined
}
object SchemaCategory {
  
  inline def apply(): SchemaCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCategory]
  }
  
  extension [Self <: SchemaCategory](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMoreHoursTypes(value: js.Array[SchemaMoreHoursType]): Self = StObject.set(x, "moreHoursTypes", value.asInstanceOf[js.Any])
    
    inline def setMoreHoursTypesUndefined: Self = StObject.set(x, "moreHoursTypes", js.undefined)
    
    inline def setMoreHoursTypesVarargs(value: SchemaMoreHoursType*): Self = StObject.set(x, "moreHoursTypes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServiceTypes(value: js.Array[SchemaServiceType]): Self = StObject.set(x, "serviceTypes", value.asInstanceOf[js.Any])
    
    inline def setServiceTypesUndefined: Self = StObject.set(x, "serviceTypes", js.undefined)
    
    inline def setServiceTypesVarargs(value: SchemaServiceType*): Self = StObject.set(x, "serviceTypes", js.Array(value*))
  }
}
