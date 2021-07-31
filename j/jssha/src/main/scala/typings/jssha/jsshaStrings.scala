package typings.jssha

import typings.jssha.mod.StringDataFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsshaStrings {
  
  @js.native
  sealed trait ARRAYBUFFER extends StObject
  @scala.inline
  def ARRAYBUFFER: ARRAYBUFFER = "ARRAYBUFFER".asInstanceOf[ARRAYBUFFER]
  
  @js.native
  sealed trait B64
    extends StObject
       with StringDataFormat
  @scala.inline
  def B64: B64 = "B64".asInstanceOf[B64]
  
  @js.native
  sealed trait BYTES
    extends StObject
       with StringDataFormat
  @scala.inline
  def BYTES: BYTES = "BYTES".asInstanceOf[BYTES]
  
  @js.native
  sealed trait HEX
    extends StObject
       with StringDataFormat
  @scala.inline
  def HEX: HEX = "HEX".asInstanceOf[HEX]
  
  @js.native
  sealed trait TEXT
    extends StObject
       with StringDataFormat
  @scala.inline
  def TEXT: TEXT = "TEXT".asInstanceOf[TEXT]
}
