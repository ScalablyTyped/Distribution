package typings
package atJupyterlabRendermimeLib.libRenderersMod.renderSVGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the `renderSVG` function.
  */
trait IRenderOptions extends js.Object {
  /**
    * The host node for the rendered SVG.
    */
  var host: stdLib.HTMLElement
  /**
    * The SVG source.
    */
  var source: java.lang.String
  /**
    * Whether the source is trusted.
    */
  var trusted: scala.Boolean
  /**
    * Whether the svg should be unconfined.
    */
  var unconfined: js.UndefOr[scala.Boolean] = js.undefined
}

object IRenderOptions {
  @scala.inline
  def apply(
    host: stdLib.HTMLElement,
    source: java.lang.String,
    trusted: scala.Boolean,
    unconfined: js.UndefOr[scala.Boolean] = js.undefined
  ): IRenderOptions = {
    val __obj = js.Dynamic.literal(host = host, source = source, trusted = trusted)
    if (!js.isUndefined(unconfined)) __obj.updateDynamic("unconfined")(unconfined)
    __obj.asInstanceOf[IRenderOptions]
  }
}

