package typings.materialUiSystem

import typings.materialUiSystem.materialUiSystemStrings.theme
import typings.materialUiSystem.mod.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCss[Props] extends js.Object {
  var css: Omit[Props, theme]
}

object AnonCss {
  @scala.inline
  def apply[Props](css: Omit[Props, theme]): AnonCss[Props] = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCss[Props]]
  }
}

