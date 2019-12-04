package typings.inversify

import typings.inversify.dtsInterfacesInterfacesMod.interfaces.Binding
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.BindingWhenOnSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/syntax/binding_in_syntax", JSImport.Namespace)
@js.native
object dtsSyntaxBindingUnderscoreInUnderscoreSyntaxMod extends js.Object {
  @js.native
  class BindingInSyntax[T] protected ()
    extends typings.inversify.dtsInterfacesInterfacesMod.interfaces.BindingInSyntax[T] {
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

