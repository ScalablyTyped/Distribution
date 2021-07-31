package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderreportsListDisbursementsResponse extends StObject {
  
  /**
    * The list of disbursements.
    */
  var disbursements: js.UndefOr[js.Array[SchemaOrderReportDisbursement]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#orderreportsListDisbursementsResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The token for the retrieval of the next page of disbursements.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaOrderreportsListDisbursementsResponse {
  
  @scala.inline
  def apply(): SchemaOrderreportsListDisbursementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderreportsListDisbursementsResponse]
  }
  
  @scala.inline
  implicit class SchemaOrderreportsListDisbursementsResponseMutableBuilder[Self <: SchemaOrderreportsListDisbursementsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisbursements(value: js.Array[SchemaOrderReportDisbursement]): Self = StObject.set(x, "disbursements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisbursementsUndefined: Self = StObject.set(x, "disbursements", js.undefined)
    
    @scala.inline
    def setDisbursementsVarargs(value: SchemaOrderReportDisbursement*): Self = StObject.set(x, "disbursements", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
