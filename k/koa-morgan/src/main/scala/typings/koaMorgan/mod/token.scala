package typings.koaMorgan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-morgan", "token")
@js.native
object token extends js.Object {
  
  /**
    * Define a custom token which can be used in custom morgan logging formats.
    */
  def apply(name: String, callback: TokenCallbackFn): KoaMorgan = js.native
}
