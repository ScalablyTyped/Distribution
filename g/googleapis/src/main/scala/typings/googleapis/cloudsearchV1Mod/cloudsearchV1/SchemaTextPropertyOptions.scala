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
  def apply(): SchemaTextPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextPropertyOptions]
  }
  @scala.inline
  implicit class SchemaTextPropertyOptionsOps[Self <: SchemaTextPropertyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOperatorOptions(value: SchemaTextOperatorOptions): Self = this.set("operatorOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatorOptions: Self = this.set("operatorOptions", js.undefined)
    @scala.inline
    def setRetrievalImportance(value: SchemaRetrievalImportance): Self = this.set("retrievalImportance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetrievalImportance: Self = this.set("retrievalImportance", js.undefined)
  }
  
}

