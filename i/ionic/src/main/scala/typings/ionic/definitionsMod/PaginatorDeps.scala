package typings.ionic.definitionsMod

import typings.ionic.anon.Req
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginatorDeps[T /* <: Response[js.Array[js.Object]] */, S] extends js.Object {
  
  val client: IClient = js.native
  
  def guard(res: APIResponseSuccess): /* is T */ Boolean = js.native
  
  val max: js.UndefOr[Double] = js.native
  
  def reqgen(): js.Promise[Req] = js.native
  
  val state: js.UndefOr[Partial[S]] = js.native
}
object PaginatorDeps {
  
  @scala.inline
  def apply[T /* <: Response[js.Array[js.Object]] */, S](client: IClient, guard: APIResponseSuccess => /* is T */ Boolean, reqgen: () => js.Promise[Req]): PaginatorDeps[T, S] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], guard = js.Any.fromFunction1(guard), reqgen = js.Any.fromFunction0(reqgen))
    __obj.asInstanceOf[PaginatorDeps[T, S]]
  }
  
  @scala.inline
  implicit class PaginatorDepsOps[Self <: PaginatorDeps[_, _], T /* <: Response[js.Array[js.Object]] */, S] (val x: Self with (PaginatorDeps[T, S])) extends AnyVal {
    
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
    def setClient(value: IClient): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuard(value: APIResponseSuccess => /* is T */ Boolean): Self = this.set("guard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReqgen(value: () => js.Promise[Req]): Self = this.set("reqgen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setState(value: Partial[S]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
