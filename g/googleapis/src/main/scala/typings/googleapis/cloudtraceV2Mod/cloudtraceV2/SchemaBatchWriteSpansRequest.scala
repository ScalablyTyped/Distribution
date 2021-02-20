package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request message for the `BatchWriteSpans` method.
  */
@js.native
trait SchemaBatchWriteSpansRequest extends StObject {
  
  /**
    * A list of new spans. The span names must not match existing spans, or the
    * results are undefined.
    */
  var spans: js.UndefOr[js.Array[SchemaSpan]] = js.native
}
object SchemaBatchWriteSpansRequest {
  
  @scala.inline
  def apply(): SchemaBatchWriteSpansRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchWriteSpansRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchWriteSpansRequestMutableBuilder[Self <: SchemaBatchWriteSpansRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpans(value: js.Array[SchemaSpan]): Self = StObject.set(x, "spans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpansUndefined: Self = StObject.set(x, "spans", js.undefined)
    
    @scala.inline
    def setSpansVarargs(value: SchemaSpan*): Self = StObject.set(x, "spans", js.Array(value :_*))
  }
}
