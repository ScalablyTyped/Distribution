package typings.inversifyBindingDecorators

import typings.inversify.interfacesMod.interfaces.Bind
import typings.inversify.interfacesMod.interfaces.Context
import typings.inversify.interfacesMod.interfaces.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify-binding-decorators/dts/interfaces/interfaces", JSImport.Namespace)
@js.native
object interfacesMod extends js.Object {
  
  @js.native
  object interfaces extends js.Object {
    
    @js.native
    trait ProvideDoneSyntax extends js.Object {
      
      def done(): js.Function1[/* target */ js.Any, _] = js.native
      def done(force: Boolean): js.Function1[/* target */ js.Any, _] = js.native
    }
    
    @js.native
    trait ProvideInSyntax[T] extends ProvideDoneSyntax {
      
      def inSingletonScope(): ProvideWhenOnSyntax[T] = js.native
      
      def inTransientScope(): ProvideWhenOnSyntax[T] = js.native
    }
    
    @js.native
    trait ProvideInWhenOnSyntax[T]
      extends ProvideInSyntax[T]
         with ProvideWhenSyntax[T]
         with ProvideOnSyntax[T]
    
    @js.native
    trait ProvideOnSyntax[T] extends ProvideDoneSyntax {
      
      def onActivation(fn: js.Function2[/* context */ Context, /* injectable */ T, T]): ProvideWhenSyntax[T] = js.native
    }
    
    @js.native
    trait ProvideSyntax extends js.Object {
      
      def constraint(bind: Bind, target: js.Any): js.Any = js.native
      @JSName("constraint")
      var constraint_Original: BindConstraint = js.native
      
      var implementationType: js.Any = js.native
    }
    
    @js.native
    trait ProvideWhenOnSyntax[T]
      extends ProvideWhenSyntax[T]
         with ProvideOnSyntax[T]
    
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
    
    type BindConstraint = js.Function2[/* bind */ Bind, /* target */ js.Any, js.Any]
  }
}
