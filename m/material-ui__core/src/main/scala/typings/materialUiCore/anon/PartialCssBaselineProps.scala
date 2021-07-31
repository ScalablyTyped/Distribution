package typings.materialUiCore.anon

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/CssBaseline.CssBaselineProps> */
trait PartialCssBaselineProps extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.undefined
}
object PartialCssBaselineProps {
  
  @scala.inline
  def apply(): PartialCssBaselineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCssBaselineProps]
  }
  
  @scala.inline
  implicit class PartialCssBaselinePropsMutableBuilder[Self <: PartialCssBaselineProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
