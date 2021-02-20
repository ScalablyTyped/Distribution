package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mobile app List Response
  */
@js.native
trait SchemaMobileAppsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#mobileAppsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Mobile apps collection.
    */
  var mobileApps: js.UndefOr[js.Array[SchemaMobileApp]] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaMobileAppsListResponse {
  
  @scala.inline
  def apply(): SchemaMobileAppsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileAppsListResponse]
  }
  
  @scala.inline
  implicit class SchemaMobileAppsListResponseMutableBuilder[Self <: SchemaMobileAppsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMobileApps(value: js.Array[SchemaMobileApp]): Self = StObject.set(x, "mobileApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileAppsUndefined: Self = StObject.set(x, "mobileApps", js.undefined)
    
    @scala.inline
    def setMobileAppsVarargs(value: SchemaMobileApp*): Self = StObject.set(x, "mobileApps", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
