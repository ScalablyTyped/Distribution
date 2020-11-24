package typings.jointjs.mod.routers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericRouterJSON[K /* <: RouterType */] extends js.Object {
  
  var args: js.UndefOr[GenericRouterArguments[K]] = js.native
  
  var name: K = js.native
}
object GenericRouterJSON {
  
  @scala.inline
  def apply[K /* <: RouterType */](name: K): GenericRouterJSON[K] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericRouterJSON[K]]
  }
  
  @scala.inline
  implicit class GenericRouterJSONOps[Self <: GenericRouterJSON[_], K /* <: RouterType */] (val x: Self with GenericRouterJSON[K]) extends AnyVal {
    
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
    def setName(value: K): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: GenericRouterArguments[K]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
  }
}
