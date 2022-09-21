package typings.koaPinoLogger

import typings.pino.mod.DestinationStream
import typings.pino.mod.Logger
import typings.pino.mod.LoggerOptions
import typings.pinoHttp.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Middleware = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware]
  inline def apply(opts: Unit, stream: DestinationStream): Middleware = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Middleware]
  inline def apply(opts: Options): Middleware = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def apply(opts: Options, stream: DestinationStream): Middleware = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Middleware]
  inline def apply(stream: DestinationStream): Middleware = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  @JSImport("koa-pino-logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compose.Middleware<ParameterizedContext<StateT, ContextT, ResponseBodyT>> * / any */ trait Middleware extends StObject {
    
    var logger: Logger[LoggerOptions]
  }
  object Middleware {
    
    inline def apply(logger: Logger[LoggerOptions]): Middleware = {
      val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
      __obj.asInstanceOf[Middleware]
    }
    
    extension [Self <: Middleware](x: Self) {
      
      inline def setLogger(value: Logger[LoggerOptions]): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object koaAugmentingMod {
    
    trait ExtendableContext extends StObject {
      
      var log: Logger[LoggerOptions]
    }
    object ExtendableContext {
      
      inline def apply(log: Logger[LoggerOptions]): ExtendableContext = {
        val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
        __obj.asInstanceOf[ExtendableContext]
      }
      
      extension [Self <: ExtendableContext](x: Self) {
        
        inline def setLog(value: Logger[LoggerOptions]): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      }
    }
  }
}
