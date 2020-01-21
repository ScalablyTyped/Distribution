package typings.lazyJs.LazyJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LazyStatic extends js.Object {
  def apply(value: String): StringLikeSequence = js.native
  def apply(value: js.Any): ObjectLikeSequence[_] = js.native
  def apply(value: js.Array[_]): ArrayLikeSequence[_] = js.native
  def generate[T](generatorFn: GeneratorCallback[T]): GeneratedSequence[T] = js.native
  def generate[T](generatorFn: GeneratorCallback[T], length: Double): GeneratedSequence[T] = js.native
  def makeHttpRequest(path: String): StringLikeSequence = js.native
  def on[T](eventType: String): Sequence[T] = js.native
  def range(from: Double, to: Double): GeneratedSequence[Double] = js.native
  def range(from: Double, to: Double, step: Double): GeneratedSequence[Double] = js.native
  def range(to: Double): GeneratedSequence[Double] = js.native
  def readFile(path: String): StringLikeSequence = js.native
  def repeat[T](value: T): GeneratedSequence[T] = js.native
  def repeat[T](value: T, count: Double): GeneratedSequence[T] = js.native
  def strict(): LazyStatic = js.native
}

