package typings.itPeekable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * <T>
    */
  type AsyncPeekable[T] = typings.std.AsyncIterable[T] with typings.itPeekable.mod.AsyncPeek[T] with typings.itPeekable.mod.Push[T] with (typings.std.AsyncIterator[T, _, js.UndefOr[scala.Nothing]])
  
  /**
    * <T>
    */
  type Peekable[T] = typings.std.Iterable[T] with typings.itPeekable.mod.Peek[T] with typings.itPeekable.mod.Push[T] with (typings.std.Iterator[T, _, js.UndefOr[scala.Nothing]])
}
