package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgHierarchicalGridLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Specifies the default tooltip applied to an expand column cell, that is currently expanded.
    *
    */
  var collapseTooltip: js.UndefOr[String] = js.native
  /**
    * Specifies the default tooltip applied to an expand column cell, that is currently collapsed.
    *
    */
  var expandTooltip: js.UndefOr[String] = js.native
}

object IgHierarchicalGridLocale {
  @scala.inline
  def apply(): IgHierarchicalGridLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgHierarchicalGridLocale]
  }
  @scala.inline
  implicit class IgHierarchicalGridLocaleOps[Self <: IgHierarchicalGridLocale] (val x: Self) extends AnyVal {
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
    def setCollapseTooltip(value: String): Self = this.set("collapseTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseTooltip: Self = this.set("collapseTooltip", js.undefined)
    @scala.inline
    def setExpandTooltip(value: String): Self = this.set("expandTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandTooltip: Self = this.set("expandTooltip", js.undefined)
  }
  
}

