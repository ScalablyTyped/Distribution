package typings.lambdaWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLambdaFunction extends js.Object {
  var lambdaFunction: String
  var region: String
}

object AnonLambdaFunction {
  @scala.inline
  def apply(lambdaFunction: String, region: String): AnonLambdaFunction = {
    val __obj = js.Dynamic.literal(lambdaFunction = lambdaFunction.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLambdaFunction]
  }
}

