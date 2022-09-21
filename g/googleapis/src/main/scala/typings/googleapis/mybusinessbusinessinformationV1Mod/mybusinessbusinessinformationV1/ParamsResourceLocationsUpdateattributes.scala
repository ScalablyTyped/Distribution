package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsUpdateattributes
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Attribute name of attributes that you'd like to update. Represented by `attributes/{attribute\}`. Updates: All attributes provided in the attributes field that you would like to update must be set in the `attribute_mask`. Attributes set in the above list but not in the `attribute_mask` will be ignored. Deletes: If you'd like to delete certain attributes, they must be specified in the `attribute_mask` with no matching entry in the attributes list. If you'd like to delete all attributes set on a location, you should look up all the applicable attributes for the location and then add them to the `attribute_mask` with an empty attributes field.
    */
  var attributeMask: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Google identifier for this location in the form of `locations/{location_id\}/attributes`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAttributes] = js.undefined
}
object ParamsResourceLocationsUpdateattributes {
  
  inline def apply(): ParamsResourceLocationsUpdateattributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsUpdateattributes]
  }
  
  extension [Self <: ParamsResourceLocationsUpdateattributes](x: Self) {
    
    inline def setAttributeMask(value: String): Self = StObject.set(x, "attributeMask", value.asInstanceOf[js.Any])
    
    inline def setAttributeMaskUndefined: Self = StObject.set(x, "attributeMask", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaAttributes): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
