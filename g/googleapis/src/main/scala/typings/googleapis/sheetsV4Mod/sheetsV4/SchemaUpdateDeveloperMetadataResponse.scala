package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response from updating developer metadata.
  */
@js.native
trait SchemaUpdateDeveloperMetadataResponse extends js.Object {
  /**
    * The updated developer metadata.
    */
  var developerMetadata: js.UndefOr[js.Array[SchemaDeveloperMetadata]] = js.native
}

object SchemaUpdateDeveloperMetadataResponse {
  @scala.inline
  def apply(): SchemaUpdateDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDeveloperMetadataResponse]
  }
  @scala.inline
  implicit class SchemaUpdateDeveloperMetadataResponseOps[Self <: SchemaUpdateDeveloperMetadataResponse] (val x: Self) extends AnyVal {
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
    def setDeveloperMetadataVarargs(value: SchemaDeveloperMetadata*): Self = this.set("developerMetadata", js.Array(value :_*))
    @scala.inline
    def setDeveloperMetadata(value: js.Array[SchemaDeveloperMetadata]): Self = this.set("developerMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloperMetadata: Self = this.set("developerMetadata", js.undefined)
  }
  
}

