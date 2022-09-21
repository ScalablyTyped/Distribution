package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSpanContext extends StObject {
  
  /**
    * The resource name of the span. The format is: projects/[PROJECT_ID_OR_NUMBER]/traces/[TRACE_ID]/spans/[SPAN_ID] [TRACE_ID] is a unique identifier for a trace within a project; it is a 32-character hexadecimal encoding of a 16-byte array.[SPAN_ID] is a unique identifier for a span within a trace; it is a 16-character hexadecimal encoding of an 8-byte array.
    */
  var spanName: js.UndefOr[String | Null] = js.undefined
}
object SchemaSpanContext {
  
  inline def apply(): SchemaSpanContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpanContext]
  }
  
  extension [Self <: SchemaSpanContext](x: Self) {
    
    inline def setSpanName(value: String): Self = StObject.set(x, "spanName", value.asInstanceOf[js.Any])
    
    inline def setSpanNameNull: Self = StObject.set(x, "spanName", null)
    
    inline def setSpanNameUndefined: Self = StObject.set(x, "spanName", js.undefined)
  }
}
