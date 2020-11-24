package typings.grpcGrpcJs.filterMod

import typings.grpcGrpcJs.callStreamMod.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterFactory[T /* <: Filter */] extends js.Object {
  
  def createFilter(callStream: Call): T = js.native
}
object FilterFactory {
  
  @scala.inline
  def apply[T /* <: Filter */](createFilter: Call => T): FilterFactory[T] = {
    val __obj = js.Dynamic.literal(createFilter = js.Any.fromFunction1(createFilter))
    __obj.asInstanceOf[FilterFactory[T]]
  }
  
  @scala.inline
  implicit class FilterFactoryOps[Self <: FilterFactory[_], T /* <: Filter */] (val x: Self with FilterFactory[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateFilter(value: Call => T): Self = this.set("createFilter", js.Any.fromFunction1(value))
  }
}
