package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgWidget
  extends /**
	 * Option for igWidget
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
}

object IgWidget {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igWidget
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    language: java.lang.String = null,
    locale: js.Any = null,
    regional: java.lang.String | js.Object = null
  ): IgWidget = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgWidget]
  }
}

