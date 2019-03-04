package typings
package jsforceLib.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetrieveResult extends js.Object {
  var fileProperties: js.Array[FileProperties]
  var id: java.lang.String
  var messages: js.Array[js.Object]
  var zipFile: java.lang.String
}

object RetrieveResult {
  @scala.inline
  def apply(
    fileProperties: js.Array[FileProperties],
    id: java.lang.String,
    messages: js.Array[js.Object],
    zipFile: java.lang.String
  ): RetrieveResult = {
    val __obj = js.Dynamic.literal(fileProperties = fileProperties, id = id, messages = messages, zipFile = zipFile)
  
    __obj.asInstanceOf[RetrieveResult]
  }
}

