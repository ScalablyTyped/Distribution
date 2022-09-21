package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFilterList extends StObject {
  
  /**
    * These infoTypes are based on after the `eval_info_type_mapping` and `golden_info_type_mapping`.
    */
  var infoTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaFilterList {
  
  inline def apply(): SchemaFilterList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterList]
  }
  
  extension [Self <: SchemaFilterList](x: Self) {
    
    inline def setInfoTypes(value: js.Array[String]): Self = StObject.set(x, "infoTypes", value.asInstanceOf[js.Any])
    
    inline def setInfoTypesNull: Self = StObject.set(x, "infoTypes", null)
    
    inline def setInfoTypesUndefined: Self = StObject.set(x, "infoTypes", js.undefined)
    
    inline def setInfoTypesVarargs(value: String*): Self = StObject.set(x, "infoTypes", js.Array(value*))
  }
}
