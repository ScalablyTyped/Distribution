package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Link extends StObject {
  
  /** A set of attributes on the link. You have have up to 32 attributes per link. */
  var attributes: js.UndefOr[Attributes] = js.undefined
  
  /** The [SPAN_ID] for a span within a trace. */
  var spanId: js.UndefOr[String] = js.undefined
  
  /** The [TRACE_ID] for a trace within a project. */
  var traceId: js.UndefOr[String] = js.undefined
  
  /** The relationship of the current span relative to the linked span. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Link {
  
  @scala.inline
  def apply(): Link = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Link]
  }
  
  @scala.inline
  implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setSpanId(value: String): Self = StObject.set(x, "spanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanIdUndefined: Self = StObject.set(x, "spanId", js.undefined)
    
    @scala.inline
    def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceIdUndefined: Self = StObject.set(x, "traceId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
