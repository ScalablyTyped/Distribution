package typings.knockout.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object bindingProvider {
  
  @JSImport("knockout", "bindingProvider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("knockout", "bindingProvider.instance")
  @js.native
  def instance: IBindingProvider = js.native
  @scala.inline
  def instance_=(x: IBindingProvider): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
}
