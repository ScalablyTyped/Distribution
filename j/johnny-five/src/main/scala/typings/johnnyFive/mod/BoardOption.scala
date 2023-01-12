package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoardOption extends StObject {
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[Double | String] = js.undefined
  
  var io: js.UndefOr[Any] = js.undefined
  
  var port: js.UndefOr[String | Any] = js.undefined
  
  var repl: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object BoardOption {
  
  inline def apply(): BoardOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoardOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoardOption] (val x: Self) extends AnyVal {
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIo(value: Any): Self = StObject.set(x, "io", value.asInstanceOf[js.Any])
    
    inline def setIoUndefined: Self = StObject.set(x, "io", js.undefined)
    
    inline def setPort(value: String | Any): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setRepl(value: Boolean): Self = StObject.set(x, "repl", value.asInstanceOf[js.Any])
    
    inline def setReplUndefined: Self = StObject.set(x, "repl", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
