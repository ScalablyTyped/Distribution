package typings.jsforce.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMetadataQuery extends js.Object {
  var folder: js.UndefOr[String] = js.undefined
  var `type`: String
}

object ListMetadataQuery {
  @scala.inline
  def apply(`type`: String, folder: String = null): ListMetadataQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMetadataQuery]
  }
}

