package typings.hast.mod

import typings.unist.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parent
  extends typings.unist.mod.Parent

object Parent {
  @scala.inline
  def apply(children: js.Array[Node], `type`: String): Parent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent]
  }
}

