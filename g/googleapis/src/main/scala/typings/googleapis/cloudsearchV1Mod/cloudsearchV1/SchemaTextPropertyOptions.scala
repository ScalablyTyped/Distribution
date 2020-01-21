package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for text properties.
  */
@js.native
trait SchemaTextPropertyOptions extends js.Object {
  /**
    * If set, describes how the property should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaTextOperatorOptions] = js.native
  /**
    * Indicates the search quality importance of the tokens within the field
    * when used for retrieval.
    */
  var retrievalImportance: js.UndefOr[SchemaRetrievalImportance] = js.native
}

object SchemaTextPropertyOptions {
  @scala.inline
  def apply(
    operatorOptions: SchemaTextOperatorOptions = null,
    retrievalImportance: SchemaRetrievalImportance = null
  ): SchemaTextPropertyOptions = {
    val __obj = js.Dynamic.literal()
    if (operatorOptions != null) __obj.updateDynamic("operatorOptions")(operatorOptions.asInstanceOf[js.Any])
    if (retrievalImportance != null) __obj.updateDynamic("retrievalImportance")(retrievalImportance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTextPropertyOptions]
  }
}

