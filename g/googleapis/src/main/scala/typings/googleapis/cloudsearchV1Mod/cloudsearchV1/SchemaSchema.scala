package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The schema definition for a data source.
  */
@js.native
trait SchemaSchema extends js.Object {
  /**
    * The list of top-level objects for the data source. The maximum number of
    * elements is 10.
    */
  var objectDefinitions: js.UndefOr[js.Array[SchemaObjectDefinition]] = js.native
  /**
    * IDs of the Long Running Operations (LROs) currently running for this
    * schema. After modifying the schema, wait for operations to complete
    * before indexing additional content.
    */
  var operationIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaSchema {
  @scala.inline
  def apply(objectDefinitions: js.Array[SchemaObjectDefinition] = null, operationIds: js.Array[String] = null): SchemaSchema = {
    val __obj = js.Dynamic.literal()
    if (objectDefinitions != null) __obj.updateDynamic("objectDefinitions")(objectDefinitions.asInstanceOf[js.Any])
    if (operationIds != null) __obj.updateDynamic("operationIds")(operationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSchema]
  }
}

