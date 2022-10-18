package typings.grommet

import typings.react.mod.ClassAttributes
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLTableSectionElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTableHeaderMod {
  
  @JSImport("grommet/components/TableHeader", "TableHeader")
  @js.native
  val TableHeader: FC[TableHeaderExtendedProps] = js.native
  
  trait TableHeaderExtendedProps
    extends StObject
       with TableHeaderProps
       with ClassAttributes[HTMLTableSectionElement]
       with HTMLAttributes[HTMLTableSectionElement]
  object TableHeaderExtendedProps {
    
    inline def apply(): TableHeaderExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableHeaderExtendedProps]
    }
  }
  
  trait TableHeaderProps extends StObject
  
  type htmlTableHeaderProps = DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]
}
