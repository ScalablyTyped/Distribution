package typings.materialUi

import typings.materialUi.MaterialUI.Styles.MuiTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMuiTheme extends js.Object {
  var muiTheme: js.UndefOr[MuiTheme] = js.undefined
}

object AnonMuiTheme {
  @scala.inline
  def apply(muiTheme: MuiTheme = null): AnonMuiTheme = {
    val __obj = js.Dynamic.literal()
    if (muiTheme != null) __obj.updateDynamic("muiTheme")(muiTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMuiTheme]
  }
}

