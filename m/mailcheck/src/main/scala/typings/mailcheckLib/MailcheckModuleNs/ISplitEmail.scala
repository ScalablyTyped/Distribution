package typings
package mailcheckLib.MailcheckModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISplitEmail extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var topLevelDomain: js.UndefOr[java.lang.String] = js.undefined
}

object ISplitEmail {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    domain: java.lang.String = null,
    topLevelDomain: java.lang.String = null
  ): ISplitEmail = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (topLevelDomain != null) __obj.updateDynamic("topLevelDomain")(topLevelDomain)
    __obj.asInstanceOf[ISplitEmail]
  }
}

