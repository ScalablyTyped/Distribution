package typings.itMultipart

import typings.itMultipart.anon.Body
import typings.node.httpMod.IncomingMessage
import typings.std.AsyncIterable
import typings.std.AsyncIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @typedef {import('http').IncomingHttpHeaders} IncomingHttpHeaders
    */
  /**
    * @template T
    * @typedef {AsyncIterable<T> & AsyncIterator<T>} It
    */
  /**
    * Streaming multipart HTTP message parser
    * @param {import('http').IncomingMessage} source
    * @param {string} [boundary]
    * @returns {AsyncIterable<{headers:IncomingHttpHeaders, body:It<Buffer>}>}
    */
  @JSImport("it-multipart/dist", JSImport.Namespace)
  @js.native
  def apply(source: IncomingMessage): AsyncIterable[Body] = js.native
  @JSImport("it-multipart/dist", JSImport.Namespace)
  @js.native
  def apply(source: IncomingMessage, boundary: String): AsyncIterable[Body] = js.native
  
  type IncomingHttpHeaders = typings.node.httpMod.IncomingHttpHeaders
  
  type It[T] = AsyncIterable[T] with (AsyncIterator[T, _, js.UndefOr[scala.Nothing]])
  
  @js.native
  trait PrefixPush[T] extends StObject {
    
    def push(arg0: T): Unit = js.native
  }
  object PrefixPush {
    
    @scala.inline
    def apply[T](push: T => Unit): PrefixPush[T] = {
      val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
      __obj.asInstanceOf[PrefixPush[T]]
    }
    
    @scala.inline
    implicit class PrefixPushMutableBuilder[Self <: PrefixPush[_], T] (val x: Self with PrefixPush[T]) extends AnyVal {
      
      @scala.inline
      def setPush(value: T => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    }
  }
  
  type PrefixStream[T] = AsyncIterable[T] with (AsyncIterator[T, _, js.UndefOr[scala.Nothing]]) with PrefixPush[T]
  
  type parseHeaders = js.Function1[/* arg0 */ String, IncomingHttpHeaders]
}
