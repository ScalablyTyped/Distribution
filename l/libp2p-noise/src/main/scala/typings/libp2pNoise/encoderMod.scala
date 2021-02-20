package typings.libp2pNoise

import typings.buffer.mod.Buffer
import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.handshakeMod.MessageBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encoderMod {
  
  @JSImport("libp2p-noise/dist/src/encoder", "decode0")
  @js.native
  def decode0(input: bytes): MessageBuffer = js.native
  
  @JSImport("libp2p-noise/dist/src/encoder", "decode1")
  @js.native
  def decode1(input: bytes): MessageBuffer = js.native
  
  @JSImport("libp2p-noise/dist/src/encoder", "decode2")
  @js.native
  def decode2(input: bytes): MessageBuffer = js.native
  
  @JSImport("libp2p-noise/dist/src/encoder", "encode0")
  @js.native
  def encode0(message: MessageBuffer): bytes = js.native
  
  @JSImport("libp2p-noise/dist/src/encoder", "encode1")
  @js.native
  def encode1(message: MessageBuffer): bytes = js.native
  
  @JSImport("libp2p-noise/dist/src/encoder", "encode2")
  @js.native
  def encode2(message: MessageBuffer): bytes = js.native
  
  object uint16BEDecode {
    
    @JSImport("libp2p-noise/dist/src/encoder", "uint16BEDecode")
    @js.native
    def apply(data: typings.bl.mod.^): Double = js.native
    @JSImport("libp2p-noise/dist/src/encoder", "uint16BEDecode")
    @js.native
    def apply(data: Buffer): Double = js.native
    @JSImport("libp2p-noise/dist/src/encoder", "uint16BEDecode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libp2p-noise/dist/src/encoder", "uint16BEDecode.bytes")
    @js.native
    def bytes: Double = js.native
    @scala.inline
    def bytes_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bytes")(x.asInstanceOf[js.Any])
  }
  
  object uint16BEEncode {
    
    @JSImport("libp2p-noise/dist/src/encoder", "uint16BEEncode")
    @js.native
    def apply(value: Double, target: Buffer, offset: Double): Buffer = js.native
    @JSImport("libp2p-noise/dist/src/encoder", "uint16BEEncode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libp2p-noise/dist/src/encoder", "uint16BEEncode.bytes")
    @js.native
    def bytes: Double = js.native
    @scala.inline
    def bytes_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bytes")(x.asInstanceOf[js.Any])
  }
}
