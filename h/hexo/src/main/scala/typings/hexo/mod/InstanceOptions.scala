package typings.hexo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceOptions extends StObject {
  
  var config: js.UndefOr[String] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var safe: js.UndefOr[Boolean] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
}
object InstanceOptions {
  
  @scala.inline
  def apply(): InstanceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceOptions]
  }
  
  @scala.inline
  implicit class InstanceOptionsMutableBuilder[Self <: InstanceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
