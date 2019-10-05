package typings.knockoutDashSecureDashBinding.knockoutDashSecureDashBindingMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.knockout.KnockoutBindingContext
import typings.knockout.KnockoutBindingProvider
import typings.knockoutDashSecureDashBinding.KnockoutSecureBindingOptions
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout-secure-binding", JSImport.Namespace)
@js.native
class ^ () extends KnockoutBindingProvider {
  def this(options: KnockoutSecureBindingOptions) = this()
  /* CompleteClass */
  override def getBindings(node: Node, bindingContext: KnockoutBindingContext): js.Object = js.native
  /* CompleteClass */
  override def nodeHasBindings(node: Node): Boolean = js.native
}

@JSImport("knockout-secure-binding", JSImport.Namespace)
@js.native
object ^ extends TopLevel[
      Instantiable0[KnockoutBindingProvider] with (Instantiable1[/* options */ KnockoutSecureBindingOptions, KnockoutBindingProvider])
    ]

