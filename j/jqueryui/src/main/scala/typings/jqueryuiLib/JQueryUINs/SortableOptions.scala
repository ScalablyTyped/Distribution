package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Sortable //////////////////////////////////////////////////

trait SortableOptions extends SortableEvents {
  var appendTo: js.UndefOr[js.Any] = js.undefined
   // jQuery, Element, Selector or string
  var attribute: js.UndefOr[java.lang.String] = js.undefined
  var axis: js.UndefOr[java.lang.String] = js.undefined
  var cancel: js.UndefOr[js.Any] = js.undefined
   // Selector
  var connectWith: js.UndefOr[js.Any] = js.undefined
   // Selector
  var containment: js.UndefOr[js.Any] = js.undefined
   // Element, Selector or string
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var cursorAt: js.UndefOr[js.Any] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  var dropOnEmpty: js.UndefOr[scala.Boolean] = js.undefined
  var forceHelperSize: js.UndefOr[scala.Boolean] = js.undefined
  var forcePlaceholderSize: js.UndefOr[scala.Boolean] = js.undefined
  var grid: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var handle: js.UndefOr[js.Any] = js.undefined
  var helper: js.UndefOr[
    java.lang.String | (js.Function2[/* event */ stdLib.Event, /* element */ Sortable, stdLib.Element])
  ] = js.undefined
   // Selector or Element
  var items: js.UndefOr[js.Any] = js.undefined
   // Selector
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var revert: js.UndefOr[js.Any] = js.undefined
   // boolean or number
  var scroll: js.UndefOr[scala.Boolean] = js.undefined
  var scrollSensitivity: js.UndefOr[scala.Double] = js.undefined
  var scrollSpeed: js.UndefOr[scala.Double] = js.undefined
  var tolerance: js.UndefOr[java.lang.String] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

