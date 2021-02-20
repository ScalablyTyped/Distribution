package typings.grommet.anon

import typings.grommet.utilsMod.BorderType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Panel extends StObject {
  
  var border: js.UndefOr[BorderType] = js.native
  
  var heading: js.UndefOr[Level] = js.native
  
  var hover: js.UndefOr[Heading] = js.native
  
  var icons: js.UndefOr[Collapse] = js.native
  
  var panel: js.UndefOr[`4`] = js.native
}
object Panel {
  
  @scala.inline
  def apply(): Panel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Panel]
  }
  
  @scala.inline
  implicit class PanelMutableBuilder[Self <: Panel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: BorderType): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setBorderVarargs(value: Error*): Self = StObject.set(x, "border", js.Array(value :_*))
    
    @scala.inline
    def setHeading(value: Level): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    @scala.inline
    def setHover(value: Heading): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setIcons(value: Collapse): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setPanel(value: `4`): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
  }
}
