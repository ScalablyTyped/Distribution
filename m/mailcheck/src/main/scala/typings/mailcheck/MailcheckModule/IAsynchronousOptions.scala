package typings.mailcheck.MailcheckModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsynchronousOptions extends js.Object {
  var distanceFunction: js.UndefOr[IDistanceFunction] = js.undefined
  var domains: js.UndefOr[js.Array[String]] = js.undefined
  var email: String
  var empty: js.UndefOr[IEmpty | IJQueryEmpty] = js.undefined
  var secondLevelDomains: js.UndefOr[js.Array[String]] = js.undefined
  var suggested: ISuggested | IJQuerySuggested
  var topLevelDomains: js.UndefOr[js.Array[String]] = js.undefined
}

object IAsynchronousOptions {
  @scala.inline
  def apply(
    email: String,
    suggested: ISuggested | IJQuerySuggested,
    distanceFunction: (/* s1 */ String, /* s2 */ String) => Double = null,
    domains: js.Array[String] = null,
    empty: IEmpty | IJQueryEmpty = null,
    secondLevelDomains: js.Array[String] = null,
    topLevelDomains: js.Array[String] = null
  ): IAsynchronousOptions = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], suggested = suggested.asInstanceOf[js.Any])
    if (distanceFunction != null) __obj.updateDynamic("distanceFunction")(js.Any.fromFunction2(distanceFunction))
    if (domains != null) __obj.updateDynamic("domains")(domains.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (secondLevelDomains != null) __obj.updateDynamic("secondLevelDomains")(secondLevelDomains.asInstanceOf[js.Any])
    if (topLevelDomains != null) __obj.updateDynamic("topLevelDomains")(topLevelDomains.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsynchronousOptions]
  }
}

