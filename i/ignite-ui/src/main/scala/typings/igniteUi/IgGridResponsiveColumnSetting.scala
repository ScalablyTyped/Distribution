package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridResponsiveColumnSetting
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * A list of predefined classes to decide element's visibility on.
    *
    */
  var classes: js.UndefOr[String] = js.native
  /**
    * Column index. Can be used in place of column key. The preferred way of populating a column setting is to always use the column keys as identifiers.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
    * Column key. This is a required property in every column setting if columnIndex is not set.
    *
    */
  var columnKey: js.UndefOr[String] = js.native
  /**
    * A configuration object to use for the responsive functionality. Uses the keys defined in the widget's responsiveModes object. The classes property is not used if this one is set.
    *
    */
  var configuration: js.UndefOr[js.Any] = js.native
}

object IgGridResponsiveColumnSetting {
  @scala.inline
  def apply(): IgGridResponsiveColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridResponsiveColumnSetting]
  }
  @scala.inline
  implicit class IgGridResponsiveColumnSettingOps[Self <: IgGridResponsiveColumnSetting] (val x: Self) extends AnyVal {
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
    def setClasses(value: String): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    @scala.inline
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    @scala.inline
    def setConfiguration(value: js.Any): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
  }
  
}

