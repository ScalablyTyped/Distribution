package typings
package maquetteLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNode extends _VNodeChild {
  /**
    * Array of [[VNode]]s to be used as children. This array is already flattened.
    */
  val children: js.UndefOr[js.Array[VNode]] = js.undefined
  /**
    * Used by maquette to store the domNode that was produced from this [[VNode]].
    */
  var domNode: stdLib.Node | scala.Null
  /**
    * Object containing attributes, properties, event handlers and more, see [[h]].
    */
  val properties: js.UndefOr[VNodeProperties] = js.undefined
  /**
    * Used in a special case when a [[VNode]] only has one child node which is a text node. Only used in combination with children === undefined.
    */
  val text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The CSS selector containing tagname, css classnames and id. An empty string is used to denote a text node.
    */
  val vnodeSelector: java.lang.String
}

object VNode {
  @scala.inline
  def apply(
    vnodeSelector: java.lang.String,
    children: js.Array[VNode] = null,
    domNode: stdLib.Node = null,
    properties: VNodeProperties = null,
    text: java.lang.String = null
  ): VNode = {
    val __obj = js.Dynamic.literal(vnodeSelector = vnodeSelector)
    if (children != null) __obj.updateDynamic("children")(children)
    if (domNode != null) __obj.updateDynamic("domNode")(domNode)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[VNode]
  }
}

