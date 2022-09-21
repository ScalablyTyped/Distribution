package typings.ipldCar

import typings.ipldCar.ipldCarBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexedReaderBrowserMod {
  
  @JSImport("@ipld/car/types/lib/indexed-reader-browser", "CarIndexedReader")
  @js.native
  open class CarIndexedReader () extends StObject
  /* static members */
  object CarIndexedReader {
    
    @JSImport("@ipld/car/types/lib/indexed-reader-browser", "CarIndexedReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromFile(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")().asInstanceOf[js.Promise[Unit]]
  }
  
  @JSImport("@ipld/car/types/lib/indexed-reader-browser", "__browser")
  @js.native
  val browser: `true` = js.native
}
