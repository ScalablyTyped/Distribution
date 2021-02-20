package typings.libratoNode

import org.scalablytyped.runtime.StringDictionary
import typings.libratoNode.anon.RequestCountKey
import typings.libratoNode.libratoNodeBooleans.`false`
import typings.libratoNode.libratoNodeBooleans.`true`
import typings.libratoNode.libratoNodeStrings.SIGINT
import typings.libratoNode.libratoNodeStrings.error
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("librato-node", "configure")
  @js.native
  def configure(config: LibratoConfig): Unit = js.native
  @JSImport("librato-node", "configure")
  @js.native
  def configure(config: LibratoSimulate): Unit = js.native
  
  @JSImport("librato-node", "flush")
  @js.native
  def flush(): Unit = js.native
  @JSImport("librato-node", "flush")
  @js.native
  def flush(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  
  @JSImport("librato-node", "increment")
  @js.native
  def increment(name: String): Unit = js.native
  @JSImport("librato-node", "increment")
  @js.native
  def increment(name: String, value: js.UndefOr[scala.Nothing], opts: CustomSource): Unit = js.native
  @JSImport("librato-node", "increment")
  @js.native
  def increment(name: String, value: Double): Unit = js.native
  @JSImport("librato-node", "increment")
  @js.native
  def increment(name: String, value: Double, opts: CustomSource): Unit = js.native
  
  @JSImport("librato-node", "measure")
  @js.native
  def measure(name: String, value: Double): Unit = js.native
  @JSImport("librato-node", "measure")
  @js.native
  def measure(name: String, value: Double, opts: CustomSource): Unit = js.native
  
  @JSImport("librato-node", "middleware")
  @js.native
  def middleware(): js.Function3[
    /* req */ js.Object, 
    /* res */ js.Object, 
    /* next */ js.Function0[Unit | js.Promise[Unit]], 
    Unit
  ] = js.native
  @JSImport("librato-node", "middleware")
  @js.native
  def middleware(config: RequestCountKey): js.Function3[
    /* req */ js.Object, 
    /* res */ js.Object, 
    /* next */ js.Function0[Unit | js.Promise[Unit]], 
    Unit
  ] = js.native
  
  @JSImport("librato-node", "on")
  @js.native
  def on_SIGINT(event: SIGINT, handler: js.Function0[Unit]): Unit = js.native
  @JSImport("librato-node", "on")
  @js.native
  def on_error(event: error, handler: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("librato-node", "start")
  @js.native
  def start(): Unit = js.native
  
  @JSImport("librato-node", "stop")
  @js.native
  def stop(): Unit = js.native
  @JSImport("librato-node", "stop")
  @js.native
  def stop(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  
  @JSImport("librato-node", "timing")
  @js.native
  def timing(name: String, fn: js.Function1[/* done */ js.Function0[Unit], Unit]): Unit = js.native
  @JSImport("librato-node", "timing")
  @js.native
  def timing(
    name: String,
    fn: js.Function1[/* done */ js.Function0[Unit], Unit],
    cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  @JSImport("librato-node", "timing")
  @js.native
  def timing(
    name: String,
    fn: js.Function1[/* done */ js.Function0[Unit], Unit],
    opts: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  @JSImport("librato-node", "timing")
  @js.native
  def timing(name: String, fn: js.Function1[/* done */ js.Function0[Unit], Unit], opts: CustomSource): Unit = js.native
  @JSImport("librato-node", "timing")
  @js.native
  def timing(
    name: String,
    fn: js.Function1[/* done */ js.Function0[Unit], Unit],
    opts: CustomSource,
    cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  @JSImport("librato-node", "timing")
  @js.native
  def timing_T_T[T](
    name: String,
    fn: js.Function1[
      /* done */ js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ T, T], 
      Unit
    ]
  ): T = js.native
  @JSImport("librato-node", "timing")
  @js.native
  def timing_T_T[T](
    name: String,
    fn: js.Function1[
      /* done */ js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ T, T], 
      Unit
    ],
    cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  ): T = js.native
  @JSImport("librato-node", "timing")
  @js.native
  def timing_T_T[T](
    name: String,
    fn: js.Function1[
      /* done */ js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ T, T], 
      Unit
    ],
    opts: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  ): T = js.native
  @JSImport("librato-node", "timing")
  @js.native
  def timing_T_T[T](
    name: String,
    fn: js.Function1[
      /* done */ js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ T, T], 
      Unit
    ],
    opts: CustomSource
  ): T = js.native
  @JSImport("librato-node", "timing")
  @js.native
  def timing_T_T[T](
    name: String,
    fn: js.Function1[
      /* done */ js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ T, T], 
      Unit
    ],
    opts: CustomSource,
    cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  ): T = js.native
  
  @js.native
  trait CustomSource extends StObject {
    
    var source: String = js.native
  }
  object CustomSource {
    
    @scala.inline
    def apply(source: String): CustomSource = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomSource]
    }
    
    @scala.inline
    implicit class CustomSourceMutableBuilder[Self <: CustomSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LibratoConfig extends StObject {
    
    var email: String = js.native
    
    var period: js.UndefOr[Double] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var requestOptions: js.UndefOr[LibratoRequestOptions] = js.native
    
    var simulate: js.UndefOr[`false`] = js.native
    
    var source: js.UndefOr[String] = js.native
    
    var token: String = js.native
  }
  object LibratoConfig {
    
    @scala.inline
    def apply(email: String, token: String): LibratoConfig = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[LibratoConfig]
    }
    
    @scala.inline
    implicit class LibratoConfigMutableBuilder[Self <: LibratoConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRequestOptions(value: LibratoRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
      
      @scala.inline
      def setSimulate(value: `false`): Self = StObject.set(x, "simulate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimulateUndefined: Self = StObject.set(x, "simulate", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LibratoRequestOptions extends StObject {
    
    var authorization: js.UndefOr[String] = js.native
    
    var delayStrategy: js.UndefOr[js.Function0[Double]] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var maxAttempts: js.UndefOr[Double] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var retryDelay: js.UndefOr[Double] = js.native
    
    var uri: js.UndefOr[String] = js.native
    
    var `user-agent`: js.UndefOr[String] = js.native
  }
  object LibratoRequestOptions {
    
    @scala.inline
    def apply(): LibratoRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LibratoRequestOptions]
    }
    
    @scala.inline
    implicit class LibratoRequestOptionsMutableBuilder[Self <: LibratoRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
      
      @scala.inline
      def setDelayStrategy(value: () => Double): Self = StObject.set(x, "delayStrategy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDelayStrategyUndefined: Self = StObject.set(x, "delayStrategy", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      @scala.inline
      def `setUser-agent`(value: String): Self = StObject.set(x, "user-agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setUser-agentUndefined`: Self = StObject.set(x, "user-agent", js.undefined)
    }
  }
  
  @js.native
  trait LibratoSimulate extends StObject {
    
    var simulate: `true` = js.native
  }
  object LibratoSimulate {
    
    @scala.inline
    def apply(simulate: `true`): LibratoSimulate = {
      val __obj = js.Dynamic.literal(simulate = simulate.asInstanceOf[js.Any])
      __obj.asInstanceOf[LibratoSimulate]
    }
    
    @scala.inline
    implicit class LibratoSimulateMutableBuilder[Self <: LibratoSimulate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSimulate(value: `true`): Self = StObject.set(x, "simulate", value.asInstanceOf[js.Any])
    }
  }
}
