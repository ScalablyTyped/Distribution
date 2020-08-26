package typings.layuiSrc.layui

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeNode
  extends /* propName */ StringDictionary[js.Any] {
  var children: js.UndefOr[TreeNode | js.Array[TreeNode]] = js.native
  var href: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var spread: js.UndefOr[Boolean] = js.native
}

object TreeNode {
  @scala.inline
  def apply(): TreeNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeNode]
  }
  @scala.inline
  implicit class TreeNodeOps[Self <: TreeNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildrenVarargs(value: TreeNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: TreeNode | js.Array[TreeNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSpread(value: Boolean): Self = this.set("spread", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpread: Self = this.set("spread", js.undefined)
  }
  
}

