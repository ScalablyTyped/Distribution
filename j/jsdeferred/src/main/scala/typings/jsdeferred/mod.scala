package typings.jsdeferred

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    @JSGlobal("Deferred")
    @js.native
    class Deferred () extends StObject {
      
      def call(): Deferred = js.native
      def call(`val`: js.Any): Deferred = js.native
      
      def cancel(): Deferred = js.native
      
      def error(fun: ErrorCallback): Deferred = js.native
      
      def fail(err: js.Any): Deferred = js.native
      
      def loop(n: Double, fun: FunctionWithNumber): Deferred = js.native
      def loop(n: Loop_, fun: FunctionWithNumber): Deferred = js.native
      
      def next(fun: js.Function): Deferred = js.native
      
      def parallel(dl: js.Any): Deferred = js.native
      
      def wait(n: Double): Deferred = js.native
    }
    object Deferred {
      
      @JSGlobal("Deferred")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Deferred.call")
      @js.native
      def call(fun: js.UndefOr[scala.Nothing], args: js.Any*): Deferred = js.native
      /* static member */
      @JSGlobal("Deferred.call")
      @js.native
      def call(fun: js.Function, args: js.Any*): Deferred = js.native
      
      /* static member */
      @JSGlobal("Deferred.chain")
      @js.native
      def chain(args: js.Any*): Deferred = js.native
      
      /* static member */
      @JSGlobal("Deferred.connect")
      @js.native
      def connect(funo: js.Any, options: String): DeferredizedFunction = js.native
      /* static member */
      @JSGlobal("Deferred.connect")
      @js.native
      def connect(funo: js.Function): DeferredizedFunction = js.native
      @JSGlobal("Deferred.connect")
      @js.native
      def connect(funo: js.Function, options: ConnectOption): DeferredizedFunction = js.native
      
      /* static member */
      @JSGlobal("Deferred.define")
      @js.native
      def define(): js.Any = js.native
      @JSGlobal("Deferred.define")
      @js.native
      def define(obj: js.UndefOr[scala.Nothing], list: js.Array[String]): js.Any = js.native
      @JSGlobal("Deferred.define")
      @js.native
      def define(obj: js.Any): js.Any = js.native
      @JSGlobal("Deferred.define")
      @js.native
      def define(obj: js.Any, list: js.Array[String]): js.Any = js.native
      
      /* static member */
      @JSGlobal("Deferred.earlier")
      @js.native
      def earlier(dl: js.Any): Deferred = js.native
      
      /* static member */
      @JSGlobal("Deferred.isDeferred")
      @js.native
      def isDeferred(obj: js.Any): Boolean = js.native
      
      /* static member */
      @JSGlobal("Deferred.loop")
      @js.native
      def loop(n: Double, fun: FunctionWithNumber): Deferred = js.native
      /* static member */
      @JSGlobal("Deferred.loop")
      @js.native
      def loop(n: Loop_, fun: FunctionWithNumber): Deferred = js.native
      
      /* static member */
      @JSGlobal("Deferred.methods")
      @js.native
      def methods: js.Array[String] = js.native
      @scala.inline
      def methods_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("methods")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Deferred.next")
      @js.native
      def next(fun: js.Function): Deferred = js.native
      
      /* static member */
      @JSGlobal("Deferred.parallel")
      @js.native
      def parallel(dl: js.Any): Deferred = js.native
      
      /* static member */
      @JSGlobal("Deferred.register")
      @js.native
      def register(name: String, fun: DeferredizedFunction): Unit = js.native
      
      /* static member */
      @JSGlobal("Deferred.repeat")
      @js.native
      def repeat(n: Double, fun: FunctionWithNumber): Deferred = js.native
      
      /* static member */
      @JSGlobal("Deferred.retry")
      @js.native
      def retry(retryCount: Double, funcDeferred: DeferredizedFunctionWithNumber): Deferred = js.native
      @JSGlobal("Deferred.retry")
      @js.native
      def retry(retryCount: Double, funcDeferred: DeferredizedFunctionWithNumber, options: RetryOption): Deferred = js.native
      
      /* static member */
      @JSGlobal("Deferred.wait")
      @js.native
      def wait_(n: Double): Deferred = js.native
    }
    
    @JSGlobal("call")
    @js.native
    def call(fun: js.UndefOr[scala.Nothing], args: js.Any*): Deferred = js.native
    @JSGlobal("call")
    @js.native
    def call(fun: js.Function, args: js.Any*): Deferred = js.native
    
    @JSGlobal("chain")
    @js.native
    def chain(args: js.Any*): Deferred = js.native
    
    @JSGlobal("earlier")
    @js.native
    def earlier(dl: js.Any): Deferred = js.native
    
    @JSGlobal("loop")
    @js.native
    def loop(n: Double, fun: FunctionWithNumber): Deferred = js.native
    @JSGlobal("loop")
    @js.native
    def loop(n: Loop_, fun: FunctionWithNumber): Deferred = js.native
    
    @JSGlobal("next")
    @js.native
    def next(fun: js.Function): Deferred = js.native
    
    @JSGlobal("parallel")
    @js.native
    def parallel(dl: js.Any): Deferred = js.native
    
    @JSGlobal("repeat")
    @js.native
    def repeat(n: Double, fun: FunctionWithNumber): Deferred = js.native
    
    @JSGlobal("wait")
    @js.native
    def wait_(n: Double): Deferred = js.native
    
    @js.native
    trait ConnectOption extends StObject {
      
      var args: js.UndefOr[js.Array[_]] = js.native
      
      var ng: js.UndefOr[Double] = js.native
      
      var ok: js.UndefOr[Double] = js.native
      
      var target: js.Any = js.native
    }
    object ConnectOption {
      
      @scala.inline
      def apply(target: js.Any): ConnectOption = {
        val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[ConnectOption]
      }
      
      @scala.inline
      implicit class ConnectOptionMutableBuilder[Self <: ConnectOption] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        @scala.inline
        def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
        
        @scala.inline
        def setNg(value: Double): Self = StObject.set(x, "ng", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNgUndefined: Self = StObject.set(x, "ng", js.undefined)
        
        @scala.inline
        def setOk(value: Double): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
        
        @scala.inline
        def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      }
    }
    
    type DeferredizedFunction = js.Function1[/* repeated */ js.Any, Deferred]
    
    type DeferredizedFunctionWithNumber = js.Function1[/* n */ Double, Deferred]
    
    type ErrorCallback = js.Function2[/* d */ Deferred, /* repeated */ js.Any, js.Any]
    
    type FunctionWithNumber = js.Function2[/* i */ Double, /* o */ js.UndefOr[js.Any], js.Any]
    
    @js.native
    trait JQueryXHR extends StObject {
      
      def next(fun: js.Function): Deferred = js.native
    }
    object JQueryXHR {
      
      @scala.inline
      def apply(next: js.Function => Deferred): JQueryXHR = {
        val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
        __obj.asInstanceOf[JQueryXHR]
      }
      
      @scala.inline
      implicit class JQueryXHRMutableBuilder[Self <: JQueryXHR] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNext(value: js.Function => Deferred): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait Loop_ extends StObject {
      
      var begin: js.UndefOr[Double] = js.native
      
      var end: js.UndefOr[Double] = js.native
      
      var step: js.UndefOr[Double] = js.native
    }
    object Loop_ {
      
      @scala.inline
      def apply(): Loop_ = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Loop_]
      }
      
      @scala.inline
      implicit class Loop_MutableBuilder[Self <: Loop_] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBegin(value: Double): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
        
        @scala.inline
        def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        @scala.inline
        def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      }
    }
    
    @js.native
    trait RetryOption extends StObject {
      
      @JSName("wait")
      var wait_FRetryOption: Double = js.native
    }
    object RetryOption {
      
      @scala.inline
      def apply(wait_ : Double): RetryOption = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
        __obj.asInstanceOf[RetryOption]
      }
      
      @scala.inline
      implicit class RetryOptionMutableBuilder[Self <: RetryOption] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      }
    }
  }
}
