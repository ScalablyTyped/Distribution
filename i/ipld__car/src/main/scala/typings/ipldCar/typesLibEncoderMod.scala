package typings.ipldCar

import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibEncoderMod {
  
  @JSImport("@ipld/car/types/lib/encoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEncoder(writer: typings.ipldCar.typesLibCodingMod.IteratorChannelWriter[js.typedarray.Uint8Array]): CarEncoder = ^.asInstanceOf[js.Dynamic].applyDynamic("createEncoder")(writer.asInstanceOf[js.Any]).asInstanceOf[CarEncoder]
  
  inline def createHeader(roots: js.Array[CID]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("createHeader")(roots.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  type Block = typings.ipldCar.typesApiMod.Block
  
  type CID = typings.multiformats.mod.CID[Any, Double, Double, Version]
  
  type CarEncoder = typings.ipldCar.typesLibCodingMod.CarEncoder
  
  type IteratorChannelWriter = typings.ipldCar.typesLibCodingMod.IteratorChannelWriter[js.typedarray.Uint8Array]
}
