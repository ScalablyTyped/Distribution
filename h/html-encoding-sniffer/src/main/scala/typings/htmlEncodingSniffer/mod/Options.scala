package typings.htmlEncodingSniffer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		 * The ultimate fallback encoding used if no valid encoding is supplied
  		 * by the transport layer, and no encoding is sniffed from the bytes.
  		 *
  		 * @default
  		 * ```js
  		 * 'windows-1252'
  		 * ```
  		 *
  		 * Which is recommended by the algorithm's table of suggested
  		 * defaults for "All other locales" (including the `en` locale).
  		 */
  var defaultEncoding: js.UndefOr[String] = js.undefined
  /**
  		 * An encoding label that is obtained from the "transport layer"
  		 * (probably an HTTP `Content-Type` header), which overrides
  		 * everything but a BOM.
  		 */
  var transportLayerEncodingLabel: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(defaultEncoding: String = null, transportLayerEncodingLabel: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding.asInstanceOf[js.Any])
    if (transportLayerEncodingLabel != null) __obj.updateDynamic("transportLayerEncodingLabel")(transportLayerEncodingLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

