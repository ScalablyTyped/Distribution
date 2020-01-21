package typings.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataInfo extends js.Object {
  var fullName: String
}

object MetadataInfo {
  @scala.inline
  def apply(fullName: String): MetadataInfo = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MetadataInfo]
  }
}

