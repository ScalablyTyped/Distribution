package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceSplitRequest extends StObject {
  
  /** Hints for tuning the splitting process. */
  var options: js.UndefOr[SourceSplitOptions] = js.undefined
  
  /** Specification of the source to be split. */
  var source: js.UndefOr[Source] = js.undefined
}
object SourceSplitRequest {
  
  inline def apply(): SourceSplitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSplitRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceSplitRequest] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: SourceSplitOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
