package typings.grommet

import typings.react.mod.ClassAttributes
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLTableRowElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableRowMod {
  
  @JSImport("grommet/components/TableRow", "TableRow")
  @js.native
  val TableRow: FC[TableRowExtendedProps] = js.native
  
  trait TableRowExtendedProps
    extends StObject
       with TableRowProps
       with ClassAttributes[HTMLTableRowElement]
       with HTMLAttributes[HTMLTableRowElement]
  object TableRowExtendedProps {
    
    inline def apply(): TableRowExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableRowExtendedProps]
    }
  }
  
  trait TableRowProps extends StObject
  
  type htmlTableRowProps = DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement]
}
