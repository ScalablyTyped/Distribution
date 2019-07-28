package typings.knockoutDotProjections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MappingWithDisposeCallback[T, TResult] extends js.Object {
  def mappingWithDisposeCallback(value: T): Anon_Dispose[TResult]
}

object Anon_MappingWithDisposeCallback {
  @scala.inline
  def apply[T, TResult](mappingWithDisposeCallback: T => Anon_Dispose[TResult]): Anon_MappingWithDisposeCallback[T, TResult] = {
    val __obj = js.Dynamic.literal(mappingWithDisposeCallback = js.Any.fromFunction1(mappingWithDisposeCallback))
  
    __obj.asInstanceOf[Anon_MappingWithDisposeCallback[T, TResult]]
  }
}

