package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversionsBatchInsertResponse extends StObject {
  
  /** Indicates that some or all conversions failed to insert. */
  var hasFailures: js.UndefOr[Boolean] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversionsBatchInsertResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The insert status of each conversion. Statuses are returned in the same order that conversions are inserted. */
  var status: js.UndefOr[js.Array[ConversionStatus]] = js.undefined
}
object ConversionsBatchInsertResponse {
  
  @scala.inline
  def apply(): ConversionsBatchInsertResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionsBatchInsertResponse]
  }
  
  @scala.inline
  implicit class ConversionsBatchInsertResponseMutableBuilder[Self <: ConversionsBatchInsertResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasFailures(value: Boolean): Self = StObject.set(x, "hasFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasFailuresUndefined: Self = StObject.set(x, "hasFailures", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setStatus(value: js.Array[ConversionStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStatusVarargs(value: ConversionStatus*): Self = StObject.set(x, "status", js.Array(value :_*))
  }
}
