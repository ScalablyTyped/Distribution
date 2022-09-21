package typings.itSplit

import typings.itSplit.anon.Delimiter
import typings.node.bufferMod.global.Buffer
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(source: js.Iterable[js.typedarray.Uint8Array]): AsyncGenerator[Buffer, Unit, Any] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[Buffer, Unit, Any]]
  inline def apply(source: js.Iterable[js.typedarray.Uint8Array], options: Delimiter): AsyncGenerator[Buffer, Unit, Any] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[Buffer, Unit, Any]]
  /**
    * Splits Uint8Arrays emitted by an (async) iterable by a delimiter
    *
    * @param {AsyncIterable<Uint8Array>|Iterable<Uint8Array>} source
    * @param {object} [options]
    * @param {Uint8Array} [options.delimiter]
    */
  inline def apply(source: AsyncIterable[js.typedarray.Uint8Array]): AsyncGenerator[Buffer, Unit, Any] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[Buffer, Unit, Any]]
  inline def apply(source: AsyncIterable[js.typedarray.Uint8Array], options: Delimiter): AsyncGenerator[Buffer, Unit, Any] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[Buffer, Unit, Any]]
  
  @JSImport("it-split", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
