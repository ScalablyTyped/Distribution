package typings.gulpDashTypescript.releaseProjectMod

import typings.node.NodeJS.ReadWriteStream
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompileStream extends ReadWriteStream {
  var dts: Readable = js.native
  @JSName("js")
  var js_ : Readable = js.native
}

