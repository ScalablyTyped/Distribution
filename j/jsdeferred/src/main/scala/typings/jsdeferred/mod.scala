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
      inline def call(fun: js.Function, args: js.Any*): Deferred = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fun.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Deferred]
      inline def call(fun: Unit, args: js.Any*): Deferred = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fun.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Deferred]
      
      /* static member */
      inline def chain(args: js.Any*): Deferred = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(args.asInstanceOf[js.Any]).asInstanceOf[Deferred]
      
      /* static member */
      inline def connect(funo: js.Any, options: String): DeferredizedFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(funo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DeferredizedFunction]
      /* static member */
      inline def connect(funo: js.Function): DeferredizedFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(funo.asInstanceOf[js.Any]).asInstanceOf[DeferredizedFunction]
      inline def connect(funo: js.Function, options: ConnectOption): DeferredizedFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(funo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DeferredizedFunction]
      
      /* static member */
      inline def define(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("define")().asInstanceOf[js.Any]
      inline def define(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      inline def define(obj: js.Any, list: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(obj.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def define(obj: Unit, list: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(obj.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      /* static member */
      inline def earlier(dl: js.Any): Deferred = ^.asInstanceOf[js.Dynamic].applyDynamic("earlier")(dl.asInstanceOf[js.Any]).asInstanceOf[Deferred]
      
      /* static member */
      inline def isDeferred(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeferred")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /* static member */
      inline def loop(n: Double, fun: FunctionWithNumber): Deferred = (^.asInstanceOf[js.Dynamic].applyDynamic("loop")(n.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[Deferred]
      /* static member */
      inline def loop(n: Loop_, fun: FunctionWithNumber): Deferred = (^.asInstanceOf[js.Dynamic].applyDynamic("loop")(n.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[Deferred]
      
      /* static member */
      @JSGlobal("Deferred.methods")
      @js.native
      def methods: js.Array[String] = js.native
      inline def methods_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("methods")(x.asInstanceOf[js.Any])
      
      /* static member */
      inline def next(fun: js.Function): Deferred = ^.asInstanceOf[js.Dynamic].applyDynamic("next")(fun.asInstanceOf[js.Any]).asInstanceOf[Deferred]
      
      /* static member */
      inline def parallel(dl: js.Any): Deferred = ^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(dl.asInstanceOf[js.Any]).asInstanceOf[Deferred]
      
      /* static member */
      inline def register(name: String, fun: DeferredizedFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(name.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /* static member */
      inline def repeat(n: Double, fun: FunctionWithNumber): Deferred = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(n.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[Deferred]
      
      /* static member */
      inline def retry(retryCount: Double, funcDeferred: DeferredizedFunctionWithNumber): Deferred = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(retryCount.asInstanceOf[js.Any], funcDeferred.asInstanceOf[js.Any])).asInstanceOf[Deferred]
      inline def retry(retryCount: Double, funcDeferred: DeferredizedFunctionWithNumber, options: RetryOption): Deferred = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(retryCount.asInstanceOf[js.Any], funcDeferred.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Deferred]
      
      /* static member */
      inline def wait_(n: Double): Deferred = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(n.asInstanceOf[js.Any]).asInstanceOf[Deferred]
    }
    
    inline def call(fun: js.Function, args: js.Any*): Deferred = (js.Dynamic.global.applyDynamic("call")(fun.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Deferred]
    inline def call(fun: Unit, args: js.Any*): Deferred = (js.Dynamic.global.applyDynamic("call")(fun.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Deferred]
    
    inline def chain(args: js.Any*): Deferred = js.Dynamic.global.applyDynamic("chain")(args.asInstanceOf[js.Any]).asInstanceOf[Deferred]
    
    inline def earlier(dl: js.Any): Deferred = js.Dynamic.global.applyDynamic("earlier")(dl.asInstanceOf[js.Any]).asInstanceOf[Deferred]
    
    inline def loop(n: Double, fun: FunctionWithNumber): Deferred = (js.Dynamic.global.applyDynamic("loop")(n.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[Deferred]
    inline def loop(n: Loop_, fun: FunctionWithNumber): Deferred = (js.Dynamic.global.applyDynamic("loop")(n.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[Deferred]
    
    inline def next(fun: js.Function): Deferred = js.Dynamic.global.applyDynamic("next")(fun.asInstanceOf[js.Any]).asInstanceOf[Deferred]
    
    inline def parallel(dl: js.Any): Deferred = js.Dynamic.global.applyDynamic("parallel")(dl.asInstanceOf[js.Any]).asInstanceOf[Deferred]
    
    inline def repeat(n: Double, fun: FunctionWithNumber): Deferred = (js.Dynamic.global.applyDynamic("repeat")(n.asInstanceOf[js.Any], fun.asInstanceOf[js.Any])).asInstanceOf[Deferred]
    
    inline def wait_(n: Double): Deferred = js.Dynamic.global.applyDynamic("wait")(n.asInstanceOf[js.Any]).asInstanceOf[Deferred]
    
    trait ConnectOption extends StObject {
      
      var args: js.UndefOr[js.Array[js.Any]] = js.undefined
      
      var ng: js.UndefOr[Double] = js.undefined
      
      var ok: js.UndefOr[Double] = js.undefined
      
      var target: js.Any
    }
    object ConnectOption {
      
      inline def apply(target: js.Any): ConnectOption = {
        val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[ConnectOption]
      }
      
      extension [Self <: ConnectOption](x: Self) {
        
        inline def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        inline def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
        
        inline def setNg(value: Double): Self = StObject.set(x, "ng", value.asInstanceOf[js.Any])
        
        inline def setNgUndefined: Self = StObject.set(x, "ng", js.undefined)
        
        inline def setOk(value: Double): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
        
        inline def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
        
        inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
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
      
      inline def apply(next: js.Function => Deferred): JQueryXHR = {
        val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
        __obj.asInstanceOf[JQueryXHR]
      }
      
      extension [Self <: JQueryXHR](x: Self) {
        
        inline def setNext(value: js.Function => Deferred): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      }
    }
    
    trait Loop_ extends StObject {
      
      var begin: js.UndefOr[Double] = js.undefined
      
      var end: js.UndefOr[Double] = js.undefined
      
      var step: js.UndefOr[Double] = js.undefined
    }
    object Loop_ {
      
      inline def apply(): Loop_ = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Loop_]
      }
      
      extension [Self <: Loop_](x: Self) {
        
        inline def setBegin(value: Double): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
        
        inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
        
        inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
        
        inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      }
    }
    
    trait RetryOption extends StObject {
      
      @JSName("wait")
      var wait_FRetryOption: Double
    }
    object RetryOption {
      
      inline def apply(wait_ : Double): RetryOption = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
        __obj.asInstanceOf[RetryOption]
      }
      
      extension [Self <: RetryOption](x: Self) {
        
        inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      }
    }
  }
}
