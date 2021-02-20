package typings.jqueryPnotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PNotifyLabel extends StObject {
  
  var all: js.UndefOr[String] = js.native
  
  var close: js.UndefOr[String] = js.native
  
  var last: js.UndefOr[String] = js.native
  
  var redisplay: js.UndefOr[String] = js.native
  
  var stick: js.UndefOr[String] = js.native
}
object PNotifyLabel {
  
  @scala.inline
  def apply(): PNotifyLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PNotifyLabel]
  }
  
  @scala.inline
  implicit class PNotifyLabelMutableBuilder[Self <: PNotifyLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    @scala.inline
    def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    @scala.inline
    def setRedisplay(value: String): Self = StObject.set(x, "redisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedisplayUndefined: Self = StObject.set(x, "redisplay", js.undefined)
    
    @scala.inline
    def setStick(value: String): Self = StObject.set(x, "stick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickUndefined: Self = StObject.set(x, "stick", js.undefined)
  }
}
