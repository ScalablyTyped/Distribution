package typings.koaPinoLogger

import typings.pino.mod.DestinationStream
import typings.pino.mod.Logger
import typings.pinoHttp.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-pino-logger", JSImport.Namespace)
  @js.native
  def apply(): Middleware = js.native
  @JSImport("koa-pino-logger", JSImport.Namespace)
  @js.native
  def apply(opts: js.UndefOr[scala.Nothing], stream: DestinationStream): Middleware = js.native
  @JSImport("koa-pino-logger", JSImport.Namespace)
  @js.native
  def apply(opts: Options): Middleware = js.native
  @JSImport("koa-pino-logger", JSImport.Namespace)
  @js.native
  def apply(opts: Options, stream: DestinationStream): Middleware = js.native
  @JSImport("koa-pino-logger", JSImport.Namespace)
  @js.native
  def apply(stream: DestinationStream): Middleware = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compose.Middleware<ParameterizedContext<StateT, CustomT>> * / any */ @js.native
  trait Middleware extends StObject {
    
    var logger: Logger = js.native
  }
  object Middleware {
    
    @scala.inline
    def apply(logger: Logger): Middleware = {
      val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
      __obj.asInstanceOf[Middleware]
    }
    
    @scala.inline
    implicit class MiddlewareMutableBuilder[Self <: Middleware] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object koaAugmentingMod {
    
    @js.native
    trait ExtendableContext extends StObject {
      
      var log: Logger = js.native
    }
    object ExtendableContext {
      
      @scala.inline
      def apply(log: Logger): ExtendableContext = {
        val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
        __obj.asInstanceOf[ExtendableContext]
      }
      
      @scala.inline
      implicit class ExtendableContextMutableBuilder[Self <: ExtendableContext] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLog(value: Logger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      }
    }
  }
}
