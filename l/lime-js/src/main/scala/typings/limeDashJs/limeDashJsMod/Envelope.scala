package typings.limeDashJs.limeDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Envelope extends js.Object {
  var from: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var pp: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object Envelope {
  @scala.inline
  def apply(
    from: String = null,
    id: String = null,
    metadata: js.Any = null,
    pp: String = null,
    to: String = null
  ): Envelope = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (id != null) __obj.updateDynamic("id")(id)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (pp != null) __obj.updateDynamic("pp")(pp)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Envelope]
  }
}

