package typings.koaBunyanLogger

import typings.bunyan.mod.^
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koa.mod.Request
import typings.koa.mod.Response
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-bunyan-logger", JSImport.Namespace)
  @js.native
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-bunyan-logger", JSImport.Namespace)
  @js.native
  def apply(logger: ^): Middleware[DefaultState, DefaultContext] = js.native
  
  @JSImport("koa-bunyan-logger", "requestIdContext")
  @js.native
  def requestIdContext(): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-bunyan-logger", "requestIdContext")
  @js.native
  def requestIdContext(opts: RequestIdContextOptions): Middleware[DefaultState, DefaultContext] = js.native
  
  @JSImport("koa-bunyan-logger", "requestLogger")
  @js.native
  def requestLogger(): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-bunyan-logger", "requestLogger")
  @js.native
  def requestLogger(opts: RequestLoggerOptions): Middleware[DefaultState, DefaultContext] = js.native
  
  @JSImport("koa-bunyan-logger", "timeContext")
  @js.native
  def timeContext(): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-bunyan-logger", "timeContext")
  @js.native
  def timeContext(opts: TimeContextOptions): Middleware[DefaultState, DefaultContext] = js.native
  
  @js.native
  trait RequestData extends StObject {
    
    var req: Request = js.native
  }
  object RequestData {
    
    @scala.inline
    def apply(req: Request): RequestData = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestData]
    }
    
    @scala.inline
    implicit class RequestDataMutableBuilder[Self <: RequestData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReq(value: Request): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestIdContextOptions extends StObject {
    
    var field: js.UndefOr[String] = js.native
    
    var header: js.UndefOr[String] = js.native
    
    var prop: js.UndefOr[String] = js.native
    
    var requestProp: js.UndefOr[String] = js.native
  }
  object RequestIdContextOptions {
    
    @scala.inline
    def apply(): RequestIdContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestIdContextOptions]
    }
    
    @scala.inline
    implicit class RequestIdContextOptionsMutableBuilder[Self <: RequestIdContextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
      
      @scala.inline
      def setRequestProp(value: String): Self = StObject.set(x, "requestProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestPropUndefined: Self = StObject.set(x, "requestProp", js.undefined)
    }
  }
  
  @js.native
  trait RequestLoggerOptions extends StObject {
    
    var durationField: js.UndefOr[String] = js.native
    
    var formatRequestMessage: js.UndefOr[js.Function1[/* requestData */ RequestData, String]] = js.native
    
    var formatResponseMessage: js.UndefOr[js.Function1[/* responseData */ ResponseData, String]] = js.native
    
    var ignorePath: js.UndefOr[js.Array[String]] = js.native
    
    var levelFn: js.UndefOr[js.Function2[/* status */ Double, /* err */ Error, String]] = js.native
    
    var updateLogFields: js.UndefOr[js.Function1[/* data */ RequestData, RequestData]] = js.native
    
    var updateRequestLogFields: js.UndefOr[js.Function1[/* requestData */ RequestData, RequestData]] = js.native
    
    var updateResponseLogFields: js.UndefOr[js.Function1[/* responseData */ ResponseData, ResponseData]] = js.native
  }
  object RequestLoggerOptions {
    
    @scala.inline
    def apply(): RequestLoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestLoggerOptions]
    }
    
    @scala.inline
    implicit class RequestLoggerOptionsMutableBuilder[Self <: RequestLoggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDurationField(value: String): Self = StObject.set(x, "durationField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationFieldUndefined: Self = StObject.set(x, "durationField", js.undefined)
      
      @scala.inline
      def setFormatRequestMessage(value: /* requestData */ RequestData => String): Self = StObject.set(x, "formatRequestMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatRequestMessageUndefined: Self = StObject.set(x, "formatRequestMessage", js.undefined)
      
      @scala.inline
      def setFormatResponseMessage(value: /* responseData */ ResponseData => String): Self = StObject.set(x, "formatResponseMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatResponseMessageUndefined: Self = StObject.set(x, "formatResponseMessage", js.undefined)
      
      @scala.inline
      def setIgnorePath(value: js.Array[String]): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePathUndefined: Self = StObject.set(x, "ignorePath", js.undefined)
      
      @scala.inline
      def setIgnorePathVarargs(value: String*): Self = StObject.set(x, "ignorePath", js.Array(value :_*))
      
      @scala.inline
      def setLevelFn(value: (/* status */ Double, /* err */ Error) => String): Self = StObject.set(x, "levelFn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLevelFnUndefined: Self = StObject.set(x, "levelFn", js.undefined)
      
      @scala.inline
      def setUpdateLogFields(value: /* data */ RequestData => RequestData): Self = StObject.set(x, "updateLogFields", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateLogFieldsUndefined: Self = StObject.set(x, "updateLogFields", js.undefined)
      
      @scala.inline
      def setUpdateRequestLogFields(value: /* requestData */ RequestData => RequestData): Self = StObject.set(x, "updateRequestLogFields", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateRequestLogFieldsUndefined: Self = StObject.set(x, "updateRequestLogFields", js.undefined)
      
      @scala.inline
      def setUpdateResponseLogFields(value: /* responseData */ ResponseData => ResponseData): Self = StObject.set(x, "updateResponseLogFields", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateResponseLogFieldsUndefined: Self = StObject.set(x, "updateResponseLogFields", js.undefined)
    }
  }
  
  @js.native
  trait ResponseData extends StObject {
    
    var req: Request = js.native
    
    var res: Response = js.native
  }
  object ResponseData {
    
    @scala.inline
    def apply(req: Request, res: Response): ResponseData = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseData]
    }
    
    @scala.inline
    implicit class ResponseDataMutableBuilder[Self <: ResponseData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReq(value: Request): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRes(value: Response): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TimeContextOptions extends StObject {
    
    var logLevel: js.UndefOr[String] = js.native
    
    var updateLogFields: js.UndefOr[js.Function1[/* fields */ js.Any, _]] = js.native
  }
  object TimeContextOptions {
    
    @scala.inline
    def apply(): TimeContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeContextOptions]
    }
    
    @scala.inline
    implicit class TimeContextOptionsMutableBuilder[Self <: TimeContextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setUpdateLogFields(value: /* fields */ js.Any => _): Self = StObject.set(x, "updateLogFields", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateLogFieldsUndefined: Self = StObject.set(x, "updateLogFields", js.undefined)
    }
  }
  
  // Extend the Koa context to add the logger..
  /* augmented module */
  object koaAugmentingMod {
    
    @js.native
    trait BaseContext extends StObject {
      
      var log: ^ = js.native
    }
    object BaseContext {
      
      @scala.inline
      def apply(log: ^): BaseContext = {
        val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
        __obj.asInstanceOf[BaseContext]
      }
      
      @scala.inline
      implicit class BaseContextMutableBuilder[Self <: BaseContext] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLog(value: ^): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      }
    }
  }
}
