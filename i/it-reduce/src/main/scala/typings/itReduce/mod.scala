package typings.itReduce

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-reduce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T, V](source: js.Iterable[T], func: js.Function2[/* acc */ V, /* curr */ T, V], init: V): js.Promise[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], func.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[V]]
  inline def default[T, V](source: AsyncIterable[T], func: js.Function2[/* acc */ V, /* curr */ T, V], init: V): js.Promise[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], func.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[V]]
  
  inline def default_TV_V[T, V](source: js.Iterable[T], func: js.Function2[/* acc */ V, /* curr */ T, V], init: V): V = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], func.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[V]
}
