package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionHoldOptions extends StObject {
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  
  var useUpdate: js.UndefOr[Boolean] = js.native
}
object SessionHoldOptions {
  
  @scala.inline
  def apply(): SessionHoldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionHoldOptions]
  }
  
  @scala.inline
  implicit class SessionHoldOptionsMutableBuilder[Self <: SessionHoldOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
    
    @scala.inline
    def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
    
    @scala.inline
    def setUseUpdate(value: Boolean): Self = StObject.set(x, "useUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseUpdateUndefined: Self = StObject.set(x, "useUpdate", js.undefined)
  }
}
