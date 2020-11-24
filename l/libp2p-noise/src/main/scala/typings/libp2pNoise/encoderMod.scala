package typings.libp2pNoise

import typings.bl.mod.^
import typings.buffer.mod.Buffer
import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.handshakeMod.MessageBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-noise/dist/src/encoder", JSImport.Namespace)
@js.native
object encoderMod extends js.Object {
  
  def decode0(input: bytes): MessageBuffer = js.native
  
  def decode1(input: bytes): MessageBuffer = js.native
  
  def decode2(input: bytes): MessageBuffer = js.native
  
  def encode0(message: MessageBuffer): bytes = js.native
  
  def encode1(message: MessageBuffer): bytes = js.native
  
  def encode2(message: MessageBuffer): bytes = js.native
  
  @js.native
  object uint16BEDecode extends js.Object {
    
    def apply(data: ^): Double = js.native
    def apply(data: Buffer): Double = js.native
    
    var bytes: Double = js.native
  }
  
  @js.native
  object uint16BEEncode extends js.Object {
    
    def apply(value: Double, target: Buffer, offset: Double): Buffer = js.native
    
    var bytes: Double = js.native
  }
}
