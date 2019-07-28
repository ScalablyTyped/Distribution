package typings.atJupyterlabRendermime.libRenderersMod.renderImageNs

import typings.std.HTMLElement
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
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The image node to update with the content.
    */
  var host: HTMLElement
  /**
    * The mime type for the image.
    */
  var mimeType: String
  /**
    * Whether an image requires a background for legibility.
    */
  var needsBackground: js.UndefOr[String] = js.undefined
  /**
    * The base64 encoded source for the image.
    */
  var source: String
  /**
    * Whether the image should be unconfined.
    */
  var unconfined: js.UndefOr[Boolean] = js.undefined
  /**
    * The optional width for the image.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IRenderOptions {
  @scala.inline
  def apply(
    host: HTMLElement,
    mimeType: String,
    source: String,
    height: Int | Double = null,
    needsBackground: String = null,
    unconfined: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): IRenderOptions = {
    val __obj = js.Dynamic.literal(host = host, mimeType = mimeType, source = source)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (needsBackground != null) __obj.updateDynamic("needsBackground")(needsBackground)
    if (!js.isUndefined(unconfined)) __obj.updateDynamic("unconfined")(unconfined)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderOptions]
  }
}

