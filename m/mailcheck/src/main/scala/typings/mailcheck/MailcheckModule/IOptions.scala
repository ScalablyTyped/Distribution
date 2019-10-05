package typings.mailcheck.MailcheckModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var distanceFunction: js.UndefOr[IDistanceFunction] = js.undefined
  var domains: js.UndefOr[js.Array[String]] = js.undefined
  var email: String
  var empty: js.UndefOr[IEmpty | IJQueryEmpty] = js.undefined
  var secondLevelDomains: js.UndefOr[js.Array[String]] = js.undefined
  var suggested: js.UndefOr[ISuggested | IJQuerySuggested] = js.undefined
  var topLevelDomains: js.UndefOr[js.Array[String]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    email: String,
    distanceFunction: (/* s1 */ String, /* s2 */ String) => Double = null,
    domains: js.Array[String] = null,
    empty: IEmpty | IJQueryEmpty = null,
    secondLevelDomains: js.Array[String] = null,
    suggested: ISuggested | IJQuerySuggested = null,
    topLevelDomains: js.Array[String] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(email = email)
    if (distanceFunction != null) __obj.updateDynamic("distanceFunction")(js.Any.fromFunction2(distanceFunction))
    if (domains != null) __obj.updateDynamic("domains")(domains)
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (secondLevelDomains != null) __obj.updateDynamic("secondLevelDomains")(secondLevelDomains)
    if (suggested != null) __obj.updateDynamic("suggested")(suggested.asInstanceOf[js.Any])
    if (topLevelDomains != null) __obj.updateDynamic("topLevelDomains")(topLevelDomains)
    __obj.asInstanceOf[IOptions]
  }
}

