package typings.griddleReact.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GriddleStyleConfig extends StObject {
  
  var classNames: js.UndefOr[GriddleStyleElements[String]] = js.native
  
  var icons: js.UndefOr[GriddleStyleElements[GriddleStyleIcons]] = js.native
  
  var styles: js.UndefOr[GriddleStyleElements[CSSProperties]] = js.native
}
object GriddleStyleConfig {
  
  @scala.inline
  def apply(): GriddleStyleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleStyleConfig]
  }
  
  @scala.inline
  implicit class GriddleStyleConfigMutableBuilder[Self <: GriddleStyleConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassNames(value: GriddleStyleElements[String]): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    @scala.inline
    def setIcons(value: GriddleStyleElements[GriddleStyleIcons]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setStyles(value: GriddleStyleElements[CSSProperties]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
