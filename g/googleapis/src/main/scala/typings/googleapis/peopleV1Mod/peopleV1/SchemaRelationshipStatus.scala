package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s read-only relationship status.
  */
@js.native
trait SchemaRelationshipStatus extends js.Object {
  
  /**
    * The read-only value of the relationship status translated and formatted
    * in the viewer&#39;s account locale or the `Accept-Language` HTTP header
    * locale.
    */
  var formattedValue: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the relationship status.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  
  /**
    * The relationship status. The value can be custom or one of these
    * predefined values:  * `single` * `inARelationship` * `engaged` *
    * `married` * `itsComplicated` * `openRelationship` * `widowed` *
    * `inDomesticPartnership` * `inCivilUnion`
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaRelationshipStatus {
  
  @scala.inline
  def apply(): SchemaRelationshipStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelationshipStatus]
  }
  
  @scala.inline
  implicit class SchemaRelationshipStatusOps[Self <: SchemaRelationshipStatus] (val x: Self) extends AnyVal {
    
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
    def setFormattedValue(value: String): Self = this.set("formattedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormattedValue: Self = this.set("formattedValue", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
