package typings.atMaterialDashUiStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ThemeOptional[Theme] extends js.Object {
  var theme: js.UndefOr[Theme] = js.undefined
}

object Anon_ThemeOptional {
  @scala.inline
  def apply[Theme](theme: Theme = null): Anon_ThemeOptional[Theme] = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ThemeOptional[Theme]]
  }
}

