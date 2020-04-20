package typings.jupyterlabExtensionmanager.listingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListingApi extends js.Object {
  var blacklist: js.Array[IListEntry]
  var blacklist_uris: js.Array[String]
  var whitelist: js.Array[IListEntry]
  var whitelist_uris: js.Array[String]
}

object IListingApi {
  @scala.inline
  def apply(
    blacklist: js.Array[IListEntry],
    blacklist_uris: js.Array[String],
    whitelist: js.Array[IListEntry],
    whitelist_uris: js.Array[String]
  ): IListingApi = {
    val __obj = js.Dynamic.literal(blacklist = blacklist.asInstanceOf[js.Any], blacklist_uris = blacklist_uris.asInstanceOf[js.Any], whitelist = whitelist.asInstanceOf[js.Any], whitelist_uris = whitelist_uris.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListingApi]
  }
}

