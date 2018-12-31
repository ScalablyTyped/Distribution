package typings
package logrotateDashStreamLib.logrotateDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("logrotate-stream", JSImport.Namespace)
@js.native
object logrotateDashStreamModMembers extends js.Object {
  /**
    * Create a rotating log stream.
    * @returns a writable stream to a rotating log file
    */
  def apply(opts: logrotateDashStreamLib.logrotateDashStreamMod.logrotateStreamNs.Options): nodeLib.streamMod.Writable = js.native
}

