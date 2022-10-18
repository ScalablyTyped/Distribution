package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.interactjsTypesStrings.drag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocEvents extends StObject {
  
  var docEvents: js.Array[Listener] = js.native
  
  var list: js.Array[typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]] = js.native
  
  var listeners: StringDictionary[typings.interactjsTypes.coreTypesMod.Listener] = js.native
  
  def `new`(options: Any): typings.interactjsTypes.coreInteractionMod.Interaction[drag] = js.native
  
  var pointerMoveTolerance: Double = js.native
}
