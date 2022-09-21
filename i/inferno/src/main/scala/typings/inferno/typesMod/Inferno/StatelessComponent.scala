package typings.inferno.typesMod.Inferno

import typings.inferno.anon.Children
import typings.inferno.typesMod.Refs
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatelessComponent[P] extends StObject {
  
  def apply(props: Children & P & Refs[P]): InfernoElement[Any] | Null = js.native
  def apply(props: Children & P & Refs[P], context: Any): InfernoElement[Any] | Null = js.native
  
  var defaultHooks: js.UndefOr[Refs[P]] = js.native
  
  var defaultProps: js.UndefOr[Partial[P]] = js.native
}
