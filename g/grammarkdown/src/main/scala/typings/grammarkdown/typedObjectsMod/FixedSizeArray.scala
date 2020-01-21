package typings.grammarkdown.typedObjectsMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixedSizeArray[THint /* <: TypeHint */, T] extends /* index */ NumberDictionary[T] {
  val length: Double
}

object FixedSizeArray {
  @scala.inline
  def apply[THint /* <: TypeHint */, T](length: Double, NumberDictionary: /* index */ NumberDictionary[T] = null): FixedSizeArray[THint, T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FixedSizeArray[THint, T]]
  }
}

