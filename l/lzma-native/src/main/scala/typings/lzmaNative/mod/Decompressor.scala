package typings.lzmaNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lzma-native", "Decompressor")
@js.native
object Decompressor extends js.Object {
  
  def apply(): JSLzmaStream = js.native
  def apply(options: LzmaOptions): JSLzmaStream = js.native
}
