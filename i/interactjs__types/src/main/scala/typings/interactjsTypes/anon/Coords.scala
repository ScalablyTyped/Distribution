package typings.interactjsTypes.anon

import typings.interactjsTypes.coreScopeMod.Scope
import typings.interactjsTypes.coreTypesMod.ActionProps
import typings.interactjsTypes.coreTypesMod.PointerEventType
import typings.interactjsTypes.interactjsTypesStrings.drag
import typings.interactjsTypes.interactjsTypesStrings.drop
import typings.interactjsTypes.interactjsTypesStrings.gesture
import typings.interactjsTypes.interactjsTypesStrings.resize
import typings.interactjsTypes.utilsPointerUtilsMod.MockCoords
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coords[T /* <: typings.interactjsTypes.coreTypesMod.Target */] extends StObject {
  
  var coords: MockCoords = js.native
  
  def down(): Unit = js.native
  
  var event: Buttons & typings.interactjsTypes.coreTypesMod.PointerType & PointerEventType = js.native
  
  var interact: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_InteractStatic.InteractStatic */ Any = js.native
  
  var interactable: InteractableDevTools = js.native
  
  var interaction: typings.interactjsTypes.coreInteractionMod.Interaction[
    /* keyof @interactjs/types.@interactjs/core/types.ActionMap */ drag | drop | gesture | resize
  ] = js.native
  
  def move(): Unit = js.native
  def move(force: Boolean): Unit = js.native
  
  var scope: Scope = js.native
  
  @JSName("start")
  def start_drag(action: ActionProps[drag]): Boolean = js.native
  @JSName("start")
  def start_drop(action: ActionProps[drop]): Boolean = js.native
  @JSName("start")
  def start_gesture(action: ActionProps[gesture]): Boolean = js.native
  @JSName("start")
  def start_resize(action: ActionProps[resize]): Boolean = js.native
  
  def stop(): Unit = js.native
  
  var target: T = js.native
  
  def up(): Unit = js.native
}
