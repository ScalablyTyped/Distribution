package typings.mathjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser extends js.Object {
  def clear(): scala.Unit = js.native
  def evaluate(expr: String): js.Any = js.native
  def get(variable: String): js.Any = js.native
  def getAll(): StringDictionary[js.Any] = js.native
  def set(variable: String, value: js.Any): scala.Unit = js.native
}

object Parser {
  @scala.inline
  def apply(
    clear: () => scala.Unit,
    evaluate: String => js.Any,
    get: String => js.Any,
    getAll: () => StringDictionary[js.Any],
    set: (String, js.Any) => scala.Unit
  ): Parser = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), evaluate = js.Any.fromFunction1(evaluate), get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction0(getAll), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Parser]
  }
  @scala.inline
  implicit class ParserOps[Self <: Parser] (val x: Self) extends AnyVal {
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
    def setClear(value: () => scala.Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setEvaluate(value: String => js.Any): Self = this.set("evaluate", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: String => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAll(value: () => StringDictionary[js.Any]): Self = this.set("getAll", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: (String, js.Any) => scala.Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

