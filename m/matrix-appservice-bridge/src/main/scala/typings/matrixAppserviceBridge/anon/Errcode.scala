package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errcode extends StObject {
  
  var errcode: String
  
  var error: String
}
object Errcode {
  
  inline def apply(errcode: String, error: String): Errcode = {
    val __obj = js.Dynamic.literal(errcode = errcode.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errcode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Errcode] (val x: Self) extends AnyVal {
    
    inline def setErrcode(value: String): Self = StObject.set(x, "errcode", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
