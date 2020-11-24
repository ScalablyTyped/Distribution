package typings.iltorb.mod

import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("iltorb", "compressStream")
@js.native
object compressStream extends js.Object {
  
  def apply(): Transform with BrotliFlushable = js.native
  def apply(options: BrotliEncodeParams): Transform with BrotliFlushable = js.native
}
