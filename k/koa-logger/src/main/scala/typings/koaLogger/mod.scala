package typings.koaLogger

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-logger", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: Transporter): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: TransporterOpts): Middleware[DefaultState, DefaultContext] = js.native
  
  @js.native
  trait TransporterOpts extends js.Object {
    
    def transporter(str: String, args: js.Object): Unit = js.native
    @JSName("transporter")
    var transporter_Original: Transporter = js.native
  }
  
  type Transporter = js.Function2[/* str */ String, /* args */ js.Object, Unit]
}
