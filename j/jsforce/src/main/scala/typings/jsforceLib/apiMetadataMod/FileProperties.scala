package typings
package jsforceLib.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileProperties extends js.Object {
  var createdById: java.lang.String
  var createdByName: java.lang.String
  var createdDate: java.lang.String
  var fileName: java.lang.String
  var fullName: java.lang.String
  var id: java.lang.String
  var lastModifiedById: java.lang.String
  var lastModifiedByName: java.lang.String
  var lastModifiedDate: java.lang.String
  var manageableState: js.UndefOr[java.lang.String] = js.undefined
  var namespacePrefix: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object FileProperties {
  @scala.inline
  def apply(
    createdById: java.lang.String,
    createdByName: java.lang.String,
    createdDate: java.lang.String,
    fileName: java.lang.String,
    fullName: java.lang.String,
    id: java.lang.String,
    lastModifiedById: java.lang.String,
    lastModifiedByName: java.lang.String,
    lastModifiedDate: java.lang.String,
    `type`: java.lang.String,
    manageableState: java.lang.String = null,
    namespacePrefix: java.lang.String = null
  ): FileProperties = {
    val __obj = js.Dynamic.literal(createdById = createdById, createdByName = createdByName, createdDate = createdDate, fileName = fileName, fullName = fullName, id = id, lastModifiedById = lastModifiedById, lastModifiedByName = lastModifiedByName, lastModifiedDate = lastModifiedDate)
    __obj.updateDynamic("type")(`type`)
    if (manageableState != null) __obj.updateDynamic("manageableState")(manageableState)
    if (namespacePrefix != null) __obj.updateDynamic("namespacePrefix")(namespacePrefix)
    __obj.asInstanceOf[FileProperties]
  }
}

