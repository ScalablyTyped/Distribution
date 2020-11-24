package typings.libxmljs.mod

import typings.libxmljs.anon.Declaration
import typings.libxmljs.libxmljsStrings.attribute
import typings.libxmljs.libxmljsStrings.comment
import typings.libxmljs.libxmljsStrings.element
import typings.libxmljs.libxmljsStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libxmljs", "Node")
@js.native
class Node () extends js.Object {
  
  def doc(): Document = js.native
  
  /**
    * The namespace or null in case of comment nodes
    */
  def namespace(): Namespace | Null = js.native
  
  /**
    * An array of namespaces that the object belongs to.
    *
    * @param local If it is true, only the namespace declarations local to this
    *              node are returned, rather than all of the namespaces in scope
    *              at this node (including the ones from the parent elements).
    */
  def namespaces(): js.Array[Namespace] = js.native
  def namespaces(local: Boolean): js.Array[Namespace] = js.native
  
  def nextSibling(): Node | Null = js.native
  
  def parent(): Element | Document = js.native
  
  def prevSibling(): Node | Null = js.native
  
  def remove(): this.type = js.native
  
  def toString(format: Boolean): String = js.native
  def toString(format: Declaration): String = js.native
  
  def `type`(): comment | element | text | attribute = js.native
}
