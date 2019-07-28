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
    val __obj = js.Dynamic.literal(createdById = createdById, createdByName = createdByName, createdDate = createdDate, fileName = fileName, fullName = fullName, id = id, lastModifiedById = lastModifiedById, lastModifiedByName = lastModifiedByName, lastModifiedDate = lastModifiedDate)
    __obj.updateDynamic("type")(`type`)
    if (manageableState != null) __obj.updateDynamic("manageableState")(manageableState)
    if (namespacePrefix != null) __obj.updateDynamic("namespacePrefix")(namespacePrefix)
    __obj.asInstanceOf[FileProperties]
  }
}

