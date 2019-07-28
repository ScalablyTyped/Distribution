package typings.gulpDashTap

import typings.node.NodeJSNs.ReadWriteStream
import typings.vinyl.vinylMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashTapMod {
  type Tap = js.Function2[/* tapFunction */ TapFunction, /* t */ js.UndefOr[js.Any], ReadWriteStream]
  type TapFunction = js.Function1[/* file */ File, js.Any]
}
