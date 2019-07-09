package typings
package mathjsLib.mathjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  def clear(): scala.Unit
  def evaluate(expr: java.lang.String): js.Any
  def get(variable: java.lang.String): js.Any
  def getAll(): org.scalablytyped.runtime.StringDictionary[js.Any]
  def set(variable: java.lang.String, value: js.Any): scala.Unit
}

object Parser {
  @scala.inline
  def apply(
    clear: () => scala.Unit,
    evaluate: java.lang.String => js.Any,
    get: java.lang.String => js.Any,
    getAll: () => org.scalablytyped.runtime.StringDictionary[js.Any],
    set: (java.lang.String, js.Any) => scala.Unit
  ): Parser = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), evaluate = js.Any.fromFunction1(evaluate), get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction0(getAll), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[Parser]
  }
}

