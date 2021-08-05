package typings.jsoneditoronline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONEditorShowDropDownListParams extends StObject {
  
  def callback(value: js.Any): Unit
  
  var node: JSONEditorNode
  
  var optionClassName: String
  
  var optionSelectedClassName: String
  
  var value: String
  
  var values: js.Array[js.Object]
  
  var x: Double
  
  var y: Double
}
object JSONEditorShowDropDownListParams {
  
  inline def apply(
    callback: js.Any => Unit,
    node: JSONEditorNode,
    optionClassName: String,
    optionSelectedClassName: String,
    value: String,
    values: js.Array[js.Object],
    x: Double,
    y: Double
  ): JSONEditorShowDropDownListParams = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), node = node.asInstanceOf[js.Any], optionClassName = optionClassName.asInstanceOf[js.Any], optionSelectedClassName = optionSelectedClassName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEditorShowDropDownListParams]
  }
  
  extension [Self <: JSONEditorShowDropDownListParams](x: Self) {
    
    inline def setCallback(value: js.Any => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setNode(value: JSONEditorNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setOptionClassName(value: String): Self = StObject.set(x, "optionClassName", value.asInstanceOf[js.Any])
    
    inline def setOptionSelectedClassName(value: String): Self = StObject.set(x, "optionSelectedClassName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[js.Object]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: js.Object*): Self = StObject.set(x, "values", js.Array(value :_*))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
