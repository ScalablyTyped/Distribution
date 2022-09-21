package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTextValues extends StObject {
  
  /**
    * The maximum allowable length for text values is 2048 characters.
    */
  var values: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaTextValues {
  
  inline def apply(): SchemaTextValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextValues]
  }
  
  extension [Self <: SchemaTextValues](x: Self) {
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
