package typings
package libxmljsLib.libxmljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libxmljs", "Node")
@js.native
class Node () extends js.Object {
  def doc(): Document = js.native
  /**
    * The namespace or null in case of comment nodes
    */
  def namespace(): Namespace | scala.Null = js.native
  /**
    * An array of namespaces that the object belongs to.
    *
    * @param local If it is true, only the namespace declarations local to this
    *              node are returned, rather than all of the namespaces in scope
    *              at this node (including the ones from the parent elements).
    */
  def namespaces(): js.Array[Namespace] = js.native
  def namespaces(local: scala.Boolean): js.Array[Namespace] = js.native
  def nextSibling(): Node | scala.Null = js.native
  def parent(): Element | Document = js.native
  def prevSibling(): Node | scala.Null = js.native
  def remove(): this.type = js.native
  def toString(format: libxmljsLib.Anon_Declaration): java.lang.String = js.native
  def toString(format: scala.Boolean): java.lang.String = js.native
  def `type`(): libxmljsLib.libxmljsLibStrings.comment | libxmljsLib.libxmljsLibStrings.element | libxmljsLib.libxmljsLibStrings.text | libxmljsLib.libxmljsLibStrings.attribute = js.native
}

