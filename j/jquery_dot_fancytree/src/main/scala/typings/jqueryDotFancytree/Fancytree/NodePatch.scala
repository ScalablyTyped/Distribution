package typings.jqueryDotFancytree.Fancytree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Data object similar to NodeData, but with additional options.
  * May be passed to FancytreeNode#applyPatch (Every property that is omitted (or set to undefined) will be ignored)  */
trait NodePatch extends js.Object {
  /** (not yet implemented) */
  var appendChildren: js.UndefOr[NodeData] = js.undefined
  /** (not yet implemented) */
  var insertChildren: js.UndefOr[NodeData] = js.undefined
  /** (not yet implemented) */
  var replaceChildren: js.UndefOr[NodeData] = js.undefined
}

object NodePatch {
  @scala.inline
  def apply(appendChildren: NodeData = null, insertChildren: NodeData = null, replaceChildren: NodeData = null): NodePatch = {
    val __obj = js.Dynamic.literal()
    if (appendChildren != null) __obj.updateDynamic("appendChildren")(appendChildren.asInstanceOf[js.Any])
    if (insertChildren != null) __obj.updateDynamic("insertChildren")(insertChildren.asInstanceOf[js.Any])
    if (replaceChildren != null) __obj.updateDynamic("replaceChildren")(replaceChildren.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodePatch]
  }
}

