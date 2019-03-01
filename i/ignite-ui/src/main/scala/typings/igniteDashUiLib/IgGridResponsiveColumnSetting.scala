package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridResponsiveColumnSetting
  extends /**
	 * Option for IgGridResponsiveColumnSetting
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * A list of predefined classes to decide element's visibility on.
  	 *
  	 */
  var classes: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Column index. Can be used in place of column key. The preferred way of populating a column setting is to always use the column keys as identifiers.
  	 *
  	 */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Column key. This is a required property in every column setting if columnIndex is not set.
  	 *
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * A configuration object to use for the responsive functionality. Uses the keys defined in the widget's responsiveModes object. The classes property is not used if this one is set.
  	 *
  	 */
  var configuration: js.UndefOr[js.Any] = js.undefined
}

object IgGridResponsiveColumnSetting {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridResponsiveColumnSetting
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    classes: java.lang.String = null,
    columnIndex: scala.Int | scala.Double = null,
    columnKey: java.lang.String = null,
    configuration: js.Any = null
  ): IgGridResponsiveColumnSetting = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    __obj.asInstanceOf[IgGridResponsiveColumnSetting]
  }
}

