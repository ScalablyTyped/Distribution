package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auto extends js.Object {
  var horizontal: js.UndefOr[
    grommetLib.grommetLibStrings.auto | grommetLib.grommetLibStrings.hidden | grommetLib.grommetLibStrings.scroll | grommetLib.grommetLibStrings.visible
  ] = js.undefined
  var vertical: js.UndefOr[
    grommetLib.grommetLibStrings.auto | grommetLib.grommetLibStrings.hidden | grommetLib.grommetLibStrings.scroll | grommetLib.grommetLibStrings.visible
  ] = js.undefined
}

object Anon_Auto {
  @scala.inline
  def apply(
    horizontal: grommetLib.grommetLibStrings.auto | grommetLib.grommetLibStrings.hidden | grommetLib.grommetLibStrings.scroll | grommetLib.grommetLibStrings.visible = null,
    vertical: grommetLib.grommetLibStrings.auto | grommetLib.grommetLibStrings.hidden | grommetLib.grommetLibStrings.scroll | grommetLib.grommetLibStrings.visible = null
  ): Anon_Auto = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Auto]
  }
}

