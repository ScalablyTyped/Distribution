package typings.handlebars.hbs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utils extends StObject {
  
  def blockParams(obj: js.Array[_], ids: js.Array[_]): js.Array[_] = js.native
  
  def createFrame(`object`: js.Any): js.Any = js.native
  
  def escapeExpression(str: String): String = js.native
  
  def extend(obj: js.Any, source: js.Any*): js.Any = js.native
  
  def isArray(obj: js.Any): Boolean = js.native
  
  def isEmpty(obj: js.Any): Boolean = js.native
  
  def isFunction(obj: js.Any): Boolean = js.native
  
  def toString(obj: js.Any): String = js.native
}
object Utils {
  
  @scala.inline
  def apply(
    blockParams: (js.Array[_], js.Array[_]) => js.Array[_],
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
  
  @scala.inline
  implicit class UtilsMutableBuilder[Self <: Utils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockParams(value: (js.Array[_], js.Array[_]) => js.Array[_]): Self = StObject.set(x, "blockParams", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateFrame(value: js.Any => js.Any): Self = StObject.set(x, "createFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEscapeExpression(value: String => String): Self = StObject.set(x, "escapeExpression", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtend(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsArray(value: js.Any => Boolean): Self = StObject.set(x, "isArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmpty(value: js.Any => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFunction(value: js.Any => Boolean): Self = StObject.set(x, "isFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToString_(value: js.Any => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
  }
}
