package typings.mathjs.mathjsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  def clear(): scala.Unit
  def evaluate(expr: String): js.Any
  def get(variable: String): js.Any
  def getAll(): StringDictionary[js.Any]
  def set(variable: String, value: js.Any): scala.Unit
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
}

