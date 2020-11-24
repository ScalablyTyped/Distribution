package typings.helmet.contentSecurityPolicyMod

import org.scalablytyped.runtime.StringDictionary
import typings.helmet.anon.ReadonlyContentSecurityPo
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Error
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("helmet/dist/middlewares/content-security-policy", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
    Unit
  ] = js.native
  def apply(options: ReadonlyContentSecurityPo): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
    Unit
  ] = js.native
  
  var getDefaultDirectives: js.Function0[StringDictionary[Iterable[ContentSecurityPolicyDirectiveValue]]] = js.native
}
