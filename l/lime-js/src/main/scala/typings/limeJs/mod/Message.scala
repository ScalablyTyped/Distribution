package typings.limeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends Envelope {
  var content: js.Any
  var `type`: String
}

object Message {
  @scala.inline
  def apply(
    content: js.Any,
    `type`: String,
    from: String = null,
    id: String = null,
    metadata: js.Any = null,
    pp: String = null,
    to: String = null
  ): Message = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (pp != null) __obj.updateDynamic("pp")(pp.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

