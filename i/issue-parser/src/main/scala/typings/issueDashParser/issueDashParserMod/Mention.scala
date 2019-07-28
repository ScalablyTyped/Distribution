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
    val __obj = js.Dynamic.literal(prefix = prefix, raw = raw, user = user)
  
    __obj.asInstanceOf[Mention]
  }
}

