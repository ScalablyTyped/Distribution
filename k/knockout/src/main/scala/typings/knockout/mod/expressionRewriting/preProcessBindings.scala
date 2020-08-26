package typings.knockout.mod.expressionRewriting

import typings.knockout.mod.BindingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "expressionRewriting.preProcessBindings")
@js.native
object preProcessBindings extends js.Object {
  def apply(bindingsString: String): String = js.native
  def apply(bindingsString: String, bindingOptions: BindingOptions): String = js.native
  def apply(keyValueArray: js.Array[KeyValue]): String = js.native
  def apply(keyValueArray: js.Array[KeyValue], bindingOptions: BindingOptions): String = js.native
}

