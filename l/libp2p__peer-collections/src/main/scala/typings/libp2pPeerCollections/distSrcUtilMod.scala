package typings.libp2pPeerCollections

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilMod {
  
  @JSImport("@libp2p/peer-collections/dist/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapIterable[T, R](iter: IterableIterator[T], map: js.Function1[/* val */ T, R]): IterableIterator[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapIterable")(iter.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[R]]
}
