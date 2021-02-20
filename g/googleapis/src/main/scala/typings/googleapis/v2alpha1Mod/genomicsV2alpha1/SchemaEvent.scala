package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Carries information about events that occur during pipeline execution.
  */
@js.native
trait SchemaEvent extends StObject {
  
  /**
    * A human-readable description of the event. Note that these strings can
    * change at any time without notice. Any application logic must use the
    * information in the `details` field.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Machine-readable details about the event.
    */
  var details: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * The time at which the event occurred.
    */
  var timestamp: js.UndefOr[String] = js.native
}
object SchemaEvent {
  
  @scala.inline
  def apply(): SchemaEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEvent]
  }
  
  @scala.inline
  implicit class SchemaEventMutableBuilder[Self <: SchemaEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDetails(value: StringDictionary[js.Any]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
