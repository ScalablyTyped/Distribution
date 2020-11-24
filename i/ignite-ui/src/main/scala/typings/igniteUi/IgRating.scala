package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgRating
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets/Sets custom css votes.
    * That object should be 2-dimentional array or object with indexes, where every item of first level represents settings for a vote at that index.
    * Second level of an item is settings for a vote and it should contain classes for a specific state of vote.
    * Item at index [0] on second level is used for css class of vote in normal state.
    * Item at index [1] on second level is used for css class of vote in selected state.
    * Item at index [2] on second level is used for css class of vote in hover state.
    * Examples:
    * { 1: { 0: "normalCss", 1: "selectedCss", 2: "hoverCss"} }
    * will customize only second vote with [normalCss](ui.igrating#theming:ui-igrating ui-state-default ui-widget-content) for normal state, [hoverCss](ui.igrating#theming:ui-igrating-hover ui-state-hover) for hover state and [selectedCss](ui.igrating#theming:ui-igrating-voteselected) for selected state.
    * [[null, 's1', 'h1'], [null, 's2', 'h2'], [null, 's3', 'h3']]
    * will customize selected and hover states for first 3 votes with classes h# and s#.
    *
    */
  var cssVotes: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets if igRating can have focus. Change of that option is not supported after igRating was created.
    * Value true: can get focus and process key events.
    * Value false: cannot get focus.
    *
    */
  var focusable: js.UndefOr[Boolean] = js.native
  
  /**
    * Fired before hover value is changed.
    * If the application returns false, then the action is canceled and the value remains unchanged.
    */
  var hoverChange: js.UndefOr[HoverChangeEvent] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets/Sets precision. Precision of value and valueHover.
    *
    *
    * Valid values:
    * "exact" Value corresponds location of mouse.
    * "half" Value is rounded to the half of vote.
    * "whole" Value is rounded to the number of votes.
    */
  var precision: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets part of vote-size, which is considered as zero value.
    * It has effect only when precision is set to "half" or "whole".
    * If user clicks between edge of the first vote and (sizeOfVote * precisionZeroVote), then value is set to 0.
    * Same is applied for mouseover as well.
    *
    */
  var precisionZeroVote: js.UndefOr[Double] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Gets/Sets number of decimal places used to round value and value-hover.
    * Negative value will disable that option and value will not be rounded.
    * Notes:
    * If precision is "whole" or "half" and roundedDecimalPlaces is set in range of 0..2, then 3 is used.
    * If valueAsPercent is enabled and roundedDecimalPlaces is set to 0, then 1 is used.
    * If it is larger than 15, then 15 is used.
    *
    */
  var roundedDecimalPlaces: js.UndefOr[Double] = js.native
  
  /**
    * Gets the direction of selected and hovered votes. Change of that option is not supported after igRating was created.
    * Value true: from left to right or from top to bottom.
    * Value false: from right to left or from bottom to left.
    *
    */
  var swapDirection: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets selector for css classes.
    * That option allows replacing all default css styles by custom values.
    * Application should provide css classes for all members defined in the css options with "theme" selector.
    *
    */
  var theme: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets object which contains options supported by igValidator.
    * Note that for onblur validation depends on the [focusable](ui.igrating#options:focusable) option.
    *
    */
  var validatorOptions: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets/Sets value (selected votes or percent). If the value is of type string, it should be suitable for parsing to number. According to [valueAsPercent](ui.igrating#options:valueAsPercent) options the value is used as number of selected votes or as a percent of the votes.
    *
    */
  var value: js.UndefOr[Double | String] = js.native
  
  /**
    * Gets/Sets percent or vote number to measure value and value-hover.
    * Value true: value is measured as percent (from 0 to 1).
    * Value false: value is measured in number of voted (from 0 to voteCount)
    *
    */
  var valueAsPercent: js.UndefOr[Boolean] = js.native
  
  /**
    * Fired before (selected) value is changed.
    * If the application returns false, then the action is canceled and the value remains unchanged.
    */
  var valueChange: js.UndefOr[ValueChangeEvent] = js.native
  
  /**
    * Gets/Sets value-hover (hovered votes or percent of hovered votes). The default is same as value. If the value is of type string, it should be suitable for parsing to number. According to [valueAsPercent](ui.igrating#options:valueAsPercent) options the valueHover is used as number of hovered votes or as a percent of the hovered votes.
    *
    */
  var valueHover: js.UndefOr[Double | String] = js.native
  
  /**
    * Gets a vertical or horizontal orientation for the votes.
    * Change of that option is not supported after igRating was created.
    *
    */
  var vertical: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets number of votes.
    *
    */
  var voteCount: js.UndefOr[Double] = js.native
  
  /**
    * Gets/Sets custom height of a vote in pixels. In case of 0 the run time style value is used.
    *
    */
  var voteHeight: js.UndefOr[Double] = js.native
  
  /**
    * Gets/Sets custom width of a vote in pixels. In case of 0 the run time style value is used.
    *
    */
  var voteWidth: js.UndefOr[Double] = js.native
}
object IgRating {
  
  @scala.inline
  def apply(): IgRating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgRating]
  }
  
  @scala.inline
  implicit class IgRatingOps[Self <: IgRating] (val x: Self) extends AnyVal {
    
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
    def setCssVotes(value: js.Any): Self = this.set("cssVotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssVotes: Self = this.set("cssVotes", js.undefined)
    
    @scala.inline
    def setFocusable(value: Boolean): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    
    @scala.inline
    def setHoverChange(value: (/* event */ Event, /* ui */ HoverChangeEventUIParam) => Unit): Self = this.set("hoverChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHoverChange: Self = this.set("hoverChange", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setPrecision(value: String): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setPrecisionZeroVote(value: Double): Self = this.set("precisionZeroVote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecisionZeroVote: Self = this.set("precisionZeroVote", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    
    @scala.inline
    def setRoundedDecimalPlaces(value: Double): Self = this.set("roundedDecimalPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundedDecimalPlaces: Self = this.set("roundedDecimalPlaces", js.undefined)
    
    @scala.inline
    def setSwapDirection(value: Boolean): Self = this.set("swapDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwapDirection: Self = this.set("swapDirection", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setValidatorOptions(value: js.Any): Self = this.set("validatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidatorOptions: Self = this.set("validatorOptions", js.undefined)
    
    @scala.inline
    def setValue(value: Double | String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueAsPercent(value: Boolean): Self = this.set("valueAsPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueAsPercent: Self = this.set("valueAsPercent", js.undefined)
    
    @scala.inline
    def setValueChange(value: (/* event */ Event, /* ui */ ValueChangeEventUIParam) => Unit): Self = this.set("valueChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteValueChange: Self = this.set("valueChange", js.undefined)
    
    @scala.inline
    def setValueHover(value: Double | String): Self = this.set("valueHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueHover: Self = this.set("valueHover", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
    
    @scala.inline
    def setVoteCount(value: Double): Self = this.set("voteCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoteCount: Self = this.set("voteCount", js.undefined)
    
    @scala.inline
    def setVoteHeight(value: Double): Self = this.set("voteHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoteHeight: Self = this.set("voteHeight", js.undefined)
    
    @scala.inline
    def setVoteWidth(value: Double): Self = this.set("voteWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoteWidth: Self = this.set("voteWidth", js.undefined)
  }
}
