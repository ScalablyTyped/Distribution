package typings.helmet.helmetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetPermittedCrossDomainPoliciesConfiguration extends js.Object {
  var permittedPolicies: js.UndefOr[String] = js.undefined
}

object IHelmetPermittedCrossDomainPoliciesConfiguration {
  @scala.inline
  def apply(permittedPolicies: String = null): IHelmetPermittedCrossDomainPoliciesConfiguration = {
    val __obj = js.Dynamic.literal()
    if (permittedPolicies != null) __obj.updateDynamic("permittedPolicies")(permittedPolicies)
    __obj.asInstanceOf[IHelmetPermittedCrossDomainPoliciesConfiguration]
  }
}

