package typings
package handlebarsDashHelpersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockParams extends js.Object {
  def blockParams(obj: js.Array[_], ids: js.Array[_]): js.Array[_]
  def createFrame(`object`: js.Any): js.Any
  def escapeExpression(str: java.lang.String): java.lang.String
  def extend(obj: js.Any, source: js.Any*): js.Any
  def isArray(obj: js.Any): scala.Boolean
  def isEmpty(obj: js.Any): scala.Boolean
  def isFunction(obj: js.Any): scala.Boolean
  def toString(obj: js.Any): java.lang.String
}

object Anon_BlockParams {
  @scala.inline
  def apply(
    blockParams: js.Function2[js.Array[_], js.Array[_], js.Array[_]],
    createFrame: js.Function1[js.Any, js.Any],
    escapeExpression: js.Function1[java.lang.String, java.lang.String],
    extend: js.Function2[js.Any, /* repeated */ js.Any, js.Any],
    isArray: js.Function1[js.Any, scala.Boolean],
    isEmpty: js.Function1[js.Any, scala.Boolean],
    isFunction: js.Function1[js.Any, scala.Boolean],
    toString: js.Function1[js.Any, java.lang.String]
  ): Anon_BlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blockParams")(blockParams)
    __obj.updateDynamic("createFrame")(createFrame)
    __obj.updateDynamic("escapeExpression")(escapeExpression)
    __obj.updateDynamic("extend")(extend)
    __obj.updateDynamic("isArray")(isArray)
    __obj.updateDynamic("isEmpty")(isEmpty)
    __obj.updateDynamic("isFunction")(isFunction)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[Anon_BlockParams]
  }
}

