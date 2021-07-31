package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Exemplars are example points that may be used to annotate aggregated
  * distribution values. They are metadata that gives information about a
  * particular value added to a Distribution bucket, such as a trace ID that
  * was active when a value was added. They may contain further information,
  * such as a example values and timestamps, origin, etc.
  */
trait SchemaExemplar extends StObject {
  
  /**
    * Contextual information about the example value. Examples are:Trace:
    * type.googleapis.com/google.monitoring.v3.SpanContextLiteral string:
    * type.googleapis.com/google.protobuf.StringValueLabels dropped during
    * aggregation:  type.googleapis.com/google.monitoring.v3.DroppedLabelsThere
    * may be only a single attachment of any given message type in a single
    * exemplar, and this is enforced by the system.
    */
  var attachments: js.UndefOr[js.Array[StringDictionary[js.Any]]] = js.undefined
  
  /**
    * The observation (sampling) time of the above value.
    */
  var timestamp: js.UndefOr[String] = js.undefined
  
  /**
    * Value of the exemplar point. This value determines to which bucket the
    * exemplar belongs.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object SchemaExemplar {
  
  @scala.inline
  def apply(): SchemaExemplar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExemplar]
  }
  
  @scala.inline
  implicit class SchemaExemplarMutableBuilder[Self <: SchemaExemplar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: js.Array[StringDictionary[js.Any]]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
