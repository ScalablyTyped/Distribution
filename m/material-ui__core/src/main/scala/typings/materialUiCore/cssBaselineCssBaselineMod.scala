package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.materialUiCoreStrings.`@global`
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssBaselineCssBaselineMod extends Shortcut {
  
  @JSImport("@material-ui/core/CssBaseline/CssBaseline", JSImport.Default)
  @js.native
  val default: ComponentType[CssBaselineProps] = js.native
  
  type CssBaselineClassKey = `@global`
  
  trait CssBaselineProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.undefined
  }
  object CssBaselineProps {
    
    @scala.inline
    def apply(): CssBaselineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CssBaselineProps]
    }
    
    @scala.inline
    implicit class CssBaselinePropsMutableBuilder[Self <: CssBaselineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  type _To = ComponentType[CssBaselineProps]
  
  /* This means you don't have to write `default`, but can instead just say `cssBaselineCssBaselineMod.foo` */
  override def _to: ComponentType[CssBaselineProps] = default
}
