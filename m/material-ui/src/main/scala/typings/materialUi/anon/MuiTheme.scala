package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MuiTheme extends StObject {
  
  var muiTheme: js.UndefOr[typings.materialUi.MaterialUI.Styles.MuiTheme] = js.undefined
}
object MuiTheme {
  
  inline def apply(): MuiTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MuiTheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MuiTheme] (val x: Self) extends AnyVal {
    
    inline def setMuiTheme(value: typings.materialUi.MaterialUI.Styles.MuiTheme): Self = StObject.set(x, "muiTheme", value.asInstanceOf[js.Any])
    
    inline def setMuiThemeUndefined: Self = StObject.set(x, "muiTheme", js.undefined)
  }
}
