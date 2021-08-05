package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores the list of events and times they occured for major events in job
  * execution.
  */
trait SchemaTimestampEvent extends StObject {
  
  /**
    * String indicating the type of event
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The time this event occured.
    */
  var timestamp: js.UndefOr[String] = js.undefined
}
object SchemaTimestampEvent {
  
  inline def apply(): SchemaTimestampEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimestampEvent]
  }
  
  extension [Self <: SchemaTimestampEvent](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
