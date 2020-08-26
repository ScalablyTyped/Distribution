package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about a field.
  */
@js.native
trait SchemaFieldMetadata extends js.Object {
  /**
    * True if the field is the primary field; false if the field is a secondary
    * field.
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * The source of the field.
    */
  var source: js.UndefOr[SchemaSource] = js.native
  /**
    * True if the field is verified; false if the field is unverified. A
    * verified field is typically a name, email address, phone number, or
    * website that has been confirmed to be owned by the person.
    */
  var verified: js.UndefOr[Boolean] = js.native
}

object SchemaFieldMetadata {
  @scala.inline
  def apply(): SchemaFieldMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldMetadata]
  }
  @scala.inline
  implicit class SchemaFieldMetadataOps[Self <: SchemaFieldMetadata] (val x: Self) extends AnyVal {
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
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setSource(value: SchemaSource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setVerified(value: Boolean): Self = this.set("verified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerified: Self = this.set("verified", js.undefined)
  }
  
}

