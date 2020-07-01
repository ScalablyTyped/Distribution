package typings.grommet.anon

import typings.grommet.utilsMod.BorderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderBorderType extends js.Object {
  var border: js.UndefOr[BorderType] = js.undefined
}

object BorderBorderType {
  @scala.inline
  def apply(border: BorderType = null): BorderBorderType = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBorderType]
  }
}

