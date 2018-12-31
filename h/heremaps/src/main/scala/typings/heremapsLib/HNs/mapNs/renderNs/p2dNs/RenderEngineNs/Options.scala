package typings
package heremapsLib.HNs.mapNs.renderNs.p2dNs.RenderEngineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** optional */
  var enableSubpixelRendering: js.UndefOr[scala.Boolean] = js.undefined
  /** The pixelRatio to use for over-sampling in cases of high-resolution displays */
  var pixelRatio: scala.Double
  /** Object describes how many cached zoom levels should be used as a base map background while base map tiles are */
  var renderBaseBackground: js.UndefOr[js.Object] = js.undefined
}

