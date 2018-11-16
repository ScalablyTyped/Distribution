package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingWhenSyntax[T] extends js.Object {
  def when(constraint: js.Function1[/* request */ Request, scala.Boolean]): BindingOnSyntax[T] = js.native
  def whenAnyAncestorIs(ancestor: java.lang.String): BindingOnSyntax[T] = js.native
  def whenAnyAncestorIs(ancestor: js.Function): BindingOnSyntax[T] = js.native
  def whenAnyAncestorMatches(constraint: js.Function1[/* request */ Request, scala.Boolean]): BindingOnSyntax[T] = js.native
  def whenAnyAncestorNamed(name: java.lang.String): BindingOnSyntax[T] = js.native
  def whenAnyAncestorNamed(name: js.Symbol): BindingOnSyntax[T] = js.native
  def whenAnyAncestorNamed(name: scala.Double): BindingOnSyntax[T] = js.native
  def whenAnyAncestorTagged(tag: java.lang.String, value: js.Any): BindingOnSyntax[T] = js.native
  def whenAnyAncestorTagged(tag: js.Symbol, value: js.Any): BindingOnSyntax[T] = js.native
  def whenAnyAncestorTagged(tag: scala.Double, value: js.Any): BindingOnSyntax[T] = js.native
  def whenInjectedInto(parent: java.lang.String): BindingOnSyntax[T] = js.native
  def whenInjectedInto(parent: js.Function): BindingOnSyntax[T] = js.native
  def whenNoAncestorIs(ancestor: java.lang.String): BindingOnSyntax[T] = js.native
  def whenNoAncestorIs(ancestor: js.Function): BindingOnSyntax[T] = js.native
  def whenNoAncestorMatches(constraint: js.Function1[/* request */ Request, scala.Boolean]): BindingOnSyntax[T] = js.native
  def whenNoAncestorNamed(name: java.lang.String): BindingOnSyntax[T] = js.native
  def whenNoAncestorNamed(name: js.Symbol): BindingOnSyntax[T] = js.native
  def whenNoAncestorNamed(name: scala.Double): BindingOnSyntax[T] = js.native
  def whenNoAncestorTagged(tag: java.lang.String, value: js.Any): BindingOnSyntax[T] = js.native
  def whenNoAncestorTagged(tag: js.Symbol, value: js.Any): BindingOnSyntax[T] = js.native
  def whenNoAncestorTagged(tag: scala.Double, value: js.Any): BindingOnSyntax[T] = js.native
  def whenParentNamed(name: java.lang.String): BindingOnSyntax[T] = js.native
  def whenParentNamed(name: js.Symbol): BindingOnSyntax[T] = js.native
  def whenParentNamed(name: scala.Double): BindingOnSyntax[T] = js.native
  def whenParentTagged(tag: java.lang.String, value: js.Any): BindingOnSyntax[T] = js.native
  def whenParentTagged(tag: js.Symbol, value: js.Any): BindingOnSyntax[T] = js.native
  def whenParentTagged(tag: scala.Double, value: js.Any): BindingOnSyntax[T] = js.native
  def whenTargetIsDefault(): BindingOnSyntax[T] = js.native
  def whenTargetNamed(name: java.lang.String): BindingOnSyntax[T] = js.native
  def whenTargetNamed(name: js.Symbol): BindingOnSyntax[T] = js.native
  def whenTargetNamed(name: scala.Double): BindingOnSyntax[T] = js.native
  def whenTargetTagged(tag: java.lang.String, value: js.Any): BindingOnSyntax[T] = js.native
  def whenTargetTagged(tag: js.Symbol, value: js.Any): BindingOnSyntax[T] = js.native
  def whenTargetTagged(tag: scala.Double, value: js.Any): BindingOnSyntax[T] = js.native
}

