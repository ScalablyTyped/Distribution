package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePeopleSearchdirectorypeople
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Additional data to merge into the directory sources if they are connected through verified join keys such as email addresses or phone numbers.
    */
  var mergeSources: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. The number of people to include in the response. Valid values are between 1 and 500, inclusive. Defaults to 100 if not set or set to 0.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. A page token, received from a previous response `next_page_token`. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `SearchDirectoryPeople` must match the first call that provided the page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Prefix query that matches fields in the person. Does NOT use the read_mask for determining what fields to match.
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A field mask to restrict which fields on each person are returned. Multiple fields can be specified by separating them with commas. Valid values are: * addresses * ageRanges * biographies * birthdays * calendarUrls * clientData * coverPhotos * emailAddresses * events * externalIds * genders * imClients * interests * locales * locations * memberships * metadata * miscKeywords * names * nicknames * occupations * organizations * phoneNumbers * photos * relations * sipAddresses * skills * urls * userDefined
    */
  var readMask: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Directory sources to return.
    */
  var sources: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourcePeopleSearchdirectorypeople {
  
  inline def apply(): ParamsResourcePeopleSearchdirectorypeople = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePeopleSearchdirectorypeople]
  }
  
  extension [Self <: ParamsResourcePeopleSearchdirectorypeople](x: Self) {
    
    inline def setMergeSources(value: js.Array[String]): Self = StObject.set(x, "mergeSources", value.asInstanceOf[js.Any])
    
    inline def setMergeSourcesUndefined: Self = StObject.set(x, "mergeSources", js.undefined)
    
    inline def setMergeSourcesVarargs(value: String*): Self = StObject.set(x, "mergeSources", js.Array(value*))
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setReadMask(value: String): Self = StObject.set(x, "readMask", value.asInstanceOf[js.Any])
    
    inline def setReadMaskUndefined: Self = StObject.set(x, "readMask", js.undefined)
    
    inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
