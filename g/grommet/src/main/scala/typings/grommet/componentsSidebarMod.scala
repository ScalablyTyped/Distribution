package typings.grommet

import typings.grommet.componentsBoxMod.BoxProps
import typings.grommet.grommetStrings.onClick
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsSidebarMod {
  
  @JSImport("grommet/components/Sidebar", "Sidebar")
  @js.native
  val Sidebar: FC[SidebarExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLDivElement>, std.HTMLDivElement>, 'onClick'> ]: react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLDivElement>, std.HTMLDivElement>[P]} */ trait SidebarExtendedProps
    extends StObject
       with BoxProps
       with SidebarProps
  object SidebarExtendedProps {
    
    inline def apply(): SidebarExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarExtendedProps]
    }
  }
  
  trait SidebarProps extends StObject {
    
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    var header: js.UndefOr[ReactNode] = js.undefined
  }
  object SidebarProps {
    
    inline def apply(): SidebarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarProps]
    }
    
    extension [Self <: SidebarProps](x: Self) {
      
      inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
  
  type divProps = Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], onClick]
}
