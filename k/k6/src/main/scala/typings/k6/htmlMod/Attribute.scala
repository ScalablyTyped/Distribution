package typings.k6.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "Attribute")
@js.native
abstract class Attribute () extends js.Object {
  /** Name. */
  var name: String = js.native
  /** Owning element. */
  var ownerElement: Element = js.native
  /** Value. */
  var value: String = js.native
  /** Local part of qualified name. */
  def localName(): String = js.native
  /** Namespace URI. */
  def namespaceURI(): String = js.native
  /** Namespace prefix. */
  def prefix(): String = js.native
}

