package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.distCoreTypesMod.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentFactory[P, T /* <: IComponent[P, ComponentState] */] extends StObject {
  
  def apply(props: ClassAttributes[T] & P, children: InfernoNode*): CElement[P, T] = js.native
  def apply(props: Unit, children: InfernoNode*): CElement[P, T] = js.native
}
