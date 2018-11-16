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

