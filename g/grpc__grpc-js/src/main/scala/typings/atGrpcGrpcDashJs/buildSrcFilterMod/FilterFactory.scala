package typings.atGrpcGrpcDashJs.buildSrcFilterMod

import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterFactory[T /* <: Filter */] extends js.Object {
  def createFilter(callStream: Call): T
}

object FilterFactory {
  @scala.inline
  def apply[T /* <: Filter */](createFilter: Call => T): FilterFactory[T] = {
    val __obj = js.Dynamic.literal(createFilter = js.Any.fromFunction1(createFilter))
  
    __obj.asInstanceOf[FilterFactory[T]]
  }
}

