package typings.indefiniteDashObservable.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer[T] extends js.Object {
  @JSName("next")
  var next_Original: NextChannel[T] = js.native
  def next(value: T): Unit = js.native
}

