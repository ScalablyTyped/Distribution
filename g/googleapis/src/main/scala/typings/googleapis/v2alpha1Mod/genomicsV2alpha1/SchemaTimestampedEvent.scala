package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimestampedEvent extends StObject {
  
  /**
    * The event data.
    */
  var data: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The time when the event happened.
    */
  var timestamp: js.UndefOr[String | Null] = js.undefined
}
object SchemaTimestampedEvent {
  
  inline def apply(): SchemaTimestampedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimestampedEvent]
  }
  
  extension [Self <: SchemaTimestampedEvent](x: Self) {
    
    inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
