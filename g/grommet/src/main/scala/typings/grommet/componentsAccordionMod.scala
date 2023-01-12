package typings.grommet

import typings.grommet.anon.TabContents
import typings.grommet.componentsBoxMod.BoxProps
import typings.grommet.utilsMod.AnimateType
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsAccordionMod {
  
  @JSImport("grommet/components/Accordion", "Accordion")
  @js.native
  val Accordion: FC[AccordionExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLDivElement>, std.HTMLDivElement>, 'onClick'> ]: react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLDivElement>, std.HTMLDivElement>[P]} */ trait AccordionExtendedProps
    extends StObject
       with AccordionProps
       with BoxProps
  object AccordionExtendedProps {
    
    inline def apply(): AccordionExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionExtendedProps]
    }
  }
  
  trait AccordionProps extends StObject {
    
    var activeIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var animate: js.UndefOr[AnimateType] = js.undefined
    
    var messages: js.UndefOr[TabContents] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var onActive: js.UndefOr[js.Function1[/* activeIndexes */ js.Array[Double], Unit]] = js.undefined
  }
  object AccordionProps {
    
    inline def apply(): AccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccordionProps] (val x: Self) extends AnyVal {
      
      inline def setActiveIndex(value: Double | js.Array[Double]): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      inline def setActiveIndexVarargs(value: Double*): Self = StObject.set(x, "activeIndex", js.Array(value*))
      
      inline def setAnimate(value: AnimateType): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setMessages(value: TabContents): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnActive(value: /* activeIndexes */ js.Array[Double] => Unit): Self = StObject.set(x, "onActive", js.Any.fromFunction1(value))
      
      inline def setOnActiveUndefined: Self = StObject.set(x, "onActive", js.undefined)
    }
  }
}
