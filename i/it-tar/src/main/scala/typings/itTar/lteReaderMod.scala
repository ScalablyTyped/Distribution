package typings.itTar

import typings.itStreamTypes.mod.Source
import typings.std.AsyncIterator
import typings.std.IteratorResult
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lteReaderMod {
  
  @JSImport("it-tar/dist/src/lte-reader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lteReader(source: Source[js.typedarray.Uint8Array]): LteReader_ = ^.asInstanceOf[js.Dynamic].applyDynamic("lteReader")(source.asInstanceOf[js.Any]).asInstanceOf[LteReader_]
  
  @js.native
  trait LteReader_
    extends StObject
       with AsyncIterator[Uint8ArrayList, Unit, js.UndefOr[Double]] {
    
    def nextLte(bytes: Double): js.Promise[IteratorResult[Uint8ArrayList, Any]] = js.native
    
    @JSName("return")
    def return_MLteReader_(): js.Promise[IteratorResult[Uint8ArrayList, Any]] = js.native
  }
}
