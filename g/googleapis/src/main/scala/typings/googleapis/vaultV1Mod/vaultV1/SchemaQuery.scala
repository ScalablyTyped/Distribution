package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    accountInfo: SchemaAccountInfo = null,
    corpus: String = null,
    dataScope: String = null,
    driveOptions: SchemaDriveOptions = null,
    endTime: String = null,
    hangoutsChatInfo: SchemaHangoutsChatInfo = null,
    hangoutsChatOptions: SchemaHangoutsChatOptions = null,
    mailOptions: SchemaMailOptions = null,
    orgUnitInfo: SchemaOrgUnitInfo = null,
    searchMethod: String = null,
    startTime: String = null,
    teamDriveInfo: SchemaTeamDriveInfo = null,
    terms: String = null,
    timeZone: String = null
  ): SchemaQuery = {
    val __obj = js.Dynamic.literal()
    if (accountInfo != null) __obj.updateDynamic("accountInfo")(accountInfo.asInstanceOf[js.Any])
    if (corpus != null) __obj.updateDynamic("corpus")(corpus.asInstanceOf[js.Any])
    if (dataScope != null) __obj.updateDynamic("dataScope")(dataScope.asInstanceOf[js.Any])
    if (driveOptions != null) __obj.updateDynamic("driveOptions")(driveOptions.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (hangoutsChatInfo != null) __obj.updateDynamic("hangoutsChatInfo")(hangoutsChatInfo.asInstanceOf[js.Any])
    if (hangoutsChatOptions != null) __obj.updateDynamic("hangoutsChatOptions")(hangoutsChatOptions.asInstanceOf[js.Any])
    if (mailOptions != null) __obj.updateDynamic("mailOptions")(mailOptions.asInstanceOf[js.Any])
    if (orgUnitInfo != null) __obj.updateDynamic("orgUnitInfo")(orgUnitInfo.asInstanceOf[js.Any])
    if (searchMethod != null) __obj.updateDynamic("searchMethod")(searchMethod.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (teamDriveInfo != null) __obj.updateDynamic("teamDriveInfo")(teamDriveInfo.asInstanceOf[js.Any])
    if (terms != null) __obj.updateDynamic("terms")(terms.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQuery]
  }
}

