package typings.iobroker.iobrokerMod.Global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Maybe this should extend Record<string, any>,
// but the extra properties aren't defined anywhere,
// so I'd rather force the user to explicitly state
// he knows what he's doing by casting to any
trait ObjectCommon extends js.Object {
  // Icon and role aren't defined in SCHEMA.md,
  // but they are being used by some adapters
  /** Icon for this object */
  var icon: js.UndefOr[String] = js.undefined
  /** name of this object */
  var name: String
  /** role of the object */
  var role: js.UndefOr[String] = js.undefined
}

object ObjectCommon {
  @scala.inline
  def apply(name: String, icon: String = null, role: String = null): ObjectCommon = {
    val __obj = js.Dynamic.literal(name = name)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[ObjectCommon]
  }
}

