package typings.materialUiStyles.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassName[Theme] extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
}

object ClassName {
  @scala.inline
  def apply[Theme](className: String = null, theme: Theme = null): ClassName[Theme] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName[Theme]]
  }
}

