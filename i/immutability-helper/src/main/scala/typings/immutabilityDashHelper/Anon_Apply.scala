package typings.immutabilityDashHelper

import typings.immutabilityDashHelper.immutabilityDashHelperMod._Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Apply[T]
  extends _Spec[T, js.Any] {
  @JSName("$apply")
  def $apply(v: T): T
}

object Anon_Apply {
  @scala.inline
  def apply[T]($apply: T => T): Anon_Apply[T] = {
    val __obj = js.Dynamic.literal($apply = js.Any.fromFunction1($apply))
  
    __obj.asInstanceOf[Anon_Apply[T]]
  }
}

