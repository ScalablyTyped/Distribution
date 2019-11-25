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
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (pp != null) __obj.updateDynamic("pp")(pp.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

