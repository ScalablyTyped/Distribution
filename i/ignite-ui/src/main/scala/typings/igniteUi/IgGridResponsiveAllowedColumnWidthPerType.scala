package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridResponsiveAllowedColumnWidthPerType
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Minimal width in pixels bool columns can take before forcing vertical rendering
    *
    */
  var bool: js.UndefOr[Double] = js.undefined
  /**
    * Minimal width in pixels date columns can take before forcing vertical rendering
    *
    */
  var date: js.UndefOr[Double] = js.undefined
  /**
    * Minimal width in pixels number columns can take before forcing vertical rendering
    *
    */
  var number: js.UndefOr[Double] = js.undefined
  /**
    * Minimal width in pixels object columns can take before forcing vertical rendering
    *
    */
  var `object`: js.UndefOr[Double] = js.undefined
  /**
    * Minimal width in pixels string columns can take before forcing vertical rendering
    *
    */
  var string: js.UndefOr[Double] = js.undefined
}

object IgGridResponsiveAllowedColumnWidthPerType {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    bool: js.UndefOr[Double] = js.undefined,
    date: js.UndefOr[Double] = js.undefined,
    number: js.UndefOr[Double] = js.undefined,
    `object`: js.UndefOr[Double] = js.undefined,
    string: js.UndefOr[Double] = js.undefined
  ): IgGridResponsiveAllowedColumnWidthPerType = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(bool)) __obj.updateDynamic("bool")(bool.get.asInstanceOf[js.Any])
    if (!js.isUndefined(date)) __obj.updateDynamic("date")(date.get.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`object`)) __obj.updateDynamic("object")(`object`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(string)) __obj.updateDynamic("string")(string.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridResponsiveAllowedColumnWidthPerType]
  }
}

