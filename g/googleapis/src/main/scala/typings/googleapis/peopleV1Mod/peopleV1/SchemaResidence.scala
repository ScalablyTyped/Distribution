package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s past or current residence.
  */
@js.native
trait SchemaResidence extends js.Object {
  /**
    * True if the residence is the person&#39;s current residence; false if the
    * residence is a past residence.
    */
  var current: js.UndefOr[Boolean] = js.native
  /**
    * Metadata about the residence.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The address of the residence.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaResidence {
  @scala.inline
  def apply(): SchemaResidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResidence]
  }
  @scala.inline
  implicit class SchemaResidenceOps[Self <: SchemaResidence] (val x: Self) extends AnyVal {
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
    def setCurrent(value: Boolean): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
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

