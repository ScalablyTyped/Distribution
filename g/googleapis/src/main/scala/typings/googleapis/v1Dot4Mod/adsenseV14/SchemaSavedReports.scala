package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSavedReports extends StObject {
  
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The saved reports returned in this list response.
    */
  var items: js.UndefOr[js.Array[SchemaSavedReport]] = js.undefined
  
  /**
    * Kind of list this is, in this case adsense#savedReports.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Continuation token used to page through saved reports. To retrieve the
    * next page of results, set the next request&#39;s &quot;pageToken&quot;
    * value to this.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaSavedReports {
  
  @scala.inline
  def apply(): SchemaSavedReports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSavedReports]
  }
  
  @scala.inline
  implicit class SchemaSavedReportsMutableBuilder[Self <: SchemaSavedReports] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaSavedReport]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaSavedReport*): Self = StObject.set(x, "items", js.Array(value :_*))
    
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
