package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Allowfrom extends js.Object {
  /**
    * an object for specifying the 'allow-from' rule,
    */
  var rule: hapiLib.hapiLibStrings.deny | hapiLib.hapiLibStrings.sameorigin | hapiLib.hapiLibStrings.`allow-from`
  /**
    * when rule is 'allow-from' this is used to form the rest of the header, otherwise this field is ignored. If rule is 'allow-from' but source is unset, the rule will be automatically changed
    * to 'sameorigin'.
    */
  var source: java.lang.String
}

object Anon_Allowfrom {
  @scala.inline
  def apply(
    rule: hapiLib.hapiLibStrings.deny | hapiLib.hapiLibStrings.sameorigin | hapiLib.hapiLibStrings.`allow-from`,
    source: java.lang.String
  ): Anon_Allowfrom = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any], source = source)
  
    __obj.asInstanceOf[Anon_Allowfrom]
  }
}

