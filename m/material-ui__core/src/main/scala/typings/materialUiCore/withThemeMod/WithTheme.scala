package typings.materialUiCore.withThemeMod

import typings.materialUiCore.createMuiThemeMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithTheme extends js.Object {
  var theme: Theme = js.native
}

object WithTheme {
  @scala.inline
  def apply(theme: Theme): WithTheme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WithTheme]
  }
}

