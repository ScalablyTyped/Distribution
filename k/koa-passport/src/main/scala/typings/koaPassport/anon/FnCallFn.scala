package typings.koaPassport.anon

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallFn extends js.Object {
  
  def apply[TUser, TID](
    fn: js.Function2[
      /* id */ TID, 
      /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], Unit], 
      Unit
    ]
  ): Unit = js.native
  def apply[TUser, TID, TR /* <: IncomingMessage */](
    fn: js.Function3[
      /* req */ TR, 
      /* id */ TID, 
      /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], Unit], 
      Unit
    ]
  ): Unit = js.native
}
