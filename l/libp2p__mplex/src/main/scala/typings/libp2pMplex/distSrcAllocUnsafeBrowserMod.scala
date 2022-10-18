package typings.libp2pMplex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAllocUnsafeBrowserMod {
  
  @JSImport("@libp2p/mplex/dist/src/alloc-unsafe-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allocUnsafe(size: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("allocUnsafe")(size.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
