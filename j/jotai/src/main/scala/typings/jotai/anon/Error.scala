package typings.jotai.anon

import typings.jotai.jotaiStrings.hasError
import typings.jotai.vanillaUtilsLoadableMod.Loadable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error
  extends StObject
     with Loadable_[Any] {
  
  var error: Any
  
  var state: hasError
}
object Error {
  
  inline def apply(error: Any): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], state = "hasError")
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setState(value: hasError): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
