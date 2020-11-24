package typings.jsonata.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expression extends js.Object {
  
  def assign(name: String, value: js.Any): Unit = js.native
  
  def ast(): ExprNode = js.native
  
  def evaluate(input: js.Any): js.Any = js.native
  def evaluate(
    input: js.Any,
    bindings: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ JsonataError, /* resp */ js.Any, Unit]
  ): Unit = js.native
  def evaluate(input: js.Any, bindings: Record[String, _]): js.Any = js.native
  def evaluate(
    input: js.Any,
    bindings: Record[String, _],
    callback: js.Function2[/* err */ JsonataError, /* resp */ js.Any, Unit]
  ): Unit = js.native
  
  def registerFunction(name: String, implementation: js.ThisFunction1[/* this */ Focus, /* repeated */ js.Any, _]): Unit = js.native
  def registerFunction(
    name: String,
    implementation: js.ThisFunction1[/* this */ Focus, /* repeated */ js.Any, _],
    signature: String
  ): Unit = js.native
}
