package typings.limeDashJs.limeDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends Envelope {
  var method: String
  var reason: js.UndefOr[Reason] = js.undefined
  var resource: js.UndefOr[js.Any] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object Command {
  @scala.inline
  def apply(
    method: String,
    from: String = null,
    id: String = null,
    metadata: js.Any = null,
    pp: String = null,
    reason: Reason = null,
    resource: js.Any = null,
    status: String = null,
    to: String = null,
    `type`: String = null,
    uri: String = null
  ): Command = {
    val __obj = js.Dynamic.literal(method = method)
    if (from != null) __obj.updateDynamic("from")(from)
    if (id != null) __obj.updateDynamic("id")(id)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (pp != null) __obj.updateDynamic("pp")(pp)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (status != null) __obj.updateDynamic("status")(status)
    if (to != null) __obj.updateDynamic("to")(to)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Command]
  }
}

