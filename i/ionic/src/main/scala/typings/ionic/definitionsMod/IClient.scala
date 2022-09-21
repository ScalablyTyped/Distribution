package typings.ionic.definitionsMod

import typings.ionic.anon.Req
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClient extends StObject {
  
  var config: IConfig
  
  def `do`(req: SuperAgentRequest): js.Promise[APIResponseSuccess]
  
  def make(method: HttpMethod, path: String): js.Promise[Req]
  
  def paginate[T /* <: Response[js.Array[js.Object]] */](args: PaginateArgs[T]): IPaginator[T, PaginatorState]
}
object IClient {
  
  inline def apply(
    config: IConfig,
    `do`: SuperAgentRequest => js.Promise[APIResponseSuccess],
    make: (HttpMethod, String) => js.Promise[Req],
    paginate: PaginateArgs[Any] => IPaginator[Any, PaginatorState]
  ): IClient = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], make = js.Any.fromFunction2(make), paginate = js.Any.fromFunction1(paginate))
    __obj.updateDynamic("do")(js.Any.fromFunction1(`do`))
    __obj.asInstanceOf[IClient]
  }
  
  extension [Self <: IClient](x: Self) {
    
    inline def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDo(value: SuperAgentRequest => js.Promise[APIResponseSuccess]): Self = StObject.set(x, "do", js.Any.fromFunction1(value))
    
    inline def setMake(value: (HttpMethod, String) => js.Promise[Req]): Self = StObject.set(x, "make", js.Any.fromFunction2(value))
    
    inline def setPaginate(value: PaginateArgs[Any] => IPaginator[Any, PaginatorState]): Self = StObject.set(x, "paginate", js.Any.fromFunction1(value))
  }
}
