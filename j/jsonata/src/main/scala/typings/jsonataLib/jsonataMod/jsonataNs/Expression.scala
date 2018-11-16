package typings
package jsonataLib.jsonataMod.jsonataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expression extends js.Object {
  def assign(key: java.lang.String, func: js.Function1[/* repeated */js.Any, _]): scala.Unit = js.native
  def evaluate(input: js.Any): js.Any = js.native
  def evaluate(input: js.Any, bindings: js.Any): js.Any = js.native
  def evaluate(input: js.Any, bindings: js.Any, callback: js.Function0[_]): js.Any = js.native
}

