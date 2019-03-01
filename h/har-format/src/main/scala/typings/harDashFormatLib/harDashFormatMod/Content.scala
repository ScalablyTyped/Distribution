package typings
package harDashFormatLib.harDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of bytes saved. Leave out this field if the information is not
    * available.
    */
  var compression: js.UndefOr[scala.Double] = js.undefined
  /**
    * Encoding used for response text field e.g `base64`.
    *
    * Leave out this field if the text field is HTTP decoded
    * (decompressed & unchunked), than trans-coded from its original character
    * set into UTF-8.
    */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * MIME type of the response text (value of the Content-Type response
    * header).
    *
    * The charset attribute of the MIME type is included (if available).
    */
  var mimeType: java.lang.String
  /**
    * Length of the returned content in bytes.
    *
    * Should be equal to `response.bodySize` if there is no compression and
    * bigger when the content has been compressed.
    */
  var size: scala.Double
  /**
    * Response body sent from the server or loaded from the browser cache.
    *
    * This field is populated with textual content only.
    *
    * The text field is either HTTP decoded text or a encoded (e.g. `base64`)
    * representation of the response body.
    *
    * Leave out this field if the information is not available.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Content {
  @scala.inline
  def apply(
    mimeType: java.lang.String,
    size: scala.Double,
    comment: java.lang.String = null,
    compression: scala.Int | scala.Double = null,
    encoding: java.lang.String = null,
    text: java.lang.String = null
  ): Content = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mimeType")(mimeType)
    __obj.updateDynamic("size")(size)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Content]
  }
}

