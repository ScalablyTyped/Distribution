package typings.lambdaDashTester.lambdaDashTesterMod

import typings.awsDashLambda.awsDashLambdaMod.ClientContext
import typings.awsDashLambda.awsDashLambdaMod.Context
import typings.awsDashLambda.awsDashLambdaMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lambda-tester", "LambdaTester")
@js.native
class LambdaTester[T /* <: Handler[_, _] */] () extends js.Object {
  def clientContext(clientContext: ClientContext): this.type = js.native
  def context(context: Context): this.type = js.native
  def event(event: HandlerEvent[T]): this.type = js.native
  def expectError(verifier: Verifier[HandlerError[T]]): js.Promise[_] = js.native
  def expectFail(verifier: Verifier[HandlerError[T]]): js.Promise[_] = js.native
  def expectReject(verifier: Verifier[HandlerError[T]]): js.Promise[_] = js.native
  def expectResolve(verifier: Verifier[HandlerResult[T]]): js.Promise[_] = js.native
  def expectResult(verifier: Verifier[HandlerResult[T]]): js.Promise[_] = js.native
  def expectSucceed(verifier: Verifier[HandlerResult[T]]): js.Promise[_] = js.native
  def identity(cognitoIdentityId: String, cognitoIdentityPoolId: String): this.type = js.native
  def timeout(seconds: Double): this.type = js.native
  def xray(): this.type = js.native
}

