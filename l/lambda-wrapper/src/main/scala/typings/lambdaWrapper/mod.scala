package typings.lambdaWrapper

import typings.awsLambda.handlerMod.Callback
import typings.lambdaWrapper.anon.Handler
import typings.lambdaWrapper.anon.LambdaFunction
import typings.lambdaWrapper.anon.PartialContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lambda-wrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(mod: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(mod.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def run(event: Any, callback: Callback[Any]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def run(event: Any, context: PartialContext, callback: Callback[Any]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def wrap(mod: LambdaFunction): Wrapped[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(mod.asInstanceOf[js.Any]).asInstanceOf[Wrapped[Any, Any]]
  inline def wrap(mod: LambdaFunction, options: js.Object): Wrapped[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(mod.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Wrapped[Any, Any]]
  inline def wrap[TEvent, TResult, THandlerName /* <: String */](
    mod: /* import warning: importer.ImportType#apply Failed type conversion: {[ name in THandlerName ]: aws-lambda.aws-lambda/handler.Handler<TEvent, TResult>} */ js.Any
  ): Wrapped[TEvent, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(mod.asInstanceOf[js.Any]).asInstanceOf[Wrapped[TEvent, TResult]]
  inline def wrap[TEvent, TResult, THandlerName /* <: String */](
    mod: /* import warning: importer.ImportType#apply Failed type conversion: {[ name in THandlerName ]: aws-lambda.aws-lambda/handler.Handler<TEvent, TResult>} */ js.Any,
    options: Handler[THandlerName]
  ): Wrapped[TEvent, TResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(mod.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Wrapped[TEvent, TResult]]
  
  @js.native
  trait Wrapped[TEvent, TResult] extends StObject {
    
    def run(event: TEvent): js.Promise[TResult] = js.native
    def run(event: TEvent, callback: Callback[TResult]): Unit = js.native
    def run(event: TEvent, context: PartialContext): js.Promise[TResult] = js.native
    // None of these functions resolve the promise if a callback is present, so prohibit using both.
    def run(event: TEvent, context: PartialContext, callback: Callback[TResult]): Unit = js.native
    
    def runHandler(event: TEvent, context: PartialContext): Unit = js.native
    def runHandler(event: TEvent, context: PartialContext, callback: Callback[TResult]): Unit = js.native
    @JSName("runHandler")
    def runHandler_Promise(event: TEvent, context: PartialContext): js.Promise[TResult] = js.native
  }
}
