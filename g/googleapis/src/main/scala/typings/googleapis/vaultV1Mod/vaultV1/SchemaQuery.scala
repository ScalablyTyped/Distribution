package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A query definition relevant for search &amp; export.
  */
trait SchemaQuery extends StObject {
  
  /**
    * When &#39;ACCOUNT&#39; is chosen as search method, account_info needs to
    * be specified.
    */
  var accountInfo: js.UndefOr[SchemaAccountInfo] = js.undefined
  
  /**
    * The corpus to search.
    */
  var corpus: js.UndefOr[String] = js.undefined
  
  /**
    * The data source to search from.
    */
  var dataScope: js.UndefOr[String] = js.undefined
  
  /**
    * For Drive search, specify more options in this field.
    */
  var driveOptions: js.UndefOr[SchemaDriveOptions] = js.undefined
  
  /**
    * The end time range for the search query. These timestamps are in GMT and
    * rounded down to the start of the given date.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * When &#39;ROOM&#39; is chosen as search method, hangout_chats_info needs
    * to be specified. (read-only)
    */
  var hangoutsChatInfo: js.UndefOr[SchemaHangoutsChatInfo] = js.undefined
  
  /**
    * For hangouts chat search, specify more options in this field. (read-only)
    */
  var hangoutsChatOptions: js.UndefOr[SchemaHangoutsChatOptions] = js.undefined
  
  /**
    * For mail search, specify more options in this field.
    */
  var mailOptions: js.UndefOr[SchemaMailOptions] = js.undefined
  
  /**
    * When &#39;ORG_UNIT&#39; is chosen as as search method, org_unit_info
    * needs to be specified.
    */
  var orgUnitInfo: js.UndefOr[SchemaOrgUnitInfo] = js.undefined
  
  /**
    * The search method to use.
    */
  var searchMethod: js.UndefOr[String] = js.undefined
  
  /**
    * The start time range for the search query. These timestamps are in GMT
    * and rounded down to the start of the given date.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * When &#39;TEAM_DRIVE&#39; is chosen as search method, team_drive_info
    * needs to be specified.
    */
  var teamDriveInfo: js.UndefOr[SchemaTeamDriveInfo] = js.undefined
  
  /**
    * The corpus-specific &lt;a
    * href=&quot;https://support.google.com/vault/answer/2474474&quot;&gt;search
    * operators&lt;/a&gt; used to generate search results.
    */
  var terms: js.UndefOr[String] = js.undefined
  
  /**
    * The time zone name. It should be an IANA TZ name, such as
    * &quot;America/Los_Angeles&quot;. For more information, see &lt;a
    * href=&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones&quot;&gt;Time
    * Zone&lt;/a&gt;.
    */
  var timeZone: js.UndefOr[String] = js.undefined
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
    
    inline def setCorpusUndefined: Self = StObject.set(x, "corpus", js.undefined)
    
    inline def setDataScope(value: String): Self = StObject.set(x, "dataScope", value.asInstanceOf[js.Any])
    
    inline def setDataScopeUndefined: Self = StObject.set(x, "dataScope", js.undefined)
    
    inline def setDriveOptions(value: SchemaDriveOptions): Self = StObject.set(x, "driveOptions", value.asInstanceOf[js.Any])
    
    inline def setDriveOptionsUndefined: Self = StObject.set(x, "driveOptions", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setHangoutsChatInfo(value: SchemaHangoutsChatInfo): Self = StObject.set(x, "hangoutsChatInfo", value.asInstanceOf[js.Any])
    
    inline def setHangoutsChatInfoUndefined: Self = StObject.set(x, "hangoutsChatInfo", js.undefined)
    
    inline def setHangoutsChatOptions(value: SchemaHangoutsChatOptions): Self = StObject.set(x, "hangoutsChatOptions", value.asInstanceOf[js.Any])
    
    inline def setHangoutsChatOptionsUndefined: Self = StObject.set(x, "hangoutsChatOptions", js.undefined)
    
    inline def setMailOptions(value: SchemaMailOptions): Self = StObject.set(x, "mailOptions", value.asInstanceOf[js.Any])
    
    inline def setMailOptionsUndefined: Self = StObject.set(x, "mailOptions", js.undefined)
    
    inline def setOrgUnitInfo(value: SchemaOrgUnitInfo): Self = StObject.set(x, "orgUnitInfo", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitInfoUndefined: Self = StObject.set(x, "orgUnitInfo", js.undefined)
    
    inline def setSearchMethod(value: String): Self = StObject.set(x, "searchMethod", value.asInstanceOf[js.Any])
    
    inline def setSearchMethodUndefined: Self = StObject.set(x, "searchMethod", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTeamDriveInfo(value: SchemaTeamDriveInfo): Self = StObject.set(x, "teamDriveInfo", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveInfoUndefined: Self = StObject.set(x, "teamDriveInfo", js.undefined)
    
    inline def setTerms(value: String): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
