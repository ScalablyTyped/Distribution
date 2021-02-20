package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlgroupOptions extends StObject {
  
  var corners: js.UndefOr[Boolean] = js.native
  
  var excludeInvisible: js.UndefOr[Boolean] = js.native
  
  var mini: js.UndefOr[Boolean] = js.native
  
  var shadow: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object ControlgroupOptions {
  
  @scala.inline
  def apply(): ControlgroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlgroupOptions]
  }
  
  @scala.inline
  implicit class ControlgroupOptionsMutableBuilder[Self <: ControlgroupOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorners(value: Boolean): Self = StObject.set(x, "corners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornersUndefined: Self = StObject.set(x, "corners", js.undefined)
    
    @scala.inline
    def setExcludeInvisible(value: Boolean): Self = StObject.set(x, "excludeInvisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeInvisibleUndefined: Self = StObject.set(x, "excludeInvisible", js.undefined)
    
    @scala.inline
    def setMini(value: Boolean): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiniUndefined: Self = StObject.set(x, "mini", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
