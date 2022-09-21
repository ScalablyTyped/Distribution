package typings.hyperFunctionComponent

import org.scalablytyped.runtime.StringDictionary
import typings.hyperFunctionComponent.anon.Dictk
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HfcProps extends StObject {
  
  var attrs: StringDictionary[Any]
  
  var events: StringDictionary[js.Function1[/* args */ js.UndefOr[StringDictionary[Any]], Any]]
  
  var others: StringDictionary[Any]
  
  var slots: StringDictionary[js.Function2[/* container */ Element, /* args */ js.UndefOr[Dictk], Unit]]
}
object HfcProps {
  
  inline def apply(
    attrs: StringDictionary[Any],
    events: StringDictionary[js.Function1[/* args */ js.UndefOr[StringDictionary[Any]], Any]],
    others: StringDictionary[Any],
    slots: StringDictionary[js.Function2[/* container */ Element, /* args */ js.UndefOr[Dictk], Unit]]
  ): HfcProps = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], others = others.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[HfcProps]
  }
  
  extension [Self <: HfcProps](x: Self) {
    
    inline def setAttrs(value: StringDictionary[Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: StringDictionary[js.Function1[/* args */ js.UndefOr[StringDictionary[Any]], Any]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setOthers(value: StringDictionary[Any]): Self = StObject.set(x, "others", value.asInstanceOf[js.Any])
    
    inline def setSlots(value: StringDictionary[js.Function2[/* container */ Element, /* args */ js.UndefOr[Dictk], Unit]]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
  }
}
