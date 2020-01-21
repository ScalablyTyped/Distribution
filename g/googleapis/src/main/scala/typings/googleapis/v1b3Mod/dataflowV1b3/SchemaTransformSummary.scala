package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of the type, names/ids, and input/outputs for a transform.
  */
@js.native
trait SchemaTransformSummary extends js.Object {
  /**
    * Transform-specific display data.
    */
  var displayData: js.UndefOr[js.Array[SchemaDisplayData]] = js.native
  /**
    * SDK generated id of this transform instance.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * User names for all collection inputs to this transform.
    */
  var inputCollectionName: js.UndefOr[js.Array[String]] = js.native
  /**
    * Type of transform.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * User provided name for this transform instance.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * User  names for all collection outputs to this transform.
    */
  var outputCollectionName: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTransformSummary {
  @scala.inline
  def apply(
    displayData: js.Array[SchemaDisplayData] = null,
    id: String = null,
    inputCollectionName: js.Array[String] = null,
    kind: String = null,
    name: String = null,
    outputCollectionName: js.Array[String] = null
  ): SchemaTransformSummary = {
    val __obj = js.Dynamic.literal()
    if (displayData != null) __obj.updateDynamic("displayData")(displayData.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputCollectionName != null) __obj.updateDynamic("inputCollectionName")(inputCollectionName.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outputCollectionName != null) __obj.updateDynamic("outputCollectionName")(outputCollectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTransformSummary]
  }
}

