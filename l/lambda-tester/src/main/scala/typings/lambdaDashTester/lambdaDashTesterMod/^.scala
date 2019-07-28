package typings.lambdaDashTester.lambdaDashTesterMod

import typings.awsDashLambda.awsDashLambdaMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lambda-tester", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T /* <: Handler[_, _] */](handler: T): LambdaTester[T] = js.native
}

