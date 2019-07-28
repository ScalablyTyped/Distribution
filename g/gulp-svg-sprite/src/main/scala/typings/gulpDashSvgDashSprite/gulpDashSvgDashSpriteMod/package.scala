package typings.gulpDashSvgDashSprite

import typings.node.NodeJSNs.ReadWriteStream
import typings.svgDashSprite.svgDashSpriteMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashSvgDashSpriteMod {
  type SvgSprite = js.Function1[/* options */ js.UndefOr[Config], ReadWriteStream]
}
