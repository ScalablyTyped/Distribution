package typings.lzmaDashNative.lzmaDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.lzmaDashNative.lzmaDashNativeStrings.easyEncoder
  - typings.lzmaDashNative.lzmaDashNativeStrings.aloneDecoder
  - typings.lzmaDashNative.lzmaDashNativeStrings.rawEncoder
  - typings.lzmaDashNative.lzmaDashNativeStrings.autoDecoder
  - typings.lzmaDashNative.lzmaDashNativeStrings.aloneEncoder
  - typings.lzmaDashNative.lzmaDashNativeStrings.streamEncoder
  - typings.lzmaDashNative.lzmaDashNativeStrings.streamDecoder
*/
trait Coders extends js.Object

object Coders {
  @scala.inline
  def aloneDecoder: typings.lzmaDashNative.lzmaDashNativeStrings.aloneDecoder = this.cast("aloneDecoder")
  @scala.inline
  def aloneEncoder: typings.lzmaDashNative.lzmaDashNativeStrings.aloneEncoder = this.cast("aloneEncoder")
  @scala.inline
  def autoDecoder: typings.lzmaDashNative.lzmaDashNativeStrings.autoDecoder = this.cast("autoDecoder")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def easyEncoder: typings.lzmaDashNative.lzmaDashNativeStrings.easyEncoder = this.cast("easyEncoder")
  @scala.inline
  def rawEncoder: typings.lzmaDashNative.lzmaDashNativeStrings.rawEncoder = this.cast("rawEncoder")
  @scala.inline
  def streamDecoder: typings.lzmaDashNative.lzmaDashNativeStrings.streamDecoder = this.cast("streamDecoder")
  @scala.inline
  def streamEncoder: typings.lzmaDashNative.lzmaDashNativeStrings.streamEncoder = this.cast("streamEncoder")
}

