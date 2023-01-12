package typings.materialUiPagination

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("material-ui-pagination", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PaginationProps, js.Object, Any]
  
  type Pagination = Component[PaginationProps, js.Object, Any]
  
  trait PaginationProps extends StObject {
    
    var current: Double
    
    var display: Double
    
    def onChange(value: Double): Unit
    
    var total: Double
  }
  object PaginationProps {
    
    inline def apply(current: Double, display: Double, onChange: Double => Unit, total: Double): PaginationProps = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginationProps] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setDisplay(value: Double): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
