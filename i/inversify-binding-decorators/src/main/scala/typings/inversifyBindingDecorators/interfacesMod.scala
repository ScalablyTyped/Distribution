package typings.inversifyBindingDecorators

import typings.inversify.interfacesMod.interfaces.Bind
import typings.inversify.interfacesMod.interfaces.Context
import typings.inversify.interfacesMod.interfaces.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  object interfaces {
    
    type BindConstraint = js.Function2[/* bind */ Bind, /* target */ js.Any, js.Any]
    
    @js.native
    trait ProvideDoneSyntax extends StObject {
      
      def done(): js.Function1[/* target */ js.Any, js.Any] = js.native
      def done(force: Boolean): js.Function1[/* target */ js.Any, js.Any] = js.native
    }
    
    @js.native
    trait ProvideInSyntax[T]
      extends StObject
         with ProvideDoneSyntax {
      
      def inSingletonScope(): ProvideWhenOnSyntax[T] = js.native
      
      def inTransientScope(): ProvideWhenOnSyntax[T] = js.native
    }
    
    @js.native
    trait ProvideInWhenOnSyntax[T]
      extends StObject
         with ProvideInSyntax[T]
         with ProvideWhenSyntax[T]
         with ProvideOnSyntax[T]
    
    @js.native
    trait ProvideOnSyntax[T]
      extends StObject
         with ProvideDoneSyntax {
      
      def onActivation(fn: js.Function2[/* context */ Context, /* injectable */ T, T]): ProvideWhenSyntax[T] = js.native
    }
    
    trait ProvideSyntax extends StObject {
      
      def constraint(bind: Bind, target: js.Any): js.Any
      @JSName("constraint")
      var constraint_Original: BindConstraint
      
      var implementationType: js.Any
    }
    object ProvideSyntax {
      
      inline def apply(constraint: (/* bind */ Bind, /* target */ js.Any) => js.Any, implementationType: js.Any): ProvideSyntax = {
        val __obj = js.Dynamic.literal(constraint = js.Any.fromFunction2(constraint), implementationType = implementationType.asInstanceOf[js.Any])
        __obj.asInstanceOf[ProvideSyntax]
      }
      
      extension [Self <: ProvideSyntax](x: Self) {
        
        inline def setConstraint(value: (/* bind */ Bind, /* target */ js.Any) => js.Any): Self = StObject.set(x, "constraint", js.Any.fromFunction2(value))
        
        inline def setImplementationType(value: js.Any): Self = StObject.set(x, "implementationType", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ProvideWhenOnSyntax[T]
      extends StObject
         with ProvideWhenSyntax[T]
         with ProvideOnSyntax[T]
    
    @js.native
    trait ProvideWhenSyntax[T]
      extends StObject
         with ProvideDoneSyntax {
      
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
  }
}
