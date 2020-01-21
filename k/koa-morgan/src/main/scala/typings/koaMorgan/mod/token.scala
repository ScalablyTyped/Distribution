package typings.koaMorgan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-morgan", "token")
@js.native
object token extends js.Object {
  /**
    * Define a custom token which can be used in custom morgan logging formats.
    */
  def apply(name: String, callback: TokenCallbackFn): KoaMorgan = js.native
}

