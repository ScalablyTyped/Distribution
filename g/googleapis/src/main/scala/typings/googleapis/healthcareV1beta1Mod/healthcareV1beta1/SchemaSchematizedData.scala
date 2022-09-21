package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSchematizedData extends StObject {
  
  /**
    * JSON output of the parser.
    */
  var data: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The error output of the parser.
    */
  var error: js.UndefOr[String | Null] = js.undefined
}
object SchemaSchematizedData {
  
  inline def apply(): SchemaSchematizedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchematizedData]
  }
  
  extension [Self <: SchemaSchematizedData](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
