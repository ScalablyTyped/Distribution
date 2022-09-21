package typings.itReader

import typings.itStreamTypes.mod.Source
import typings.std.AsyncGenerator
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-reader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reader(source: Source[js.typedarray.Uint8Array | Uint8ArrayList]): Reader_ = ^.asInstanceOf[js.Dynamic].applyDynamic("reader")(source.asInstanceOf[js.Any]).asInstanceOf[Reader_]
  
  @js.native
  trait Reader_
    extends StObject
       with AsyncGenerator[Uint8ArrayList, Unit, Any]
}
