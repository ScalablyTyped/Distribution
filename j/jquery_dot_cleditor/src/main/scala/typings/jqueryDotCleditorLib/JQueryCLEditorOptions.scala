package typings
package jqueryDotCleditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryCLEditorOptions extends js.Object {
  var bodyStyle: js.UndefOr[java.lang.String] = js.undefined
  var colors: js.UndefOr[java.lang.String] = js.undefined
  var controls: js.UndefOr[java.lang.String] = js.undefined
  var docCSSFile: js.UndefOr[java.lang.String] = js.undefined
  var docType: js.UndefOr[java.lang.String] = js.undefined
  var fonts: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var sizes: js.UndefOr[java.lang.String] = js.undefined
  var styles: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
  var useCSS: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object JQueryCLEditorOptions {
  @scala.inline
  def apply(
    bodyStyle: java.lang.String = null,
    colors: java.lang.String = null,
    controls: java.lang.String = null,
    docCSSFile: java.lang.String = null,
    docType: java.lang.String = null,
    fonts: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    sizes: java.lang.String = null,
    styles: js.Array[js.Array[java.lang.String]] = null,
    useCSS: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): JQueryCLEditorOptions = {
    val __obj = js.Dynamic.literal()
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (controls != null) __obj.updateDynamic("controls")(controls)
    if (docCSSFile != null) __obj.updateDynamic("docCSSFile")(docCSSFile)
    if (docType != null) __obj.updateDynamic("docType")(docType)
    if (fonts != null) __obj.updateDynamic("fonts")(fonts)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (!js.isUndefined(useCSS)) __obj.updateDynamic("useCSS")(useCSS)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryCLEditorOptions]
  }
}

