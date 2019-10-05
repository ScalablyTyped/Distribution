package typings.atJupyterlabRendermime.libRenderersMod.renderText

import typings.atJupyterlabApputils.libSanitizerMod.ISanitizer
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
    val __obj = js.Dynamic.literal(host = host, sanitizer = sanitizer, source = source)
  
    __obj.asInstanceOf[IRenderOptions]
  }
}

