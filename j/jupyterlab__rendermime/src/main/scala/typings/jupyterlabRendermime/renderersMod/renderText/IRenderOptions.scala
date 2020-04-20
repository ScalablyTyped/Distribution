package typings.jupyterlabRendermime.renderersMod.renderText

import typings.jupyterlabApputils.sanitizerMod.ISanitizer
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the `renderText` function.
  */
trait IRenderOptions extends js.Object {
  /**
    * The host node for the text content.
    */
  var host: HTMLElement
  /**
    * The html sanitizer for untrusted source.
    */
  var sanitizer: ISanitizer
  /**
    * The source text to render.
    */
  var source: String
}

object IRenderOptions {
  @scala.inline
  def apply(host: HTMLElement, sanitizer: ISanitizer, source: String): IRenderOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderOptions]
  }
}

