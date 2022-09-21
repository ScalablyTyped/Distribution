package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExemplar extends StObject {
  
  /**
    * Contextual information about the example value. Examples are: Trace: type.googleapis.com/google.monitoring.v3.SpanContext Literal string: type.googleapis.com/google.protobuf.StringValue Labels dropped during aggregation: type.googleapis.com/google.monitoring.v3.DroppedLabels There may be only a single attachment of any given message type in a single exemplar, and this is enforced by the system.
    */
  var attachments: js.UndefOr[js.Array[StringDictionary[Any]] | Null] = js.undefined
  
  /**
    * The observation (sampling) time of the above value.
    */
  var timestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value of the exemplar point. This value determines to which bucket the exemplar belongs.
    */
  var value: js.UndefOr[Double | Null] = js.undefined
}
object SchemaExemplar {
  
  inline def apply(): SchemaExemplar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExemplar]
  }
  
  extension [Self <: SchemaExemplar](x: Self) {
    
    inline def setAttachments(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsNull: Self = StObject.set(x, "attachments", null)
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
