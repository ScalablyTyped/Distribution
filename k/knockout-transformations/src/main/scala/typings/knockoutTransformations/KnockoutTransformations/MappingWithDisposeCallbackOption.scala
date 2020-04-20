package typings.knockoutTransformations.KnockoutTransformations

import typings.knockoutTransformations.AnonDispose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingWithDisposeCallbackOption[T, TResult] extends js.Object {
  def mappingWithDisposeCallback(value: T): AnonDispose[TResult]
}

object MappingWithDisposeCallbackOption {
  @scala.inline
  def apply[T, TResult](mappingWithDisposeCallback: T => AnonDispose[TResult]): MappingWithDisposeCallbackOption[T, TResult] = {
    val __obj = js.Dynamic.literal(mappingWithDisposeCallback = js.Any.fromFunction1(mappingWithDisposeCallback))
    __obj.asInstanceOf[MappingWithDisposeCallbackOption[T, TResult]]
  }
}

