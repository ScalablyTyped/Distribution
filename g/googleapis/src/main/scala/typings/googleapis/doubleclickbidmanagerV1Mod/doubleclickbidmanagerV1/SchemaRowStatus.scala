package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the upload status of a row in the request.
  */
@js.native
trait SchemaRowStatus extends js.Object {
  /**
    * Whether the stored entity is changed as a result of upload.
    */
  var changed: js.UndefOr[Boolean] = js.native
  /**
    * Entity Id.
    */
  var entityId: js.UndefOr[String] = js.native
  /**
    * Entity name.
    */
  var entityName: js.UndefOr[String] = js.native
  /**
    * Reasons why the entity can&#39;t be uploaded.
    */
  var errors: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether the entity is persisted.
    */
  var persisted: js.UndefOr[Boolean] = js.native
  /**
    * Row number.
    */
  var rowNumber: js.UndefOr[Double] = js.native
}

object SchemaRowStatus {
  @scala.inline
  def apply(
    changed: js.UndefOr[Boolean] = js.undefined,
    entityId: String = null,
    entityName: String = null,
    errors: js.Array[String] = null,
    persisted: js.UndefOr[Boolean] = js.undefined,
    rowNumber: Int | Double = null
  ): SchemaRowStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(changed)) __obj.updateDynamic("changed")(changed.asInstanceOf[js.Any])
    if (entityId != null) __obj.updateDynamic("entityId")(entityId.asInstanceOf[js.Any])
    if (entityName != null) __obj.updateDynamic("entityName")(entityName.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (!js.isUndefined(persisted)) __obj.updateDynamic("persisted")(persisted.asInstanceOf[js.Any])
    if (rowNumber != null) __obj.updateDynamic("rowNumber")(rowNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRowStatus]
  }
}

