package typings.logrotateDashStream.logrotateDashStreamMod

import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("logrotate-stream", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Create a rotating log stream.
    * @returns a writable stream to a rotating log file
    */
  def apply(opts: Options): Writable = js.native
}

