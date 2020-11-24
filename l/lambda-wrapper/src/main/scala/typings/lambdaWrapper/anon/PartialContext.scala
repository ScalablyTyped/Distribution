package typings.lambdaWrapper.anon

import typings.awsLambda.handlerMod.ClientContext
import typings.awsLambda.handlerMod.CognitoIdentity
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<aws-lambda.aws-lambda.Context> */
@js.native
trait PartialContext extends js.Object {
  
  var awsRequestId: js.UndefOr[String] = js.native
  
  var callbackWaitsForEmptyEventLoop: js.UndefOr[Boolean] = js.native
  
  var clientContext: js.UndefOr[ClientContext] = js.native
  
  var done: js.UndefOr[js.Function0[Unit]] = js.native
  
  var fail: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  
  var functionName: js.UndefOr[String] = js.native
  
  var functionVersion: js.UndefOr[String] = js.native
  
  var getRemainingTimeInMillis: js.UndefOr[js.Function0[Double]] = js.native
  
  var identity: js.UndefOr[CognitoIdentity] = js.native
  
  var invokedFunctionArn: js.UndefOr[String] = js.native
  
  var logGroupName: js.UndefOr[String] = js.native
  
  var logStreamName: js.UndefOr[String] = js.native
  
  var memoryLimitInMB: js.UndefOr[String] = js.native
  
  var succeed: js.UndefOr[js.Function1[/* messageOrObject */ js.Any, Unit]] = js.native
}
object PartialContext {
  
  @scala.inline
  def apply(): PartialContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialContext]
  }
  
  @scala.inline
  implicit class PartialContextOps[Self <: PartialContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAwsRequestId(value: String): Self = this.set("awsRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsRequestId: Self = this.set("awsRequestId", js.undefined)
    
    @scala.inline
    def setCallbackWaitsForEmptyEventLoop(value: Boolean): Self = this.set("callbackWaitsForEmptyEventLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackWaitsForEmptyEventLoop: Self = this.set("callbackWaitsForEmptyEventLoop", js.undefined)
    
    @scala.inline
    def setClientContext(value: ClientContext): Self = this.set("clientContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientContext: Self = this.set("clientContext", js.undefined)
    
    @scala.inline
    def setDone(value: () => Unit): Self = this.set("done", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    
    @scala.inline
    def setFail(value: /* error */ Error => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setFunctionName(value: String): Self = this.set("functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionName: Self = this.set("functionName", js.undefined)
    
    @scala.inline
    def setFunctionVersion(value: String): Self = this.set("functionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionVersion: Self = this.set("functionVersion", js.undefined)
    
    @scala.inline
    def setGetRemainingTimeInMillis(value: () => Double): Self = this.set("getRemainingTimeInMillis", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRemainingTimeInMillis: Self = this.set("getRemainingTimeInMillis", js.undefined)
    
    @scala.inline
    def setIdentity(value: CognitoIdentity): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
    
    @scala.inline
    def setInvokedFunctionArn(value: String): Self = this.set("invokedFunctionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvokedFunctionArn: Self = this.set("invokedFunctionArn", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: String): Self = this.set("logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogGroupName: Self = this.set("logGroupName", js.undefined)
    
    @scala.inline
    def setLogStreamName(value: String): Self = this.set("logStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogStreamName: Self = this.set("logStreamName", js.undefined)
    
    @scala.inline
    def setMemoryLimitInMB(value: String): Self = this.set("memoryLimitInMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryLimitInMB: Self = this.set("memoryLimitInMB", js.undefined)
    
    @scala.inline
    def setSucceed(value: /* messageOrObject */ js.Any => Unit): Self = this.set("succeed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSucceed: Self = this.set("succeed", js.undefined)
  }
}
