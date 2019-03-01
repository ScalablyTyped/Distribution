package typings
package jsforceLib.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMetadataInfo extends js.Object {
  var currentName: java.lang.String
  var metadata: MetadataInfo
}

object UpdateMetadataInfo {
  @scala.inline
  def apply(currentName: java.lang.String, metadata: MetadataInfo): UpdateMetadataInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentName")(currentName)
    __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[UpdateMetadataInfo]
  }
}

