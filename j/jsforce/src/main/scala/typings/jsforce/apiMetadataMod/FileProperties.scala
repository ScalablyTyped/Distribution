package typings.jsforce.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileProperties extends js.Object {
  var createdById: String
  var createdByName: String
  var createdDate: String
  var fileName: String
  var fullName: String
  var id: String
  var lastModifiedById: String
  var lastModifiedByName: String
  var lastModifiedDate: String
  var manageableState: js.UndefOr[String] = js.undefined
  var namespacePrefix: js.UndefOr[String] = js.undefined
  var `type`: String
}

object FileProperties {
  @scala.inline
  def apply(
    createdById: String,
    createdByName: String,
    createdDate: String,
    fileName: String,
    fullName: String,
    id: String,
    lastModifiedById: String,
    lastModifiedByName: String,
    lastModifiedDate: String,
    `type`: String,
    manageableState: String = null,
    namespacePrefix: String = null
  ): FileProperties = {
    val __obj = js.Dynamic.literal(createdById = createdById.asInstanceOf[js.Any], createdByName = createdByName.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModifiedById = lastModifiedById.asInstanceOf[js.Any], lastModifiedByName = lastModifiedByName.asInstanceOf[js.Any], lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (manageableState != null) __obj.updateDynamic("manageableState")(manageableState.asInstanceOf[js.Any])
    if (namespacePrefix != null) __obj.updateDynamic("namespacePrefix")(namespacePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileProperties]
  }
}

