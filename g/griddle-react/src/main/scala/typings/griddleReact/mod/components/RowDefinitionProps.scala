package typings.griddleReact.mod.components

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowDefinitionProps
  extends StObject
     with /* x */ StringDictionary[Any] {
  
  //The column that will be known used to track child data
  //By default this will be "children"
  var childColumnName: js.UndefOr[String] = js.undefined
  
  //The css class name, or a function to generate a class name from props, to apply to this row.
  var cssClassName: js.UndefOr[String | (js.Function1[/* props */ Any, String])] = js.undefined
  
  //The column value that should be used as the key for the row
  //if this is not set it will make one up (not efficient)
  var rowKey: js.UndefOr[String] = js.undefined
}
object RowDefinitionProps {
  
  inline def apply(): RowDefinitionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowDefinitionProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowDefinitionProps] (val x: Self) extends AnyVal {
    
    inline def setChildColumnName(value: String): Self = StObject.set(x, "childColumnName", value.asInstanceOf[js.Any])
    
    inline def setChildColumnNameUndefined: Self = StObject.set(x, "childColumnName", js.undefined)
    
    inline def setCssClassName(value: String | (js.Function1[/* props */ Any, String])): Self = StObject.set(x, "cssClassName", value.asInstanceOf[js.Any])
    
    inline def setCssClassNameFunction1(value: /* props */ Any => String): Self = StObject.set(x, "cssClassName", js.Any.fromFunction1(value))
    
    inline def setCssClassNameUndefined: Self = StObject.set(x, "cssClassName", js.undefined)
    
    inline def setRowKey(value: String): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
    
    inline def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
  }
}
