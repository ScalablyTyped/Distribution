package typings.lzmaNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lzma-native", "createStream")
@js.native
object createStream extends js.Object {
  
  def apply(coder: Coders): JSLzmaStream = js.native
  def apply(coder: Coders, options: LzmaOptions): JSLzmaStream = js.native
}
