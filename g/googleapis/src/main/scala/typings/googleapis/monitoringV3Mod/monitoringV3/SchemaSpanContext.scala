package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The context of a span, attached to google.api.Distribution.Exemplars in
  * google.api.Distribution values during aggregation.It contains the name of a
  * span with format:  projects/PROJECT_ID/traces/TRACE_ID/spans/SPAN_ID
  */
trait SchemaSpanContext extends StObject {
  
  /**
    * The resource name of the span in the following format:
    * projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/[SPAN_ID] TRACE_ID is a
    * unique identifier for a trace within a project; it is a 32-character
    * hexadecimal encoding of a 16-byte array.SPAN_ID is a unique identifier
    * for a span within a trace; it is a 16-character hexadecimal encoding of
    * an 8-byte array.
    */
  var spanName: js.UndefOr[String] = js.undefined
}
object SchemaSpanContext {
  
  @scala.inline
  def apply(): SchemaSpanContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpanContext]
  }
  
  @scala.inline
  implicit class SchemaSpanContextMutableBuilder[Self <: SchemaSpanContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpanName(value: String): Self = StObject.set(x, "spanName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanNameUndefined: Self = StObject.set(x, "spanName", js.undefined)
  }
}
