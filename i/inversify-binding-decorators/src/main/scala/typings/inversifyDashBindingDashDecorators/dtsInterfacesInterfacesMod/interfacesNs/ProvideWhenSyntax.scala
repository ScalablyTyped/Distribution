package typings.inversifyDashBindingDashDecorators.dtsInterfacesInterfacesMod.interfacesNs

import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvideWhenSyntax[T] extends ProvideDoneSyntax {
  def when(constraint: js.Function1[/* request */ Request, Boolean]): ProvideOnSyntax[T] = js.native
  def whenAnyAncestorIs(ancestor: String): ProvideOnSyntax[T] = js.native
  def whenAnyAncestorIs(ancestor: js.Function): ProvideOnSyntax[T] = js.native
  def whenAnyAncestorMatches(constraint: js.Function1[/* request */ Request, Boolean]): ProvideOnSyntax[T] = js.native
  def whenAnyAncestorNamed(name: String): ProvideOnSyntax[T] = js.native
  def whenAnyAncestorTagged(tag: String, value: js.Any): ProvideOnSyntax[T] = js.native
  def whenInjectedInto(parent: String): ProvideOnSyntax[T] = js.native
  def whenInjectedInto(parent: js.Function): ProvideOnSyntax[T] = js.native
  def whenNoAncestorIs(ancestor: String): ProvideOnSyntax[T] = js.native
  def whenNoAncestorIs(ancestor: js.Function): ProvideOnSyntax[T] = js.native
  def whenNoAncestorMatches(constraint: js.Function1[/* request */ Request, Boolean]): ProvideOnSyntax[T] = js.native
  def whenNoAncestorNamed(name: String): ProvideOnSyntax[T] = js.native
  def whenNoAncestorTagged(tag: String, value: js.Any): ProvideOnSyntax[T] = js.native
  def whenParentNamed(name: String): ProvideOnSyntax[T] = js.native
  def whenParentTagged(tag: String, value: js.Any): ProvideOnSyntax[T] = js.native
  def whenTargetNamed(name: String): ProvideOnSyntax[T] = js.native
  def whenTargetTagged(tag: String, value: js.Any): ProvideOnSyntax[T] = js.native
}

