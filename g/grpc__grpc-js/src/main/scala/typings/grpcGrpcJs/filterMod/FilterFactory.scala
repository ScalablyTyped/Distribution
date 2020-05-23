package typings.grpcGrpcJs.filterMod

import typings.grpcGrpcJs.callStreamMod.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterFactory[T /* <: Filter */] extends js.Object {
  def createFilter(callStream: Call): T
}

object FilterFactory {
  @scala.inline
  def apply[T](createFilter: Call => T): FilterFactory[T] = {
    val __obj = js.Dynamic.literal(createFilter = js.Any.fromFunction1(createFilter))
    __obj.asInstanceOf[FilterFactory[T]]
  }
}

