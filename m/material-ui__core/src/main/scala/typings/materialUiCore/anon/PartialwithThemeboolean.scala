package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  withTheme :boolean}> */
trait PartialwithThemeboolean extends StObject {
  
  var withTheme: js.UndefOr[Boolean] = js.undefined
}
object PartialwithThemeboolean {
  
  inline def apply(): PartialwithThemeboolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialwithThemeboolean]
  }
  
  extension [Self <: PartialwithThemeboolean](x: Self) {
    
    inline def setWithTheme(value: Boolean): Self = StObject.set(x, "withTheme", value.asInstanceOf[js.Any])
    
    inline def setWithThemeUndefined: Self = StObject.set(x, "withTheme", js.undefined)
  }
}
