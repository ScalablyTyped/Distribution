package typings
package knockoutDashTransformationsLib.KnockoutTransformationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingWithDisposeCallbackOption[T, TResult] extends js.Object {
  def mappingWithDisposeCallback(value: T): knockoutDashTransformationsLib.Anon_Dispose[TResult]
}

object MappingWithDisposeCallbackOption {
  @scala.inline
  def apply[T, TResult](mappingWithDisposeCallback: js.Function1[T, knockoutDashTransformationsLib.Anon_Dispose[TResult]]): MappingWithDisposeCallbackOption[T, TResult] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mappingWithDisposeCallback")(mappingWithDisposeCallback)
    __obj.asInstanceOf[MappingWithDisposeCallbackOption[T, TResult]]
  }
}

