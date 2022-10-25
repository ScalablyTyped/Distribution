package typings.ipldCar

import typings.ipldCar.distSrcReaderBrowserMod.Block
import typings.ipldCar.distSrcReaderBrowserMod.CarHeader
import typings.ipldCar.distSrcReaderBrowserMod.CarV2Header
import typings.ipldCar.distSrcReaderMod.BlockIndex
import typings.ipldCar.ipldCarBooleans.`false`
import typings.node.fsPromisesMod.FileHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object readerMod {
  
  @JSImport("@ipld/car/reader", "CarReader")
  @js.native
  open class CarReader protected ()
    extends typings.ipldCar.distSrcReaderMod.CarReader {
    /**
      * @constructs CarReader
      * @param {CarHeader|CarV2Header} header
      * @param {Block[]} blocks
      */
    def this(header: CarHeader, blocks: js.Array[Block]) = this()
    def this(header: CarV2Header, blocks: js.Array[Block]) = this()
  }
  /* static members */
  object CarReader {
    
    @JSImport("@ipld/car/reader", "CarReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def readRaw(fd: Double, blockIndex: BlockIndex): js.Promise[typings.ipldCar.distSrcReaderMod.Block] = (^.asInstanceOf[js.Dynamic].applyDynamic("readRaw")(fd.asInstanceOf[js.Any], blockIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.ipldCar.distSrcReaderMod.Block]]
    /**
      * Reads a block directly from a file descriptor for an open CAR file. This
      * function is **only available in Node.js** and not a browser environment.
      *
      * This function can be used in connection with {@link CarIndexer} which emits
      * the `BlockIndex` objects that are required by this function.
      *
      * The user is responsible for opening and closing the file used in this call.
      *
      * @async
      * @static
      * @memberof CarReader
      * @param {fs.promises.FileHandle | number} fd - A file descriptor from the
      * Node.js `fs` module. Either an integer, from `fs.open()` or a `FileHandle`
      * from `fs.promises.open()`.
      * @param {BlockIndex} blockIndex - An index pointing to the location of the
      * Block required. This `BlockIndex` should take the form:
      * `{cid:CID, blockLength:number, blockOffset:number}`.
      * @returns {Promise<Block>} A `{ cid:CID, bytes:Uint8Array }` pair.
      */
    inline def readRaw(fd: FileHandle, blockIndex: BlockIndex): js.Promise[typings.ipldCar.distSrcReaderMod.Block] = (^.asInstanceOf[js.Dynamic].applyDynamic("readRaw")(fd.asInstanceOf[js.Any], blockIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.ipldCar.distSrcReaderMod.Block]]
  }
  
  @JSImport("@ipld/car/reader", "__browser")
  @js.native
  val browser: `false` = js.native
}
