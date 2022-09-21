package typings.koaConvert

import org.scalablytyped.runtime.Shortcut
import typings.koa.mod.Middleware
import typings.koaConvert.mod.KoaConvert.convert
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("koa-convert", JSImport.Namespace)
  @js.native
  val ^ : convert = js.native
  
  object KoaConvert {
    
    @js.native
    trait convert extends StObject {
      
      def apply[State, Context](mw: MW[State, Context]): Middleware[State, Context, Any] = js.native
      
      def back[State, Context](mw: MW[State, Context]): Middleware[State, Context, Any] = js.native
      
      def compose[State, Context](mw: (MW[State, Context])*): Middleware[State, Context, Any] = js.native
    }
  }
  
  type MW[State, Context] = (js.Function1[/* next */ Any, Generator[Any, Any, Any]]) | (Middleware[State, Context, Any])
  
  type _To = convert
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: convert = ^
}
