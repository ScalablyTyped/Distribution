package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkEditSitesResponse extends StObject {
  
  /** The list of sites that have been successfully created. This list will be absent if empty. */
  var sites: js.UndefOr[js.Array[Site]] = js.undefined
}
object BulkEditSitesResponse {
  
  @scala.inline
  def apply(): BulkEditSitesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditSitesResponse]
  }
  
  @scala.inline
  implicit class BulkEditSitesResponseMutableBuilder[Self <: BulkEditSitesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSites(value: js.Array[Site]): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
    
    @scala.inline
    def setSitesVarargs(value: Site*): Self = StObject.set(x, "sites", js.Array(value :_*))
  }
}
