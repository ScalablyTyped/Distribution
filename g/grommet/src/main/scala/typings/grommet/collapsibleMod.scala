package typings.grommet

import typings.grommet.grommetStrings.horizontal
import typings.grommet.grommetStrings.vertical
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collapsibleMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/Collapsible", "Collapsible")
  @js.native
  class Collapsible protected ()
    extends Component[
          CollapsibleProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: CollapsibleProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: CollapsibleProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/Collapsible", "Collapsible")
  @js.native
  val Collapsible: ComponentClass[
    CollapsibleProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  
  trait CollapsibleProps extends StObject {
    
    var direction: js.UndefOr[horizontal | vertical] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
  }
  object CollapsibleProps {
    
    inline def apply(): CollapsibleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapsibleProps]
    }
    
    extension [Self <: CollapsibleProps](x: Self) {
      
      inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
}
