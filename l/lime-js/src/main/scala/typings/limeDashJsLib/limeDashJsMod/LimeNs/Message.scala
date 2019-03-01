package typings
package limeDashJsLib.limeDashJsMod.LimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends Envelope {
  var content: js.Any
  var `type`: java.lang.String
}

object Message {
  @scala.inline
  def apply(
    content: js.Any,
    `type`: java.lang.String,
    from: java.lang.String = null,
    id: java.lang.String = null,
    metadata: js.Any = null,
    pp: java.lang.String = null,
    to: java.lang.String = null
  ): Message = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("content")(content)
    if (from != null) __obj.updateDynamic("from")(from)
    if (id != null) __obj.updateDynamic("id")(id)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (pp != null) __obj.updateDynamic("pp")(pp)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Message]
  }
}

