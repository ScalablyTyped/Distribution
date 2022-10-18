package typings.lib0.distMod

import typings.std.IterableIterator
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iterator {
  
  @JSImport("lib0/dist", "iterator")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createIterator[T](next: js.Function0[IteratorResult[T, Any]]): IterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIterator")(next.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[T]]
  
  inline def iteratorFilter[T](iterator: js.Iterator[T], filter: js.Function1[/* arg0 */ T, Boolean]): IterableIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("iteratorFilter")(iterator.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[T]]
  
  inline def iteratorMap[T, M](iterator: js.Iterator[T], fmap: js.Function1[/* arg0 */ T, M]): IterableIterator[js.UndefOr[M]] = (^.asInstanceOf[js.Dynamic].applyDynamic("iteratorMap")(iterator.asInstanceOf[js.Any], fmap.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[js.UndefOr[M]]]
  
  inline def mapIterator[T, R](iterator: js.Iterator[T], f: js.Function1[/* arg0 */ T, R]): IterableIterator[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapIterator")(iterator.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[R]]
}
