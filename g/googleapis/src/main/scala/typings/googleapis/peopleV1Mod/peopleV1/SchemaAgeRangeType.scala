package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s age range.
  */
@js.native
trait SchemaAgeRangeType extends js.Object {
  
  /**
    * The age range.
    */
  var ageRange: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the age range.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
}
object SchemaAgeRangeType {
  
  @scala.inline
  def apply(): SchemaAgeRangeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAgeRangeType]
  }
  
  @scala.inline
  implicit class SchemaAgeRangeTypeOps[Self <: SchemaAgeRangeType] (val x: Self) extends AnyVal {
    
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
    def setAgeRange(value: String): Self = this.set("ageRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgeRange: Self = this.set("ageRange", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
