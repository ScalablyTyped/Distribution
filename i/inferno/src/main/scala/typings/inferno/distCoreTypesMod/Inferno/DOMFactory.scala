package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.distCoreTypesMod.InfernoNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMFactory[P /* <: DOMAttributes[T] */, T /* <: Element */] extends StObject {
  
  def apply(props: ClassAttributes[T] & P, children: InfernoNode*): DOMElement[P, T] = js.native
  def apply(props: Null, children: InfernoNode*): DOMElement[P, T] = js.native
  def apply(props: Unit, children: InfernoNode*): DOMElement[P, T] = js.native
}
