package typings
package limeDashJsLib.limeDashJsMod.LimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Envelope extends js.Object {
  var from: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var pp: js.UndefOr[java.lang.String] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object Envelope {
  @scala.inline
  def apply(
    from: java.lang.String = null,
    id: java.lang.String = null,
    metadata: js.Any = null,
    pp: java.lang.String = null,
    to: java.lang.String = null
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

