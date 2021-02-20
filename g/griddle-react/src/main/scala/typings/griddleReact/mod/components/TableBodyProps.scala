package typings.griddleReact.mod.components

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableBodyProps extends StObject {
  
  var Row: js.UndefOr[js.Any] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var rowIds: js.UndefOr[js.Array[Double]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object TableBodyProps {
  
  @scala.inline
  def apply(): TableBodyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBodyProps]
  }
  
  @scala.inline
  implicit class TableBodyPropsMutableBuilder[Self <: TableBodyProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setRow(value: js.Any): Self = StObject.set(x, "Row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIds(value: js.Array[Double]): Self = StObject.set(x, "rowIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIdsUndefined: Self = StObject.set(x, "rowIds", js.undefined)
    
    @scala.inline
    def setRowIdsVarargs(value: Double*): Self = StObject.set(x, "rowIds", js.Array(value :_*))
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "Row", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
