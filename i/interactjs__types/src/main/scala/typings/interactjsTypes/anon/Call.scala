package typings.interactjsTypes.anon

import typings.interactjsTypes.modifiersTypesMod.Modifier
import typings.interactjsTypes.modifiersTypesMod.ModifierState
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call[Defaults /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  enabled :boolean | undefined} */ js.Any */, State /* <: ModifierState[Any, Any, Any] */, Name /* <: String */, Result] extends StObject {
  
  def apply(): Modifier[Defaults, State, Name, Result] = js.native
  def apply(_options: Partial[Defaults]): Modifier[Defaults, State, Name, Result] = js.native
  
  var _defaults: Defaults = js.native
  
  var _methods: BeforeEndSet[State, Result] = js.native
}
