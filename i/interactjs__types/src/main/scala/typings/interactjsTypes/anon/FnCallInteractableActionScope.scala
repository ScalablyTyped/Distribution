package typings.interactjsTypes.anon

import typings.interactjsTypes.coreScopeMod.Scope
import typings.interactjsTypes.coreTypesMod.ActionProps
import typings.interactjsTypes.interactjsTypesStrings.drag
import typings.interactjsTypes.interactjsTypesStrings.drop
import typings.interactjsTypes.interactjsTypesStrings.gesture
import typings.interactjsTypes.interactjsTypesStrings.resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallInteractableActionScope extends StObject {
  
  def apply(
    interactable: InteractableAllowFrom,
    action: ActionProps[drag | drop | gesture | resize],
    scope: Scope
  ): js.Promise[InteractableAllowFrom] = js.native
}
