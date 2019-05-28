package typings
package koaDashHbsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofUtils extends js.Object {
  def blockParams(obj: js.Array[_], ids: js.Array[_]): js.Array[_]
  def createFrame(`object`: js.Any): js.Any
  def escapeExpression(str: java.lang.String): java.lang.String
  def extend(obj: js.Any, source: js.Any*): js.Any
  def isArray(obj: js.Any): scala.Boolean
  def isEmpty(obj: js.Any): scala.Boolean
  def isFunction(obj: js.Any): scala.Boolean
  def toString(obj: js.Any): java.lang.String
}

object TypeofUtils {
  @scala.inline
  def apply(
    blockParams: (js.Array[_], js.Array[_]) => js.Array[_],
    createFrame: js.Any => js.Any,
    escapeExpression: java.lang.String => java.lang.String,
    extend: (js.Any, /* repeated */ js.Any) => js.Any,
    isArray: js.Any => scala.Boolean,
    isEmpty: js.Any => scala.Boolean,
    isFunction: js.Any => scala.Boolean,
    toString: js.Any => java.lang.String
  ): TypeofUtils = {
    val __obj = js.Dynamic.literal(blockParams = js.Any.fromFunction2(blockParams), createFrame = js.Any.fromFunction1(createFrame), escapeExpression = js.Any.fromFunction1(escapeExpression), extend = js.Any.fromFunction2(extend), isArray = js.Any.fromFunction1(isArray), isEmpty = js.Any.fromFunction1(isEmpty), isFunction = js.Any.fromFunction1(isFunction), toString = js.Any.fromFunction1(toString))
  
    __obj.asInstanceOf[TypeofUtils]
  }
}

