package typings.libp2p.anon

import typings.libp2p.distSrcIdentifyPbMessageMod.Identify
import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofIdentify extends StObject {
  
  def codec(): Codec[Identify] = js.native
  
  def decode(buf: js.typedarray.Uint8Array): Identify = js.native
  def decode(buf: Uint8ArrayList): Identify = js.native
  
  def encode(obj: PartialIdentify): js.typedarray.Uint8Array = js.native
}
