package typings
package lazyDotJsLib.LazyJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectLikeSequence[T] extends Sequence[T] {
  def assign(other: js.Any): ObjectLikeSequence[T] = js.native
  // throws error
  //async(): X;
  def defaults(defaults: js.Any): ObjectLikeSequence[T] = js.native
  def functions(): Sequence[T] = js.native
  def get(property: java.lang.String): js.Any = js.native
  def invert(): ObjectLikeSequence[T] = js.native
  def keys(): Sequence[java.lang.String] = js.native
  def merge(others: js.Any): ObjectLikeSequence[T] = js.native
  def merge(others: js.Any, mergeFn: js.Function): ObjectLikeSequence[T] = js.native
  def merge(others: ObjectLikeSequence[T]): ObjectLikeSequence[T] = js.native
  def merge(others: ObjectLikeSequence[T], mergeFn: js.Function): ObjectLikeSequence[T] = js.native
  def omit(properties: js.Array[java.lang.String]): ObjectLikeSequence[T] = js.native
  def pairs(): Sequence[T] = js.native
  def pick(properties: js.Array[java.lang.String]): ObjectLikeSequence[T] = js.native
  def values(): Sequence[T] = js.native
  def watch(propertyNames: java.lang.String): Sequence[lazyDotJsLib.Anon_Property] = js.native
  def watch(propertyNames: js.Array[java.lang.String]): Sequence[lazyDotJsLib.Anon_Property] = js.native
}

