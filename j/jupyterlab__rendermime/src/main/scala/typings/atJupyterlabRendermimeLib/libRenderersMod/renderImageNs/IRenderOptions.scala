package typings
package atJupyterlabRendermimeLib.libRenderersMod.renderImageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the `renderImage` function.
  */
trait IRenderOptions extends js.Object {
  /**
    * The optional height for the image.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * The image node to update with the content.
    */
  var host: stdLib.HTMLElement
  /**
    * The mime type for the image.
    */
  var mimeType: java.lang.String
  /**
    * Whether an image requires a background for legibility.
    */
  var needsBackground: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The base64 encoded source for the image.
    */
  var source: java.lang.String
  /**
    * Whether the image should be unconfined.
    */
  var unconfined: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The optional width for the image.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object IRenderOptions {
  @scala.inline
  def apply(
    host: stdLib.HTMLElement,
    mimeType: java.lang.String,
    source: java.lang.String,
    height: scala.Int | scala.Double = null,
    needsBackground: java.lang.String = null,
    unconfined: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): IRenderOptions = {
    val __obj = js.Dynamic.literal(host = host, mimeType = mimeType, source = source)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (needsBackground != null) __obj.updateDynamic("needsBackground")(needsBackground)
    if (!js.isUndefined(unconfined)) __obj.updateDynamic("unconfined")(unconfined)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderOptions]
  }
}

