package typings.jqueryDotFlagstrap.jQueryFlagStrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlagStrapOptions extends js.Object {
  /**
    * Default: "btn-md"
    * The bootstrap button size `class` for this drop down
    */
  var buttonSize: String
  /**
    * Default: "btn-default"
    * The bootstrap button type `class` for this drop down
    */
  var buttonType: String
  /**
    * Default: (all)
    * Only show specific countries
    * Example:
    * 
    * {"GB": "United Kingdom", "US": "United States"}
    * 
    * will only show the USA and UK.
    */
  var countries: js.UndefOr[js.Object] = js.undefined
  /**
    * Default: uniquely generated
    * the `id` attribute for the actual `select` input
    */
  var inputId: js.UndefOr[String] = js.undefined
  /**
    * Default: uniquely generated
    * the `name` attribute for the actual `select` input
    */
  var inputName: String
  /**
    * Default: "20px"
    * The `margin` between `flag` and `text label`
    */
  var labelMargin: String
  /**
    * Default: null
    * This callback gets called each time the select is changed. It receives two parameters, the new value, and the select element.
    */
  var onSelect: js.UndefOr[js.Function2[/* value */ js.Any, /* element */ js.Any, Unit]] = js.undefined
  /**
    * Default: {value: "", text: "Please select a country"}
    * Set the placeholder value and text. To disable the placeholder define as (boolean) false.
    */
  var placeholder: Boolean | FlagStrapPlaceholderOptions
  /**
    * Default: false
    * Scrollable or full height drop down
    */
  var scrollable: Boolean
  /**
    * Default: "250px"
    * `max-height` for the scrollable drop down
    */
  var scrollableHeight: js.UndefOr[String] = js.undefined
}

object FlagStrapOptions {
  @scala.inline
  def apply(
    buttonSize: String,
    buttonType: String,
    inputName: String,
    labelMargin: String,
    placeholder: Boolean | FlagStrapPlaceholderOptions,
    scrollable: Boolean,
    countries: js.Object = null,
    inputId: String = null,
    onSelect: (/* value */ js.Any, /* element */ js.Any) => Unit = null,
    scrollableHeight: String = null
  ): FlagStrapOptions = {
    val __obj = js.Dynamic.literal(buttonSize = buttonSize.asInstanceOf[js.Any], buttonType = buttonType.asInstanceOf[js.Any], inputName = inputName.asInstanceOf[js.Any], labelMargin = labelMargin.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], scrollable = scrollable.asInstanceOf[js.Any])
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (scrollableHeight != null) __obj.updateDynamic("scrollableHeight")(scrollableHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlagStrapOptions]
  }
}

