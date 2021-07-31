package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoardOption extends StObject {
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[Double | String] = js.undefined
  
  var io: js.UndefOr[js.Any] = js.undefined
  
  var port: js.UndefOr[String | js.Any] = js.undefined
  
  var repl: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object BoardOption {
  
  @scala.inline
  def apply(): BoardOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoardOption]
  }
  
  @scala.inline
  implicit class BoardOptionMutableBuilder[Self <: BoardOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIo(value: js.Any): Self = StObject.set(x, "io", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIoUndefined: Self = StObject.set(x, "io", js.undefined)
    
    @scala.inline
    def setPort(value: String | js.Any): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setRepl(value: Boolean): Self = StObject.set(x, "repl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplUndefined: Self = StObject.set(x, "repl", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
