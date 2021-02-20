package typings.karma.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyOptions extends StObject {
  
  /**
    * Whether or not the proxy should override the Host header using the host from the target
    * @defult false
    */
  var changeOrigin: js.UndefOr[Boolean] = js.native
  
  /** The target url or path (mandatory) */
  var target: String = js.native
}
object ProxyOptions {
  
  @scala.inline
  def apply(target: String): ProxyOptions = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyOptions]
  }
  
  @scala.inline
  implicit class ProxyOptionsMutableBuilder[Self <: ProxyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeOrigin(value: Boolean): Self = StObject.set(x, "changeOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeOriginUndefined: Self = StObject.set(x, "changeOrigin", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
