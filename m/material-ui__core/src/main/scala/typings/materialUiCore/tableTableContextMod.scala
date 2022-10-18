package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.tableTableMod.Padding
import typings.materialUiCore.tableTableMod.Size
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableTableContextMod extends Shortcut {
  
  @JSImport("@material-ui/core/Table/TableContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[TableContextProps]] = js.native
  
  trait TableContextProps extends StObject {
    
    var padding: Padding
    
    var size: Size
  }
  object TableContextProps {
    
    inline def apply(padding: Padding, size: Size): TableContextProps = {
      val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableContextProps]
    }
    
    extension [Self <: TableContextProps](x: Self) {
      
      inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Context[js.UndefOr[TableContextProps]]
  
  /* This means you don't have to write `default`, but can instead just say `tableTableContextMod.foo` */
  override def _to: Context[js.UndefOr[TableContextProps]] = default
}
