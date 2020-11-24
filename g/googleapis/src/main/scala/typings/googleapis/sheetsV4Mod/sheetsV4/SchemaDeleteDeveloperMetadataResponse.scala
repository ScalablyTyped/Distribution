package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response from deleting developer metadata.
  */
@js.native
trait SchemaDeleteDeveloperMetadataResponse extends js.Object {
  
  /**
    * The metadata that was deleted.
    */
  var deletedDeveloperMetadata: js.UndefOr[js.Array[SchemaDeveloperMetadata]] = js.native
}
object SchemaDeleteDeveloperMetadataResponse {
  
  @scala.inline
  def apply(): SchemaDeleteDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteDeveloperMetadataResponse]
  }
  
  @scala.inline
  implicit class SchemaDeleteDeveloperMetadataResponseOps[Self <: SchemaDeleteDeveloperMetadataResponse] (val x: Self) extends AnyVal {
    
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
    def setDeletedDeveloperMetadataVarargs(value: SchemaDeveloperMetadata*): Self = this.set("deletedDeveloperMetadata", js.Array(value :_*))
    
    @scala.inline
    def setDeletedDeveloperMetadata(value: js.Array[SchemaDeveloperMetadata]): Self = this.set("deletedDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletedDeveloperMetadata: Self = this.set("deletedDeveloperMetadata", js.undefined)
  }
}
