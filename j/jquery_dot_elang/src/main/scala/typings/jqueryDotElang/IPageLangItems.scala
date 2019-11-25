package typings.jqueryDotElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPageLangItems extends js.Object {
  var en: js.UndefOr[IPageLabels] = js.undefined
  var hu: js.UndefOr[IPageLabels] = js.undefined
}

object IPageLangItems {
  @scala.inline
  def apply(en: IPageLabels = null, hu: IPageLabels = null): IPageLangItems = {
    val __obj = js.Dynamic.literal()
    if (en != null) __obj.updateDynamic("en")(en.asInstanceOf[js.Any])
    if (hu != null) __obj.updateDynamic("hu")(hu.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPageLangItems]
  }
}

