package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApiWarning extends StObject {
  
  /**
    * Code to uniquely identify the warning type.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The warning message.
    */
  var message: js.UndefOr[String | Null] = js.undefined
}
object SchemaApiWarning {
  
  inline def apply(): SchemaApiWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiWarning]
  }
  
  extension [Self <: SchemaApiWarning](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
