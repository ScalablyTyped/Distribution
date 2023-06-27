package typings.maplibreMaplibreGlStyleSpec.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionParsingError
  extends StObject
     with Error {
  
  var key: String
}
object ExpressionParsingError {
  
  inline def apply(key: String, message: String, name: String): ExpressionParsingError = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionParsingError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpressionParsingError] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
