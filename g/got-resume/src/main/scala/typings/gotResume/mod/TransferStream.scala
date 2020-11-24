package typings.gotResume.mod

import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferStream extends Transform {
  
  /** Cancel the stream. */
  def cancel(): Unit = js.native
  
  /** Parent `Transfer` object. */
  var transfer: Transfer = js.native
}
