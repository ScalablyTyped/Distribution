package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsTypesStrings.drag
import typings.interactjsTypes.interactjsTypesStrings.drop
import typings.interactjsTypes.interactjsTypesStrings.gesture
import typings.interactjsTypes.interactjsTypesStrings.resize
import typings.interactjsTypes.pointerUtilsMod.MockCoords
import typings.interactjsTypes.scopeMod.Scope
import typings.interactjsTypes.typesMod.ActionProps
import typings.interactjsTypes.typesMod.PointerEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coords[T /* <: typings.interactjsTypes.typesMod.Target */] extends StObject {
  
  var coords: MockCoords = js.native
  
  def down(): Unit = js.native
  
  var event: Buttons & typings.interactjsTypes.typesMod.PointerType & PointerEventType = js.native
  
  var interact: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_InteractStatic.InteractStatic */ Any = js.native
  
  var interactable: InteractableDevTools = js.native
  
  var interaction: typings.interactjsTypes.interactionMod.Interaction[
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
