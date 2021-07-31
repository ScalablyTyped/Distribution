package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.tableTableMod.Padding
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableContextMod extends Shortcut {
  
  @JSImport("@material-ui/core/Table/TableContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[TableContextProps]] = js.native
  
  trait TableContextProps extends StObject {
    
    var padding: Padding
  }
  object TableContextProps {
    
    @scala.inline
    def apply(padding: Padding): TableContextProps = {
      val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableContextProps]
    }
    
    @scala.inline
    implicit class TableContextPropsMutableBuilder[Self <: TableContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Context[js.UndefOr[TableContextProps]]
  
  /* This means you don't have to write `default`, but can instead just say `tableContextMod.foo` */
  override def _to: Context[js.UndefOr[TableContextProps]] = default
}
