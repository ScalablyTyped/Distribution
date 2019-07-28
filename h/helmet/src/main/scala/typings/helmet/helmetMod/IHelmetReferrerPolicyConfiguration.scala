package typings.helmet.helmetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetReferrerPolicyConfiguration extends js.Object {
  var policy: js.UndefOr[String] = js.undefined
}

object IHelmetReferrerPolicyConfiguration {
  @scala.inline
  def apply(policy: String = null): IHelmetReferrerPolicyConfiguration = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy)
    __obj.asInstanceOf[IHelmetReferrerPolicyConfiguration]
  }
}

