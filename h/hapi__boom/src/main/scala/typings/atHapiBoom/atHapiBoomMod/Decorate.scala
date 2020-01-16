package typings.atHapiBoom.atHapiBoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decorate[Decoration] extends js.Object {
  /**
    * An option with extra properties to set on the error object
    */
  var decorate: js.UndefOr[Decoration] = js.undefined
}

object Decorate {
  @scala.inline
  def apply[Decoration](decorate: Decoration = null): Decorate[Decoration] = {
    val __obj = js.Dynamic.literal()
    if (decorate != null) __obj.updateDynamic("decorate")(decorate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decorate[Decoration]]
  }
}

