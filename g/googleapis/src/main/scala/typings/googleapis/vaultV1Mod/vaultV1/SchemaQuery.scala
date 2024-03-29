package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQuery extends StObject {
  
  /**
    * Required when **SearchMethod** is **ACCOUNT**.
    */
  var accountInfo: js.UndefOr[SchemaAccountInfo] = js.undefined
  
  /**
    * The Google Workspace service to search.
    */
  var corpus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The data source to search.
    */
  var dataScope: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set Drive search-specific options.
    */
  var driveOptions: js.UndefOr[SchemaDriveOptions] = js.undefined
  
  /**
    * The end time for the search query. Specify in GMT. The value is rounded to 12 AM on the specified date.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required when **SearchMethod** is **ROOM**. (read-only)
    */
  var hangoutsChatInfo: js.UndefOr[SchemaHangoutsChatInfo] = js.undefined
  
  /**
    * Set Chat search-specific options. (read-only)
    */
  var hangoutsChatOptions: js.UndefOr[SchemaHangoutsChatOptions] = js.undefined
  
  /**
    * Set Gmail search-specific options.
    */
  var mailOptions: js.UndefOr[SchemaMailOptions] = js.undefined
  
  /**
    * The entity to search. This field replaces **searchMethod** to support shared drives. When **searchMethod** is **TEAM_DRIVE**, the response of this field is **SHARED_DRIVE**.
    */
  var method: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required when **SearchMethod** is **ORG_UNIT**.
    */
  var orgUnitInfo: js.UndefOr[SchemaOrgUnitInfo] = js.undefined
  
  /**
    * The search method to use.
    */
  var searchMethod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required when **SearchMethod** is **SHARED_DRIVE**.
    */
  var sharedDriveInfo: js.UndefOr[SchemaSharedDriveInfo] = js.undefined
  
  /**
    * Required when **SearchMethod** is **SITES_URL**.
    */
  var sitesUrlInfo: js.UndefOr[SchemaSitesUrlInfo] = js.undefined
  
  /**
    * The start time for the search query. Specify in GMT. The value is rounded to 12 AM on the specified date.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required when **SearchMethod** is **TEAM_DRIVE**.
    */
  var teamDriveInfo: js.UndefOr[SchemaTeamDriveInfo] = js.undefined
  
  /**
    * Service-specific [search operators](https://support.google.com/vault/answer/2474474) to filter search results.
    */
  var terms: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time zone name. It should be an IANA TZ name, such as "America/Los_Angeles". For a list of time zone names, see [Time Zone](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). For more information about how Vault uses time zones, see [the Vault help center](https://support.google.com/vault/answer/6092995#time).
    */
  var timeZone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set Voice search-specific options.
    */
  var voiceOptions: js.UndefOr[SchemaVoiceOptions] = js.undefined
}
object SchemaQuery {
  
  inline def apply(): SchemaQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuery]
  }
  
  extension [Self <: SchemaQuery](x: Self) {
    
    inline def setAccountInfo(value: SchemaAccountInfo): Self = StObject.set(x, "accountInfo", value.asInstanceOf[js.Any])
    
    inline def setAccountInfoUndefined: Self = StObject.set(x, "accountInfo", js.undefined)
    
    inline def setCorpus(value: String): Self = StObject.set(x, "corpus", value.asInstanceOf[js.Any])
    
    inline def setCorpusNull: Self = StObject.set(x, "corpus", null)
    
    inline def setCorpusUndefined: Self = StObject.set(x, "corpus", js.undefined)
    
    inline def setDataScope(value: String): Self = StObject.set(x, "dataScope", value.asInstanceOf[js.Any])
    
    inline def setDataScopeNull: Self = StObject.set(x, "dataScope", null)
    
    inline def setDataScopeUndefined: Self = StObject.set(x, "dataScope", js.undefined)
    
    inline def setDriveOptions(value: SchemaDriveOptions): Self = StObject.set(x, "driveOptions", value.asInstanceOf[js.Any])
    
    inline def setDriveOptionsUndefined: Self = StObject.set(x, "driveOptions", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setHangoutsChatInfo(value: SchemaHangoutsChatInfo): Self = StObject.set(x, "hangoutsChatInfo", value.asInstanceOf[js.Any])
    
    inline def setHangoutsChatInfoUndefined: Self = StObject.set(x, "hangoutsChatInfo", js.undefined)
    
    inline def setHangoutsChatOptions(value: SchemaHangoutsChatOptions): Self = StObject.set(x, "hangoutsChatOptions", value.asInstanceOf[js.Any])
    
    inline def setHangoutsChatOptionsUndefined: Self = StObject.set(x, "hangoutsChatOptions", js.undefined)
    
    inline def setMailOptions(value: SchemaMailOptions): Self = StObject.set(x, "mailOptions", value.asInstanceOf[js.Any])
    
    inline def setMailOptionsUndefined: Self = StObject.set(x, "mailOptions", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodNull: Self = StObject.set(x, "method", null)
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOrgUnitInfo(value: SchemaOrgUnitInfo): Self = StObject.set(x, "orgUnitInfo", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitInfoUndefined: Self = StObject.set(x, "orgUnitInfo", js.undefined)
    
    inline def setSearchMethod(value: String): Self = StObject.set(x, "searchMethod", value.asInstanceOf[js.Any])
    
    inline def setSearchMethodNull: Self = StObject.set(x, "searchMethod", null)
    
    inline def setSearchMethodUndefined: Self = StObject.set(x, "searchMethod", js.undefined)
    
    inline def setSharedDriveInfo(value: SchemaSharedDriveInfo): Self = StObject.set(x, "sharedDriveInfo", value.asInstanceOf[js.Any])
    
    inline def setSharedDriveInfoUndefined: Self = StObject.set(x, "sharedDriveInfo", js.undefined)
    
    inline def setSitesUrlInfo(value: SchemaSitesUrlInfo): Self = StObject.set(x, "sitesUrlInfo", value.asInstanceOf[js.Any])
    
    inline def setSitesUrlInfoUndefined: Self = StObject.set(x, "sitesUrlInfo", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTeamDriveInfo(value: SchemaTeamDriveInfo): Self = StObject.set(x, "teamDriveInfo", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveInfoUndefined: Self = StObject.set(x, "teamDriveInfo", js.undefined)
    
    inline def setTerms(value: String): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsNull: Self = StObject.set(x, "terms", null)
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setVoiceOptions(value: SchemaVoiceOptions): Self = StObject.set(x, "voiceOptions", value.asInstanceOf[js.Any])
    
    inline def setVoiceOptionsUndefined: Self = StObject.set(x, "voiceOptions", js.undefined)
  }
}
