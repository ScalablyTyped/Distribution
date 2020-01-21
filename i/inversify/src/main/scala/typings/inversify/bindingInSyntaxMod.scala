package typings.inversify

import typings.inversify.interfacesMod.interfaces.Binding
import typings.inversify.interfacesMod.interfaces.BindingWhenOnSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/syntax/binding_in_syntax", JSImport.Namespace)
@js.native
object bindingInSyntaxMod extends js.Object {
  @js.native
  class BindingInSyntax[T] protected ()
    extends typings.inversify.interfacesMod.interfaces.BindingInSyntax[T] {
    def this(binding: Binding[T]) = this()
    var _binding: js.Any = js.native
    /* CompleteClass */
    override def inRequestScope(): BindingWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def inSingletonScope(): BindingWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def inTransientScope(): BindingWhenOnSyntax[T] = js.native
  }
  
}

