package typings.inversifyDashBindingDashDecorators.dtsInterfacesInterfacesMod.interfacesNs

import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvideOnSyntax[T] extends ProvideDoneSyntax {
  def onActivation(fn: js.Function2[/* context */ Context, /* injectable */ T, T]): ProvideWhenSyntax[T] = js.native
}

