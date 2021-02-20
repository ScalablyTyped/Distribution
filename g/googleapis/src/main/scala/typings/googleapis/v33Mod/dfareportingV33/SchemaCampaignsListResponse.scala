package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Campaign List Response
  */
@js.native
trait SchemaCampaignsListResponse extends StObject {
  
  /**
    * Campaign collection.
    */
  var campaigns: js.UndefOr[js.Array[SchemaCampaign]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#campaignsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaCampaignsListResponse {
  
  @scala.inline
  def apply(): SchemaCampaignsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCampaignsListResponse]
  }
  
  @scala.inline
  implicit class SchemaCampaignsListResponseMutableBuilder[Self <: SchemaCampaignsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaigns(value: js.Array[SchemaCampaign]): Self = StObject.set(x, "campaigns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignsUndefined: Self = StObject.set(x, "campaigns", js.undefined)
    
    @scala.inline
    def setCampaignsVarargs(value: SchemaCampaign*): Self = StObject.set(x, "campaigns", js.Array(value :_*))
    
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
