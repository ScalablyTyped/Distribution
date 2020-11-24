package typings.ionicCore.anon

import typings.ionicCore.interfaceMod.NavOutletElement
import typings.ionicCore.interfaceMod.RouteID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ids extends js.Object {
  
  var ids: js.Array[RouteID] = js.native
  
  var outlet: js.UndefOr[NavOutletElement] = js.native
}
object Ids {
  
  @scala.inline
  def apply(ids: js.Array[RouteID]): Ids = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ids]
  }
  
  @scala.inline
  implicit class IdsOps[Self <: Ids] (val x: Self) extends AnyVal {
    
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
    def setIdsVarargs(value: RouteID*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: js.Array[RouteID]): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlet(value: NavOutletElement): Self = this.set("outlet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlet: Self = this.set("outlet", js.undefined)
  }
}
