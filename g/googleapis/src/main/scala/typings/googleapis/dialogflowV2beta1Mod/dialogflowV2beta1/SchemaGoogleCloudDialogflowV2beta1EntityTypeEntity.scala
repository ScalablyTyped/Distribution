package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An **entity entry** for an associated entity type.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity extends js.Object {
  /**
    * Required. A collection of value synonyms. For example, if the entity type
    * is *vegetable*, and `value` is *scallions*, a synonym could be *green
    * onions*.  For `KIND_LIST` entity types:  *   This collection must contain
    * exactly one synonym equal to `value`.
    */
  var synonyms: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. The primary value associated with this entity entry. For
    * example, if the entity type is *vegetable*, the value could be
    * *scallions*.  For `KIND_MAP` entity types:  *   A canonical value to be
    * used in place of synonyms.  For `KIND_LIST` entity types:  *   A string
    * that can contain references to other entity types (with or     without
    * aliases).
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1EntityTypeEntityOps[Self <: SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity] (val x: Self) extends AnyVal {
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
    def setSynonymsVarargs(value: String*): Self = this.set("synonyms", js.Array(value :_*))
    @scala.inline
    def setSynonyms(value: js.Array[String]): Self = this.set("synonyms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSynonyms: Self = this.set("synonyms", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

