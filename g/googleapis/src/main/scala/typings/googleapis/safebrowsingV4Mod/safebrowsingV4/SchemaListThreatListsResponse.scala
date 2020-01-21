package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListThreatListsResponse extends js.Object {
  /**
    * The lists available for download by the client.
    */
  var threatLists: js.UndefOr[js.Array[SchemaThreatListDescriptor]] = js.native
}

object SchemaListThreatListsResponse {
  @scala.inline
  def apply(threatLists: js.Array[SchemaThreatListDescriptor] = null): SchemaListThreatListsResponse = {
    val __obj = js.Dynamic.literal()
    if (threatLists != null) __obj.updateDynamic("threatLists")(threatLists.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListThreatListsResponse]
  }
}

