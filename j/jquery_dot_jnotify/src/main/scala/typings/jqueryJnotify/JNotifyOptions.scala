package typings.jqueryJnotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JNotifyOptions extends StObject {
  
  var disappearTime: js.UndefOr[Double] = js.native
  
  var permanent: js.UndefOr[Boolean] = js.native
  
  var showIcon: js.UndefOr[Boolean] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object JNotifyOptions {
  
  @scala.inline
  def apply(): JNotifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JNotifyOptions]
  }
  
  @scala.inline
  implicit class JNotifyOptionsMutableBuilder[Self <: JNotifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisappearTime(value: Double): Self = StObject.set(x, "disappearTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisappearTimeUndefined: Self = StObject.set(x, "disappearTime", js.undefined)
    
    @scala.inline
    def setPermanent(value: Boolean): Self = StObject.set(x, "permanent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermanentUndefined: Self = StObject.set(x, "permanent", js.undefined)
    
    @scala.inline
    def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
