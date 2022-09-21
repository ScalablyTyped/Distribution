package typings.grommet

import typings.react.mod.ClassAttributes
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionPanelMod {
  
  @JSImport("grommet/components/AccordionPanel", "AccordionPanel")
  @js.native
  val AccordionPanel: FC[AccordionPanelExtendedProps] = js.native
  
  trait AccordionPanelExtendedProps
    extends StObject
       with AccordionPanelProps
       with ClassAttributes[HTMLDivElement]
       with HTMLAttributes[HTMLDivElement]
  object AccordionPanelExtendedProps {
    
    inline def apply(): AccordionPanelExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionPanelExtendedProps]
    }
  }
  
  trait AccordionPanelProps extends StObject {
    
    var header: js.UndefOr[ReactNode] = js.undefined
    
    var label: js.UndefOr[String | ReactNode] = js.undefined
  }
  object AccordionPanelProps {
    
    inline def apply(): AccordionPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionPanelProps]
    }
    
    extension [Self <: AccordionPanelProps](x: Self) {
      
      inline def setHeader(value: ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setLabel(value: String | ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  type divType = DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]
}
