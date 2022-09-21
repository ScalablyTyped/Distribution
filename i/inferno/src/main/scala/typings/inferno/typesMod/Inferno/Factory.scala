package typings.inferno.typesMod.Inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Factory[P] extends StObject {
  
  def apply(props: Attributes & P, children: InfernoNode*): InfernoElement[P] = js.native
  def apply(props: Unit, children: InfernoNode*): InfernoElement[P] = js.native
}
