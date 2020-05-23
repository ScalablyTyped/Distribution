package typings.helmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetReferrerPolicyConfiguration extends js.Object {
  var policy: js.UndefOr[String | js.Array[String]] = js.undefined
}

object IHelmetReferrerPolicyConfiguration {
  @scala.inline
  def apply(policy: String | js.Array[String] = null): IHelmetReferrerPolicyConfiguration = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHelmetReferrerPolicyConfiguration]
  }
}

