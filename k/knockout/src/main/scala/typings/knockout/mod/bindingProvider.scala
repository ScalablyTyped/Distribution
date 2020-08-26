package typings.knockout.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "bindingProvider")
@js.native
class bindingProvider () extends IBindingProvider {
  def getBindingsString(node: Node): String = js.native
  def getBindingsString(node: Node, bindingContext: BindingContext[_]): String = js.native
  @JSName("getBindings")
  def getBindings_MbindingProvider(node: Node, bindingContext: BindingContext[_]): js.Object = js.native
  def parseBindingsString(bindingsString: String, bindingContext: BindingContext[_], node: Node): js.Object = js.native
  def parseBindingsString(bindingsString: String, bindingContext: BindingContext[_], node: Node, options: BindingOptions): js.Object | BindingAccessors = js.native
}

/* static members */
@JSImport("knockout", "bindingProvider")
@js.native
object bindingProvider extends js.Object {
  var instance: IBindingProvider = js.native
}

