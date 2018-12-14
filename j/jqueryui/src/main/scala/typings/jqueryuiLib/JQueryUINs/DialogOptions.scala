package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Dialog //////////////////////////////////////////////////

trait DialogOptions extends DialogEvents {
  var appendTo: js.UndefOr[java.lang.String] = js.undefined
  var autoOpen: js.UndefOr[scala.Boolean] = js.undefined
  var buttons: js.UndefOr[
    (org.scalablytyped.runtime.StringDictionary[js.Function1[/* event */ js.UndefOr[stdLib.Event], scala.Unit]]) | js.Array[DialogButtonOptions]
  ] = js.undefined
  var classes: js.UndefOr[DialogClasses] = js.undefined
  var closeOnEscape: js.UndefOr[scala.Boolean] = js.undefined
  var closeText: js.UndefOr[java.lang.String] = js.undefined
  var dialogClass: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var hide: js.UndefOr[scala.Boolean | scala.Double | java.lang.String | DialogShowHideOptions] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[js.Any] = js.undefined
   // object, string or []
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  var show: js.UndefOr[scala.Boolean | scala.Double | java.lang.String | DialogShowHideOptions] = js.undefined
  var stack: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[js.Any] = js.undefined
   // number or string
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

