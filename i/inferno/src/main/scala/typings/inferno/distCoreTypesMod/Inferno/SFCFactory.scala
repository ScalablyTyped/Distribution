package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.distCoreTypesMod.InfernoNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCFactory[P] extends StObject {
  
  def apply(props: Attributes & P, children: InfernoNode*): SFCElement[P] = js.native
  def apply(props: Unit, children: InfernoNode*): SFCElement[P] = js.native
}
