package typings.jsforce.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMetadataInfo extends js.Object {
  var currentName: String
  var metadata: MetadataInfo
}

object UpdateMetadataInfo {
  @scala.inline
  def apply(currentName: String, metadata: MetadataInfo): UpdateMetadataInfo = {
    val __obj = js.Dynamic.literal(currentName = currentName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateMetadataInfo]
  }
}

