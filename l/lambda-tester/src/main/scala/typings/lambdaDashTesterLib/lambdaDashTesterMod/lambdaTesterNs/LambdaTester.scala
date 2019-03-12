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
    clientContext: awsDashLambdaLib.awsDashLambdaMod.ClientContext => LambdaTester,
    context: awsDashLambdaLib.awsDashLambdaMod.Context => LambdaTester,
    event: js.Any => LambdaTester,
    expectError: Verifier => js.Promise[_],
    expectFail: Verifier => js.Promise[_],
    expectReject: Verifier => js.Promise[_],
    expectResolve: Verifier => js.Promise[_],
    expectResult: Verifier => js.Promise[_],
    expectSucceed: Verifier => js.Promise[_],
    identity: (java.lang.String, java.lang.String) => LambdaTester,
    timeout: scala.Double => LambdaTester,
    xray: () => LambdaTester
  ): LambdaTester = {
    val __obj = js.Dynamic.literal(clientContext = js.Any.fromFunction1(clientContext), context = js.Any.fromFunction1(context), event = js.Any.fromFunction1(event), expectError = js.Any.fromFunction1(expectError), expectFail = js.Any.fromFunction1(expectFail), expectReject = js.Any.fromFunction1(expectReject), expectResolve = js.Any.fromFunction1(expectResolve), expectResult = js.Any.fromFunction1(expectResult), expectSucceed = js.Any.fromFunction1(expectSucceed), identity = js.Any.fromFunction2(identity), timeout = js.Any.fromFunction1(timeout), xray = js.Any.fromFunction0(xray))
  
    __obj.asInstanceOf[LambdaTester]
  }
}

