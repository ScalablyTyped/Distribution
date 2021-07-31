package typings.ionic.anon

import typings.ionic.definitionsMod.APIResponseSuccess
import typings.ionic.definitionsMod.App
import typings.ionic.definitionsMod.PaginatorGuard
import typings.ionic.definitionsMod.PaginatorRequestGenerator
import typings.ionic.definitionsMod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ionic.ionic/definitions.PaginateArgs<ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.App>>>> */
trait PartialPaginateArgsRespon extends StObject {
  
  var guard: js.UndefOr[PaginatorGuard[Response[js.Array[App]]]] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var reqgen: js.UndefOr[PaginatorRequestGenerator] = js.undefined
  
  var state: js.UndefOr[PartialPaginatorState] = js.undefined
}
object PartialPaginateArgsRespon {
  
  @scala.inline
  def apply(): PartialPaginateArgsRespon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaginateArgsRespon]
  }
  
  @scala.inline
  implicit class PartialPaginateArgsResponMutableBuilder[Self <: PartialPaginateArgsRespon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGuard(value: /* res */ APIResponseSuccess => /* is T */ Boolean): Self = StObject.set(x, "guard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGuardUndefined: Self = StObject.set(x, "guard", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setReqgen(value: () => js.Promise[Req]): Self = StObject.set(x, "reqgen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReqgenUndefined: Self = StObject.set(x, "reqgen", js.undefined)
    
    @scala.inline
    def setState(value: PartialPaginatorState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
