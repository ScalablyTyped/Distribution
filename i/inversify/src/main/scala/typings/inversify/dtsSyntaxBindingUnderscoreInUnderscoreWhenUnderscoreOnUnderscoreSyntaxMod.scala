package typings.inversify

import typings.inversify.dtsInterfacesInterfacesMod.interfaces.Binding
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.BindingInSyntax
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.BindingOnSyntax
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.BindingWhenOnSyntax
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.BindingWhenSyntax
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/syntax/binding_in_when_on_syntax", JSImport.Namespace)
@js.native
object dtsSyntaxBindingUnderscoreInUnderscoreWhenUnderscoreOnUnderscoreSyntaxMod extends js.Object {
  @js.native
  class BindingInWhenOnSyntax[T] protected ()
    extends BindingInSyntax[T]
       with BindingWhenSyntax[T]
       with BindingOnSyntax[T] {
    def this(binding: Binding[T]) = this()
    var _binding: js.Any = js.native
    var _bindingInSyntax: js.Any = js.native
    var _bindingOnSyntax: js.Any = js.native
    var _bindingWhenSyntax: js.Any = js.native
    /* CompleteClass */
    override def inRequestScope(): BindingWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def inSingletonScope(): BindingWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def inTransientScope(): BindingWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def onActivation(fn: js.Function2[/* context */ Context, T, T]): BindingWhenSyntax[T] = js.native
  }
  
}

