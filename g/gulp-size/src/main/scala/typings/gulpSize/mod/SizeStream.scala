package typings.gulpSize.mod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeStream
  extends ReadableStream
     with WritableStream {
  var prettySize: String = js.native
  var size: Double = js.native
}

