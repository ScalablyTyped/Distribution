package typings.interactjsTypes

import org.scalablytyped.runtime.StringDictionary
import typings.interactjsTypes.coreTypesMod.EventTypes
import typings.interactjsTypes.coreTypesMod.Listener
import typings.interactjsTypes.coreTypesMod.ListenersArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsNormalizeListenersMod {
  
  @JSImport("@interactjs/utils/normalizeListeners", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(`type`: EventTypes): NormalizedListeners = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`type`.asInstanceOf[js.Any]).asInstanceOf[NormalizedListeners]
  inline def default(`type`: EventTypes, listeners: js.Array[ListenersArg]): NormalizedListeners = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`type`.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any])).asInstanceOf[NormalizedListeners]
  inline def default(`type`: EventTypes, listeners: js.Array[ListenersArg], result: NormalizedListeners): NormalizedListeners = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`type`.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[NormalizedListeners]
  inline def default(`type`: EventTypes, listeners: Unit, result: NormalizedListeners): NormalizedListeners = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`type`.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[NormalizedListeners]
  inline def default(`type`: EventTypes, listeners: ListenersArg): NormalizedListeners = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`type`.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any])).asInstanceOf[NormalizedListeners]
  inline def default(`type`: EventTypes, listeners: ListenersArg, result: NormalizedListeners): NormalizedListeners = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`type`.asInstanceOf[js.Any], listeners.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[NormalizedListeners]
  
  type NormalizedListeners = StringDictionary[js.Array[Listener]]
}
