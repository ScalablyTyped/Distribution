package typings.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetrieveResult extends js.Object {
  var fileProperties: js.Array[FileProperties]
  var id: String
  var messages: js.Array[RetrieveMessage]
  var zipFile: String
}

object RetrieveResult {
  @scala.inline
  def apply(
    fileProperties: js.Array[FileProperties],
    id: String,
    messages: js.Array[RetrieveMessage],
    zipFile: String
  ): RetrieveResult = {
    val __obj = js.Dynamic.literal(fileProperties = fileProperties.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], zipFile = zipFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveResult]
  }
}

