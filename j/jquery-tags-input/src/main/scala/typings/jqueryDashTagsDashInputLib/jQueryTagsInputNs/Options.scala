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

