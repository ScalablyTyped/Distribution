package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  withTheme :boolean}> */
@js.native
trait PartialwithThemeboolean extends StObject {
  
  var withTheme: js.UndefOr[Boolean] = js.native
}
object PartialwithThemeboolean {
  
  @scala.inline
  def apply(): PartialwithThemeboolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialwithThemeboolean]
  }
  
  @scala.inline
  implicit class PartialwithThemebooleanMutableBuilder[Self <: PartialwithThemeboolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWithTheme(value: Boolean): Self = StObject.set(x, "withTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithThemeUndefined: Self = StObject.set(x, "withTheme", js.undefined)
  }
}
