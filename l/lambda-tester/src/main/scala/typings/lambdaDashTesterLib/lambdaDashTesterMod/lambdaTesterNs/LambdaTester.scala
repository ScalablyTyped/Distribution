package typings
package lambdaDashTesterLib.lambdaDashTesterMod.lambdaTesterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaTester extends js.Object {
  def clientContext(clientContext: awsDashLambdaLib.awsDashLambdaMod.ClientContext): this.type
  def context(context: awsDashLambdaLib.awsDashLambdaMod.Context): this.type
  def event(event: js.Any): this.type
  def expectError(verifier: Verifier): js.Promise[_]
  def expectFail(verifier: Verifier): js.Promise[_]
  def expectReject(verifier: Verifier): js.Promise[_]
  def expectResolve(verifier: Verifier): js.Promise[_]
  def expectResult(verifier: Verifier): js.Promise[_]
  def expectSucceed(verifier: Verifier): js.Promise[_]
  def identity(cognitoIdentityId: java.lang.String, cognitoIdentityPoolId: java.lang.String): this.type
  def timeout(seconds: scala.Double): this.type
  def xray(): this.type
}

object LambdaTester {
  @scala.inline
  def apply(
    clientContext: js.Function1[awsDashLambdaLib.awsDashLambdaMod.ClientContext, LambdaTester],
    context: js.Function1[awsDashLambdaLib.awsDashLambdaMod.Context, LambdaTester],
    event: js.Function1[js.Any, LambdaTester],
    expectError: js.Function1[Verifier, js.Promise[_]],
    expectFail: js.Function1[Verifier, js.Promise[_]],
    expectReject: js.Function1[Verifier, js.Promise[_]],
    expectResolve: js.Function1[Verifier, js.Promise[_]],
    expectResult: js.Function1[Verifier, js.Promise[_]],
    expectSucceed: js.Function1[Verifier, js.Promise[_]],
    identity: js.Function2[java.lang.String, java.lang.String, LambdaTester],
    timeout: js.Function1[scala.Double, LambdaTester],
    xray: js.Function0[LambdaTester]
  ): LambdaTester = {
    val __obj = js.Dynamic.literal(clientContext = clientContext, context = context, event = event, expectError = expectError, expectFail = expectFail, expectReject = expectReject, expectResolve = expectResolve, expectResult = expectResult, expectSucceed = expectSucceed, identity = identity, timeout = timeout, xray = xray)
  
    __obj.asInstanceOf[LambdaTester]
  }
}

