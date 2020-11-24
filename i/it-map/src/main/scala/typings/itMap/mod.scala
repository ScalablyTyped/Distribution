package typings.itMap

import typings.std.AsyncIterable
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("it-map/dist", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Takes an (async) iterable and returns one with each item mapped by the passed
    * function.
    *
    * @template I,O
    * @param {AsyncIterable<I>|Iterable<I>} source
    * @param {function(I):O|Promise<O>} func
    * @returns {AsyncIterable<O>}
    */
  def apply[I, O](source: AsyncIterable[I], func: js.Function1[/* arg0 */ I, O | js.Promise[O]]): AsyncIterable[O] = js.native
  def apply[I, O](source: Iterable[I], func: js.Function1[/* arg0 */ I, O | js.Promise[O]]): AsyncIterable[O] = js.native
}
