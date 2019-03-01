package typings
package mainDashBowerDashFilesLib.mainDashBowerDashFilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaths extends js.Object {
  var bowerDirectory: js.UndefOr[java.lang.String] = js.undefined
  var bowerJson: js.UndefOr[java.lang.String] = js.undefined
  var bowerrc: js.UndefOr[java.lang.String] = js.undefined
}

object IPaths {
  @scala.inline
  def apply(
    bowerDirectory: java.lang.String = null,
    bowerJson: java.lang.String = null,
    bowerrc: java.lang.String = null
  ): IPaths = {
    val __obj = js.Dynamic.literal()
    if (bowerDirectory != null) __obj.updateDynamic("bowerDirectory")(bowerDirectory)
    if (bowerJson != null) __obj.updateDynamic("bowerJson")(bowerJson)
    if (bowerrc != null) __obj.updateDynamic("bowerrc")(bowerrc)
    __obj.asInstanceOf[IPaths]
  }
}

