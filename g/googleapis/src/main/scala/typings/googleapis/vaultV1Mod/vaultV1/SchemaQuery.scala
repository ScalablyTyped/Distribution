package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A query definition relevant for search &amp; export.
  */
@js.native
trait SchemaQuery extends js.Object {
  
  /**
    * When &#39;ACCOUNT&#39; is chosen as search method, account_info needs to
    * be specified.
    */
  var accountInfo: js.UndefOr[SchemaAccountInfo] = js.native
  
  /**
    * The corpus to search.
    */
  var corpus: js.UndefOr[String] = js.native
  
  /**
    * The data source to search from.
    */
  var dataScope: js.UndefOr[String] = js.native
  
  /**
    * For Drive search, specify more options in this field.
    */
  var driveOptions: js.UndefOr[SchemaDriveOptions] = js.native
  
  /**
    * The end time range for the search query. These timestamps are in GMT and
    * rounded down to the start of the given date.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * When &#39;ROOM&#39; is chosen as search method, hangout_chats_info needs
    * to be specified. (read-only)
    */
  var hangoutsChatInfo: js.UndefOr[SchemaHangoutsChatInfo] = js.native
  
  /**
    * For hangouts chat search, specify more options in this field. (read-only)
    */
  var hangoutsChatOptions: js.UndefOr[SchemaHangoutsChatOptions] = js.native
  
  /**
    * For mail search, specify more options in this field.
    */
  var mailOptions: js.UndefOr[SchemaMailOptions] = js.native
  
  /**
    * When &#39;ORG_UNIT&#39; is chosen as as search method, org_unit_info
    * needs to be specified.
    */
  var orgUnitInfo: js.UndefOr[SchemaOrgUnitInfo] = js.native
  
  /**
    * The search method to use.
    */
  var searchMethod: js.UndefOr[String] = js.native
  
  /**
    * The start time range for the search query. These timestamps are in GMT
    * and rounded down to the start of the given date.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * When &#39;TEAM_DRIVE&#39; is chosen as search method, team_drive_info
    * needs to be specified.
    */
  var teamDriveInfo: js.UndefOr[SchemaTeamDriveInfo] = js.native
  
  /**
    * The corpus-specific &lt;a
    * href=&quot;https://support.google.com/vault/answer/2474474&quot;&gt;search
    * operators&lt;/a&gt; used to generate search results.
    */
  var terms: js.UndefOr[String] = js.native
  
  /**
    * The time zone name. It should be an IANA TZ name, such as
    * &quot;America/Los_Angeles&quot;. For more information, see &lt;a
    * href=&quot;https://en.wikipedia.org/wiki/List_of_tz_database_time_zones&quot;&gt;Time
    * Zone&lt;/a&gt;.
    */
  var timeZone: js.UndefOr[String] = js.native
}
object SchemaQuery {
  
  @scala.inline
  def apply(): SchemaQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuery]
  }
  
  @scala.inline
  implicit class SchemaQueryOps[Self <: SchemaQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountInfo(value: SchemaAccountInfo): Self = this.set("accountInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountInfo: Self = this.set("accountInfo", js.undefined)
    
    @scala.inline
    def setCorpus(value: String): Self = this.set("corpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorpus: Self = this.set("corpus", js.undefined)
    
    @scala.inline
    def setDataScope(value: String): Self = this.set("dataScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataScope: Self = this.set("dataScope", js.undefined)
    
    @scala.inline
    def setDriveOptions(value: SchemaDriveOptions): Self = this.set("driveOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveOptions: Self = this.set("driveOptions", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setHangoutsChatInfo(value: SchemaHangoutsChatInfo): Self = this.set("hangoutsChatInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHangoutsChatInfo: Self = this.set("hangoutsChatInfo", js.undefined)
    
    @scala.inline
    def setHangoutsChatOptions(value: SchemaHangoutsChatOptions): Self = this.set("hangoutsChatOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHangoutsChatOptions: Self = this.set("hangoutsChatOptions", js.undefined)
    
    @scala.inline
    def setMailOptions(value: SchemaMailOptions): Self = this.set("mailOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMailOptions: Self = this.set("mailOptions", js.undefined)
    
    @scala.inline
    def setOrgUnitInfo(value: SchemaOrgUnitInfo): Self = this.set("orgUnitInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrgUnitInfo: Self = this.set("orgUnitInfo", js.undefined)
    
    @scala.inline
    def setSearchMethod(value: String): Self = this.set("searchMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchMethod: Self = this.set("searchMethod", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setTeamDriveInfo(value: SchemaTeamDriveInfo): Self = this.set("teamDriveInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamDriveInfo: Self = this.set("teamDriveInfo", js.undefined)
    
    @scala.inline
    def setTerms(value: String): Self = this.set("terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerms: Self = this.set("terms", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
}
