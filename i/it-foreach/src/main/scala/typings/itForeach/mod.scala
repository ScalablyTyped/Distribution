package typings.itForeach

import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import typings.std.Awaited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](source: js.Iterable[T], fn: js.Function1[/* thing */ T, Unit | js.Promise[Unit]]): AsyncGenerator[Awaited[T], Unit, Any] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[Awaited[T], Unit, Any]]
  /**
    * Invokes the passed function for each item in an iterable
    *
    * @template T
    * @param {AsyncIterable<T>|Iterable<T>} source
    * @param {(thing: T) => void | Promise<void>} fn
    */
  inline def apply[T](source: AsyncIterable[T], fn: js.Function1[/* thing */ T, Unit | js.Promise[Unit]]): AsyncGenerator[Awaited[T], Unit, Any] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[Awaited[T], Unit, Any]]
  
  @JSImport("it-foreach", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
