package typings.ipldCar

import typings.ipldCar.ipldCarBooleans.`true`
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import typings.std.AsyncIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibWriterBrowserMod {
  
  @JSImport("@ipld/car/types/lib/writer-browser", "CarWriter")
  @js.native
  open class CarWriter protected ()
    extends StObject
       with typings.ipldCar.typesApiMod.BlockWriter {
    /**
      * @param {CID[]} roots
      * @param {CarEncoder} encoder
      */
    def this(roots: js.Array[CID[Any, Double, Double, Version]], encoder: CarEncoder) = this()
    
    var _encoder: typings.ipldCar.typesLibCodingMod.CarEncoder = js.native
    
    var _ended: Boolean = js.native
    
    /** @type {Promise<void>} */
    var _mutex: js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def close(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def put(block: typings.ipldCar.typesApiMod.Block): js.Promise[Unit] = js.native
  }
  /* static members */
  object CarWriter {
    
    @JSImport("@ipld/car/types/lib/writer-browser", "CarWriter")
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
    inline def create(roots: js.Array[CID[Any, Double, Double, Version]]): WriterChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(roots.asInstanceOf[js.Any]).asInstanceOf[WriterChannel]
    inline def create(roots: Unit): WriterChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(roots.asInstanceOf[js.Any]).asInstanceOf[WriterChannel]
    inline def create(roots: CID[Any, Double, Double, Version]): WriterChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(roots.asInstanceOf[js.Any]).asInstanceOf[WriterChannel]
    
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
      * @param {CID[]} roots A new list of roots to replace the existing list in
      * the CAR header. The new header must take up the same number of bytes as the
      * existing header, so the roots should collectively be the same byte length
      * as the existing roots.
      * @returns {Promise<Uint8Array>}
      */
    inline def updateRootsInBytes(bytes: js.typedarray.Uint8Array, roots: js.Array[CID[Any, Double, Double, Version]]): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRootsInBytes")(bytes.asInstanceOf[js.Any], roots.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  }
  
  @JSImport("@ipld/car/types/lib/writer-browser", "CarWriterOut")
  @js.native
  open class CarWriterOut protected ()
    extends StObject
       with AsyncIterable[js.typedarray.Uint8Array] {
    /**
      * @param {AsyncIterator<Uint8Array>} iterator
      */
    def this(iterator: AsyncIterator[js.typedarray.Uint8Array, Any, Unit]) = this()
    
    var _iterating: js.UndefOr[Boolean] = js.native
    
    var _iterator: AsyncIterator[js.typedarray.Uint8Array, Any, Unit] = js.native
  }
  
  @JSImport("@ipld/car/types/lib/writer-browser", "__browser")
  @js.native
  val browser: `true` = js.native
  
  type Block = typings.ipldCar.typesApiMod.Block
  
  type BlockWriter = typings.ipldCar.typesApiMod.BlockWriter
  
  type CarEncoder = typings.ipldCar.typesLibCodingMod.CarEncoder
  
  type IteratorChannel = typings.ipldCar.typesLibCodingMod.IteratorChannel[js.typedarray.Uint8Array]
  
  type WriterChannel = typings.ipldCar.typesApiMod.WriterChannel
}
