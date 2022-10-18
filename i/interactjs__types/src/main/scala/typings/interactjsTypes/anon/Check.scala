package typings.interactjsTypes.anon

import typings.interactjsTypes.autoScrollPluginMod.AutoScrollOptions
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.interactjsTypesStrings.drag
import typings.interactjsTypes.interactjsTypesStrings.drop
import typings.interactjsTypes.interactjsTypesStrings.gesture
import typings.interactjsTypes.interactjsTypesStrings.resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Check extends StObject {
  
  def check(interactable: InteractableAllowFrom, actionName: ActionName): Boolean = js.native
  
  var defaults: AutoScrollOptions = js.native
  
  var i: Double = js.native
  
  var interaction: typings.interactjsTypes.coreInteractionMod.Interaction[
    /* keyof @interactjs/types.@interactjs/core/types.ActionMap */ drag | drop | gesture | resize
  ] = js.native
  
  var isScrolling: Boolean = js.native
  
  var margin: Double = js.native
  
  def now(): Double = js.native
  
  def onInteractionMove(hasInteractionPointer: InteractionInteraction): Unit = js.native
  def onInteractionMove(hasInteractionPointer: InteractionInteractionPointerPointerType): Unit = js.native
  def onInteractionMove(hasInteractionPointer: InteractionPointer): Unit = js.native
  def onInteractionMove(hasInteractionPointer: PointerPointerType): Unit = js.native
  
  var prevTime: Double = js.native
  
  def scroll(): Unit = js.native
  
  var speed: Double = js.native
  
  def start(interaction: typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]): Unit = js.native
  
  def stop(): Unit = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
