package typings.itDrain

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-drain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(source: js.Iterable[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(source: AsyncIterable[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
