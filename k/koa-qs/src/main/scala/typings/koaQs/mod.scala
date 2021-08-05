package typings.koaQs

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(app: typings.koa.mod.^[DefaultState, DefaultContext]): typings.koa.mod.^[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[typings.koa.mod.^[DefaultState, DefaultContext]]
  inline def apply(app: typings.koa.mod.^[DefaultState, DefaultContext], mode: ParseMode): typings.koa.mod.^[DefaultState, DefaultContext] = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typings.koa.mod.^[DefaultState, DefaultContext]]
  
  @JSImport("koa-qs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.koaQs.koaQsStrings.extended
    - typings.koaQs.koaQsStrings.strict
    - typings.koaQs.koaQsStrings.first
  */
  trait ParseMode extends StObject
  object ParseMode {
    
    inline def extended: typings.koaQs.koaQsStrings.extended = "extended".asInstanceOf[typings.koaQs.koaQsStrings.extended]
    
    inline def first: typings.koaQs.koaQsStrings.first = "first".asInstanceOf[typings.koaQs.koaQsStrings.first]
    
    inline def strict: typings.koaQs.koaQsStrings.strict = "strict".asInstanceOf[typings.koaQs.koaQsStrings.strict]
  }
}
