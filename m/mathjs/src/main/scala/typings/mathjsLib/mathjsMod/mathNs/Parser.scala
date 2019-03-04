package typings
package mathjsLib.mathjsMod.mathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  def clear(): scala.Unit
  def eval(expr: java.lang.String): js.Any
  def get(variable: java.lang.String): js.Any
  def getAll(): org.scalablytyped.runtime.StringDictionary[js.Any]
  def set(variable: java.lang.String, value: js.Any): scala.Unit
}

object Parser {
  @scala.inline
  def apply(
    clear: js.Function0[scala.Unit],
    eval: js.Function1[java.lang.String, js.Any],
    get: js.Function1[java.lang.String, js.Any],
    getAll: js.Function0[org.scalablytyped.runtime.StringDictionary[js.Any]],
    set: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): Parser = {
    val __obj = js.Dynamic.literal(clear = clear, eval = eval, get = get, getAll = getAll, set = set)
  
    __obj.asInstanceOf[Parser]
  }
}

