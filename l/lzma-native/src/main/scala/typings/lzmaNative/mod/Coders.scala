package typings.lzmaNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.lzmaNative.lzmaNativeStrings.easyEncoder
  - typings.lzmaNative.lzmaNativeStrings.aloneDecoder
  - typings.lzmaNative.lzmaNativeStrings.rawEncoder
  - typings.lzmaNative.lzmaNativeStrings.autoDecoder
  - typings.lzmaNative.lzmaNativeStrings.aloneEncoder
  - typings.lzmaNative.lzmaNativeStrings.streamEncoder
  - typings.lzmaNative.lzmaNativeStrings.streamDecoder
*/
trait Coders extends js.Object

object Coders {
  @scala.inline
  def aloneDecoder: typings.lzmaNative.lzmaNativeStrings.aloneDecoder = this.cast("aloneDecoder")
  @scala.inline
  def aloneEncoder: typings.lzmaNative.lzmaNativeStrings.aloneEncoder = this.cast("aloneEncoder")
  @scala.inline
  def autoDecoder: typings.lzmaNative.lzmaNativeStrings.autoDecoder = this.cast("autoDecoder")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def easyEncoder: typings.lzmaNative.lzmaNativeStrings.easyEncoder = this.cast("easyEncoder")
  @scala.inline
  def rawEncoder: typings.lzmaNative.lzmaNativeStrings.rawEncoder = this.cast("rawEncoder")
  @scala.inline
  def streamDecoder: typings.lzmaNative.lzmaNativeStrings.streamDecoder = this.cast("streamDecoder")
  @scala.inline
  def streamEncoder: typings.lzmaNative.lzmaNativeStrings.streamEncoder = this.cast("streamEncoder")
}

