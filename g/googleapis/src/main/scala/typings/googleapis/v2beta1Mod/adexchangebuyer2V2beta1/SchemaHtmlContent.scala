package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTML content for a creative.
  */
@js.native
trait SchemaHtmlContent extends js.Object {
  /**
    * The height of the HTML snippet in pixels.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The HTML snippet that displays the ad when inserted in the web page.
    */
  var snippet: js.UndefOr[String] = js.native
  /**
    * The width of the HTML snippet in pixels.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaHtmlContent {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    snippet: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): SchemaHtmlContent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHtmlContent]
  }
}

