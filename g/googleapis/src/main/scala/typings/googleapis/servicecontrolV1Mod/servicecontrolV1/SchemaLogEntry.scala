package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An individual log entry.
  */
@js.native
trait SchemaLogEntry extends js.Object {
  /**
    * Optional. Information about the HTTP request associated with this log
    * entry, if applicable.
    */
  var httpRequest: js.UndefOr[SchemaHttpRequest] = js.native
  /**
    * A unique ID for the log entry used for deduplication. If omitted, the
    * implementation will generate one based on operation_id.
    */
  var insertId: js.UndefOr[String] = js.native
  /**
    * A set of user-defined (key, value) data that provides additional
    * information about the log entry.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Required. The log to which this log entry belongs. Examples:
    * `&quot;syslog&quot;`, `&quot;book_log&quot;`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. Information about an operation associated with the log entry,
    * if applicable.
    */
  var operation: js.UndefOr[SchemaLogEntryOperation] = js.native
  /**
    * The log entry payload, represented as a protocol buffer that is expressed
    * as a JSON object. The only accepted type currently is AuditLog.
    */
  var protoPayload: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The severity of the log entry. The default value is
    * `LogSeverity.DEFAULT`.
    */
  var severity: js.UndefOr[String] = js.native
  /**
    * The log entry payload, represented as a structure that is expressed as a
    * JSON object.
    */
  var structPayload: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The log entry payload, represented as a Unicode string (UTF-8).
    */
  var textPayload: js.UndefOr[String] = js.native
  /**
    * The time the event described by the log entry occurred. If omitted,
    * defaults to operation start time.
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * Optional. Resource name of the trace associated with the log entry, if
    * any. If this field contains a relative resource name, you can assume the
    * name is relative to `//tracing.googleapis.com`. Example:
    * `projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824`
    */
  var trace: js.UndefOr[String] = js.native
}

object SchemaLogEntry {
  @scala.inline
  def apply(
    httpRequest: SchemaHttpRequest = null,
    insertId: String = null,
    labels: StringDictionary[String] = null,
    name: String = null,
    operation: SchemaLogEntryOperation = null,
    protoPayload: StringDictionary[js.Any] = null,
    severity: String = null,
    structPayload: StringDictionary[js.Any] = null,
    textPayload: String = null,
    timestamp: String = null,
    trace: String = null
  ): SchemaLogEntry = {
    val __obj = js.Dynamic.literal()
    if (httpRequest != null) __obj.updateDynamic("httpRequest")(httpRequest.asInstanceOf[js.Any])
    if (insertId != null) __obj.updateDynamic("insertId")(insertId.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (protoPayload != null) __obj.updateDynamic("protoPayload")(protoPayload.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (structPayload != null) __obj.updateDynamic("structPayload")(structPayload.asInstanceOf[js.Any])
    if (textPayload != null) __obj.updateDynamic("textPayload")(textPayload.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (trace != null) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLogEntry]
  }
}

