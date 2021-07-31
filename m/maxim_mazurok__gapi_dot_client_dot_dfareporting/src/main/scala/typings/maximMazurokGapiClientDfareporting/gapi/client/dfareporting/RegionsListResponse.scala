package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#regionsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Region collection. */
  var regions: js.UndefOr[js.Array[Region]] = js.undefined
}
object RegionsListResponse {
  
  @scala.inline
  def apply(): RegionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionsListResponse]
  }
  
  @scala.inline
  implicit class RegionsListResponseMutableBuilder[Self <: RegionsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRegions(value: js.Array[Region]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: Region*): Self = StObject.set(x, "regions", js.Array(value :_*))
  }
}
