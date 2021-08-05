package typings.kefir.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Convert[U] extends StObject {
  
  var convert: Boolean
  
  var error: U
}
object Convert {
  
  inline def apply[U](convert: Boolean, error: U): Convert[U] = {
    val __obj = js.Dynamic.literal(convert = convert.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Convert[U]]
  }
  
  extension [Self <: Convert[?], U](x: Self & Convert[U]) {
    
    inline def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    inline def setError(value: U): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
