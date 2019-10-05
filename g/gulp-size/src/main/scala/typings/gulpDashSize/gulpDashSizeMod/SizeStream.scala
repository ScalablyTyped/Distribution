package typings.gulpDashSize.gulpDashSizeMod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeStream extends ReadWriteStream {
  var prettySize: String = js.native
  var size: Double = js.native
}

