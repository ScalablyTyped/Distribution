package typings.ipldCar

import typings.ipldCar.distSrcIndexedReaderMod.RawLocation
import typings.ipldCar.ipldCarBooleans.`false`
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object indexedReaderMod {
  
  @JSImport("@ipld/car/indexed-reader", "CarIndexedReader")
  @js.native
  open class CarIndexedReader protected ()
    extends typings.ipldCar.distSrcIndexedReaderMod.CarIndexedReader {
    /**
      * @param {number} version
      * @param {string} path
      * @param {CID[]} roots
      * @param {Map<string, RawLocation>} index
      * @param {string[]} order
      */
    def this(
      version: Double,
      path: String,
      roots: js.Array[CID[Any, Double, Double, Version]],
      index: Map[String, RawLocation],
      order: js.Array[String]
    ) = this()
  }
  /* static members */
  object CarIndexedReader {
    
    @JSImport("@ipld/car/indexed-reader", "CarIndexedReader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instantiate an {@link CarIndexedReader} from a file with the provided
      * `path`. The CAR file is first indexed with a full path that collects `CID`s
      * and block locations. This index is maintained in memory. Subsequent reads
      * operate on a read-only file descriptor, fetching the block from its in-file
      * location.
      *
      * For large archives, the initial indexing may take some time. The returned
      * `Promise` will resolve only after this is complete.
      *
      * @async
      * @static
      * @memberof CarIndexedReader
      * @param {string} path
      * @returns {Promise<CarIndexedReader>}
      */
    inline def fromFile(path: String): js.Promise[typings.ipldCar.distSrcIndexedReaderMod.CarIndexedReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.ipldCar.distSrcIndexedReaderMod.CarIndexedReader]]
  }
  
  @JSImport("@ipld/car/indexed-reader", "__browser")
  @js.native
  val browser: `false` = js.native
}
