package typings.ionic.definitionsMod

import typings.ionic.anon.Req
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClient extends js.Object {
  
  var config: IConfig = js.native
  
  def `do`(req: SuperAgentRequest): js.Promise[APIResponseSuccess] = js.native
  
  def make(method: HttpMethod, path: String): js.Promise[Req] = js.native
  
  def paginate[T /* <: Response[js.Array[js.Object]] */](args: PaginateArgs[T]): IPaginator[T, PaginatorState] = js.native
}
object IClient {
  
  @scala.inline
  def apply(
    config: IConfig,
    `do`: SuperAgentRequest => js.Promise[APIResponseSuccess],
    make: (HttpMethod, String) => js.Promise[Req],
    paginate: PaginateArgs[js.Any] => IPaginator[js.Any, PaginatorState]
  ): IClient = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], make = js.Any.fromFunction2(make), paginate = js.Any.fromFunction1(paginate))
    __obj.updateDynamic("do")(js.Any.fromFunction1(`do`))
    __obj.asInstanceOf[IClient]
  }
  
  @scala.inline
  implicit class IClientOps[Self <: IClient] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: IConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDo(value: SuperAgentRequest => js.Promise[APIResponseSuccess]): Self = this.set("do", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMake(value: (HttpMethod, String) => js.Promise[Req]): Self = this.set("make", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPaginate(value: PaginateArgs[js.Any] => IPaginator[js.Any, PaginatorState]): Self = this.set("paginate", js.Any.fromFunction1(value))
  }
}
