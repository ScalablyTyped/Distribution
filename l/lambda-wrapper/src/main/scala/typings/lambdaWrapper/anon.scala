package typings.lambdaWrapper

import typings.awsLambda.handlerMod.ClientContext
import typings.awsLambda.handlerMod.CognitoIdentity
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Handler[THandlerName /* <: String */] extends StObject {
    
    var handler: js.UndefOr[THandlerName] = js.undefined
  }
  object Handler {
    
    inline def apply[THandlerName /* <: String */](): Handler[THandlerName] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Handler[THandlerName]]
    }
    
    extension [Self <: Handler[?], THandlerName /* <: String */](x: Self & Handler[THandlerName]) {
      
      inline def setHandler(value: THandlerName): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    }
  }
  
  trait LambdaFunction extends StObject {
    
    var lambdaFunction: String
    
    var region: String
  }
  object LambdaFunction {
    
    inline def apply(lambdaFunction: String, region: String): LambdaFunction = {
      val __obj = js.Dynamic.literal(lambdaFunction = lambdaFunction.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[LambdaFunction]
    }
    
    extension [Self <: LambdaFunction](x: Self) {
      
      inline def setLambdaFunction(value: String): Self = StObject.set(x, "lambdaFunction", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<aws-lambda.aws-lambda.Context> */
  trait PartialContext extends StObject {
    
    var awsRequestId: js.UndefOr[String] = js.undefined
    
    var callbackWaitsForEmptyEventLoop: js.UndefOr[Boolean] = js.undefined
    
    var clientContext: js.UndefOr[ClientContext] = js.undefined
    
    var done: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var fail: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
    
    var functionName: js.UndefOr[String] = js.undefined
    
    var functionVersion: js.UndefOr[String] = js.undefined
    
    var getRemainingTimeInMillis: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var identity: js.UndefOr[CognitoIdentity] = js.undefined
    
    var invokedFunctionArn: js.UndefOr[String] = js.undefined
    
    var logGroupName: js.UndefOr[String] = js.undefined
    
    var logStreamName: js.UndefOr[String] = js.undefined
    
    var memoryLimitInMB: js.UndefOr[String] = js.undefined
    
    var succeed: js.UndefOr[js.Function1[/* messageOrObject */ js.Any, Unit]] = js.undefined
  }
  object PartialContext {
    
    inline def apply(): PartialContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialContext]
    }
    
    extension [Self <: PartialContext](x: Self) {
      
      inline def setAwsRequestId(value: String): Self = StObject.set(x, "awsRequestId", value.asInstanceOf[js.Any])
      
      inline def setAwsRequestIdUndefined: Self = StObject.set(x, "awsRequestId", js.undefined)
      
      inline def setCallbackWaitsForEmptyEventLoop(value: Boolean): Self = StObject.set(x, "callbackWaitsForEmptyEventLoop", value.asInstanceOf[js.Any])
      
      inline def setCallbackWaitsForEmptyEventLoopUndefined: Self = StObject.set(x, "callbackWaitsForEmptyEventLoop", js.undefined)
      
      inline def setClientContext(value: ClientContext): Self = StObject.set(x, "clientContext", value.asInstanceOf[js.Any])
      
      inline def setClientContextUndefined: Self = StObject.set(x, "clientContext", js.undefined)
      
      inline def setDone(value: () => Unit): Self = StObject.set(x, "done", js.Any.fromFunction0(value))
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFail(value: /* error */ Error => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
      
      inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
      
      inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
      
      inline def setFunctionVersion(value: String): Self = StObject.set(x, "functionVersion", value.asInstanceOf[js.Any])
      
      inline def setFunctionVersionUndefined: Self = StObject.set(x, "functionVersion", js.undefined)
      
      inline def setGetRemainingTimeInMillis(value: () => Double): Self = StObject.set(x, "getRemainingTimeInMillis", js.Any.fromFunction0(value))
      
      inline def setGetRemainingTimeInMillisUndefined: Self = StObject.set(x, "getRemainingTimeInMillis", js.undefined)
      
      inline def setIdentity(value: CognitoIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setInvokedFunctionArn(value: String): Self = StObject.set(x, "invokedFunctionArn", value.asInstanceOf[js.Any])
      
      inline def setInvokedFunctionArnUndefined: Self = StObject.set(x, "invokedFunctionArn", js.undefined)
      
      inline def setLogGroupName(value: String): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
      
      inline def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
      
      inline def setLogStreamName(value: String): Self = StObject.set(x, "logStreamName", value.asInstanceOf[js.Any])
      
      inline def setLogStreamNameUndefined: Self = StObject.set(x, "logStreamName", js.undefined)
      
      inline def setMemoryLimitInMB(value: String): Self = StObject.set(x, "memoryLimitInMB", value.asInstanceOf[js.Any])
      
      inline def setMemoryLimitInMBUndefined: Self = StObject.set(x, "memoryLimitInMB", js.undefined)
      
      inline def setSucceed(value: /* messageOrObject */ js.Any => Unit): Self = StObject.set(x, "succeed", js.Any.fromFunction1(value))
      
      inline def setSucceedUndefined: Self = StObject.set(x, "succeed", js.undefined)
    }
  }
}
