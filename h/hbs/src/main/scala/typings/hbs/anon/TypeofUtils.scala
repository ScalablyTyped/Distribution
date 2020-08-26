package typings.hbs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofUtils extends js.Object {
  def blockParams(obj: js.Array[_], ids: js.Array[_]): js.Array[_] = js.native
  def createFrame(`object`: js.Any): js.Any = js.native
  def escapeExpression(str: String): String = js.native
  def extend(obj: js.Any, source: js.Any*): js.Any = js.native
  def isArray(obj: js.Any): Boolean = js.native
  def isEmpty(obj: js.Any): Boolean = js.native
  def isFunction(obj: js.Any): Boolean = js.native
  def toString(obj: js.Any): String = js.native
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
  @scala.inline
  implicit class TypeofUtilsOps[Self <: TypeofUtils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlockParams(value: (js.Array[_], js.Array[_]) => js.Array[_]): Self = this.set("blockParams", js.Any.fromFunction2(value))
    @scala.inline
    def setCreateFrame(value: js.Any => js.Any): Self = this.set("createFrame", js.Any.fromFunction1(value))
    @scala.inline
    def setEscapeExpression(value: String => String): Self = this.set("escapeExpression", js.Any.fromFunction1(value))
    @scala.inline
    def setExtend(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = this.set("extend", js.Any.fromFunction2(value))
    @scala.inline
    def setIsArray(value: js.Any => Boolean): Self = this.set("isArray", js.Any.fromFunction1(value))
    @scala.inline
    def setIsEmpty(value: js.Any => Boolean): Self = this.set("isEmpty", js.Any.fromFunction1(value))
    @scala.inline
    def setIsFunction(value: js.Any => Boolean): Self = this.set("isFunction", js.Any.fromFunction1(value))
    @scala.inline
    def setToString(value: js.Any => String): Self = this.set("toString", js.Any.fromFunction1(value))
  }
  
}

