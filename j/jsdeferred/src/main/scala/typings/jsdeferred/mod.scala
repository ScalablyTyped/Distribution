package typings.jsdeferred

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
      
      /* static member */
      @scala.inline
      def call(fun: js.Function, args: js.Any*): Deferred = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fun.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Deferred]
      @scala.inline
      def call(fun: Unit, args: js.Any*): Deferred = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fun.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Deferred]
      
      /* static member */
      @scala.inline
      def chain(args: js.Any*): Deferred = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(args.asInstanceOf[js.Any]).asInstanceOf[Deferred]
      
      /* static member */
      @scala.inline
      def connect(funo: js.Any, options: String): DeferredizedFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(funo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DeferredizedFunction]
      /* static member */
      @scala.inline
      def connect(funo: js.Function): DeferredizedFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(funo.asInstanceOf[js.Any]).asInstanceOf[DeferredizedFunction]
      @scala.inline
      def connect(funo: js.Function, options: ConnectOption): DeferredizedFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(funo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DeferredizedFunction]
      
      /* static member */
      @scala.inline
      def define(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("define")().asInstanceOf[js.Any]
      @scala.inline
      def define(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      @scala.inline
      def define(obj: js.Any, list: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(obj.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      @scala.inline
      def define(obj: Unit, list: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(obj.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      /* static member */
      @scala.inline
      def earlier(dl: js.Any): Deferred = ^.asInstanceOf[js.Dynamic].applyDynamic("earlier")(dl.asInstanceOf[js.Any]).asInstanceOf[Deferred]
      
      /* static member */
      @scala.inline
      def isDeferred(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeferred")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /* static member */
      @scala.inline
      def loop(n: Double, fun: FunctionWithNumber): Deferred = (^.asInstanceOf[js.Dynamic].applyDynamic("loop")(n.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[Deferred]
      /* static member */
      @scala.inline
      def loop(n: Loop_, fun: FunctionWithNumber): Deferred = (^.asInstanceOf[js.Dynamic].applyDynamic("loop")(n.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[Deferred]
      
      /* static member */
      @JSGlobal("Deferred.methods")
      @js.native
      def methods: js.Array[String] = js.native
      @scala.inline
      def methods_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("methods")(x.asInstanceOf[js.Any])
      
      /* static member */
      @scala.inline
      def next(fun: js.Function): Deferred = ^.asInstanceOf[js.Dynamic].applyDynamic("next")(fun.asInstanceOf[js.Any]).asInstanceOf[Deferred]
      
      /* static member */
      @scala.inline
      def parallel(dl: js.Any): Deferred = ^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(dl.asInstanceOf[js.Any]).asInstanceOf[Deferred]
      
      /* static member */
      @scala.inline
      def register(name: String, fun: DeferredizedFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(name.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /* static member */
      @scala.inline
      def repeat(n: Double, fun: FunctionWithNumber): Deferred = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(n.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[Deferred]
      
      /* static member */
      @scala.inline
      def retry(retryCount: Double, funcDeferred: DeferredizedFunctionWithNumber): Deferred = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(retryCount.asInstanceOf[js.Any], funcDeferred.asInstanceOf[js.Any])).asInstanceOf[Deferred]
      @scala.inline
      def retry(retryCount: Double, funcDeferred: DeferredizedFunctionWithNumber, options: RetryOption): Deferred = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(retryCount.asInstanceOf[js.Any], funcDeferred.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Deferred]
      
      /* static member */
      @scala.inline
      def wait_(n: Double): Deferred = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(n.asInstanceOf[js.Any]).asInstanceOf[Deferred]
    }
    
    @scala.inline
    def call(fun: js.Function, args: js.Any*): Deferred = (js.Dynamic.global.applyDynamic("call")(fun.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Deferred]
    @scala.inline
    def call(fun: Unit, args: js.Any*): Deferred = (js.Dynamic.global.applyDynamic("call")(fun.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Deferred]
    
    @scala.inline
    def chain(args: js.Any*): Deferred = js.Dynamic.global.applyDynamic("chain")(args.asInstanceOf[js.Any]).asInstanceOf[Deferred]
    
    @scala.inline
    def earlier(dl: js.Any): Deferred = js.Dynamic.global.applyDynamic("earlier")(dl.asInstanceOf[js.Any]).asInstanceOf[Deferred]
    
    @scala.inline
    def loop(n: Double, fun: FunctionWithNumber): Deferred = (js.Dynamic.global.applyDynamic("loop")(n.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[Deferred]
    @scala.inline
    def loop(n: Loop_, fun: FunctionWithNumber): Deferred = (js.Dynamic.global.applyDynamic("loop")(n.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[Deferred]
    
    @scala.inline
    def next(fun: js.Function): Deferred = js.Dynamic.global.applyDynamic("next")(fun.asInstanceOf[js.Any]).asInstanceOf[Deferred]
    
    @scala.inline
    def parallel(dl: js.Any): Deferred = js.Dynamic.global.applyDynamic("parallel")(dl.asInstanceOf[js.Any]).asInstanceOf[Deferred]
    
    @scala.inline
    def repeat(n: Double, fun: FunctionWithNumber): Deferred = (js.Dynamic.global.applyDynamic("repeat")(n.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[Deferred]
    
    @scala.inline
    def wait_(n: Double): Deferred = js.Dynamic.global.applyDynamic("wait")(n.asInstanceOf[js.Any]).asInstanceOf[Deferred]
    
    trait ConnectOption extends StObject {
      
      var args: js.UndefOr[js.Array[js.Any]] = js.undefined
      
      var ng: js.UndefOr[Double] = js.undefined
      
      var ok: js.UndefOr[Double] = js.undefined
      
      var target: js.Any
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
        def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
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
    
    trait JQueryXHR extends StObject {
      
      def next(fun: js.Function): Deferred
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
    
    trait Loop_ extends StObject {
      
      var begin: js.UndefOr[Double] = js.undefined
      
      var end: js.UndefOr[Double] = js.undefined
      
      var step: js.UndefOr[Double] = js.undefined
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
    
    trait RetryOption extends StObject {
      
      @JSName("wait")
      var wait_FRetryOption: Double
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
