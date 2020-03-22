package typings.mailcheck.MailcheckModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISynchronousOptions extends js.Object {
  var distanceFunction: js.UndefOr[IDistanceFunction] = js.undefined
  var domains: js.UndefOr[js.Array[String]] = js.undefined
  var email: String
  var secondLevelDomains: js.UndefOr[js.Array[String]] = js.undefined
  var topLevelDomains: js.UndefOr[js.Array[String]] = js.undefined
}

object ISynchronousOptions {
  @scala.inline
  def apply(
    email: String,
    distanceFunction: (/* s1 */ String, /* s2 */ String) => Double = null,
    domains: js.Array[String] = null,
    secondLevelDomains: js.Array[String] = null,
    topLevelDomains: js.Array[String] = null
  ): ISynchronousOptions = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    if (distanceFunction != null) __obj.updateDynamic("distanceFunction")(js.Any.fromFunction2(distanceFunction))
    if (domains != null) __obj.updateDynamic("domains")(domains.asInstanceOf[js.Any])
    if (secondLevelDomains != null) __obj.updateDynamic("secondLevelDomains")(secondLevelDomains.asInstanceOf[js.Any])
    if (topLevelDomains != null) __obj.updateDynamic("topLevelDomains")(topLevelDomains.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISynchronousOptions]
  }
}

