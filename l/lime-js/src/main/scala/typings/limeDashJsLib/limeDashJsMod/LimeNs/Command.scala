package typings
package limeDashJsLib.limeDashJsMod.LimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends Envelope {
  var method: java.lang.String
  var reason: js.UndefOr[Reason] = js.undefined
  var resource: js.UndefOr[js.Any] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object Command {
  @scala.inline
  def apply(
    method: java.lang.String,
    from: java.lang.String = null,
    id: java.lang.String = null,
    metadata: js.Any = null,
    pp: java.lang.String = null,
    reason: Reason = null,
    resource: js.Any = null,
    status: java.lang.String = null,
    to: java.lang.String = null,
    `type`: java.lang.String = null,
    uri: java.lang.String = null
  ): Command = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
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

