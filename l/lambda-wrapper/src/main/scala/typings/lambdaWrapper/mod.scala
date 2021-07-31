package typings.lambdaWrapper

import org.scalablytyped.runtime.TopLevel
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
  
  @scala.inline
  def init(mod: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(mod.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def run(event: js.Any, callback: Callback[js.Any]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def run(event: js.Any, context: PartialContext, callback: Callback[js.Any]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def wrap(mod: LambdaFunction): Wrapped[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(mod.asInstanceOf[js.Any]).asInstanceOf[Wrapped[js.Any, js.Any]]
  @scala.inline
  def wrap(mod: LambdaFunction, options: js.Object): Wrapped[js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(mod.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Wrapped[js.Any, js.Any]]
  @scala.inline
  def wrap[TEvent, TResult, THandlerName /* <: String */](
    mod: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in THandlerName ]: aws-lambda.aws-lambda/handler.Handler<TEvent, TResult>}
    */ typings.lambdaWrapper.lambdaWrapperStrings.wrap & TopLevel[js.Any]
  ): Wrapped[TEvent, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(mod.asInstanceOf[js.Any]).asInstanceOf[Wrapped[TEvent, TResult]]
  @scala.inline
  def wrap[TEvent, TResult, THandlerName /* <: String */](
    mod: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in THandlerName ]: aws-lambda.aws-lambda/handler.Handler<TEvent, TResult>}
    */ typings.lambdaWrapper.lambdaWrapperStrings.wrap & TopLevel[js.Any],
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
