package typings.jqueryFlagstrap.jQueryFlagStrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlagStrapOptions extends js.Object {
  /**
    * Default: "btn-md"
    * The bootstrap button size `class` for this drop down
    */
  var buttonSize: String = js.native
  /**
    * Default: "btn-default"
    * The bootstrap button type `class` for this drop down
    */
  var buttonType: String = js.native
  /**
    * Default: (all)
    * Only show specific countries
    * Example:
    * 
    * {"GB": "United Kingdom", "US": "United States"}
    * 
    * will only show the USA and UK.
    */
  var countries: js.UndefOr[js.Object] = js.native
  /**
    * Default: uniquely generated
    * the `id` attribute for the actual `select` input
    */
  var inputId: js.UndefOr[String] = js.native
  /**
    * Default: uniquely generated
    * the `name` attribute for the actual `select` input
    */
  var inputName: String = js.native
  /**
    * Default: "20px"
    * The `margin` between `flag` and `text label`
    */
  var labelMargin: String = js.native
  /**
    * Default: null
    * This callback gets called each time the select is changed. It receives two parameters, the new value, and the select element.
    */
  var onSelect: js.UndefOr[js.Function2[/* value */ js.Any, /* element */ js.Any, Unit]] = js.native
  /**
    * Default: {value: "", text: "Please select a country"}
    * Set the placeholder value and text. To disable the placeholder define as (boolean) false.
    */
  var placeholder: Boolean | FlagStrapPlaceholderOptions = js.native
  /**
    * Default: false
    * Scrollable or full height drop down
    */
  var scrollable: Boolean = js.native
  /**
    * Default: "250px"
    * `max-height` for the scrollable drop down
    */
  var scrollableHeight: js.UndefOr[String] = js.native
}

object FlagStrapOptions {
  @scala.inline
  def apply(
    buttonSize: String,
    buttonType: String,
    inputName: String,
    labelMargin: String,
    placeholder: Boolean | FlagStrapPlaceholderOptions,
    scrollable: Boolean
  ): FlagStrapOptions = {
    val __obj = js.Dynamic.literal(buttonSize = buttonSize.asInstanceOf[js.Any], buttonType = buttonType.asInstanceOf[js.Any], inputName = inputName.asInstanceOf[js.Any], labelMargin = labelMargin.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], scrollable = scrollable.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlagStrapOptions]
  }
  @scala.inline
  implicit class FlagStrapOptionsOps[Self <: FlagStrapOptions] (val x: Self) extends AnyVal {
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
    def setButtonSize(value: String): Self = this.set("buttonSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonType(value: String): Self = this.set("buttonType", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputName(value: String): Self = this.set("inputName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelMargin(value: String): Self = this.set("labelMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceholder(value: Boolean | FlagStrapPlaceholderOptions): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollable(value: Boolean): Self = this.set("scrollable", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountries(value: js.Object): Self = this.set("countries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountries: Self = this.set("countries", js.undefined)
    @scala.inline
    def setInputId(value: String): Self = this.set("inputId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputId: Self = this.set("inputId", js.undefined)
    @scala.inline
    def setOnSelect(value: (/* value */ js.Any, /* element */ js.Any) => Unit): Self = this.set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setScrollableHeight(value: String): Self = this.set("scrollableHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollableHeight: Self = this.set("scrollableHeight", js.undefined)
  }
  
}

