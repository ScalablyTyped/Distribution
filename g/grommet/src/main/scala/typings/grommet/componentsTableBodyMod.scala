package typings.grommet

import typings.react.mod.ClassAttributes
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLTableSectionElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTableBodyMod {
  
  @JSImport("grommet/components/TableBody", "TableBody")
  @js.native
  val TableBody: FC[TableBodyExtendedProps] = js.native
  
  trait TableBodyExtendedProps
    extends StObject
       with TableBodyProps
       with ClassAttributes[HTMLTableSectionElement]
       with HTMLAttributes[HTMLTableSectionElement]
  object TableBodyExtendedProps {
    
    inline def apply(): TableBodyExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableBodyExtendedProps]
    }
  }
  
  trait TableBodyProps extends StObject
  
  type htmlTableBodyProps = DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]
}
