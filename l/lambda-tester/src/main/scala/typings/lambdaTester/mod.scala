package typings.lambdaTester

import typings.awsLambda.handlerMod.ClientContext
import typings.awsLambda.handlerMod.Context
import typings.awsLambda.handlerMod.Handler
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
    
    def expectError(): js.Promise[Any] = js.native
    def expectError(verifier: Verifier[HandlerError[T]]): js.Promise[Any] = js.native
    
    def expectFail(): js.Promise[Any] = js.native
    def expectFail(verifier: Verifier[HandlerError[T]]): js.Promise[Any] = js.native
    
    def expectReject(): js.Promise[Any] = js.native
    def expectReject(verifier: Verifier[HandlerError[T]]): js.Promise[Any] = js.native
    
    def expectResolve(): js.Promise[Any] = js.native
    def expectResolve(verifier: Verifier[HandlerResult[T]]): js.Promise[Any] = js.native
    
    def expectResult(): js.Promise[Any] = js.native
    def expectResult(verifier: Verifier[HandlerResult[T]]): js.Promise[Any] = js.native
    
    def expectSucceed(): js.Promise[Any] = js.native
    def expectSucceed(verifier: Verifier[HandlerResult[T]]): js.Promise[Any] = js.native
    
    def identity(cognitoIdentityId: String, cognitoIdentityPoolId: String): this.type = js.native
    
    def timeout(seconds: Double): this.type = js.native
    
    def xray(): this.type = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends aws-lambda.aws-lambda/handler.Handler<any, infer TResult> ? std.NonNullable<std.Parameters<aws-lambda.aws-lambda/handler.Callback<TResult>>['0']> : never
    }}}
    */
  @js.native
  trait HandlerError[T /* <: Handler[Any, Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends aws-lambda.aws-lambda/handler.Handler<infer TEvent, any> ? TEvent : never
    }}}
    */
  @js.native
  trait HandlerEvent[T /* <: Handler[Any, Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends aws-lambda.aws-lambda/handler.Handler<any, infer TResult> ? TResult : never
    }}}
    */
  @js.native
  trait HandlerResult[T /* <: Handler[Any, Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends lambda-tester.lambda-tester.HandlerError<aws-lambda.aws-lambda/handler.Handler<any, any>> ? S extends string ? lambda-tester.lambda-tester.VerifierFn<string> : S extends std.Error ? lambda-tester.lambda-tester.VerifierFn<std.Error> : never : lambda-tester.lambda-tester.VerifierFn<S>
    }}}
    */
  type Verifier[S] = VerifierFn[String]
  
  @js.native
  trait VerifierFn[S] extends StObject {
    
    def apply(result: S): Unit | js.Promise[Unit] = js.native
    def apply(result: S, additional: Any): Unit | js.Promise[Unit] = js.native
    def apply(result: S, additional: Any, done: js.Function0[js.Object]): Unit = js.native
    def apply(result: S, additional: Unit, done: js.Function0[js.Object]): Unit = js.native
  }
}
