package typings.libratoNode

import org.scalablytyped.runtime.StringDictionary
import typings.libratoNode.anon.RequestCountKey
import typings.libratoNode.libratoNodeBooleans.`false`
import typings.libratoNode.libratoNodeBooleans.`true`
import typings.libratoNode.libratoNodeStrings.SIGINT
import typings.libratoNode.libratoNodeStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("librato-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configure(config: LibratoConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def configure(config: LibratoSimulate): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
  inline def flush(cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def increment(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def increment(name: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("increment")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def increment(name: String, value: Double, opts: CustomSource): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("increment")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def increment(name: String, value: Unit, opts: CustomSource): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("increment")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def measure(name: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def measure(name: String, value: Double, opts: CustomSource): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def middleware(): js.Function3[
    /* req */ js.Object, 
    /* res */ js.Object, 
    /* next */ js.Function0[Unit | js.Promise[Unit]], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")().asInstanceOf[js.Function3[
    /* req */ js.Object, 
    /* res */ js.Object, 
    /* next */ js.Function0[Unit | js.Promise[Unit]], 
    Unit
  ]]
  inline def middleware(config: RequestCountKey): js.Function3[
    /* req */ js.Object, 
    /* res */ js.Object, 
    /* next */ js.Function0[Unit | js.Promise[Unit]], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* req */ js.Object, 
    /* res */ js.Object, 
    /* next */ js.Function0[Unit | js.Promise[Unit]], 
    Unit
  ]]
  
  inline def on_SIGINT(event: SIGINT, handler: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_error(event: error, handler: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def start(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[Unit]
  
  inline def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
  inline def stop(cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def timing(name: String, fn: js.Function1[/* done */ js.Function0[Unit], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def timing(
    name: String,
    fn: js.Function1[/* done */ js.Function0[Unit], Unit],
    cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def timing(
    name: String,
    fn: js.Function1[/* done */ js.Function0[Unit], Unit],
    opts: Unit,
    cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def timing(name: String, fn: js.Function1[/* done */ js.Function0[Unit], Unit], opts: CustomSource): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def timing(
    name: String,
    fn: js.Function1[/* done */ js.Function0[Unit], Unit],
    opts: CustomSource,
    cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def timing_T_T[T](
    name: String,
    fn: js.Function1[
      /* done */ js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ T, T], 
      Unit
    ]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def timing_T_T[T](
    name: String,
    fn: js.Function1[
      /* done */ js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ T, T], 
      Unit
    ],
    cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def timing_T_T[T](
    name: String,
    fn: js.Function1[
      /* done */ js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ T, T], 
      Unit
    ],
    opts: Unit,
    cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def timing_T_T[T](
    name: String,
    fn: js.Function1[
      /* done */ js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ T, T], 
      Unit
    ],
    opts: CustomSource
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def timing_T_T[T](
    name: String,
    fn: js.Function1[
      /* done */ js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ T, T], 
      Unit
    ],
    opts: CustomSource,
    cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait CustomSource extends StObject {
    
    var source: String
  }
  object CustomSource {
    
    inline def apply(source: String): CustomSource = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomSource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomSource] (val x: Self) extends AnyVal {
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait LibratoConfig extends StObject {
    
    var email: String
    
    var period: js.UndefOr[Double] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var requestOptions: js.UndefOr[LibratoRequestOptions] = js.undefined
    
    var simulate: js.UndefOr[`false`] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
    
    var token: String
  }
  object LibratoConfig {
    
    inline def apply(email: String, token: String): LibratoConfig = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[LibratoConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LibratoConfig] (val x: Self) extends AnyVal {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRequestOptions(value: LibratoRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
      
      inline def setSimulate(value: `false`): Self = StObject.set(x, "simulate", value.asInstanceOf[js.Any])
      
      inline def setSimulateUndefined: Self = StObject.set(x, "simulate", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait LibratoRequestOptions extends StObject {
    
    var authorization: js.UndefOr[String] = js.undefined
    
    var delayStrategy: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var maxAttempts: js.UndefOr[Double] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var retryDelay: js.UndefOr[Double] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
    
    var `user-agent`: js.UndefOr[String] = js.undefined
  }
  object LibratoRequestOptions {
    
    inline def apply(): LibratoRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LibratoRequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LibratoRequestOptions] (val x: Self) extends AnyVal {
      
      inline def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
      
      inline def setDelayStrategy(value: () => Double): Self = StObject.set(x, "delayStrategy", js.Any.fromFunction0(value))
      
      inline def setDelayStrategyUndefined: Self = StObject.set(x, "delayStrategy", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      inline def `setUser-agent`(value: String): Self = StObject.set(x, "user-agent", value.asInstanceOf[js.Any])
      
      inline def `setUser-agentUndefined`: Self = StObject.set(x, "user-agent", js.undefined)
    }
  }
  
  trait LibratoSimulate extends StObject {
    
    var simulate: `true`
  }
  object LibratoSimulate {
    
    inline def apply(): LibratoSimulate = {
      val __obj = js.Dynamic.literal(simulate = true)
      __obj.asInstanceOf[LibratoSimulate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LibratoSimulate] (val x: Self) extends AnyVal {
      
      inline def setSimulate(value: `true`): Self = StObject.set(x, "simulate", value.asInstanceOf[js.Any])
    }
  }
}
