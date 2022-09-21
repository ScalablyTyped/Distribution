package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the Property to soft-delete. Format: properties/{property_id\} Example: "properties/1000"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesDelete {
  
  inline def apply(): ParamsResourcePropertiesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesDelete]
  }
  
  extension [Self <: ParamsResourcePropertiesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
