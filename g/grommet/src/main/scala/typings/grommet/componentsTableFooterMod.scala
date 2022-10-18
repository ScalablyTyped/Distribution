package typings.grommet

import typings.react.mod.ClassAttributes
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLTableSectionElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTableFooterMod {
  
  @JSImport("grommet/components/TableFooter", "TableFooter")
  @js.native
  val TableFooter: FC[TableFooterExtendedProps] = js.native
  
  trait TableFooterExtendedProps
    extends StObject
       with TableFooterProps
       with ClassAttributes[HTMLTableSectionElement]
       with HTMLAttributes[HTMLTableSectionElement]
  object TableFooterExtendedProps {
    
    inline def apply(): TableFooterExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableFooterExtendedProps]
    }
  }
  
  trait TableFooterProps extends StObject
  
  type htmlTableFooterProps = DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]
}
