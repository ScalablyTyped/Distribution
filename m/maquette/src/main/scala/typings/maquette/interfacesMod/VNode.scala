package typings.maquette.interfacesMod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VNode extends _VNodeChild {
  /**
    * Array of [[VNode]]s to be used as children. This array is already flattened.
    */
  val children: js.UndefOr[js.Array[VNode]] = js.native
  /**
    * Used by maquette to store the domNode that was produced from this [[VNode]].
    */
  var domNode: Node | Null = js.native
  /**
    * Object containing attributes, properties, event handlers and more, see [[h]].
    */
  val properties: js.UndefOr[VNodeProperties] = js.native
  /**
    * Used in a special case when a [[VNode]] only has one child node which is a text node. Only used in combination with children === undefined.
    */
  val text: js.UndefOr[String] = js.native
  /**
    * The CSS selector containing tagname, css classnames and id. An empty string is used to denote a text node.
    */
  val vnodeSelector: String = js.native
}

object VNode {
  @scala.inline
  def apply(vnodeSelector: String): VNode = {
    val __obj = js.Dynamic.literal(vnodeSelector = vnodeSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode]
  }
  @scala.inline
  implicit class VNodeOps[Self <: VNode] (val x: Self) extends AnyVal {
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
    def setVnodeSelector(value: String): Self = this.set("vnodeSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: VNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[VNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDomNode(value: Node): Self = this.set("domNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomNodeNull: Self = this.set("domNode", null)
    @scala.inline
    def setProperties(value: VNodeProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

