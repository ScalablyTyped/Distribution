package typings.ionic.definitionsMod

import typings.ionic.anon.Req
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClient extends StObject {
  
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
  implicit class IClientMutableBuilder[Self <: IClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDo(value: SuperAgentRequest => js.Promise[APIResponseSuccess]): Self = StObject.set(x, "do", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMake(value: (HttpMethod, String) => js.Promise[Req]): Self = StObject.set(x, "make", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPaginate(value: PaginateArgs[js.Any] => IPaginator[js.Any, PaginatorState]): Self = StObject.set(x, "paginate", js.Any.fromFunction1(value))
  }
}
