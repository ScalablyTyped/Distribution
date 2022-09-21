package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStackTrace extends StObject {
  
  /**
    * The stack trace message. Required
    */
  var exception: js.UndefOr[String | Null] = js.undefined
}
object SchemaStackTrace {
  
  inline def apply(): SchemaStackTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStackTrace]
  }
  
  extension [Self <: SchemaStackTrace](x: Self) {
    
    inline def setException(value: String): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    inline def setExceptionNull: Self = StObject.set(x, "exception", null)
    
    inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
  }
}
