package typings.ipldCar

import typings.ipldCar.anon.Blocks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBufferDecoderMod {
  
  @JSImport("@ipld/car/dist/src/buffer-decoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bytesReader(bytes: js.typedarray.Uint8Array): BytesBufferReader = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesReader")(bytes.asInstanceOf[js.Any]).asInstanceOf[BytesBufferReader]
  
  inline def fromBytes(bytes: js.typedarray.Uint8Array): Blocks = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[Blocks]
  
  inline def limitReader(reader: BytesBufferReader, byteLimit: Double): BytesBufferReader = (^.asInstanceOf[js.Dynamic].applyDynamic("limitReader")(reader.asInstanceOf[js.Any], byteLimit.asInstanceOf[js.Any])).asInstanceOf[BytesBufferReader]
  
  inline def readBlockHead(reader: BytesBufferReader): BlockHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("readBlockHead")(reader.asInstanceOf[js.Any]).asInstanceOf[BlockHeader]
  
  inline def readHeader(reader: BytesBufferReader): CarHeader | CarV2Header = ^.asInstanceOf[js.Dynamic].applyDynamic("readHeader")(reader.asInstanceOf[js.Any]).asInstanceOf[CarHeader | CarV2Header]
  inline def readHeader(reader: BytesBufferReader, strictVersion: Double): CarHeader | CarV2Header = (^.asInstanceOf[js.Dynamic].applyDynamic("readHeader")(reader.asInstanceOf[js.Any], strictVersion.asInstanceOf[js.Any])).asInstanceOf[CarHeader | CarV2Header]
  
  type Block = typings.ipldCar.distSrcApiMod.Block
  
  type BlockHeader = typings.ipldCar.distSrcApiMod.BlockHeader
  
  type BlockIndex = typings.ipldCar.distSrcApiMod.BlockIndex
  
  type BytesBufferReader = typings.ipldCar.distSrcCodingMod.BytesBufferReader
  
  type CarHeader = typings.ipldCar.distSrcCodingMod.CarHeader
  
  type CarV2FixedHeader = typings.ipldCar.distSrcCodingMod.CarV2FixedHeader
  
  type CarV2Header = typings.ipldCar.distSrcCodingMod.CarV2Header
}
