package typings.ipldCar

import typings.ipldCar.distSrcWriterBrowserMod.CarEncoder
import typings.ipldCar.ipldCarBooleans.`false`
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.node.fsPromisesMod.FileHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object writerMod {
  
  @JSImport("@ipld/car/writer", "CarWriter")
  @js.native
  open class CarWriter protected ()
    extends typings.ipldCar.distSrcWriterMod.CarWriter {
    /**
      * @param {CID[]} roots
      * @param {CarEncoder} encoder
      */
    def this(roots: js.Array[CID[Any, Double, Double, Version]], encoder: CarEncoder) = this()
  }
  /* static members */
  object CarWriter {
    
    @JSImport("@ipld/car/writer", "CarWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def updateRootsInFile(fd: Double, roots: js.Array[typings.ipldCar.distSrcWriterMod.CID]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRootsInFile")(fd.asInstanceOf[js.Any], roots.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    /**
      * Update the list of roots in the header of an existing CAR file. The first
      * argument must be a file descriptor for CAR file that is open in read and
      * write mode (not append), e.g. `fs.open` or `fs.promises.open` with `'r+'`
      * mode.
      *
      * This operation is an _overwrite_, the total length of the CAR will not be
      * modified. A rejection will occur if the new header will not be the same
      * length as the existing header, in which case the CAR will not be modified.
      * It is the responsibility of the user to ensure that the roots being
      * replaced encode as the same length as the new roots.
      *
      * This function is **only available in Node.js** and not a browser
      * environment.
      *
      * @async
      * @static
      * @memberof CarWriter
      * @param {fs.promises.FileHandle | number} fd - A file descriptor from the
      * Node.js `fs` module. Either an integer, from `fs.open()` or a `FileHandle`
      * from `fs.promises.open()`.
      * @param {CID[]} roots - A new list of roots to replace the existing list in
      * the CAR header. The new header must take up the same number of bytes as the
      * existing header, so the roots should collectively be the same byte length
      * as the existing roots.
      * @returns {Promise<void>}
      */
    inline def updateRootsInFile(fd: FileHandle, roots: js.Array[typings.ipldCar.distSrcWriterMod.CID]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRootsInFile")(fd.asInstanceOf[js.Any], roots.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  @JSImport("@ipld/car/writer", "__browser")
  @js.native
  val browser: `false` = js.native
}
