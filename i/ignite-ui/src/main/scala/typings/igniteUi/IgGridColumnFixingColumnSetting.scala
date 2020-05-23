package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridColumnFixingColumnSetting
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Specifies whether the column can be fixed or not. If allow fixing is false, then the fixing pin will not be rendered for the column.
    *
    */
  var allowFixing: js.UndefOr[Boolean] = js.undefined
  /**
    * Identifies the grid column by index. Either key or index must be set in every column setting.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
    * Identifies the grid column by key. Either key or index must be set in every column setting.
    *
    */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether the column is initially fixed or not. Check [this topic](http://www.igniteui.com/help/iggrid-columnfixing-configuring#initial-state) out for more information.
    *
    */
  var isFixed: js.UndefOr[Boolean] = js.undefined
}

object IgGridColumnFixingColumnSetting {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    allowFixing: js.UndefOr[Boolean] = js.undefined,
    columnIndex: js.UndefOr[Double] = js.undefined,
    columnKey: String = null,
    isFixed: js.UndefOr[Boolean] = js.undefined
  ): IgGridColumnFixingColumnSetting = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowFixing)) __obj.updateDynamic("allowFixing")(allowFixing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (!js.isUndefined(isFixed)) __obj.updateDynamic("isFixed")(isFixed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridColumnFixingColumnSetting]
  }
}

