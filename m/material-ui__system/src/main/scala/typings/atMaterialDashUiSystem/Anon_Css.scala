package typings.atMaterialDashUiSystem

import typings.atMaterialDashUiSystem.atMaterialDashUiSystemMod.Omit
import typings.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Css[Props] extends js.Object {
  var css: Omit[Props, theme]
}

object Anon_Css {
  @scala.inline
  def apply[Props](css: Omit[Props, theme]): Anon_Css[Props] = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Css[Props]]
  }
}

