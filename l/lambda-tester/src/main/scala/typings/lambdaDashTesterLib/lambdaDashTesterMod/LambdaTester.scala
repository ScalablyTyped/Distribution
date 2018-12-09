package typings
package lambdaDashTesterLib.lambdaDashTesterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lambda-tester", "LambdaTester")
@js.native
class LambdaTester ()
  extends lambdaDashTesterLib.lambdaDashTesterMod.lambdaTesterNs.LambdaTester {
  /* CompleteClass */
  override def clientContext(clientContext: awsDashLambdaLib.awsDashLambdaMod.ClientContext): this.type = js.native
  /* CompleteClass */
  override def context(context: awsDashLambdaLib.awsDashLambdaMod.Context): this.type = js.native
  /* CompleteClass */
  override def event(event: js.Any): this.type = js.native
  /* CompleteClass */
  override def expectError(verifier: lambdaDashTesterLib.lambdaDashTesterMod.lambdaTesterNs.Verifier): js.Promise[_] = js.native
  /* CompleteClass */
  override def expectFail(verifier: lambdaDashTesterLib.lambdaDashTesterMod.lambdaTesterNs.Verifier): js.Promise[_] = js.native
  /* CompleteClass */
  override def expectReject(verifier: lambdaDashTesterLib.lambdaDashTesterMod.lambdaTesterNs.Verifier): js.Promise[_] = js.native
  /* CompleteClass */
  override def expectResolve(verifier: lambdaDashTesterLib.lambdaDashTesterMod.lambdaTesterNs.Verifier): js.Promise[_] = js.native
  /* CompleteClass */
  override def expectResult(verifier: lambdaDashTesterLib.lambdaDashTesterMod.lambdaTesterNs.Verifier): js.Promise[_] = js.native
  /* CompleteClass */
  override def expectSucceed(verifier: lambdaDashTesterLib.lambdaDashTesterMod.lambdaTesterNs.Verifier): js.Promise[_] = js.native
  /* CompleteClass */
  override def identity(cognitoIdentityId: java.lang.String, cognitoIdentityPoolId: java.lang.String): this.type = js.native
  /* CompleteClass */
  override def timeout(seconds: scala.Double): this.type = js.native
  /* CompleteClass */
  override def xray(): this.type = js.native
}

