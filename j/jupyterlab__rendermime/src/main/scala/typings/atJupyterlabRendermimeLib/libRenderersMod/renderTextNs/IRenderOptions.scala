package typings
package atJupyterlabRendermimeLib.libRenderersMod.renderTextNs

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
  var host: stdLib.HTMLElement
  /**
    * The source text to render.
    */
  var source: java.lang.String
}

object IRenderOptions {
  @scala.inline
  def apply(host: stdLib.HTMLElement, source: java.lang.String): IRenderOptions = {
    val __obj = js.Dynamic.literal(host = host, source = source)
  
    __obj.asInstanceOf[IRenderOptions]
  }
}

