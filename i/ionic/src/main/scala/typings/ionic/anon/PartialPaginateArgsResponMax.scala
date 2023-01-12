package typings.ionic.anon

import typings.ionic.definitionsMod.APIResponseSuccess
import typings.ionic.definitionsMod.PaginatorGuard
import typings.ionic.definitionsMod.PaginatorRequestGenerator
import typings.ionic.definitionsMod.Response
import typings.ionic.definitionsMod.SSHKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ionic.ionic/definitions.PaginateArgs<ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.SSHKey>>>> */
trait PartialPaginateArgsResponMax extends StObject {
  
  var guard: js.UndefOr[PaginatorGuard[Response[js.Array[SSHKey]]]] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var reqgen: js.UndefOr[PaginatorRequestGenerator] = js.undefined
  
  var state: js.UndefOr[PartialPaginatorState] = js.undefined
}
object PartialPaginateArgsResponMax {
  
  inline def apply(): PartialPaginateArgsResponMax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaginateArgsResponMax]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPaginateArgsResponMax] (val x: Self) extends AnyVal {
    
    inline def setGuard(value: /* res */ APIResponseSuccess => /* is T */ Boolean): Self = StObject.set(x, "guard", js.Any.fromFunction1(value))
    
    inline def setGuardUndefined: Self = StObject.set(x, "guard", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setReqgen(value: () => js.Promise[Req]): Self = StObject.set(x, "reqgen", js.Any.fromFunction0(value))
    
    inline def setReqgenUndefined: Self = StObject.set(x, "reqgen", js.undefined)
    
    inline def setState(value: PartialPaginatorState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
