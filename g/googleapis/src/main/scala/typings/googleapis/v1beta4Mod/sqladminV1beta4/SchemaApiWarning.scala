package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Admin API warning message.
  */
trait SchemaApiWarning extends StObject {
  
  /**
    * Code to uniquely identify the warning type.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * The warning message.
    */
  var message: js.UndefOr[String] = js.undefined
}
object SchemaApiWarning {
  
  inline def apply(): SchemaApiWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiWarning]
  }
  
  extension [Self <: SchemaApiWarning](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
