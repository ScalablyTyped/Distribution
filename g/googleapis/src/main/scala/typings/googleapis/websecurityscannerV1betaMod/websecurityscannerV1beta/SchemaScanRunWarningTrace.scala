package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScanRunWarningTrace extends StObject {
  
  /**
    * Indicates the warning code.
    */
  var code: js.UndefOr[String | Null] = js.undefined
}
object SchemaScanRunWarningTrace {
  
  inline def apply(): SchemaScanRunWarningTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScanRunWarningTrace]
  }
  
  extension [Self <: SchemaScanRunWarningTrace](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
