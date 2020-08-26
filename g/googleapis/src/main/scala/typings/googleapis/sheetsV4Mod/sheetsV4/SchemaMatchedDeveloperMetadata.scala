package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A developer metadata entry and the data filters specified in the original
  * request that matched it.
  */
@js.native
trait SchemaMatchedDeveloperMetadata extends js.Object {
  /**
    * All filters matching the returned developer metadata.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.native
  /**
    * The developer metadata matching the specified filters.
    */
  var developerMetadata: js.UndefOr[SchemaDeveloperMetadata] = js.native
}

object SchemaMatchedDeveloperMetadata {
  @scala.inline
  def apply(): SchemaMatchedDeveloperMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMatchedDeveloperMetadata]
  }
  @scala.inline
  implicit class SchemaMatchedDeveloperMetadataOps[Self <: SchemaMatchedDeveloperMetadata] (val x: Self) extends AnyVal {
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
    def setDataFiltersVarargs(value: SchemaDataFilter*): Self = this.set("dataFilters", js.Array(value :_*))
    @scala.inline
    def setDataFilters(value: js.Array[SchemaDataFilter]): Self = this.set("dataFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataFilters: Self = this.set("dataFilters", js.undefined)
    @scala.inline
    def setDeveloperMetadata(value: SchemaDeveloperMetadata): Self = this.set("developerMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloperMetadata: Self = this.set("developerMetadata", js.undefined)
  }
  
}

