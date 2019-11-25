package typings.mainDashBowerDashFiles.mainDashBowerDashFilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaths extends js.Object {
  var bowerDirectory: js.UndefOr[String] = js.undefined
  var bowerJson: js.UndefOr[String] = js.undefined
  var bowerrc: js.UndefOr[String] = js.undefined
}

object IPaths {
  @scala.inline
  def apply(bowerDirectory: String = null, bowerJson: String = null, bowerrc: String = null): IPaths = {
    val __obj = js.Dynamic.literal()
    if (bowerDirectory != null) __obj.updateDynamic("bowerDirectory")(bowerDirectory.asInstanceOf[js.Any])
    if (bowerJson != null) __obj.updateDynamic("bowerJson")(bowerJson.asInstanceOf[js.Any])
    if (bowerrc != null) __obj.updateDynamic("bowerrc")(bowerrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaths]
  }
}

