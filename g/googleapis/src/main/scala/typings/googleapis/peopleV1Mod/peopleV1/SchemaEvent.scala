package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event related to the person.
  */
trait SchemaEvent extends StObject {
  
  /**
    * The date of the event.
    */
  var date: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * The read-only type of the event translated and formatted in the
    * viewer&#39;s account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata about the event.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The type of the event. The type can be custom or one of these predefined
    * values:  * `anniversary` * `other`
    */
  var `type`: js.UndefOr[String] = js.undefined
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
    def setDate(value: SchemaDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
