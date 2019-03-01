package typings
package jqueryDashTagsDashInputLib.jQueryTagsInputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Autocomplete options
    */
  var autocomplete: js.UndefOr[js.Object] = js.undefined
  /**
    * Url for autocomplete
    */
  var autocomplete_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Placeholder of field when tags is empty
    */
  var defaultText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Delimiters on tags creation
    */
  var delimiter: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  /**
    * Height of tag
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Interactive tags
    */
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Max char length for tag
    */
  var maxChars: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimun char length for tag
    */
  var minChars: js.UndefOr[scala.Double] = js.undefined
  /**
    * Callback function on add tag
    */
  var onAddTag: js.UndefOr[js.Function1[/* addedValue */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * Callback function on change list of tags
    */
  var onChange: js.UndefOr[
    js.Function2[
      /* element */ jqueryDashTagsDashInputLib.JQuery, 
      /* changedValue */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback function on remove tag
    */
  var onRemoveTag: js.UndefOr[js.Function1[/* removedValue */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * Placeholder color of tags
    */
  var placeholderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Remove with tag backspace
    */
  var removeWithBackspace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Width of tag
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autocomplete: js.Object = null,
    autocomplete_url: java.lang.String = null,
    defaultText: java.lang.String = null,
    delimiter: js.Array[java.lang.String] | java.lang.String = null,
    height: java.lang.String = null,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    maxChars: scala.Int | scala.Double = null,
    minChars: scala.Int | scala.Double = null,
    onAddTag: js.Function1[/* addedValue */ java.lang.String, scala.Unit] = null,
    onChange: js.Function2[
      /* element */ jqueryDashTagsDashInputLib.JQuery, 
      /* changedValue */ java.lang.String, 
      scala.Unit
    ] = null,
    onRemoveTag: js.Function1[/* removedValue */ java.lang.String, scala.Unit] = null,
    placeholderColor: java.lang.String = null,
    removeWithBackspace: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete)
    if (autocomplete_url != null) __obj.updateDynamic("autocomplete_url")(autocomplete_url)
    if (defaultText != null) __obj.updateDynamic("defaultText")(defaultText)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (maxChars != null) __obj.updateDynamic("maxChars")(maxChars.asInstanceOf[js.Any])
    if (minChars != null) __obj.updateDynamic("minChars")(minChars.asInstanceOf[js.Any])
    if (onAddTag != null) __obj.updateDynamic("onAddTag")(onAddTag)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onRemoveTag != null) __obj.updateDynamic("onRemoveTag")(onRemoveTag)
    if (placeholderColor != null) __obj.updateDynamic("placeholderColor")(placeholderColor)
    if (!js.isUndefined(removeWithBackspace)) __obj.updateDynamic("removeWithBackspace")(removeWithBackspace)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Options]
  }
}

