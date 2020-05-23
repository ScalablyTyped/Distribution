package typings.jqueryCleditor

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
    height: js.UndefOr[Double] = js.undefined,
    sizes: String = null,
    styles: js.Array[js.Array[String]] = null,
    useCSS: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): JQueryCLEditorOptions = {
    val __obj = js.Dynamic.literal()
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (docCSSFile != null) __obj.updateDynamic("docCSSFile")(docCSSFile.asInstanceOf[js.Any])
    if (docType != null) __obj.updateDynamic("docType")(docType.asInstanceOf[js.Any])
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(useCSS)) __obj.updateDynamic("useCSS")(useCSS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryCLEditorOptions]
  }
}

