package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaThreatHit extends js.Object {
  /**
    * Client-reported identification.
    */
  var clientInfo: js.UndefOr[SchemaClientInfo] = js.native
  /**
    * The threat entry responsible for the hit. Full hash should be reported
    * for hash-based hits.
    */
  var entry: js.UndefOr[SchemaThreatEntry] = js.native
  /**
    * The platform type reported.
    */
  var platformType: js.UndefOr[String] = js.native
  /**
    * The resources related to the threat hit.
    */
  var resources: js.UndefOr[js.Array[SchemaThreatSource]] = js.native
  /**
    * The threat type reported.
    */
  var threatType: js.UndefOr[String] = js.native
  /**
    * Details about the user that encountered the threat.
    */
  var userInfo: js.UndefOr[SchemaUserInfo] = js.native
}

object SchemaThreatHit {
  @scala.inline
  def apply(
    clientInfo: SchemaClientInfo = null,
    entry: SchemaThreatEntry = null,
    platformType: String = null,
    resources: js.Array[SchemaThreatSource] = null,
    threatType: String = null,
    userInfo: SchemaUserInfo = null
  ): SchemaThreatHit = {
    val __obj = js.Dynamic.literal()
    if (clientInfo != null) __obj.updateDynamic("clientInfo")(clientInfo.asInstanceOf[js.Any])
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (platformType != null) __obj.updateDynamic("platformType")(platformType.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (threatType != null) __obj.updateDynamic("threatType")(threatType.asInstanceOf[js.Any])
    if (userInfo != null) __obj.updateDynamic("userInfo")(userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaThreatHit]
  }
}

