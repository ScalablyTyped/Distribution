package typings.jqueryJnotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JNotifyInitOptions extends StObject {
  
  var appendType: js.UndefOr[String] = js.native
  
  var oneAtTime: js.UndefOr[Boolean] = js.native
}
object JNotifyInitOptions {
  
  @scala.inline
  def apply(): JNotifyInitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JNotifyInitOptions]
  }
  
  @scala.inline
  implicit class JNotifyInitOptionsMutableBuilder[Self <: JNotifyInitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendType(value: String): Self = StObject.set(x, "appendType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendTypeUndefined: Self = StObject.set(x, "appendType", js.undefined)
    
    @scala.inline
    def setOneAtTime(value: Boolean): Self = StObject.set(x, "oneAtTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneAtTimeUndefined: Self = StObject.set(x, "oneAtTime", js.undefined)
  }
}
