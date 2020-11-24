package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Filter that describes what data should be selected or returned from a
  * request.
  */
@js.native
trait SchemaDataFilter extends js.Object {
  
  /**
    * Selects data that matches the specified A1 range.
    */
  var a1Range: js.UndefOr[String] = js.native
  
  /**
    * Selects data associated with the developer metadata matching the criteria
    * described by this DeveloperMetadataLookup.
    */
  var developerMetadataLookup: js.UndefOr[SchemaDeveloperMetadataLookup] = js.native
  
  /**
    * Selects data that matches the range described by the GridRange.
    */
  var gridRange: js.UndefOr[SchemaGridRange] = js.native
}
object SchemaDataFilter {
  
  @scala.inline
  def apply(): SchemaDataFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataFilter]
  }
  
  @scala.inline
  implicit class SchemaDataFilterOps[Self <: SchemaDataFilter] (val x: Self) extends AnyVal {
    
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
    def setA1Range(value: String): Self = this.set("a1Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA1Range: Self = this.set("a1Range", js.undefined)
    
    @scala.inline
    def setDeveloperMetadataLookup(value: SchemaDeveloperMetadataLookup): Self = this.set("developerMetadataLookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeveloperMetadataLookup: Self = this.set("developerMetadataLookup", js.undefined)
    
    @scala.inline
    def setGridRange(value: SchemaGridRange): Self = this.set("gridRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridRange: Self = this.set("gridRange", js.undefined)
  }
}
