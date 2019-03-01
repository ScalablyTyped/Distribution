package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridResponsiveAllowedColumnWidthPerType
  extends /**
	 * Option for IgGridResponsiveAllowedColumnWidthPerType
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Minimal width in pixels bool columns can take before forcing vertical rendering
  	 *
  	 */
  var bool: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Minimal width in pixels date columns can take before forcing vertical rendering
  	 *
  	 */
  var date: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Minimal width in pixels number columns can take before forcing vertical rendering
  	 *
  	 */
  var number: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Minimal width in pixels object columns can take before forcing vertical rendering
  	 *
  	 */
  var `object`: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Minimal width in pixels string columns can take before forcing vertical rendering
  	 *
  	 */
  var string: js.UndefOr[scala.Double] = js.undefined
}

object IgGridResponsiveAllowedColumnWidthPerType {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridResponsiveAllowedColumnWidthPerType
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    bool: scala.Int | scala.Double = null,
    date: scala.Int | scala.Double = null,
    number: scala.Int | scala.Double = null,
    `object`: scala.Int | scala.Double = null,
    string: scala.Int | scala.Double = null
  ): IgGridResponsiveAllowedColumnWidthPerType = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (bool != null) __obj.updateDynamic("bool")(bool.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridResponsiveAllowedColumnWidthPerType]
  }
}

