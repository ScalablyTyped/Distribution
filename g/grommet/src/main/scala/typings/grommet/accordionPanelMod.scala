package typings.grommet

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionPanelMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/AccordionPanel", "AccordionPanel")
  @js.native
  class AccordionPanel protected ()
    extends Component[
          AccordionPanelProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: AccordionPanelProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: AccordionPanelProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/AccordionPanel", "AccordionPanel")
  @js.native
  val AccordionPanel: ComponentClass[
    AccordionPanelProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  
  trait AccordionPanelProps extends StObject {
    
    var header: js.UndefOr[ReactNode] = js.undefined
    
    var label: js.UndefOr[String | ReactNode] = js.undefined
  }
  object AccordionPanelProps {
    
    @scala.inline
    def apply(): AccordionPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionPanelProps]
    }
    
    @scala.inline
    implicit class AccordionPanelPropsMutableBuilder[Self <: AccordionPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setLabel(value: String | ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
}
