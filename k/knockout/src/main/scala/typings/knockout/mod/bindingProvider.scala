package typings.knockout.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("knockout", "bindingProvider")
@js.native
open class bindingProvider ()
  extends StObject
     with IBindingProvider {
  
  /* CompleteClass */
  override def getBindingAccessors(node: Node, bindingContext: BindingContext[Any]): BindingAccessors = js.native
  
  def getBindingsString(node: Node): String = js.native
  def getBindingsString(node: Node, bindingContext: BindingContext[Any]): String = js.native
  
  @JSName("getBindings")
  def getBindings_MbindingProvider(node: Node, bindingContext: BindingContext[Any]): js.Object = js.native
  
  /* CompleteClass */
  override def nodeHasBindings(node: Node): Boolean = js.native
  
  def parseBindingsString(bindingsString: String, bindingContext: BindingContext[Any], node: Node): js.Object = js.native
  def parseBindingsString(bindingsString: String, bindingContext: BindingContext[Any], node: Node, options: BindingOptions): js.Object | BindingAccessors = js.native
}
/* static members */
object bindingProvider {
  
  @JSImport("knockout", "bindingProvider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("knockout", "bindingProvider.instance")
  @js.native
  def instance: IBindingProvider = js.native
  inline def instance_=(x: IBindingProvider): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
}
