package typings.materialUiCore

import typings.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssBaselineCssBaselineMod {
  
  @JSImport("@material-ui/core/CssBaseline/CssBaseline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: CssBaselineProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type CssBaselineClassKey = "@global"
  
  trait CssBaselineProps
    extends StObject
       with StyledComponentProps[scala.Nothing] {
    
    /**
      * You can wrap a node.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object CssBaselineProps {
    
    inline def apply(): CssBaselineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CssBaselineProps]
    }
    
    extension [Self <: CssBaselineProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
