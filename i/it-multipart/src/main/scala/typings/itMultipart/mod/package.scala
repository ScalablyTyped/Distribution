package typings.itMultipart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type IncomingHttpHeaders = typings.node.httpMod.IncomingHttpHeaders
  
  type It[T] = typings.std.AsyncIterable[T] with (typings.std.AsyncIterator[T, _, js.UndefOr[scala.Nothing]])
  
  type PrefixStream[T] = typings.std.AsyncIterable[T] with (typings.std.AsyncIterator[T, _, js.UndefOr[scala.Nothing]]) with typings.itMultipart.mod.PrefixPush[T]
  
  type parseHeaders = js.Function1[/* arg0 */ java.lang.String, typings.itMultipart.mod.IncomingHttpHeaders]
}
