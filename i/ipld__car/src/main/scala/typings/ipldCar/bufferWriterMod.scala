package typings.ipldCar

import typings.ipldCar.anon.ByteLength
import typings.ipldCar.anon.Resize
import typings.ipldCar.anon.Roots
import typings.ipldCar.distSrcBufferWriterMod.Block
import typings.ipldCar.distSrcBufferWriterMod.CID
import typings.ipldCar.distSrcBufferWriterMod.CarBufferWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object bufferWriterMod {
  
  @JSImport("@ipld/car/buffer-writer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addBlock(writer: CarBufferWriter, param1: Block): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBlock")(writer.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addRoot(writer: CarBufferWriter, root: CID): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRoot")(writer.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addRoot(writer: CarBufferWriter, root: CID, options: Resize): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRoot")(writer.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def blockLength(param0: Block): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blockLength")(param0.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def calculateHeaderLength(rootLengths: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateHeaderLength")(rootLengths.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def close(writer: CarBufferWriter): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(writer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def close(writer: CarBufferWriter, options: Resize): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("close")(writer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def createWriter(buffer: js.typedarray.ArrayBuffer): CarBufferWriter = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriter")(buffer.asInstanceOf[js.Any]).asInstanceOf[CarBufferWriter]
  inline def createWriter(buffer: js.typedarray.ArrayBuffer, options: ByteLength): CarBufferWriter = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriter")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CarBufferWriter]
  
  inline def estimateHeaderLength(rootCount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("estimateHeaderLength")(rootCount.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def estimateHeaderLength(rootCount: Double, rootByteLength: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("estimateHeaderLength")(rootCount.asInstanceOf[js.Any], rootByteLength.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def headerLength(param0: Roots): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("headerLength")(param0.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def resizeHeader(writer: CarBufferWriter, byteLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeHeader")(writer.asInstanceOf[js.Any], byteLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
