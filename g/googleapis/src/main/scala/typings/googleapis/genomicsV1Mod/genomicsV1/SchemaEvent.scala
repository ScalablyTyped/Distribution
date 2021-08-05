package typings.googleapis.genomicsV1Mod.genomicsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Carries information about events that occur during pipeline execution.
  */
trait SchemaEvent extends StObject {
  
  /**
    * A human-readable description of the event. Note that these strings can
    * change at any time without notice. Any application logic must use the
    * information in the `details` field.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Machine-readable details about the event.
    */
  var details: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * The time at which the event occurred.
    */
  var timestamp: js.UndefOr[String] = js.undefined
}
object SchemaEvent {
  
  inline def apply(): SchemaEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEvent]
  }
  
  extension [Self <: SchemaEvent](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetails(value: StringDictionary[js.Any]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
