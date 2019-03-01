package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridFeatureChooser
  extends /**
	 * Option for igGridFeatureChooser
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  var dropDownWidth: js.UndefOr[js.Any] = js.undefined
  var featureChooserDropDownOpened: js.UndefOr[FeatureChooserDropDownOpenedEvent] = js.undefined
  var featureChooserDropDownOpening: js.UndefOr[FeatureChooserDropDownOpeningEvent] = js.undefined
  var featureChooserRendered: js.UndefOr[FeatureChooserRenderedEvent] = js.undefined
  var featureChooserRendering: js.UndefOr[FeatureChooserRenderingEvent] = js.undefined
  var featureToggled: js.UndefOr[FeatureToggledEvent] = js.undefined
  var featureToggling: js.UndefOr[FeatureTogglingEvent] = js.undefined
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
  var menuToggling: js.UndefOr[MenuTogglingEvent] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
}

object IgGridFeatureChooser {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igGridFeatureChooser
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    animationDuration: scala.Int | scala.Double = null,
    dropDownWidth: js.Any = null,
    featureChooserDropDownOpened: FeatureChooserDropDownOpenedEvent = null,
    featureChooserDropDownOpening: FeatureChooserDropDownOpeningEvent = null,
    featureChooserRendered: FeatureChooserRenderedEvent = null,
    featureChooserRendering: FeatureChooserRenderingEvent = null,
    featureToggled: FeatureToggledEvent = null,
    featureToggling: FeatureTogglingEvent = null,
    language: java.lang.String = null,
    locale: js.Any = null,
    menuToggling: MenuTogglingEvent = null,
    regional: java.lang.String | js.Object = null
  ): IgGridFeatureChooser = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (dropDownWidth != null) __obj.updateDynamic("dropDownWidth")(dropDownWidth)
    if (featureChooserDropDownOpened != null) __obj.updateDynamic("featureChooserDropDownOpened")(featureChooserDropDownOpened)
    if (featureChooserDropDownOpening != null) __obj.updateDynamic("featureChooserDropDownOpening")(featureChooserDropDownOpening)
    if (featureChooserRendered != null) __obj.updateDynamic("featureChooserRendered")(featureChooserRendered)
    if (featureChooserRendering != null) __obj.updateDynamic("featureChooserRendering")(featureChooserRendering)
    if (featureToggled != null) __obj.updateDynamic("featureToggled")(featureToggled)
    if (featureToggling != null) __obj.updateDynamic("featureToggling")(featureToggling)
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (menuToggling != null) __obj.updateDynamic("menuToggling")(menuToggling)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridFeatureChooser]
  }
}

