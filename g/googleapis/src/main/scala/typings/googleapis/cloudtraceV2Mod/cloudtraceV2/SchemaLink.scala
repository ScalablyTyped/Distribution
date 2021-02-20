package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A pointer from the current span to another span in the same trace or in a
  * different trace. For example, this can be used in batching operations,
  * where a single batch handler processes multiple requests from different
  * traces or when the handler receives a request from a different project.
  */
@js.native
trait SchemaLink extends StObject {
  
  /**
    * A set of attributes on the link. You have have up to  32 attributes per
    * link.
    */
  var attributes: js.UndefOr[SchemaAttributes] = js.native
  
  /**
    * The [SPAN_ID] for a span within a trace.
    */
  var spanId: js.UndefOr[String] = js.native
  
  /**
    * The [TRACE_ID] for a trace within a project.
    */
  var traceId: js.UndefOr[String] = js.native
  
  /**
    * The relationship of the current span relative to the linked span.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaLink {
  
  @scala.inline
  def apply(): SchemaLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLink]
  }
  
  @scala.inline
  implicit class SchemaLinkMutableBuilder[Self <: SchemaLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: SchemaAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
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
