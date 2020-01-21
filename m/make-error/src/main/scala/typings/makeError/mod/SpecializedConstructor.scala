package typings.makeError.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecializedConstructor[T] extends js.Object {
  var super_ : js.Any
}

object SpecializedConstructor {
  @scala.inline
  def apply[T](super_ : js.Any): SpecializedConstructor[T] = {
    val __obj = js.Dynamic.literal(super_ = super_.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpecializedConstructor[T]]
  }
}

