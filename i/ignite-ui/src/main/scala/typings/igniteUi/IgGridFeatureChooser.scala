package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridFeatureChooser
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  var animationDuration: js.UndefOr[Double] = js.undefined
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
  var language: js.UndefOr[String] = js.undefined
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
  var regional: js.UndefOr[String | js.Object] = js.undefined
}

object IgGridFeatureChooser {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    animationDuration: js.UndefOr[Double] = js.undefined,
    dropDownWidth: js.Any = null,
    featureChooserDropDownOpened: (/* event */ Event, /* ui */ FeatureChooserDropDownOpenedEventUIParam) => Unit = null,
    featureChooserDropDownOpening: (/* event */ Event, /* ui */ FeatureChooserDropDownOpeningEventUIParam) => Unit = null,
    featureChooserRendered: (/* event */ Event, /* ui */ FeatureChooserRenderedEventUIParam) => Unit = null,
    featureChooserRendering: (/* event */ Event, /* ui */ FeatureChooserRenderingEventUIParam) => Unit = null,
    featureToggled: (/* event */ Event, /* ui */ FeatureToggledEventUIParam) => Unit = null,
    featureToggling: (/* event */ Event, /* ui */ FeatureTogglingEventUIParam) => Unit = null,
    language: String = null,
    locale: js.Any = null,
    menuToggling: (/* event */ Event, /* ui */ MenuTogglingEventUIParam) => Unit = null,
    regional: String | js.Object = null
  ): IgGridFeatureChooser = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (dropDownWidth != null) __obj.updateDynamic("dropDownWidth")(dropDownWidth.asInstanceOf[js.Any])
    if (featureChooserDropDownOpened != null) __obj.updateDynamic("featureChooserDropDownOpened")(js.Any.fromFunction2(featureChooserDropDownOpened))
    if (featureChooserDropDownOpening != null) __obj.updateDynamic("featureChooserDropDownOpening")(js.Any.fromFunction2(featureChooserDropDownOpening))
    if (featureChooserRendered != null) __obj.updateDynamic("featureChooserRendered")(js.Any.fromFunction2(featureChooserRendered))
    if (featureChooserRendering != null) __obj.updateDynamic("featureChooserRendering")(js.Any.fromFunction2(featureChooserRendering))
    if (featureToggled != null) __obj.updateDynamic("featureToggled")(js.Any.fromFunction2(featureToggled))
    if (featureToggling != null) __obj.updateDynamic("featureToggling")(js.Any.fromFunction2(featureToggling))
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (menuToggling != null) __obj.updateDynamic("menuToggling")(js.Any.fromFunction2(menuToggling))
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridFeatureChooser]
  }
}

