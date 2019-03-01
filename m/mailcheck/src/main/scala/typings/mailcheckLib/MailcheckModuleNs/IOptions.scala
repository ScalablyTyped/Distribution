package typings
package mailcheckLib.MailcheckModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var distanceFunction: js.UndefOr[IDistanceFunction] = js.undefined
  var domains: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var email: java.lang.String
  var empty: js.UndefOr[IEmpty | IJQueryEmpty] = js.undefined
  var secondLevelDomains: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var suggested: js.UndefOr[ISuggested | IJQuerySuggested] = js.undefined
  var topLevelDomains: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    email: java.lang.String,
    distanceFunction: IDistanceFunction = null,
    domains: js.Array[java.lang.String] = null,
    empty: IEmpty | IJQueryEmpty = null,
    secondLevelDomains: js.Array[java.lang.String] = null,
    suggested: ISuggested | IJQuerySuggested = null,
    topLevelDomains: js.Array[java.lang.String] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("email")(email)
    if (distanceFunction != null) __obj.updateDynamic("distanceFunction")(distanceFunction)
    if (domains != null) __obj.updateDynamic("domains")(domains)
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (secondLevelDomains != null) __obj.updateDynamic("secondLevelDomains")(secondLevelDomains)
    if (suggested != null) __obj.updateDynamic("suggested")(suggested.asInstanceOf[js.Any])
    if (topLevelDomains != null) __obj.updateDynamic("topLevelDomains")(topLevelDomains)
    __obj.asInstanceOf[IOptions]
  }
}

