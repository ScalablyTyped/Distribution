package typings
package jsforceLib.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMetadataQuery extends js.Object {
  var folder: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object ListMetadataQuery {
  @scala.inline
  def apply(`type`: java.lang.String, folder: java.lang.String = null): ListMetadataQuery = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (folder != null) __obj.updateDynamic("folder")(folder)
    __obj.asInstanceOf[ListMetadataQuery]
  }
}

