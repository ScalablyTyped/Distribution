package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTreeGridUpdatingLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Specifies the label of the add child button in touch environment.
    *
    */
  var addChildButtonLabel: js.UndefOr[String] = js.native
  /**
    * Specifies the add child tooltip text.
    *
    */
  var addChildTooltip: js.UndefOr[String] = js.native
}

object IgTreeGridUpdatingLocale {
  @scala.inline
  def apply(): IgTreeGridUpdatingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridUpdatingLocale]
  }
  @scala.inline
  implicit class IgTreeGridUpdatingLocaleOps[Self <: IgTreeGridUpdatingLocale] (val x: Self) extends AnyVal {
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
    def setAddChildButtonLabel(value: String): Self = this.set("addChildButtonLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddChildButtonLabel: Self = this.set("addChildButtonLabel", js.undefined)
    @scala.inline
    def setAddChildTooltip(value: String): Self = this.set("addChildTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddChildTooltip: Self = this.set("addChildTooltip", js.undefined)
  }
  
}

