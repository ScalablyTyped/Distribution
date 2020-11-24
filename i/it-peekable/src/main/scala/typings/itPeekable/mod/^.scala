package typings.itPeekable.mod

import typings.std.AsyncIterable
import typings.std.AsyncIterator
import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("it-peekable/dist", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * @template T
    * @typedef {Object} Peek
    * @property {() => IteratorResult<T, void>} peek
    */
  /**
    * @template T
    * @typedef {Object} AsyncPeek
    * @property {() => Promise<IteratorResult<T, void>>} peek
    */
  /**
    * @template T
    * @typedef {Object} Push
    * @property {(value:T) => void} push
    */
  /**
    * @template T
    * @typedef {Iterable<T> & Peek<T> & Push<T> & Iterator<T>} Peekable<T>
    */
  /**
    * @template T
    * @typedef {AsyncIterable<T> & AsyncPeek<T> & Push<T> & AsyncIterator<T>} AsyncPeekable<T>
    */
  /**
    * @template {Iterable<any> | AsyncIterable<any>} I
    * @param {I} iterable
    * @returns {I extends Iterable<infer T>
    *  ? Peekable<T>
    *  : I extends AsyncIterable<infer T>
    *  ? AsyncPeekable<T>
    *  : never
    * }
    */
  def apply[I /* <: Iterable[_] | AsyncIterable[_] */](iterable: I): (AsyncIterable[_] with AsyncPeek[_] with Push[_] with (AsyncIterator[_, _, js.UndefOr[scala.Nothing]])) | (Iterable[_] with Peek[_] with Push[_] with (Iterator[_, _, js.UndefOr[scala.Nothing]])) = js.native
}
