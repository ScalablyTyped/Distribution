package typings.jqueryDotCleditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryCLEditorOptions extends js.Object {
  var bodyStyle: js.UndefOr[String] = js.undefined
  var colors: js.UndefOr[String] = js.undefined
  var controls: js.UndefOr[String] = js.undefined
  var docCSSFile: js.UndefOr[String] = js.undefined
  var docType: js.UndefOr[String] = js.undefined
  var fonts: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var styles: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  var useCSS: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object JQueryCLEditorOptions {
  @scala.inline
  def apply(
    bodyStyle: String = null,
    colors: String = null,
    controls: String = null,
    docCSSFile: String = null,
    docType: String = null,
    fonts: String = null,
    height: Int | Double = null,
    sizes: String = null,
    styles: js.Array[js.Array[String]] = null,
    useCSS: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
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

