package typings
package maquetteLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VNode extends js.Object {
  /**
       * Array of [[VNode]]s to be used as children. This array is already flattened.
       */
  val children: js.UndefOr[js.Array[VNode]]
  /**
       * Used by maquette to store the domNode that was produced from this [[VNode]].
       */
  var domNode: stdLib.Node | scala.Null
  /**
       * Object containing attributes, properties, event handlers and more, see [[h]].
       */
  val properties: js.UndefOr[VNodeProperties]
  /**
       * Used in a special case when a [[VNode]] only has one child node which is a text node. Only used in combination with children === undefined.
       */
  val text: js.UndefOr[java.lang.String]
  /**
       * The CSS selector containing tagname, css classnames and id. An empty string is used to denote a text node.
       */
  val vnodeSelector: java.lang.String
}

