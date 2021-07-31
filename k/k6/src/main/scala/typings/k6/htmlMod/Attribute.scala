package typings.k6.htmlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("k6/html", "Attribute")
@js.native
abstract class Attribute () extends StObject {
  
  /** Local part of qualified name. */
  def localName(): String = js.native
  
  /** Name. */
  var name: String = js.native
  
  /** Namespace URI. */
  def namespaceURI(): String = js.native
  
  /** Owning element. */
  var ownerElement: Element = js.native
  
  /** Namespace prefix. */
  def prefix(): String = js.native
  
  /** Value. */
  var value: String = js.native
}
