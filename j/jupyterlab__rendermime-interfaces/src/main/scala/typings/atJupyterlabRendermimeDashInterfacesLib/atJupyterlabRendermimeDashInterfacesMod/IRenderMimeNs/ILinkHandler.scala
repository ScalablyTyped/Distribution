package typings
package atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that handles links on a node.
  */
@js.native
trait ILinkHandler extends js.Object {
  /**
    * Add the link handler to the node.
    *
    * @param node: the node for which to handle the link.
    *
    * @param path: the path to open when the link is clicked.
    *
    * @param id: an optional element id to scroll to when the path is opened.
    */
  def handleLink(node: stdLib.HTMLElement, path: java.lang.String): scala.Unit = js.native
  def handleLink(node: stdLib.HTMLElement, path: java.lang.String, id: java.lang.String): scala.Unit = js.native
}

