package typings.limeJs.mod

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
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (pp != null) __obj.updateDynamic("pp")(pp.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Envelope]
  }
}

