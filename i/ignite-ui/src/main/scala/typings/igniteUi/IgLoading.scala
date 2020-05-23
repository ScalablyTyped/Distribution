package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLoading
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  var cssClass: js.UndefOr[js.Any] = js.undefined
  var includeVerticalOffset: js.UndefOr[Boolean] = js.undefined
}

object IgLoading {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    cssClass: js.Any = null,
    includeVerticalOffset: js.UndefOr[Boolean] = js.undefined
  ): IgLoading = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(includeVerticalOffset)) __obj.updateDynamic("includeVerticalOffset")(includeVerticalOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgLoading]
  }
}

