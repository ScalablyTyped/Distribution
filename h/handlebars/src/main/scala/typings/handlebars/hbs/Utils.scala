package typings.handlebars.hbs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Utils extends StObject {
  
  def blockParams(obj: js.Array[js.Any], ids: js.Array[js.Any]): js.Array[js.Any]
  
  def createFrame(`object`: js.Any): js.Any
  
  def escapeExpression(str: String): String
  
  def extend(obj: js.Any, source: js.Any*): js.Any
  
  def isArray(obj: js.Any): Boolean
  
  def isEmpty(obj: js.Any): Boolean
  
  def isFunction(obj: js.Any): Boolean
  
  def toString(obj: js.Any): String
}
object Utils {
  
  inline def apply(
    blockParams: (js.Array[js.Any], js.Array[js.Any]) => js.Array[js.Any],
    createFrame: js.Any => js.Any,
    escapeExpression: String => String,
    extend: (js.Any, /* repeated */ js.Any) => js.Any,
    isArray: js.Any => Boolean,
    isEmpty: js.Any => Boolean,
    isFunction: js.Any => Boolean,
    toString_ : js.Any => String
  ): Utils = {
    val __obj = js.Dynamic.literal(blockParams = js.Any.fromFunction2(blockParams), createFrame = js.Any.fromFunction1(createFrame), escapeExpression = js.Any.fromFunction1(escapeExpression), extend = js.Any.fromFunction2(extend), isArray = js.Any.fromFunction1(isArray), isEmpty = js.Any.fromFunction1(isEmpty), isFunction = js.Any.fromFunction1(isFunction))
    __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
    __obj.asInstanceOf[Utils]
  }
  
  extension [Self <: Utils](x: Self) {
    
    inline def setBlockParams(value: (js.Array[js.Any], js.Array[js.Any]) => js.Array[js.Any]): Self = StObject.set(x, "blockParams", js.Any.fromFunction2(value))
    
    inline def setCreateFrame(value: js.Any => js.Any): Self = StObject.set(x, "createFrame", js.Any.fromFunction1(value))
    
    inline def setEscapeExpression(value: String => String): Self = StObject.set(x, "escapeExpression", js.Any.fromFunction1(value))
    
    inline def setExtend(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    
    inline def setIsArray(value: js.Any => Boolean): Self = StObject.set(x, "isArray", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: js.Any => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction1(value))
    
    inline def setIsFunction(value: js.Any => Boolean): Self = StObject.set(x, "isFunction", js.Any.fromFunction1(value))
    
    inline def setToString_(value: js.Any => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
  }
}
