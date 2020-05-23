package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Specifies the collapse indicator tooltip text.
    *
    */
  var collapseTooltipText: js.UndefOr[String] = js.undefined
  /**
    * Specifies the expansion indicator tooltip text.
    *
    */
  var expandTooltipText: js.UndefOr[String] = js.undefined
}

object IgTreeGridLocale {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    collapseTooltipText: String = null,
    expandTooltipText: String = null
  ): IgTreeGridLocale = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (collapseTooltipText != null) __obj.updateDynamic("collapseTooltipText")(collapseTooltipText.asInstanceOf[js.Any])
    if (expandTooltipText != null) __obj.updateDynamic("expandTooltipText")(expandTooltipText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTreeGridLocale]
  }
}

