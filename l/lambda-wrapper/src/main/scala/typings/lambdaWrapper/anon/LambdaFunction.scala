package typings.lambdaWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaFunction extends js.Object {
  var lambdaFunction: String
  var region: String
}

object LambdaFunction {
  @scala.inline
  def apply(lambdaFunction: String, region: String): LambdaFunction = {
    val __obj = js.Dynamic.literal(lambdaFunction = lambdaFunction.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunction]
  }
}

