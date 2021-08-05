package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An error in a cell.
  */
trait SchemaErrorValue extends StObject {
  
  /**
    * A message with more information about the error (in the spreadsheet&#39;s
    * locale).
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * The type of error.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaErrorValue {
  
  inline def apply(): SchemaErrorValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorValue]
  }
  
  extension [Self <: SchemaErrorValue](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
