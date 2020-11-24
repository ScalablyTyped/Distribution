package typings.helmet.xPermittedCrossDomainPoliciesMod

import typings.helmet.anon.ReadonlyXPermittedCrossDo
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("helmet/dist/middlewares/x-permitted-cross-domain-policies", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = js.native
  def apply(options: ReadonlyXPermittedCrossDo): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = js.native
}
