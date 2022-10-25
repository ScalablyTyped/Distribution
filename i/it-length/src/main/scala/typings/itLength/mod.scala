package typings.itLength

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-length", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(iterator: js.Iterable[Any]): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(iterator.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def default(iterator: AsyncIterable[Any]): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(iterator.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
}
