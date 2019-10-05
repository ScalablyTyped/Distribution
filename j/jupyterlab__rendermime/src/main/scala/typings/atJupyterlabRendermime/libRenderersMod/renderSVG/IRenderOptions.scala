package typings.atJupyterlabRendermime.libRenderersMod.renderSVG

import typings.std.HTMLElement
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
  var host: HTMLElement
  /**
    * The SVG source.
    */
  var source: String
  /**
    * Whether the source is trusted.
    */
  var trusted: Boolean
  /**
    * Whether the svg should be unconfined.
    */
  var unconfined: js.UndefOr[Boolean] = js.undefined
}

object IRenderOptions {
  @scala.inline
  def apply(
    host: HTMLElement,
    source: String,
    trusted: Boolean,
    unconfined: js.UndefOr[Boolean] = js.undefined
  ): IRenderOptions = {
    val __obj = js.Dynamic.literal(host = host, source = source, trusted = trusted)
    if (!js.isUndefined(unconfined)) __obj.updateDynamic("unconfined")(unconfined)
    __obj.asInstanceOf[IRenderOptions]
  }
}

