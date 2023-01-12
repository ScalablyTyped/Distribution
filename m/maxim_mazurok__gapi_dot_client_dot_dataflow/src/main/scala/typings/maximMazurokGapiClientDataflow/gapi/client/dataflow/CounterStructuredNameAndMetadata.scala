package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CounterStructuredNameAndMetadata extends StObject {
  
  /** Metadata associated with a counter */
  var metadata: js.UndefOr[CounterMetadata] = js.undefined
  
  /** Structured name of the counter. */
  var name: js.UndefOr[CounterStructuredName] = js.undefined
}
object CounterStructuredNameAndMetadata {
  
  inline def apply(): CounterStructuredNameAndMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterStructuredNameAndMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CounterStructuredNameAndMetadata] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: CounterMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: CounterStructuredName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
