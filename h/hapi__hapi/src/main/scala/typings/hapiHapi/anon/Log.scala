package typings.hapiHapi.anon

import typings.hapiHapi.hapiHapiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Log extends StObject {
  
  var log: js.UndefOr[String | js.Array[String] | `false`] = js.undefined
  
  var request: js.UndefOr[String | js.Array[String] | `false`] = js.undefined
}
object Log {
  
  inline def apply(): Log = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Log]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
    
    inline def setLog(value: String | js.Array[String] | `false`): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setLogVarargs(value: String*): Self = StObject.set(x, "log", js.Array(value*))
    
    inline def setRequest(value: String | js.Array[String] | `false`): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRequestVarargs(value: String*): Self = StObject.set(x, "request", js.Array(value*))
  }
}
