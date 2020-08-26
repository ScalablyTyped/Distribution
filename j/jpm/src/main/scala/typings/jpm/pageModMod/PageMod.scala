package typings.jpm.pageModMod

import typings.jpm.anon.AttachTo
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageMod extends js.Object {
  var include: String | (js.Array[RegExp | String]) | RegExp = js.native
  def destroy(): Unit = js.native
}

@JSImport("sdk/page-mod", "PageMod")
@js.native
object PageMod extends js.Object {
  def apply(options: AttachTo): PageMod = js.native
}

