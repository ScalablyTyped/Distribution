package typings.issueDashParser.issueDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mention extends js.Object {
  var prefix: String
  var raw: String
  var user: String
}

object Mention {
  @scala.inline
  def apply(prefix: String, raw: String, user: String): Mention = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Mention]
  }
}

