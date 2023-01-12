package typings.materialUi.MaterialUI

import typings.materialUi.MaterialUI.Styles.MuiTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeWrapperProps extends StObject {
  
  var theme: MuiTheme
}
object ThemeWrapperProps {
  
  inline def apply(theme: MuiTheme): ThemeWrapperProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeWrapperProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeWrapperProps] (val x: Self) extends AnyVal {
    
    inline def setTheme(value: MuiTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
