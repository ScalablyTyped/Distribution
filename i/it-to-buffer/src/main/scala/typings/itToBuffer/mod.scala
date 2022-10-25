package typings.itToBuffer

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-to-buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(stream: js.Iterable[js.typedarray.Uint8Array]): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def default(stream: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
}
