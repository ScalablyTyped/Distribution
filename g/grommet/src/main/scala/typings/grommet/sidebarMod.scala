package typings.grommet

import typings.grommet.boxMod.BoxProps
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarMod {
  
  @JSImport("grommet/components/Sidebar", "Sidebar")
  @js.native
  val Sidebar: FC[
    BoxProps & SidebarProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  trait SidebarProps extends StObject {
    
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    var header: js.UndefOr[ReactNode] = js.undefined
  }
  object SidebarProps {
    
    @scala.inline
    def apply(): SidebarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarProps]
    }
    
    @scala.inline
    implicit class SidebarPropsMutableBuilder[Self <: SidebarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setHeader(value: ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
}
