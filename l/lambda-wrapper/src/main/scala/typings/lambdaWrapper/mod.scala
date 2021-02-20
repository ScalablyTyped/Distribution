package typings.lambdaWrapper

import org.scalablytyped.runtime.TopLevel
import typings.awsLambda.handlerMod.Callback
import typings.lambdaWrapper.anon.Handler
import typings.lambdaWrapper.anon.LambdaFunction
import typings.lambdaWrapper.anon.PartialContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lambda-wrapper", "init")
  @js.native
  def init(mod: js.Any, options: js.Any): Unit = js.native
  
  @JSImport("lambda-wrapper", "run")
  @js.native
  def run(event: js.Any, callback: Callback[_]): js.Promise[_] = js.native
  @JSImport("lambda-wrapper", "run")
  @js.native
  def run(event: js.Any, context: PartialContext, callback: Callback[_]): js.Promise[_] = js.native
  
  @JSImport("lambda-wrapper", "wrap")
  @js.native
  def wrap(mod: LambdaFunction): Wrapped[_, _] = js.native
  @JSImport("lambda-wrapper", "wrap")
  @js.native
  def wrap(mod: LambdaFunction, options: js.Object): Wrapped[_, _] = js.native
  @JSImport("lambda-wrapper", "wrap")
  @js.native
  def wrap[TEvent, TResult, THandlerName /* <: String */](
    mod: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in THandlerName ]: aws-lambda.aws-lambda/handler.Handler<TEvent, TResult>}
    */ typings.lambdaWrapper.lambdaWrapperStrings.wrap with TopLevel[js.Any]
  ): Wrapped[TEvent, TResult] = js.native
  @JSImport("lambda-wrapper", "wrap")
  @js.native
  def wrap[TEvent, TResult, THandlerName /* <: String */](
    mod: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in THandlerName ]: aws-lambda.aws-lambda/handler.Handler<TEvent, TResult>}
    */ typings.lambdaWrapper.lambdaWrapperStrings.wrap with TopLevel[js.Any],
    options: Handler[THandlerName]
  ): Wrapped[TEvent, TResult] = js.native
  
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
