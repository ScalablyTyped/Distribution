package typings.helmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelmetReferrerPolicyConfiguration extends js.Object {
  var policy: js.UndefOr[String | js.Array[String]] = js.native
}

object IHelmetReferrerPolicyConfiguration {
  @scala.inline
  def apply(): IHelmetReferrerPolicyConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHelmetReferrerPolicyConfiguration]
  }
  @scala.inline
  implicit class IHelmetReferrerPolicyConfigurationOps[Self <: IHelmetReferrerPolicyConfiguration] (val x: Self) extends AnyVal {
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
    def setPolicyVarargs(value: String*): Self = this.set("policy", js.Array(value :_*))
    @scala.inline
    def setPolicy(value: String | js.Array[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
  
}

