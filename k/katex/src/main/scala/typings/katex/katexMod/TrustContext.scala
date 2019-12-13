package typings.katex.katexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustContext extends js.Object {
  var command: String
  var protocol: String
  var url: String
}

object TrustContext {
  @scala.inline
  def apply(command: String, protocol: String, url: String): TrustContext = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TrustContext]
  }
}

