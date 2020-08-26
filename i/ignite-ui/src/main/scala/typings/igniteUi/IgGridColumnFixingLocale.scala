package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridColumnFixingLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Text of the feature chooser button for fixing a currently unfixed column.
    *
    */
  var featureChooserTextFixedColumn: js.UndefOr[String] = js.native
  /**
    * Text of the feature chooser button for unfixing a currently fixed column.
    *
    */
  var featureChooserTextUnfixedColumn: js.UndefOr[String] = js.native
  /**
    * Specifies the tooltip text on the column fixing header icon when column is not fixed.
    *
    */
  var headerFixButtonText: js.UndefOr[String] = js.native
  /**
    * Specifies the tooltip text on the column fixing header icon when column is not fixed.
    *
    */
  var headerUnfixButtonText: js.UndefOr[String] = js.native
}

object IgGridColumnFixingLocale {
  @scala.inline
  def apply(): IgGridColumnFixingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridColumnFixingLocale]
  }
  @scala.inline
  implicit class IgGridColumnFixingLocaleOps[Self <: IgGridColumnFixingLocale] (val x: Self) extends AnyVal {
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
    def setFeatureChooserTextFixedColumn(value: String): Self = this.set("featureChooserTextFixedColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureChooserTextFixedColumn: Self = this.set("featureChooserTextFixedColumn", js.undefined)
    @scala.inline
    def setFeatureChooserTextUnfixedColumn(value: String): Self = this.set("featureChooserTextUnfixedColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureChooserTextUnfixedColumn: Self = this.set("featureChooserTextUnfixedColumn", js.undefined)
    @scala.inline
    def setHeaderFixButtonText(value: String): Self = this.set("headerFixButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderFixButtonText: Self = this.set("headerFixButtonText", js.undefined)
    @scala.inline
    def setHeaderUnfixButtonText(value: String): Self = this.set("headerUnfixButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderUnfixButtonText: Self = this.set("headerUnfixButtonText", js.undefined)
  }
  
}

