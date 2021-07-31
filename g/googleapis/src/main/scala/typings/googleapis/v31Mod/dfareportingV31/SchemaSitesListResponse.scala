package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Site List Response
  */
trait SchemaSitesListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#sitesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Site collection.
    */
  var sites: js.UndefOr[js.Array[SchemaSite]] = js.undefined
}
object SchemaSitesListResponse {
  
  @scala.inline
  def apply(): SchemaSitesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSitesListResponse]
  }
  
  @scala.inline
  implicit class SchemaSitesListResponseMutableBuilder[Self <: SchemaSitesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSites(value: js.Array[SchemaSite]): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
    
    @scala.inline
    def setSitesVarargs(value: SchemaSite*): Self = StObject.set(x, "sites", js.Array(value :_*))
  }
}
