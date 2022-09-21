package typings.itToBuffer

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(stream: js.Iterable[js.typedarray.Uint8Array]): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  /**
    * Takes an (async) iterable that yields buffer-like-objects and concats them
    * into one buffer
    * @param {AsyncIterable<Uint8Array>|Iterable<Uint8Array>} stream
    */
  inline def apply(stream: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  @JSImport("it-to-buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
