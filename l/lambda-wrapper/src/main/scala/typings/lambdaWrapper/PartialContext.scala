package typings.lambdaWrapper

import typings.awsLambda.handlerMod.ClientContext
import typings.awsLambda.handlerMod.CognitoIdentity
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<aws-lambda.aws-lambda.Context> */
trait PartialContext extends js.Object {
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
  @scala.inline
  def apply(
    awsRequestId: String = null,
    callbackWaitsForEmptyEventLoop: js.UndefOr[Boolean] = js.undefined,
    clientContext: ClientContext = null,
    done: () => Unit = null,
    fail: /* error */ Error => Unit = null,
    functionName: String = null,
    functionVersion: String = null,
    getRemainingTimeInMillis: () => Double = null,
    identity: CognitoIdentity = null,
    invokedFunctionArn: String = null,
    logGroupName: String = null,
    logStreamName: String = null,
    memoryLimitInMB: String = null,
    succeed: /* messageOrObject */ js.Any => Unit = null
  ): PartialContext = {
    val __obj = js.Dynamic.literal()
    if (awsRequestId != null) __obj.updateDynamic("awsRequestId")(awsRequestId.asInstanceOf[js.Any])
    if (!js.isUndefined(callbackWaitsForEmptyEventLoop)) __obj.updateDynamic("callbackWaitsForEmptyEventLoop")(callbackWaitsForEmptyEventLoop.asInstanceOf[js.Any])
    if (clientContext != null) __obj.updateDynamic("clientContext")(clientContext.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction0(done))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (functionName != null) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (functionVersion != null) __obj.updateDynamic("functionVersion")(functionVersion.asInstanceOf[js.Any])
    if (getRemainingTimeInMillis != null) __obj.updateDynamic("getRemainingTimeInMillis")(js.Any.fromFunction0(getRemainingTimeInMillis))
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (invokedFunctionArn != null) __obj.updateDynamic("invokedFunctionArn")(invokedFunctionArn.asInstanceOf[js.Any])
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName.asInstanceOf[js.Any])
    if (logStreamName != null) __obj.updateDynamic("logStreamName")(logStreamName.asInstanceOf[js.Any])
    if (memoryLimitInMB != null) __obj.updateDynamic("memoryLimitInMB")(memoryLimitInMB.asInstanceOf[js.Any])
    if (succeed != null) __obj.updateDynamic("succeed")(js.Any.fromFunction1(succeed))
    __obj.asInstanceOf[PartialContext]
  }
}

