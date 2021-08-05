package typings.koaBunyanLogger

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koa.mod.Request
import typings.koa.mod.Response
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext]]
  inline def apply(logger: typings.bunyan.mod.^): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply(logger.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  @JSImport("koa-bunyan-logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def requestIdContext(): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestIdContext")().asInstanceOf[Middleware[DefaultState, DefaultContext]]
  inline def requestIdContext(opts: RequestIdContextOptions): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestIdContext")(opts.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  inline def requestLogger(): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestLogger")().asInstanceOf[Middleware[DefaultState, DefaultContext]]
  inline def requestLogger(opts: RequestLoggerOptions): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestLogger")(opts.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  inline def timeContext(): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeContext")().asInstanceOf[Middleware[DefaultState, DefaultContext]]
  inline def timeContext(opts: TimeContextOptions): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeContext")(opts.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  trait RequestData extends StObject {
    
    var req: Request
  }
  object RequestData {
    
    inline def apply(req: Request): RequestData = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestData]
    }
    
    extension [Self <: RequestData](x: Self) {
      
      inline def setReq(value: Request): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestIdContextOptions extends StObject {
    
    var field: js.UndefOr[String] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var prop: js.UndefOr[String] = js.undefined
    
    var requestProp: js.UndefOr[String] = js.undefined
  }
  object RequestIdContextOptions {
    
    inline def apply(): RequestIdContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestIdContextOptions]
    }
    
    extension [Self <: RequestIdContextOptions](x: Self) {
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
      
      inline def setRequestProp(value: String): Self = StObject.set(x, "requestProp", value.asInstanceOf[js.Any])
      
      inline def setRequestPropUndefined: Self = StObject.set(x, "requestProp", js.undefined)
    }
  }
  
  trait RequestLoggerOptions extends StObject {
    
    var durationField: js.UndefOr[String] = js.undefined
    
    var formatRequestMessage: js.UndefOr[js.Function1[/* requestData */ RequestData, String]] = js.undefined
    
    var formatResponseMessage: js.UndefOr[js.Function1[/* responseData */ ResponseData, String]] = js.undefined
    
    var ignorePath: js.UndefOr[js.Array[String]] = js.undefined
    
    var levelFn: js.UndefOr[js.Function2[/* status */ Double, /* err */ Error, String]] = js.undefined
    
    var updateLogFields: js.UndefOr[js.Function1[/* data */ RequestData, RequestData]] = js.undefined
    
    var updateRequestLogFields: js.UndefOr[js.Function1[/* requestData */ RequestData, RequestData]] = js.undefined
    
    var updateResponseLogFields: js.UndefOr[js.Function1[/* responseData */ ResponseData, ResponseData]] = js.undefined
  }
  object RequestLoggerOptions {
    
    inline def apply(): RequestLoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestLoggerOptions]
    }
    
    extension [Self <: RequestLoggerOptions](x: Self) {
      
      inline def setDurationField(value: String): Self = StObject.set(x, "durationField", value.asInstanceOf[js.Any])
      
      inline def setDurationFieldUndefined: Self = StObject.set(x, "durationField", js.undefined)
      
      inline def setFormatRequestMessage(value: /* requestData */ RequestData => String): Self = StObject.set(x, "formatRequestMessage", js.Any.fromFunction1(value))
      
      inline def setFormatRequestMessageUndefined: Self = StObject.set(x, "formatRequestMessage", js.undefined)
      
      inline def setFormatResponseMessage(value: /* responseData */ ResponseData => String): Self = StObject.set(x, "formatResponseMessage", js.Any.fromFunction1(value))
      
      inline def setFormatResponseMessageUndefined: Self = StObject.set(x, "formatResponseMessage", js.undefined)
      
      inline def setIgnorePath(value: js.Array[String]): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
      
      inline def setIgnorePathUndefined: Self = StObject.set(x, "ignorePath", js.undefined)
      
      inline def setIgnorePathVarargs(value: String*): Self = StObject.set(x, "ignorePath", js.Array(value :_*))
      
      inline def setLevelFn(value: (/* status */ Double, /* err */ Error) => String): Self = StObject.set(x, "levelFn", js.Any.fromFunction2(value))
      
      inline def setLevelFnUndefined: Self = StObject.set(x, "levelFn", js.undefined)
      
      inline def setUpdateLogFields(value: /* data */ RequestData => RequestData): Self = StObject.set(x, "updateLogFields", js.Any.fromFunction1(value))
      
      inline def setUpdateLogFieldsUndefined: Self = StObject.set(x, "updateLogFields", js.undefined)
      
      inline def setUpdateRequestLogFields(value: /* requestData */ RequestData => RequestData): Self = StObject.set(x, "updateRequestLogFields", js.Any.fromFunction1(value))
      
      inline def setUpdateRequestLogFieldsUndefined: Self = StObject.set(x, "updateRequestLogFields", js.undefined)
      
      inline def setUpdateResponseLogFields(value: /* responseData */ ResponseData => ResponseData): Self = StObject.set(x, "updateResponseLogFields", js.Any.fromFunction1(value))
      
      inline def setUpdateResponseLogFieldsUndefined: Self = StObject.set(x, "updateResponseLogFields", js.undefined)
    }
  }
  
  trait ResponseData extends StObject {
    
    var req: Request
    
    var res: Response
  }
  object ResponseData {
    
    inline def apply(req: Request, res: Response): ResponseData = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseData]
    }
    
    extension [Self <: ResponseData](x: Self) {
      
      inline def setReq(value: Request): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setRes(value: Response): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeContextOptions extends StObject {
    
    var logLevel: js.UndefOr[String] = js.undefined
    
    var updateLogFields: js.UndefOr[js.Function1[/* fields */ js.Any, js.Any]] = js.undefined
  }
  object TimeContextOptions {
    
    inline def apply(): TimeContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeContextOptions]
    }
    
    extension [Self <: TimeContextOptions](x: Self) {
      
      inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setUpdateLogFields(value: /* fields */ js.Any => js.Any): Self = StObject.set(x, "updateLogFields", js.Any.fromFunction1(value))
      
      inline def setUpdateLogFieldsUndefined: Self = StObject.set(x, "updateLogFields", js.undefined)
    }
  }
  
  // Extend the Koa context to add the logger..
  /* augmented module */
  object koaAugmentingMod {
    
    trait BaseContext extends StObject {
      
      var log: typings.bunyan.mod.^
    }
    object BaseContext {
      
      inline def apply(log: typings.bunyan.mod.^): BaseContext = {
        val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
        __obj.asInstanceOf[BaseContext]
      }
      
      extension [Self <: BaseContext](x: Self) {
        
        inline def setLog(value: typings.bunyan.mod.^): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      }
    }
  }
}
