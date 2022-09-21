package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLogEntry extends StObject {
  
  /**
    * Optional. Information about the HTTP request associated with this log entry, if applicable.
    */
  var httpRequest: js.UndefOr[SchemaHttpRequest] = js.undefined
  
  /**
    * A unique ID for the log entry used for deduplication. If omitted, the implementation will generate one based on operation_id.
    */
  var insertId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A set of user-defined (key, value) data that provides additional information about the log entry.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Required. The log to which this log entry belongs. Examples: `"syslog"`, `"book_log"`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Information about an operation associated with the log entry, if applicable.
    */
  var operation: js.UndefOr[SchemaLogEntryOperation] = js.undefined
  
  /**
    * The log entry payload, represented as a protocol buffer that is expressed as a JSON object. The only accepted type currently is AuditLog.
    */
  var protoPayload: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The severity of the log entry. The default value is `LogSeverity.DEFAULT`.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Source code location information associated with the log entry, if any.
    */
  var sourceLocation: js.UndefOr[SchemaLogEntrySourceLocation] = js.undefined
  
  /**
    * The log entry payload, represented as a structure that is expressed as a JSON object.
    */
  var structPayload: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The log entry payload, represented as a Unicode string (UTF-8).
    */
  var textPayload: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time the event described by the log entry occurred. If omitted, defaults to operation start time.
    */
  var timestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Resource name of the trace associated with the log entry, if any. If this field contains a relative resource name, you can assume the name is relative to `//tracing.googleapis.com`. Example: `projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824`
    */
  var trace: js.UndefOr[String | Null] = js.undefined
}
object SchemaLogEntry {
  
  inline def apply(): SchemaLogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogEntry]
  }
  
  extension [Self <: SchemaLogEntry](x: Self) {
    
    inline def setHttpRequest(value: SchemaHttpRequest): Self = StObject.set(x, "httpRequest", value.asInstanceOf[js.Any])
    
    inline def setHttpRequestUndefined: Self = StObject.set(x, "httpRequest", js.undefined)
    
    inline def setInsertId(value: String): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
    
    inline def setInsertIdNull: Self = StObject.set(x, "insertId", null)
    
    inline def setInsertIdUndefined: Self = StObject.set(x, "insertId", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperation(value: SchemaLogEntryOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setProtoPayload(value: StringDictionary[Any]): Self = StObject.set(x, "protoPayload", value.asInstanceOf[js.Any])
    
    inline def setProtoPayloadNull: Self = StObject.set(x, "protoPayload", null)
    
    inline def setProtoPayloadUndefined: Self = StObject.set(x, "protoPayload", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setSourceLocation(value: SchemaLogEntrySourceLocation): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationUndefined: Self = StObject.set(x, "sourceLocation", js.undefined)
    
    inline def setStructPayload(value: StringDictionary[Any]): Self = StObject.set(x, "structPayload", value.asInstanceOf[js.Any])
    
    inline def setStructPayloadNull: Self = StObject.set(x, "structPayload", null)
    
    inline def setStructPayloadUndefined: Self = StObject.set(x, "structPayload", js.undefined)
    
    inline def setTextPayload(value: String): Self = StObject.set(x, "textPayload", value.asInstanceOf[js.Any])
    
    inline def setTextPayloadNull: Self = StObject.set(x, "textPayload", null)
    
    inline def setTextPayloadUndefined: Self = StObject.set(x, "textPayload", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTrace(value: String): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    inline def setTraceNull: Self = StObject.set(x, "trace", null)
    
    inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
  }
}
