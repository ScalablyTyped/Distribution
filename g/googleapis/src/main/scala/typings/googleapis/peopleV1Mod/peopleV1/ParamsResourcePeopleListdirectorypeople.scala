package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePeopleListdirectorypeople
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Additional data to merge into the directory sources if they are connected through verified join keys such as email addresses or phone numbers.
    */
  var mergeSources: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. The number of people to include in the response. Valid values are between 1 and 1000, inclusive. Defaults to 100 if not set or set to 0.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. A page token, received from a previous response `next_page_token`. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `people.listDirectoryPeople` must match the first call that provided the page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A field mask to restrict which fields on each person are returned. Multiple fields can be specified by separating them with commas. Valid values are: * addresses * ageRanges * biographies * birthdays * calendarUrls * clientData * coverPhotos * emailAddresses * events * externalIds * genders * imClients * interests * locales * locations * memberships * metadata * miscKeywords * names * nicknames * occupations * organizations * phoneNumbers * photos * relations * sipAddresses * skills * urls * userDefined
    */
  var readMask: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Whether the response should return `next_sync_token`. It can be used to get incremental changes since the last request by setting it on the request `sync_token`. More details about sync behavior at `people.listDirectoryPeople`.
    */
  var requestSyncToken: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. Directory sources to return.
    */
  var sources: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. A sync token, received from a previous response `next_sync_token` Provide this to retrieve only the resources changed since the last request. When syncing, all other parameters provided to `people.listDirectoryPeople` must match the first call that provided the sync token. More details about sync behavior at `people.listDirectoryPeople`.
    */
  var syncToken: js.UndefOr[String] = js.undefined
}
object ParamsResourcePeopleListdirectorypeople {
  
  inline def apply(): ParamsResourcePeopleListdirectorypeople = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePeopleListdirectorypeople]
  }
  
  extension [Self <: ParamsResourcePeopleListdirectorypeople](x: Self) {
    
    inline def setMergeSources(value: js.Array[String]): Self = StObject.set(x, "mergeSources", value.asInstanceOf[js.Any])
    
    inline def setMergeSourcesUndefined: Self = StObject.set(x, "mergeSources", js.undefined)
    
    inline def setMergeSourcesVarargs(value: String*): Self = StObject.set(x, "mergeSources", js.Array(value*))
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setReadMask(value: String): Self = StObject.set(x, "readMask", value.asInstanceOf[js.Any])
    
    inline def setReadMaskUndefined: Self = StObject.set(x, "readMask", js.undefined)
    
    inline def setRequestSyncToken(value: Boolean): Self = StObject.set(x, "requestSyncToken", value.asInstanceOf[js.Any])
    
    inline def setRequestSyncTokenUndefined: Self = StObject.set(x, "requestSyncToken", js.undefined)
    
    inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setSyncToken(value: String): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
    
    inline def setSyncTokenUndefined: Self = StObject.set(x, "syncToken", js.undefined)
  }
}
