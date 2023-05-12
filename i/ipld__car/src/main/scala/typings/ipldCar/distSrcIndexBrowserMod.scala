package typings.ipldCar

import typings.ipldCar.anon.ByteLength
import typings.ipldCar.anon.Resize
import typings.ipldCar.anon.Roots
import typings.ipldCar.distSrcBufferReaderBrowserMod.CarHeader
import typings.ipldCar.distSrcBufferReaderBrowserMod.CarV2Header
import typings.ipldCar.distSrcBufferReaderMod.BlockIndex
import typings.ipldCar.distSrcIteratorMod.Block
import typings.ipldCar.distSrcIteratorMod.CID
import typings.ipldCar.distSrcWriterBrowserMod.CarEncoder
import typings.ipldCar.distSrcWriterBrowserMod.WriterChannel
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcIndexBrowserMod {
  
  @JSImport("@ipld/car/dist/src/index-browser", "CarBlockIterator")
  @js.native
  open class CarBlockIterator protected ()
    extends typings.ipldCar.distSrcIteratorMod.CarBlockIterator {
    def this(version: Double, roots: js.Array[CID], iterable: Unit) = this()
    /**
      * @param {number} version
      * @param {CID[]} roots
      * @param {AsyncIterable<Block>|void} iterable
      */
    def this(version: Double, roots: js.Array[CID], iterable: AsyncIterable[Block]) = this()
  }
  /* static members */
  object CarBlockIterator {
    
    @JSImport("@ipld/car/dist/src/index-browser", "CarBlockIterator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate a {@link CarBlockIterator} from a `Uint8Array` blob. Rather
      * than decoding the entire byte array prior to returning the iterator, as in
      * {@link CarReader.fromBytes}, only the header is decoded and the remainder
      * of the CAR is parsed as the `Block`s as yielded.
      *
      * @async
      * @static
      * @memberof CarBlockIterator
      * @param {Uint8Array} bytes
      * @returns {Promise<CarBlockIterator>}
      */
    inline def fromBytes(bytes: js.typedarray.Uint8Array): js.Promise[typings.ipldCar.distSrcIteratorMod.CarBlockIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.ipldCar.distSrcIteratorMod.CarBlockIterator]]
    
    /**
      * Instantiate a {@link CarBlockIterator} from a `AsyncIterable<Uint8Array>`,
      * such as a [modern Node.js stream](https://nodejs.org/api/stream.html#stream_streams_compatibility_with_async_generators_and_async_iterators).
      * Rather than decoding the entire byte array prior to returning the iterator,
      * as in {@link CarReader.fromIterable}, only the header is decoded and the
      * remainder of the CAR is parsed as the `Block`s as yielded.
      *
      * @async
      * @static
      * @param {AsyncIterable<Uint8Array>} asyncIterable
      * @returns {Promise<CarBlockIterator>}
      */
    inline def fromIterable(asyncIterable: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[typings.ipldCar.distSrcIteratorMod.CarBlockIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.ipldCar.distSrcIteratorMod.CarBlockIterator]]
  }
  
  @JSImport("@ipld/car/dist/src/index-browser", "CarBufferReader")
  @js.native
  open class CarBufferReader protected ()
    extends typings.ipldCar.distSrcBufferReaderMod.CarBufferReader {
    /**
      * @constructs CarBufferReader
      * @param {CarHeader|CarV2Header} header
      * @param {Block[]} blocks
      */
    def this(header: CarHeader, blocks: js.Array[typings.ipldCar.distSrcBufferReaderBrowserMod.Block]) = this()
    def this(header: CarV2Header, blocks: js.Array[typings.ipldCar.distSrcBufferReaderBrowserMod.Block]) = this()
  }
  /* static members */
  object CarBufferReader {
    
    @JSImport("@ipld/car/dist/src/index-browser", "CarBufferReader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Reads a block directly from a file descriptor for an open CAR file. This
      * function is **only available in Node.js** and not a browser environment.
      *
      * This function can be used in connection with {@link CarIndexer} which emits
      * the `BlockIndex` objects that are required by this function.
      *
      * The user is responsible for opening and closing the file used in this call.
      *
      * @static
      * @memberof CarBufferReader
      * @param {number} fd - A file descriptor from the
      * Node.js `fs` module. An integer, from `fs.open()`.
      * @param {BlockIndex} blockIndex - An index pointing to the location of the
      * Block required. This `BlockIndex` should take the form:
      * `{cid:CID, blockLength:number, blockOffset:number}`.
      * @returns {Block} A `{ cid:CID, bytes:Uint8Array }` pair.
      */
    inline def readRaw(fd: Double, blockIndex: BlockIndex): typings.ipldCar.distSrcBufferReaderMod.Block = (^.asInstanceOf[js.Dynamic].applyDynamic("readRaw")(fd.asInstanceOf[js.Any], blockIndex.asInstanceOf[js.Any])).asInstanceOf[typings.ipldCar.distSrcBufferReaderMod.Block]
  }
  
  object CarBufferWriter {
    
    @JSImport("@ipld/car/dist/src/index-browser", "CarBufferWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addBlock(
      writer: typings.ipldCar.distSrcBufferWriterMod.CarBufferWriter,
      param1: typings.ipldCar.distSrcBufferWriterMod.Block
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBlock")(writer.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addRoot(
      writer: typings.ipldCar.distSrcBufferWriterMod.CarBufferWriter,
      root: typings.ipldCar.distSrcBufferWriterMod.CID
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRoot")(writer.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addRoot(
      writer: typings.ipldCar.distSrcBufferWriterMod.CarBufferWriter,
      root: typings.ipldCar.distSrcBufferWriterMod.CID,
      options: Resize
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRoot")(writer.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def blockLength(param0: typings.ipldCar.distSrcBufferWriterMod.Block): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blockLength")(param0.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def calculateHeaderLength(rootLengths: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateHeaderLength")(rootLengths.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def close(writer: typings.ipldCar.distSrcBufferWriterMod.CarBufferWriter): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(writer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def close(writer: typings.ipldCar.distSrcBufferWriterMod.CarBufferWriter, options: Resize): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("close")(writer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def createWriter(buffer: js.typedarray.ArrayBuffer): typings.ipldCar.distSrcBufferWriterMod.CarBufferWriter = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriter")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.ipldCar.distSrcBufferWriterMod.CarBufferWriter]
    inline def createWriter(buffer: js.typedarray.ArrayBuffer, options: ByteLength): typings.ipldCar.distSrcBufferWriterMod.CarBufferWriter = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriter")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ipldCar.distSrcBufferWriterMod.CarBufferWriter]
    
    inline def estimateHeaderLength(rootCount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("estimateHeaderLength")(rootCount.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def estimateHeaderLength(rootCount: Double, rootByteLength: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("estimateHeaderLength")(rootCount.asInstanceOf[js.Any], rootByteLength.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def headerLength(param0: Roots): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("headerLength")(param0.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def resizeHeader(writer: typings.ipldCar.distSrcBufferWriterMod.CarBufferWriter, byteLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeHeader")(writer.asInstanceOf[js.Any], byteLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("@ipld/car/dist/src/index-browser", "CarCIDIterator")
  @js.native
  open class CarCIDIterator protected ()
    extends typings.ipldCar.distSrcIteratorMod.CarCIDIterator {
    def this(version: Double, roots: js.Array[CID], iterable: Unit) = this()
    /**
      * @param {number} version
      * @param {CID[]} roots
      * @param {AsyncIterable<Block>|void} iterable
      */
    def this(version: Double, roots: js.Array[CID], iterable: AsyncIterable[Block]) = this()
  }
  /* static members */
  object CarCIDIterator {
    
    @JSImport("@ipld/car/dist/src/index-browser", "CarCIDIterator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate a {@link CarCIDIterator} from a `Uint8Array` blob. Rather
      * than decoding the entire byte array prior to returning the iterator, as in
      * {@link CarReader.fromBytes}, only the header is decoded and the remainder
      * of the CAR is parsed as the `CID`s as yielded.
      *
      * @async
      * @static
      * @memberof CarCIDIterator
      * @param {Uint8Array} bytes
      * @returns {Promise<CarCIDIterator>}
      */
    inline def fromBytes(bytes: js.typedarray.Uint8Array): js.Promise[typings.ipldCar.distSrcIteratorMod.CarCIDIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.ipldCar.distSrcIteratorMod.CarCIDIterator]]
    
    /**
      * Instantiate a {@link CarCIDIterator} from a `AsyncIterable<Uint8Array>`,
      * such as a [modern Node.js stream](https://nodejs.org/api/stream.html#stream_streams_compatibility_with_async_generators_and_async_iterators).
      * Rather than decoding the entire byte array prior to returning the iterator,
      * as in {@link CarReader.fromIterable}, only the header is decoded and the
      * remainder of the CAR is parsed as the `CID`s as yielded.
      *
      * @async
      * @static
      * @memberof CarCIDIterator
      * @param {AsyncIterable<Uint8Array>} asyncIterable
      * @returns {Promise<CarCIDIterator>}
      */
    inline def fromIterable(asyncIterable: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[typings.ipldCar.distSrcIteratorMod.CarCIDIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.ipldCar.distSrcIteratorMod.CarCIDIterator]]
  }
  
  @JSImport("@ipld/car/dist/src/index-browser", "CarIndexedReader")
  @js.native
  open class CarIndexedReader ()
    extends typings.ipldCar.distSrcIndexedReaderBrowserMod.CarIndexedReader
  /* static members */
  object CarIndexedReader {
    
    @JSImport("@ipld/car/dist/src/index-browser", "CarIndexedReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromFile(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")().asInstanceOf[js.Promise[Unit]]
  }
  
  @JSImport("@ipld/car/dist/src/index-browser", "CarIndexer")
  @js.native
  open class CarIndexer protected ()
    extends typings.ipldCar.distSrcIndexerMod.CarIndexer {
    /**
      * @param {number} version
      * @param {CID[]} roots
      * @param {AsyncGenerator<BlockIndex>} iterator
      */
    def this(
      version: Double,
      roots: js.Array[typings.ipldCar.distSrcIndexerMod.CID],
      iterator: AsyncGenerator[typings.ipldCar.distSrcIndexerMod.BlockIndex, Any, Any]
    ) = this()
  }
  /* static members */
  object CarIndexer {
    
    @JSImport("@ipld/car/dist/src/index-browser", "CarIndexer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate a {@link CarIndexer} from a `Uint8Array` blob. Only the header
      * is decoded initially, the remainder is processed and emitted via the
      * iterator as it is consumed.
      *
      * @async
      * @static
      * @memberof CarIndexer
      * @param {Uint8Array} bytes
      * @returns {Promise<CarIndexer>}
      */
    inline def fromBytes(bytes: js.typedarray.Uint8Array): js.Promise[typings.ipldCar.distSrcIndexerMod.CarIndexer] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.ipldCar.distSrcIndexerMod.CarIndexer]]
    
    /**
      * Instantiate a {@link CarIndexer} from a `AsyncIterable<Uint8Array>`,
      * such as a [modern Node.js stream](https://nodejs.org/api/stream.html#stream_streams_compatibility_with_async_generators_and_async_iterators).
      * is decoded initially, the remainder is processed and emitted via the
      * iterator as it is consumed.
      *
      * @async
      * @static
      * @memberof CarIndexer
      * @param {AsyncIterable<Uint8Array>} asyncIterable
      * @returns {Promise<CarIndexer>}
      */
    inline def fromIterable(asyncIterable: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[typings.ipldCar.distSrcIndexerMod.CarIndexer] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.ipldCar.distSrcIndexerMod.CarIndexer]]
  }
  
  @JSImport("@ipld/car/dist/src/index-browser", "CarReader")
  @js.native
  open class CarReader protected ()
    extends typings.ipldCar.distSrcReaderBrowserMod.CarReader {
    /**
      * @constructs CarReader
      * @param {CarHeader|CarV2Header} header
      * @param {Block[]} blocks
      */
    def this(
      header: typings.ipldCar.distSrcReaderBrowserMod.CarHeader,
      blocks: js.Array[typings.ipldCar.distSrcReaderBrowserMod.Block]
    ) = this()
    def this(
      header: typings.ipldCar.distSrcReaderBrowserMod.CarV2Header,
      blocks: js.Array[typings.ipldCar.distSrcReaderBrowserMod.Block]
    ) = this()
  }
  /* static members */
  object CarReader {
    
    @JSImport("@ipld/car/dist/src/index-browser", "CarReader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate a {@link CarReader} from a `Uint8Array` blob. This performs a
      * decode fully in memory and maintains the decoded state in memory for full
      * access to the data via the `CarReader` API.
      *
      * @async
      * @static
      * @memberof CarReader
      * @param {Uint8Array} bytes
      * @returns {Promise<CarReader>}
      */
    inline def fromBytes(bytes: js.typedarray.Uint8Array): js.Promise[typings.ipldCar.distSrcReaderBrowserMod.CarReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.ipldCar.distSrcReaderBrowserMod.CarReader]]
    
    /**
      * Instantiate a {@link CarReader} from a `AsyncIterable<Uint8Array>`, such as
      * a [modern Node.js stream](https://nodejs.org/api/stream.html#stream_streams_compatibility_with_async_generators_and_async_iterators).
      * This performs a decode fully in memory and maintains the decoded state in
      * memory for full access to the data via the `CarReader` API.
      *
      * Care should be taken for large archives; this API may not be appropriate
      * where memory is a concern or the archive is potentially larger than the
      * amount of memory that the runtime can handle.
      *
      * @async
      * @static
      * @memberof CarReader
      * @param {AsyncIterable<Uint8Array>} asyncIterable
      * @returns {Promise<CarReader>}
      */
    inline def fromIterable(asyncIterable: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[typings.ipldCar.distSrcReaderBrowserMod.CarReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.ipldCar.distSrcReaderBrowserMod.CarReader]]
  }
  
  @JSImport("@ipld/car/dist/src/index-browser", "CarWriter")
  @js.native
  open class CarWriter protected ()
    extends typings.ipldCar.distSrcWriterBrowserMod.CarWriter {
    /**
      * @param {CID[]} roots
      * @param {CarEncoder} encoder
      */
    def this(
      roots: js.Array[typings.multiformats.cidMod.CID[Any, Double, Double, Version]],
      encoder: CarEncoder
    ) = this()
  }
  /* static members */
  object CarWriter {
    
    @JSImport("@ipld/car/dist/src/index-browser", "CarWriter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new CAR writer "channel" which consists of a
      * `{ writer:CarWriter, out:AsyncIterable<Uint8Array> }` pair.
      *
      * @async
      * @static
      * @memberof CarWriter
      * @param {CID[] | CID | void} roots
      * @returns {WriterChannel} The channel takes the form of
      * `{ writer:CarWriter, out:AsyncIterable<Uint8Array> }`.
      */
    inline def create(roots: js.Array[typings.multiformats.cidMod.CID[Any, Double, Double, Version]]): WriterChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(roots.asInstanceOf[js.Any]).asInstanceOf[WriterChannel]
    inline def create(roots: Unit): WriterChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(roots.asInstanceOf[js.Any]).asInstanceOf[WriterChannel]
    inline def create(roots: typings.multiformats.cidMod.CID[Any, Double, Double, Version]): WriterChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(roots.asInstanceOf[js.Any]).asInstanceOf[WriterChannel]
    
    /**
      * Create a new CAR appender "channel" which consists of a
      * `{ writer:CarWriter, out:AsyncIterable<Uint8Array> }` pair.
      * This appender does not consider roots and does not produce a CAR header.
      * It is designed to append blocks to an _existing_ CAR archive. It is
      * expected that `out` will be concatenated onto the end of an existing
      * archive that already has a properly formatted header.
      *
      * @async
      * @static
      * @memberof CarWriter
      * @returns {WriterChannel} The channel takes the form of
      * `{ writer:CarWriter, out:AsyncIterable<Uint8Array> }`.
      */
    inline def createAppender(): WriterChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("createAppender")().asInstanceOf[WriterChannel]
    
    /**
      * Update the list of roots in the header of an existing CAR as represented
      * in a Uint8Array.
      *
      * This operation is an _overwrite_, the total length of the CAR will not be
      * modified. A rejection will occur if the new header will not be the same
      * length as the existing header, in which case the CAR will not be modified.
      * It is the responsibility of the user to ensure that the roots being
      * replaced encode as the same length as the new roots.
      *
      * The byte array passed in an argument will be modified and also returned
      * upon successful modification.
      *
      * @async
      * @static
      * @memberof CarWriter
      * @param {Uint8Array} bytes
      * @param {CID[]} roots - A new list of roots to replace the existing list in
      * the CAR header. The new header must take up the same number of bytes as the
      * existing header, so the roots should collectively be the same byte length
      * as the existing roots.
      * @returns {Promise<Uint8Array>}
      */
    inline def updateRootsInBytes(
      bytes: js.typedarray.Uint8Array,
      roots: js.Array[typings.multiformats.cidMod.CID[Any, Double, Double, Version]]
    ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRootsInBytes")(bytes.asInstanceOf[js.Any], roots.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  }
}
