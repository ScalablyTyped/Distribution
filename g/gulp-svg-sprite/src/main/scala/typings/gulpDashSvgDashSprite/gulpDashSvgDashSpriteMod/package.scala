package typings.gulpDashSvgDashSprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashSvgDashSpriteMod {
  import typings.node.NodeJSNs.ReadWriteStream
  import typings.svgDashSprite.svgDashSpriteMod.Config

  type SvgSprite = js.Function1[/* options */ js.UndefOr[Config], ReadWriteStream]
}
