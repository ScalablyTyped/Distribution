package typings.grommet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.grommet.grommetStrings.all
import typings.grommet.grommetStrings.none
import typings.grommet.grommetStrings.some
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expand[TRowType] extends StObject {
  
  var expand: js.Array[String]
  
  var expandable: js.Array[String]
  
  def onExpand(expandedKeys: js.Array[String]): Unit
  
  def onSelect(select: js.Array[String | Double], datum: TRowType): Unit
  
  var property: String
  
  var select: StringDictionary[all | some | none]
}
object Expand {
  
  inline def apply[TRowType](
    expand: js.Array[String],
    expandable: js.Array[String],
    onExpand: js.Array[String] => Unit,
    onSelect: (js.Array[String | Double], TRowType) => Unit,
    property: String,
    select: StringDictionary[all | some | none]
  ): Expand[TRowType] = {
    val __obj = js.Dynamic.literal(expand = expand.asInstanceOf[js.Any], expandable = expandable.asInstanceOf[js.Any], onExpand = js.Any.fromFunction1(onExpand), onSelect = js.Any.fromFunction2(onSelect), property = property.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expand[TRowType]]
  }
  
  extension [Self <: Expand[?], TRowType](x: Self & Expand[TRowType]) {
    
    inline def setExpand(value: js.Array[String]): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandVarargs(value: String*): Self = StObject.set(x, "expand", js.Array(value*))
    
    inline def setExpandable(value: js.Array[String]): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    inline def setExpandableVarargs(value: String*): Self = StObject.set(x, "expandable", js.Array(value*))
    
    inline def setOnExpand(value: js.Array[String] => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
    
    inline def setOnSelect(value: (js.Array[String | Double], TRowType) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: StringDictionary[all | some | none]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
  }
}
