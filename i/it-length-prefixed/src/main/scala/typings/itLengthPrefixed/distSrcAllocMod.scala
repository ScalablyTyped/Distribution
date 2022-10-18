package typings.itLengthPrefixed

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAllocMod {
  
  @JSImport("it-length-prefixed/dist/src/alloc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alloc(len: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(len.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def allocUnsafe(len: Double): js.typedarray.Uint8Array | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocUnsafe")(len.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array | Buffer]
}
