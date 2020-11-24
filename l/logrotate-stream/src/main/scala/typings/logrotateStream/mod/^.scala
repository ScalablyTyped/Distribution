package typings.logrotateStream.mod

import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("logrotate-stream", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Create a rotating log stream.
    * @returns a writable stream to a rotating log file
    */
  def apply(opts: Options): Writable = js.native
}
