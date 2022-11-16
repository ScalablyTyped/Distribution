package typings.interactjsTypes.coreTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type ListenerMap = {[index: string] : @interactjs/types.@interactjs/core/types.ListenersArg | std.Array<@interactjs/types.@interactjs/core/types.ListenersArg>}
}}}
to avoid circular code involving: 
- @interactjs/types.@interactjs/core/types.EventTypes
- @interactjs/types.@interactjs/core/types.ListenerMap
- @interactjs/types.@interactjs/core/types.Listeners
- @interactjs/types.@interactjs/core/types.ListenersArg
*/
trait ListenerMap
  extends StObject
     with /* index */ StringDictionary[ListenersArg | js.Array[ListenersArg]]
     with _ListenersArg
object ListenerMap {
  
  inline def apply(): ListenerMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerMap]
  }
}
