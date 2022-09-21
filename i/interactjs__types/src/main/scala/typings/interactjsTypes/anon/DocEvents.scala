package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.interactjsTypes.interactjsTypesStrings.drag
import typings.interactjsTypes.typesMod.ActionName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocEvents extends StObject {
  
  var docEvents: js.Array[Listener] = js.native
  
  var list: js.Array[typings.interactjsTypes.interactionMod.Interaction[ActionName]] = js.native
  
  var listeners: StringDictionary[typings.interactjsTypes.typesMod.Listener] = js.native
  
  def `new`(options: Any): typings.interactjsTypes.interactionMod.Interaction[drag] = js.native
  
  var pointerMoveTolerance: Double = js.native
}
