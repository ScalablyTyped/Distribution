package typings.grommet.anon

import typings.grommet.utilsMod.BackgroundType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundBorder extends StObject {
  
  var background: js.UndefOr[BackgroundType] = js.native
  
  var border: js.UndefOr[`3`] = js.native
  
  var label: js.UndefOr[`3`] = js.native
}
object BackgroundBorder {
  
  @scala.inline
  def apply(): BackgroundBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundBorder]
  }
  
  @scala.inline
  implicit class BackgroundBorderMutableBuilder[Self <: BackgroundBorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: `3`): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setLabel(value: `3`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
