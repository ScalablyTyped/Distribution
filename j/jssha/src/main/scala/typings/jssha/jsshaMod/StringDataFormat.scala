package typings.jssha.jsshaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jssha.jsshaStrings.HEX
  - typings.jssha.jsshaStrings.TEXT
  - typings.jssha.jsshaStrings.B64
  - typings.jssha.jsshaStrings.BYTES
*/
trait StringDataFormat extends js.Object

object StringDataFormat {
  @scala.inline
  def B64: typings.jssha.jsshaStrings.B64 = this.cast("B64")
  @scala.inline
  def BYTES: typings.jssha.jsshaStrings.BYTES = this.cast("BYTES")
  @scala.inline
  def HEX: typings.jssha.jsshaStrings.HEX = this.cast("HEX")
  @scala.inline
  def TEXT: typings.jssha.jsshaStrings.TEXT = this.cast("TEXT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

