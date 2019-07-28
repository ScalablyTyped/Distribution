package typings.limeDashJs.limeDashJsMod

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
    val __obj = js.Dynamic.literal(content = content)
    __obj.updateDynamic("type")(`type`)
    if (from != null) __obj.updateDynamic("from")(from)
    if (id != null) __obj.updateDynamic("id")(id)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (pp != null) __obj.updateDynamic("pp")(pp)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Message]
  }
}

