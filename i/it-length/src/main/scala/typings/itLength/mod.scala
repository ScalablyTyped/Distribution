package typings.itLength

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(iterator: js.Iterable[Any]): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  /**
    * Consumes the passed iterator and returns the number of items it contained.
    *
    * @param {AsyncIterable<any> | Iterable<any>} iterator
    * @returns {Promise<number>}
    */
  inline def apply(iterator: AsyncIterable[Any]): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  @JSImport("it-length", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
