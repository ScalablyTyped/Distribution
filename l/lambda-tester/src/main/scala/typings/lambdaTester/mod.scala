package typings.lambdaTester

import typings.awsLambda.handlerMod.ClientContext
import typings.awsLambda.handlerMod.Context
import typings.awsLambda.handlerMod.Handler
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: Handler[Any, Any] */](handler: T): LambdaTester[T] = ^.asInstanceOf[js.Dynamic].apply(handler.asInstanceOf[js.Any]).asInstanceOf[LambdaTester[T]]
  
  @JSImport("lambda-tester", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lambda-tester", "LambdaTester")
  @js.native
  open class LambdaTester[T /* <: Handler[Any, Any] */] () extends StObject {
    
    def clientContext(clientContext: ClientContext): this.type = js.native
    
    def context(context: Context): this.type = js.native
    
    def event(event: HandlerEvent[T]): this.type = js.native
    
    def expectError(verifier: Verifier[HandlerError[T]]): js.Promise[Any] = js.native
    
    def expectFail(verifier: Verifier[HandlerError[T]]): js.Promise[Any] = js.native
    
    def expectReject(verifier: Verifier[HandlerError[T]]): js.Promise[Any] = js.native
    
    def expectResolve(verifier: Verifier[HandlerResult[T]]): js.Promise[Any] = js.native
    
    def expectResult(verifier: Verifier[HandlerResult[T]]): js.Promise[Any] = js.native
    
    def expectSucceed(verifier: Verifier[HandlerResult[T]]): js.Promise[Any] = js.native
    
    def identity(cognitoIdentityId: String, cognitoIdentityPoolId: String): this.type = js.native
    
    def timeout(seconds: Double): this.type = js.native
    
    def xray(): this.type = js.native
  }
  
  type HandlerError[T /* <: Handler[Any, Any] */] = NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<aws-lambda.aws-lambda/handler.Callback<any>>['0'] */ js.Any
  ]
  
  type HandlerEvent[T /* <: Handler[Any, Any] */] = Any
  
  type HandlerResult[T /* <: Handler[Any, Any] */] = Any
  
  type Verifier[S] = VerifierFn[js.Error | S | String]
  
  @js.native
  trait VerifierFn[S] extends StObject {
    
    def apply(result: S): Unit | js.Promise[Unit] = js.native
    def apply(result: S, additional: Any): Unit | js.Promise[Unit] = js.native
    def apply(result: S, additional: Any, done: js.Function0[js.Object]): Unit = js.native
    def apply(result: S, additional: Unit, done: js.Function0[js.Object]): Unit = js.native
  }
}
