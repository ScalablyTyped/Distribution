package typings.helmet.mod

import org.scalablytyped.runtime.StringDictionary
import typings.helmet.anon.ReadonlyContentSecurityPo
import typings.helmet.contentSecurityPolicyMod.ContentSecurityPolicyDirectiveValue
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Error
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("helmet/dist", "contentSecurityPolicy")
@js.native
object contentSecurityPolicy extends js.Object {
  
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
  
  def getDefaultDirectives(): StringDictionary[Iterable[ContentSecurityPolicyDirectiveValue]] = js.native
  @JSName("getDefaultDirectives")
  var getDefaultDirectives_Original: js.Function0[StringDictionary[Iterable[ContentSecurityPolicyDirectiveValue]]] = js.native
}
