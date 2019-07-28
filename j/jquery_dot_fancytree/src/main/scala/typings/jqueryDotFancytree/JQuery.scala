package typings.jqueryDotFancytree

import typings.jqueryDotFancytree.FancytreeNs.Fancytree
import typings.jqueryDotFancytree.FancytreeNs.FancytreeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def fancytree(): Fancytree = js.native
  def fancytree(option: String, rest: js.Any*): js.Any = js.native
  def fancytree(options: FancytreeOptions): Fancytree = js.native
  @JSName("fancytree")
  def fancytree_Any(): js.Any = js.native
}

