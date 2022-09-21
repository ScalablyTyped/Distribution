package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsTypesStrings.drag
import typings.interactjsTypes.interactjsTypesStrings.drop
import typings.interactjsTypes.interactjsTypesStrings.gesture
import typings.interactjsTypes.interactjsTypesStrings.resize
import typings.interactjsTypes.scopeMod.Scope
import typings.interactjsTypes.typesMod.ActionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallInteractableElementActionScope extends StObject {
  
  def apply(
    interactable: InteractableAllowFrom,
    element: typings.interactjsTypes.typesMod.Element,
    action: ActionProps[drag | drop | gesture | resize],
    scope: Scope
  ): Boolean = js.native
}
