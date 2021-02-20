package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationDisabled extends StObject {
  
  var animation: js.UndefOr[`23`] = js.native
  
  var disabled: js.UndefOr[`24`] = js.native
  
  var icons: js.UndefOr[Current] = js.native
}
object AnimationDisabled {
  
  @scala.inline
  def apply(): AnimationDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationDisabled]
  }
  
  @scala.inline
  implicit class AnimationDisabledMutableBuilder[Self <: AnimationDisabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: `23`): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setDisabled(value: `24`): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setIcons(value: Current): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
  }
}
