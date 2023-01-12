package typings.jestTypes.anon

import typings.jestTypes.jestTypesStrings.error
import typings.jestTypes.mod.Exception
import typings.jestTypes.mod.SyncEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorException
  extends StObject
     with SyncEvent {
  
  var error: Exception
  
  var name: error
}
object ErrorException {
  
  inline def apply(error: Exception): ErrorException = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "error")
    __obj.asInstanceOf[ErrorException]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorException] (val x: Self) extends AnyVal {
    
    inline def setError(value: Exception): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setName(value: error): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
