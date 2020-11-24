package typings.imperium.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleActions extends js.Object {
  
  var actions: js.Array[Action] = js.native
  
  var getAcl: js.UndefOr[GetAcl] = js.native
}
object RoleActions {
  
  @scala.inline
  def apply(actions: js.Array[Action]): RoleActions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleActions]
  }
  
  @scala.inline
  implicit class RoleActionsOps[Self <: RoleActions] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: Action*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[Action]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAcl(
      value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => js.Promise[Boolean | js.Object]
    ): Self = this.set("getAcl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetAcl: Self = this.set("getAcl", js.undefined)
  }
}
