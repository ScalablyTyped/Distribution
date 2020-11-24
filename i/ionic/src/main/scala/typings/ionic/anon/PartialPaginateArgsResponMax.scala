package typings.ionic.anon

import typings.ionic.definitionsMod.APIResponseSuccess
import typings.ionic.definitionsMod.PaginatorGuard
import typings.ionic.definitionsMod.PaginatorRequestGenerator
import typings.ionic.definitionsMod.Response
import typings.ionic.definitionsMod.SSHKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ionic.ionic/definitions.PaginateArgs<ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.SSHKey>>>> */
@js.native
trait PartialPaginateArgsResponMax extends js.Object {
  
  var guard: js.UndefOr[PaginatorGuard[Response[js.Array[SSHKey]]]] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var reqgen: js.UndefOr[PaginatorRequestGenerator] = js.native
  
  var state: js.UndefOr[PartialPaginatorState] = js.native
}
object PartialPaginateArgsResponMax {
  
  @scala.inline
  def apply(): PartialPaginateArgsResponMax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaginateArgsResponMax]
  }
  
  @scala.inline
  implicit class PartialPaginateArgsResponMaxOps[Self <: PartialPaginateArgsResponMax] (val x: Self) extends AnyVal {
    
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
    def setGuard(value: /* res */ APIResponseSuccess => /* is T */ Boolean): Self = this.set("guard", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGuard: Self = this.set("guard", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setReqgen(value: () => js.Promise[Req]): Self = this.set("reqgen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReqgen: Self = this.set("reqgen", js.undefined)
    
    @scala.inline
    def setState(value: PartialPaginatorState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
