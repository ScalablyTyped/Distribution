package typings.helmet.helmetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetFrameguardConfiguration extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
}

object IHelmetFrameguardConfiguration {
  @scala.inline
  def apply(action: String = null, domain: String = null): IHelmetFrameguardConfiguration = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    __obj.asInstanceOf[IHelmetFrameguardConfiguration]
  }
}

