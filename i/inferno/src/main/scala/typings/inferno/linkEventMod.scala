package typings.inferno

import typings.inferno.typesMod.LinkedEvent
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkEventMod {
  
  @JSImport("inferno/dist/DOM/events/linkEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLinkEventObject(o: Any): /* is inferno.inferno/dist/core/types.LinkedEvent<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLinkEventObject")(o.asInstanceOf[js.Any]).asInstanceOf[/* is inferno.inferno/dist/core/types.LinkedEvent<any, any> */ Boolean]
  
  inline def linkEvent[T, E /* <: Event */](data: T, event: js.Function2[/* data */ T, /* event */ E, Unit]): (LinkedEvent[T, E]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("linkEvent")(data.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[(LinkedEvent[T, E]) | Null]
}
