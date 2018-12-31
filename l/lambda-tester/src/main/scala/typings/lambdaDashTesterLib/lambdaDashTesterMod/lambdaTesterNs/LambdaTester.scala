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

