package typings
package inversifyDashBindingDashDecoratorsLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvideWhenSyntax[T] extends ProvideDoneSyntax {
  def when(
    constraint: js.Function1[
      /* request */ inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Request, 
      scala.Boolean
    ]
  ): ProvideOnSyntax[T] = js.native
  def whenAnyAncestorIs(ancestor: java.lang.String): ProvideOnSyntax[T] = js.native
  def whenAnyAncestorIs(ancestor: js.Function): ProvideOnSyntax[T] = js.native
  def whenAnyAncestorMatches(
    constraint: js.Function1[
      /* request */ inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Request, 
      scala.Boolean
    ]
  ): ProvideOnSyntax[T] = js.native
  def whenAnyAncestorNamed(name: java.lang.String): ProvideOnSyntax[T] = js.native
  def whenAnyAncestorTagged(tag: java.lang.String, value: js.Any): ProvideOnSyntax[T] = js.native
  def whenInjectedInto(parent: java.lang.String): ProvideOnSyntax[T] = js.native
  def whenInjectedInto(parent: js.Function): ProvideOnSyntax[T] = js.native
  def whenNoAncestorIs(ancestor: java.lang.String): ProvideOnSyntax[T] = js.native
  def whenNoAncestorIs(ancestor: js.Function): ProvideOnSyntax[T] = js.native
  def whenNoAncestorMatches(
    constraint: js.Function1[
      /* request */ inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Request, 
      scala.Boolean
    ]
  ): ProvideOnSyntax[T] = js.native
  def whenNoAncestorNamed(name: java.lang.String): ProvideOnSyntax[T] = js.native
  def whenNoAncestorTagged(tag: java.lang.String, value: js.Any): ProvideOnSyntax[T] = js.native
  def whenParentNamed(name: java.lang.String): ProvideOnSyntax[T] = js.native
  def whenParentTagged(tag: java.lang.String, value: js.Any): ProvideOnSyntax[T] = js.native
  def whenTargetNamed(name: java.lang.String): ProvideOnSyntax[T] = js.native
  def whenTargetTagged(tag: java.lang.String, value: js.Any): ProvideOnSyntax[T] = js.native
}

