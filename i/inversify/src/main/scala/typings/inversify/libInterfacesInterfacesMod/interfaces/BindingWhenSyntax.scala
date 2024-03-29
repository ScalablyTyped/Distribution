package typings.inversify.libInterfacesInterfacesMod.interfaces

import typings.std.NewableFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingWhenSyntax[T] extends StObject {
  
  def when(constraint: js.Function1[/* request */ Request, Boolean]): BindingOnSyntax[T] = js.native
  
  def whenAnyAncestorIs(ancestor: String): BindingOnSyntax[T] = js.native
  def whenAnyAncestorIs(ancestor: NewableFunction): BindingOnSyntax[T] = js.native
  
  def whenAnyAncestorMatches(constraint: js.Function1[/* request */ Request, Boolean]): BindingOnSyntax[T] = js.native
  
  def whenAnyAncestorNamed(name: String): BindingOnSyntax[T] = js.native
  def whenAnyAncestorNamed(name: js.Symbol): BindingOnSyntax[T] = js.native
  def whenAnyAncestorNamed(name: Double): BindingOnSyntax[T] = js.native
  
  def whenAnyAncestorTagged(tag: String, value: Any): BindingOnSyntax[T] = js.native
  def whenAnyAncestorTagged(tag: js.Symbol, value: Any): BindingOnSyntax[T] = js.native
  def whenAnyAncestorTagged(tag: Double, value: Any): BindingOnSyntax[T] = js.native
  
  def whenInjectedInto(parent: String): BindingOnSyntax[T] = js.native
  def whenInjectedInto(parent: NewableFunction): BindingOnSyntax[T] = js.native
  
  def whenNoAncestorIs(ancestor: String): BindingOnSyntax[T] = js.native
  def whenNoAncestorIs(ancestor: NewableFunction): BindingOnSyntax[T] = js.native
  
  def whenNoAncestorMatches(constraint: js.Function1[/* request */ Request, Boolean]): BindingOnSyntax[T] = js.native
  
  def whenNoAncestorNamed(name: String): BindingOnSyntax[T] = js.native
  def whenNoAncestorNamed(name: js.Symbol): BindingOnSyntax[T] = js.native
  def whenNoAncestorNamed(name: Double): BindingOnSyntax[T] = js.native
  
  def whenNoAncestorTagged(tag: String, value: Any): BindingOnSyntax[T] = js.native
  def whenNoAncestorTagged(tag: js.Symbol, value: Any): BindingOnSyntax[T] = js.native
  def whenNoAncestorTagged(tag: Double, value: Any): BindingOnSyntax[T] = js.native
  
  def whenParentNamed(name: String): BindingOnSyntax[T] = js.native
  def whenParentNamed(name: js.Symbol): BindingOnSyntax[T] = js.native
  def whenParentNamed(name: Double): BindingOnSyntax[T] = js.native
  
  def whenParentTagged(tag: String, value: Any): BindingOnSyntax[T] = js.native
  def whenParentTagged(tag: js.Symbol, value: Any): BindingOnSyntax[T] = js.native
  def whenParentTagged(tag: Double, value: Any): BindingOnSyntax[T] = js.native
  
  def whenTargetIsDefault(): BindingOnSyntax[T] = js.native
  
  def whenTargetNamed(name: String): BindingOnSyntax[T] = js.native
  def whenTargetNamed(name: js.Symbol): BindingOnSyntax[T] = js.native
  def whenTargetNamed(name: Double): BindingOnSyntax[T] = js.native
  
  def whenTargetTagged(tag: String, value: Any): BindingOnSyntax[T] = js.native
  def whenTargetTagged(tag: js.Symbol, value: Any): BindingOnSyntax[T] = js.native
  def whenTargetTagged(tag: Double, value: Any): BindingOnSyntax[T] = js.native
}
