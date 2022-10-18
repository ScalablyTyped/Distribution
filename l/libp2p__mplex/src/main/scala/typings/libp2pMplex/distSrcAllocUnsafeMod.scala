package typings.libp2pMplex

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAllocUnsafeMod {
  
  @JSImport("@libp2p/mplex/dist/src/alloc-unsafe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allocUnsafe(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocUnsafe")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
