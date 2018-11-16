package typings
package lazyDotJsLib.LazyJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LazyStatic extends js.Object {
  def apply(value: java.lang.String): StringLikeSequence = js.native
  def apply(value: js.Any): ObjectLikeSequence[_] = js.native
  def apply(value: js.Array[_]): ArrayLikeSequence[_] = js.native
  def generate[T](generatorFn: GeneratorCallback[T]): GeneratedSequence[T] = js.native
  def generate[T](generatorFn: GeneratorCallback[T], length: scala.Double): GeneratedSequence[T] = js.native
  def makeHttpRequest(path: java.lang.String): StringLikeSequence = js.native
  def on[T](eventType: java.lang.String): Sequence[T] = js.native
  def range(from: scala.Double, to: scala.Double): GeneratedSequence[scala.Double] = js.native
  def range(from: scala.Double, to: scala.Double, step: scala.Double): GeneratedSequence[scala.Double] = js.native
  def range(to: scala.Double): GeneratedSequence[scala.Double] = js.native
  def readFile(path: java.lang.String): StringLikeSequence = js.native
  def repeat[T](value: T): GeneratedSequence[T] = js.native
  def repeat[T](value: T, count: scala.Double): GeneratedSequence[T] = js.native
  def strict(): LazyStatic = js.native
}

