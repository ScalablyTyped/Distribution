package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to check entries against lists.
  */
@js.native
trait SchemaFindThreatMatchesRequest extends js.Object {
  /**
    * The client metadata.
    */
  var client: js.UndefOr[SchemaClientInfo] = js.native
  /**
    * The lists and entries to be checked for matches.
    */
  var threatInfo: js.UndefOr[SchemaThreatInfo] = js.native
}

object SchemaFindThreatMatchesRequest {
  @scala.inline
  def apply(client: SchemaClientInfo = null, threatInfo: SchemaThreatInfo = null): SchemaFindThreatMatchesRequest = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (threatInfo != null) __obj.updateDynamic("threatInfo")(threatInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFindThreatMatchesRequest]
  }
}

