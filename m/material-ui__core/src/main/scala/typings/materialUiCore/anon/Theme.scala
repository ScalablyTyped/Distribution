package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme extends StObject {
  
  var theme: typings.materialUiCore.createMuiThemeMod.Theme
}
object Theme {
  
  @scala.inline
  def apply(theme: typings.materialUiCore.createMuiThemeMod.Theme): Theme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  @scala.inline
  implicit class ThemeMutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTheme(value: typings.materialUiCore.createMuiThemeMod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
