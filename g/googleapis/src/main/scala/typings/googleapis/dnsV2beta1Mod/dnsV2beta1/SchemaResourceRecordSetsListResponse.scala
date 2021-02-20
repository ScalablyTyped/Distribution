package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaResourceRecordSetsListResponse extends StObject {
  
  var header: js.UndefOr[SchemaResponseHeader] = js.native
  
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  var rrsets: js.UndefOr[js.Array[SchemaResourceRecordSet]] = js.native
}
object SchemaResourceRecordSetsListResponse {
  
  @scala.inline
  def apply(): SchemaResourceRecordSetsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceRecordSetsListResponse]
  }
  
  @scala.inline
  implicit class SchemaResourceRecordSetsListResponseMutableBuilder[Self <: SchemaResourceRecordSetsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: SchemaResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRrsets(value: js.Array[SchemaResourceRecordSet]): Self = StObject.set(x, "rrsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRrsetsUndefined: Self = StObject.set(x, "rrsets", js.undefined)
    
    @scala.inline
    def setRrsetsVarargs(value: SchemaResourceRecordSet*): Self = StObject.set(x, "rrsets", js.Array(value :_*))
  }
}
