package typings.koaIgnore

import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait If extends StObject {
    
    def `if`(condition: js.Function1[/* context */ Context, Boolean]): Middleware[DefaultState, DefaultContext]
    
    def unless(condition: js.Function1[/* context */ Context, Boolean]): Middleware[DefaultState, DefaultContext]
  }
  object If {
    
    @scala.inline
    def apply(
      `if`: js.Function1[/* context */ Context, Boolean] => Middleware[DefaultState, DefaultContext],
      unless: js.Function1[/* context */ Context, Boolean] => Middleware[DefaultState, DefaultContext]
    ): If = {
      val __obj = js.Dynamic.literal(unless = js.Any.fromFunction1(unless))
      __obj.updateDynamic("if")(js.Any.fromFunction1(`if`))
      __obj.asInstanceOf[If]
    }
    
    @scala.inline
    implicit class IfMutableBuilder[Self <: If] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIf(value: js.Function1[/* context */ Context, Boolean] => Middleware[DefaultState, DefaultContext]): Self = StObject.set(x, "if", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnless(value: js.Function1[/* context */ Context, Boolean] => Middleware[DefaultState, DefaultContext]): Self = StObject.set(x, "unless", js.Any.fromFunction1(value))
    }
  }
}
