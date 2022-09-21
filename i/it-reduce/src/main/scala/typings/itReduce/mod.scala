package typings.itReduce

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T, V](source: js.Iterable[T], func: js.Function2[/* arg0 */ V, /* arg1 */ T, V], init: V): js.Promise[V] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], func.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[V]]
  /**
    * Reduces the values yielded by an (async) iterable
    *
    * @template T, V
    * @param {AsyncIterable<T>|Iterable<T>} source
    * @param {function(V, T):V} func
    * @param {V} init
    */
  inline def apply[T, V](source: AsyncIterable[T], func: js.Function2[/* arg0 */ V, /* arg1 */ T, V], init: V): js.Promise[V] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], func.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[V]]
  
  @JSImport("it-reduce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
