package typings.itMerge

import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](sources: (AsyncIterable[T] | js.Iterable[T])*): AsyncGenerator[T, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(sources.asInstanceOf[Seq[js.Any]]*).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
}
