package typings.jpm.pageModMod

import typings.jpm.AnonAttachTo
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageMod extends js.Object {
  var include: String | (js.Array[RegExp | String]) | RegExp
  def destroy(): Unit
}

@JSImport("sdk/page-mod", "PageMod")
@js.native
object PageMod extends js.Object {
  def apply(options: AnonAttachTo): PageMod = js.native
}

