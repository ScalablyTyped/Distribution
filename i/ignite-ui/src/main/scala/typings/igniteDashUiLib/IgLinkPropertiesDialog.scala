package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLinkPropertiesDialog
  extends /**
	 * Option for igLinkPropertiesDialog
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  @JSName("apply")
  var apply: js.UndefOr[ApplyEvent] = js.undefined
  var cancel: js.UndefOr[CancelEvent] = js.undefined
  var hide: js.UndefOr[HideEvent] = js.undefined
  var isHidden: js.UndefOr[scala.Boolean] = js.undefined
  var item: js.UndefOr[js.Any] = js.undefined
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
  var show: js.UndefOr[ShowEvent] = js.undefined
  var target: js.UndefOr[js.Any] = js.undefined
}

object IgLinkPropertiesDialog {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igLinkPropertiesDialog
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    apply: ApplyEvent = null,
    cancel: CancelEvent = null,
    hide: HideEvent = null,
    isHidden: js.UndefOr[scala.Boolean] = js.undefined,
    item: js.Any = null,
    language: java.lang.String = null,
    locale: js.Any = null,
    regional: java.lang.String | js.Object = null,
    show: ShowEvent = null,
    target: js.Any = null
  ): IgLinkPropertiesDialog = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (apply != null) __obj.updateDynamic("apply")(apply)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (!js.isUndefined(isHidden)) __obj.updateDynamic("isHidden")(isHidden)
    if (item != null) __obj.updateDynamic("item")(item)
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[IgLinkPropertiesDialog]
  }
}

