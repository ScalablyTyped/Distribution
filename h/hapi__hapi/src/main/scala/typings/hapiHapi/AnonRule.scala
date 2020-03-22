package typings.hapiHapi

import typings.hapiHapi.hapiHapiStrings.`allow-from`
import typings.hapiHapi.hapiHapiStrings.deny
import typings.hapiHapi.hapiHapiStrings.sameorigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRule extends js.Object {
  /**
    * an object for specifying the 'allow-from' rule,
    */
  var rule: deny | sameorigin | `allow-from`
  /**
    * when rule is 'allow-from' this is used to form the rest of the header, otherwise this field is ignored. If rule is 'allow-from' but source is unset, the rule will be automatically changed
    * to 'sameorigin'.
    */
  var source: String
}

object AnonRule {
  @scala.inline
  def apply(rule: deny | sameorigin | `allow-from`, source: String): AnonRule = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRule]
  }
}

