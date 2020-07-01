package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ids extends js.Object {
  /** DELFI Haltestellen ID */
  var dhid: js.UndefOr[String] = js.undefined
}

object Ids {
  @scala.inline
  def apply(dhid: String = null): Ids = {
    val __obj = js.Dynamic.literal()
    if (dhid != null) __obj.updateDynamic("dhid")(dhid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ids]
  }
}

