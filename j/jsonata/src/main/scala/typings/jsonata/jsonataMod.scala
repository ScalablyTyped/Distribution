package typings.jsonata

import typings.jsonata.jsonataMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonata", JSImport.Namespace)
@js.native
object jsonataMod extends js.Object {
  @js.native
  trait Expression extends js.Object {
    def assign(key: String, func: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
    def evaluate(input: js.Any): js.Any = js.native
    def evaluate(input: js.Any, bindings: js.Any): js.Any = js.native
    def evaluate(input: js.Any, bindings: js.Any, callback: js.Function0[_]): js.Any = js.native
  }
  
  def apply(str: String): Expression = js.native
}

