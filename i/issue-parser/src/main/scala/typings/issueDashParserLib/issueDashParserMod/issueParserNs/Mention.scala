package typings
package issueDashParserLib.issueDashParserMod.issueParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mention extends js.Object {
  var prefix: java.lang.String
  var raw: java.lang.String
  var user: java.lang.String
}

object Mention {
  @scala.inline
  def apply(prefix: java.lang.String, raw: java.lang.String, user: java.lang.String): Mention = {
    val __obj = js.Dynamic.literal(prefix = prefix, raw = raw, user = user)
  
    __obj.asInstanceOf[Mention]
  }
}

