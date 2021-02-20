package typings.griddleReact.mod.components

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowDefinitionProps
  extends /* x */ StringDictionary[js.Any] {
  
  //The column that will be known used to track child data
  //By default this will be "children"
  var childColumnName: js.UndefOr[String] = js.native
  
  //The css class name, or a function to generate a class name from props, to apply to this row.
  var cssClassName: js.UndefOr[String | (js.Function1[/* props */ js.Any, String])] = js.native
  
  //The column value that should be used as the key for the row
  //if this is not set it will make one up (not efficient)
  var rowKey: js.UndefOr[String] = js.native
}
object RowDefinitionProps {
  
  @scala.inline
  def apply(): RowDefinitionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowDefinitionProps]
  }
  
  @scala.inline
  implicit class RowDefinitionPropsMutableBuilder[Self <: RowDefinitionProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildColumnName(value: String): Self = StObject.set(x, "childColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildColumnNameUndefined: Self = StObject.set(x, "childColumnName", js.undefined)
    
    @scala.inline
    def setCssClassName(value: String | (js.Function1[/* props */ js.Any, String])): Self = StObject.set(x, "cssClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClassNameFunction1(value: /* props */ js.Any => String): Self = StObject.set(x, "cssClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCssClassNameUndefined: Self = StObject.set(x, "cssClassName", js.undefined)
    
    @scala.inline
    def setRowKey(value: String): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
  }
}
