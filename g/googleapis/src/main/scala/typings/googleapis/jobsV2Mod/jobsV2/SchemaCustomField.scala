package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomField extends StObject {
  
  /**
    * Optional. The values of the custom data.
    */
  var values: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCustomField {
  
  inline def apply(): SchemaCustomField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomField]
  }
  
  extension [Self <: SchemaCustomField](x: Self) {
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
