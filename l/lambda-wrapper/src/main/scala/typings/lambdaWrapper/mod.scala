package typings.lambdaWrapper

import typings.awsLambda.handlerMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lambda-wrapper", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Wrapped[TEvent, TResult] extends js.Object {
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
  
  def init(mod: js.Any, options: js.Any): Unit = js.native
  def run(event: js.Any, callback: Callback[_]): js.Promise[_] = js.native
  def run(event: js.Any, context: PartialContext, callback: Callback[_]): js.Promise[_] = js.native
  def wrap(mod: AnonLambdaFunction): Wrapped[_, _] = js.native
  def wrap(mod: AnonLambdaFunction, options: js.Object): Wrapped[_, _] = js.native
  def wrap[TEvent, TResult, THandlerName /* <: String */](
    mod: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in THandlerName ]: aws-lambda.aws-lambda/handler.Handler<TEvent, TResult>}
    */ typings.lambdaWrapper.lambdaWrapperStrings.wrap with js.Any
  ): Wrapped[TEvent, TResult] = js.native
  def wrap[TEvent, TResult, THandlerName /* <: String */](
    mod: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in THandlerName ]: aws-lambda.aws-lambda/handler.Handler<TEvent, TResult>}
    */ typings.lambdaWrapper.lambdaWrapperStrings.wrap with js.Any,
    options: AnonHandler[THandlerName]
  ): Wrapped[TEvent, TResult] = js.native
}

