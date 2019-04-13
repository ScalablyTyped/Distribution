package typings
package lambdaDashTesterLib.lambdaDashTesterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lambda-tester", "LambdaTester")
@js.native
class LambdaTester () extends js.Object {
  def clientContext(clientContext: awsDashLambdaLib.awsDashLambdaMod.ClientContext): this.type = js.native
  def context(context: awsDashLambdaLib.awsDashLambdaMod.Context): this.type = js.native
  def event(event: js.Any): this.type = js.native
  def expectError(verifier: Verifier): js.Promise[_] = js.native
  def expectFail(verifier: Verifier): js.Promise[_] = js.native
  def expectReject(verifier: Verifier): js.Promise[_] = js.native
  def expectResolve(verifier: Verifier): js.Promise[_] = js.native
  def expectResult(verifier: Verifier): js.Promise[_] = js.native
  def expectSucceed(verifier: Verifier): js.Promise[_] = js.native
  def identity(cognitoIdentityId: java.lang.String, cognitoIdentityPoolId: java.lang.String): this.type = js.native
  def timeout(seconds: scala.Double): this.type = js.native
  def xray(): this.type = js.native
}

