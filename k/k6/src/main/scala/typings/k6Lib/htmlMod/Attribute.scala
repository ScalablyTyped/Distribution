package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "Attribute")
@js.native
abstract class Attribute () extends js.Object {
  var __brand: scala.Nothing = js.native
  /** Name. */
  var name: java.lang.String = js.native
  /** Owning element. */
  var ownerElement: Element = js.native
  /** Value. */
  var value: java.lang.String = js.native
  /** Local part of qualified name. */
  def localName(): java.lang.String = js.native
  /** Namespace URI. */
  def namespaceURI(): java.lang.String = js.native
  /** Namespace prefix. */
  def prefix(): java.lang.String = js.native
}

