package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Operation resource. For successful operations that return an Operation
  * resource, only the fields relevant to the operation are populated in the
  * resource.
  */
@js.native
trait SchemaOperation extends js.Object {
  /**
    * The time this operation finished in UTC timezone in RFC 3339 format, for
    * example 2012-11-15T16:19:00.094Z.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * If errors occurred during processing of this operation, this field will
    * be populated.
    */
  var error: js.UndefOr[SchemaOperationErrors] = js.native
  /**
    * The context for export operation, if applicable.
    */
  var exportContext: js.UndefOr[SchemaExportContext] = js.native
  /**
    * The context for import operation, if applicable.
    */
  var importContext: js.UndefOr[SchemaImportContext] = js.native
  /**
    * The time this operation was enqueued in UTC timezone in RFC 3339 format,
    * for example 2012-11-15T16:19:00.094Z.
    */
  var insertTime: js.UndefOr[String] = js.native
  /**
    * This is always sql#operation.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * An identifier that uniquely identifies the operation. You can use this
    * identifier to retrieve the Operations resource that has information about
    * the operation.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The type of the operation. Valid values are CREATE, DELETE, UPDATE,
    * RESTART, IMPORT, EXPORT, BACKUP_VOLUME, RESTORE_VOLUME, CREATE_USER,
    * DELETE_USER, CREATE_DATABASE, DELETE_DATABASE .
    */
  var operationType: js.UndefOr[String] = js.native
  /**
    * The URI of this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The time this operation actually started in UTC timezone in RFC 3339
    * format, for example 2012-11-15T16:19:00.094Z.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * The status of an operation. Valid values are PENDING, RUNNING, DONE,
    * UNKNOWN.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Name of the database instance related to this operation.
    */
  var targetId: js.UndefOr[String] = js.native
  var targetLink: js.UndefOr[String] = js.native
  /**
    * The project ID of the target instance related to this operation.
    */
  var targetProject: js.UndefOr[String] = js.native
  /**
    * The email address of the user who initiated this operation.
    */
  var user: js.UndefOr[String] = js.native
}

object SchemaOperation {
  @scala.inline
  def apply(
    endTime: String = null,
    error: SchemaOperationErrors = null,
    exportContext: SchemaExportContext = null,
    importContext: SchemaImportContext = null,
    insertTime: String = null,
    kind: String = null,
    name: String = null,
    operationType: String = null,
    selfLink: String = null,
    startTime: String = null,
    status: String = null,
    targetId: String = null,
    targetLink: String = null,
    targetProject: String = null,
    user: String = null
  ): SchemaOperation = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (exportContext != null) __obj.updateDynamic("exportContext")(exportContext.asInstanceOf[js.Any])
    if (importContext != null) __obj.updateDynamic("importContext")(importContext.asInstanceOf[js.Any])
    if (insertTime != null) __obj.updateDynamic("insertTime")(insertTime.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    if (targetLink != null) __obj.updateDynamic("targetLink")(targetLink.asInstanceOf[js.Any])
    if (targetProject != null) __obj.updateDynamic("targetProject")(targetProject.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperation]
  }
}

