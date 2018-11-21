package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stack[T]
  extends immutableLib.immutableMod.CollectionNs.Indexed[T] {
  /**
       * @see `Map#asImmutable`
       */
  def asImmutable(): Stack[T] = js.native
  /**
       * @see `Map#asMutable`
       */
  def asMutable(): Stack[T] = js.native
  // Persistent changes
  /**
       * Returns a new Stack with 0 size and no values.
       */
  def clear(): Stack[T] = js.native
  // Reading values
  /**
       * Alias for `Stack.first()`.
       */
  def peek(): T = js.native
  /**
       * Alias for `Stack#shift` and is not equivalent to `List#pop`.
       */
  def pop(): Stack[T] = js.native
  /**
       * Alias for `Stack#unshift` and is not equivalent to `List#push`.
       */
  def push(values: T*): Stack[T] = js.native
  /**
       * Alias for `Stack#unshiftAll`.
       */
  def pushAll(iter: Iterable[_, T]): Stack[T] = js.native
  def pushAll(iter: js.Array[T]): Stack[T] = js.native
  /**
       * Returns a new Stack with a size ones less than this Stack, excluding
       * the first item in this Stack, shifting all other values to a lower index.
       *
       * Note: this differs from `Array#shift` because it returns a new
       * Stack rather than the removed value. Use `first()` or `peek()` to get the
       * first value in this Stack.
       */
  def shift(): Stack[T] = js.native
  /**
       * Returns a new Stack with the provided `values` prepended, shifting other
       * values ahead to higher indices.
       *
       * This is very efficient for Stack.
       */
  def unshift(values: T*): Stack[T] = js.native
  /**
       * Like `Stack#unshift`, but accepts a iterable rather than varargs.
       */
  def unshiftAll(iter: Iterable[_, T]): Stack[T] = js.native
  def unshiftAll(iter: js.Array[T]): Stack[T] = js.native
  // Transient changes
  /**
       * Note: Not all methods can be used on a mutable collection or within
       * `withMutations`! Only `set`, `push`, and `pop` may be used mutatively.
       *
       * @see `Map#withMutations`
       */
  def withMutations(mutator: js.Function1[/* mutable */ Stack[T], _]): Stack[T] = js.native
}

