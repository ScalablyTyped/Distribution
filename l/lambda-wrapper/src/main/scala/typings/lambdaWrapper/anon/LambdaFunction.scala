package typings.lambdaWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaFunction extends js.Object {
  var lambdaFunction: String = js.native
  var region: String = js.native
}

object LambdaFunction {
  @scala.inline
  def apply(lambdaFunction: String, region: String): LambdaFunction = {
    val __obj = js.Dynamic.literal(lambdaFunction = lambdaFunction.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunction]
  }
  @scala.inline
  implicit class LambdaFunctionOps[Self <: LambdaFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLambdaFunction(value: String): Self = this.set("lambdaFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
  }
  
}

