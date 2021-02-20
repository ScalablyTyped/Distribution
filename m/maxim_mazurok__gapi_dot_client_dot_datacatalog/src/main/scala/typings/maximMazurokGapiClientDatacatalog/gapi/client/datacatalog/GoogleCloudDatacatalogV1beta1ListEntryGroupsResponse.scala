package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1ListEntryGroupsResponse extends StObject {
  
  /** EntryGroup details. */
  var entryGroups: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1EntryGroup]] = js.native
  
  /** Token to retrieve the next page of results. It is set to empty if no items remain in results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1ListEntryGroupsResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1ListEntryGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1ListEntryGroupsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1ListEntryGroupsResponseMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1ListEntryGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntryGroups(value: js.Array[GoogleCloudDatacatalogV1beta1EntryGroup]): Self = StObject.set(x, "entryGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryGroupsUndefined: Self = StObject.set(x, "entryGroups", js.undefined)
    
    @scala.inline
    def setEntryGroupsVarargs(value: GoogleCloudDatacatalogV1beta1EntryGroup*): Self = StObject.set(x, "entryGroups", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
