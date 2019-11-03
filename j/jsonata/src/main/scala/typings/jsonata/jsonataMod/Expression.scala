package typings.jsonata.jsonataMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expression extends js.Object {
  def assign(name: String, value: js.Any): Unit = js.native
  def ast(): ExprNode = js.native
  def evaluate(input: js.Any): js.Any = js.native
  def evaluate(input: js.Any, bindings: StringDictionary[js.Any]): js.Any = js.native
  def evaluate(
    input: js.Any,
    bindings: StringDictionary[js.Any],
    callback: js.Function2[/* err */ Error, /* resp */ js.Any, Unit]
  ): js.Any = js.native
  def registerFunction(name: String, f: js.Function): Unit = js.native
  def registerFunction(name: String, f: js.Function, signature: String): Unit = js.native
}

