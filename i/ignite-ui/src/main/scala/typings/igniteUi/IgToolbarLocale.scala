package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgToolbarLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets/Sets collapse button title.
    *
    */
  var collapseButtonTitle: js.UndefOr[js.Any] = js.native
  /**
    * Gets/Sets expand button title.
    *
    */
  var expandButtonTitle: js.UndefOr[js.Any] = js.native
}

object IgToolbarLocale {
  @scala.inline
  def apply(): IgToolbarLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgToolbarLocale]
  }
  @scala.inline
  implicit class IgToolbarLocaleOps[Self <: IgToolbarLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollapseButtonTitle(value: js.Any): Self = this.set("collapseButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseButtonTitle: Self = this.set("collapseButtonTitle", js.undefined)
    @scala.inline
    def setExpandButtonTitle(value: js.Any): Self = this.set("expandButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandButtonTitle: Self = this.set("expandButtonTitle", js.undefined)
  }
  
}

