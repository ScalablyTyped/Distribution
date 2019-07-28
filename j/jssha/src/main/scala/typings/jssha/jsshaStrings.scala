package typings.jssha

import typings.jssha.jsshaMod.StringDataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsshaStrings {
  @js.native
  sealed trait ARRAYBUFFER extends js.Object
  
  @js.native
  sealed trait B64 extends StringDataFormat
  
  @js.native
  sealed trait BYTES extends StringDataFormat
  
  @js.native
  sealed trait HEX extends StringDataFormat
  
  @js.native
  sealed trait TEXT extends StringDataFormat
  
  @scala.inline
  def ARRAYBUFFER: ARRAYBUFFER = "ARRAYBUFFER".asInstanceOf[ARRAYBUFFER]
  @scala.inline
  def B64: B64 = "B64".asInstanceOf[B64]
  @scala.inline
  def BYTES: BYTES = "BYTES".asInstanceOf[BYTES]
  @scala.inline
  def HEX: HEX = "HEX".asInstanceOf[HEX]
  @scala.inline
  def TEXT: TEXT = "TEXT".asInstanceOf[TEXT]
}

