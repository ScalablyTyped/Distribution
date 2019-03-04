package typings
package knockoutDotProjectionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MappingWithDisposeCallback[T, TResult] extends js.Object {
  def mappingWithDisposeCallback(value: T): Anon_Dispose[TResult]
}

object Anon_MappingWithDisposeCallback {
  @scala.inline
  def apply[T, TResult](mappingWithDisposeCallback: js.Function1[T, Anon_Dispose[TResult]]): Anon_MappingWithDisposeCallback[T, TResult] = {
    val __obj = js.Dynamic.literal(mappingWithDisposeCallback = mappingWithDisposeCallback)
  
    __obj.asInstanceOf[Anon_MappingWithDisposeCallback[T, TResult]]
  }
}

