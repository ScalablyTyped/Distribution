package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDynamicLinkEventStat extends StObject {
  
  /**
    * The number of times this event occurred.
    */
  var count: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link event.
    */
  var event: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Requested platform.
    */
  var platform: js.UndefOr[String | Null] = js.undefined
}
object SchemaDynamicLinkEventStat {
  
  inline def apply(): SchemaDynamicLinkEventStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicLinkEventStat]
  }
  
  extension [Self <: SchemaDynamicLinkEventStat](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventNull: Self = StObject.set(x, "event", null)
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformNull: Self = StObject.set(x, "platform", null)
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
  }
}
