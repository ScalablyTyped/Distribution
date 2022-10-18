package typings.libp2pRecord

import typings.libp2pInterfaceDht.mod.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object selectorsMod {
  
  @JSImport("@libp2p/record/selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bestRecord(selectors: Selectors, k: js.typedarray.Uint8Array, records: js.Array[js.typedarray.Uint8Array]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bestRecord")(selectors.asInstanceOf[js.Any], k.asInstanceOf[js.Any], records.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("@libp2p/record/selectors", "selectors")
  @js.native
  val selectors: Selectors = js.native
}
