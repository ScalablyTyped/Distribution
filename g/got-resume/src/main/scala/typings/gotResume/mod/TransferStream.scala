package typings.gotResume.mod

import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferStream extends Transform {
  /** Parent `Transfer` object. */
  var transfer: Transfer = js.native
  /** Cancel the stream. */
  def cancel(): Unit = js.native
}

