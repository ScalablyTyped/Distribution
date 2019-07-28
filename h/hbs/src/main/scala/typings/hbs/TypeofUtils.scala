package typings.hbs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofUtils extends js.Object {
  def blockParams(obj: js.Array[_], ids: js.Array[_]): js.Array[_]
  def createFrame(`object`: js.Any): js.Any
  def escapeExpression(str: String): String
  def extend(obj: js.Any, source: js.Any*): js.Any
  def isArray(obj: js.Any): Boolean
  def isEmpty(obj: js.Any): Boolean
  def isFunction(obj: js.Any): Boolean
  def toString(obj: js.Any): String
}

object TypeofUtils {
  @scala.inline
  def apply(
    blockParams: (js.Array[_], js.Array[_]) => js.Array[_],
    createFrame: js.Any => js.Any,
    escapeExpression: String => String,
    extend: (js.Any, /* repeated */ js.Any) => js.Any,
    isArray: js.Any => Boolean,
    isEmpty: js.Any => Boolean,
    isFunction: js.Any => Boolean,
    toString: js.Any => String
  ): TypeofUtils = {
    val __obj = js.Dynamic.literal(blockParams = js.Any.fromFunction2(blockParams), createFrame = js.Any.fromFunction1(createFrame), escapeExpression = js.Any.fromFunction1(escapeExpression), extend = js.Any.fromFunction2(extend), isArray = js.Any.fromFunction1(isArray), isEmpty = js.Any.fromFunction1(isEmpty), isFunction = js.Any.fromFunction1(isFunction), toString = js.Any.fromFunction1(toString))
  
    __obj.asInstanceOf[TypeofUtils]
  }
}

