package typings.ipldCar

import typings.ipldCar.anon.ByteLength
import typings.ipldCar.anon.Resize
import typings.ipldCar.anon.Roots
import typings.ipldCar.typesApiMod.CarBufferWriterOptions
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibBufferWriterMod {
  
  @JSImport("@ipld/car/types/lib/buffer-writer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addBlock(writer: CarBufferWriter, hasCidBytes: Block): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBlock")(writer.asInstanceOf[js.Any], hasCidBytes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addRoot(writer: CarBufferWriter, root: CID): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRoot")(writer.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addRoot(writer: CarBufferWriter, root: CID, options: Resize): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRoot")(writer.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def blockLength(hasCidBytes: Block): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blockLength")(hasCidBytes.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def calculateHeaderLength(rootLengths: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateHeaderLength")(rootLengths.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def close(writer: CarBufferWriter): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(writer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def close(writer: CarBufferWriter, options: Resize): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("close")(writer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def createWriter(buffer: js.typedarray.ArrayBuffer): CarBufferWriter = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriter")(buffer.asInstanceOf[js.Any]).asInstanceOf[CarBufferWriter]
  inline def createWriter(buffer: js.typedarray.ArrayBuffer, options: ByteLength): CarBufferWriter = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriter")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CarBufferWriter]
  
  inline def estimateHeaderLength(rootCount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("estimateHeaderLength")(rootCount.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def estimateHeaderLength(rootCount: Double, rootByteLength: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("estimateHeaderLength")(rootCount.asInstanceOf[js.Any], rootByteLength.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def headerLength(hasRoots: Roots): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("headerLength")(hasRoots.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def resizeHeader(writer: CarBufferWriter, byteLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeHeader")(writer.asInstanceOf[js.Any], byteLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Block = typings.ipldCar.typesApiMod.Block
  
  type CID = typings.ipldCar.typesApiMod.CID[Any, Double, Double, Version]
  
  /**
    * @typedef {import('../api').CID} CID
    * @typedef {import('../api').Block} Block
    * @typedef {import('../api').CarBufferWriter} Writer
    * @typedef {import('../api').CarBufferWriterOptions} Options
    * @typedef {import('./coding').CarEncoder} CarEncoder
    */
  /**
    * A simple CAR writer that writes to a pre-allocated buffer.
    *
    * @class
    * @name CarBufferWriter
    * @implements {Writer}
    */
  @js.native
  trait CarBufferWriter
    extends StObject
       with typings.ipldCar.typesApiMod.CarBufferWriter {
    
    /**
      * Add a root to this writer, to be used to create a header when the CAR is
      * finalized with {@link CarBufferWriter.close `close()`}
      *
      * @param {CID} root
      * @param {{resize?:boolean}} [options]
      * @returns {CarBufferWriter}
      */
    def addRoot(root: CID): CarBufferWriter = js.native
    def addRoot(root: CID, options: Resize): CarBufferWriter = js.native
    
    var byteOffset: Double = js.native
    
    /** @readonly */
    val bytes: js.typedarray.Uint8Array = js.native
    
    var headerSize: Double = js.native
    
    /**
      * @readonly
      * @type {CID[]}
      */
    val roots: js.Array[CID] = js.native
  }
  
  type CarEncoder = typings.ipldCar.typesLibCodingMod.CarEncoder
  
  type Options = CarBufferWriterOptions
  
  type Writer = typings.ipldCar.typesApiMod.CarBufferWriter
}
