package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a creative field value.
  */
@js.native
trait SchemaCreativeFieldValue extends js.Object {
  /**
    * ID of this creative field value. This is a read-only, auto-generated
    * field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creativeFieldValue&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Value of this creative field value. It needs to be less than 256
    * characters in length and unique per creative field.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaCreativeFieldValue {
  @scala.inline
  def apply(): SchemaCreativeFieldValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeFieldValue]
  }
  @scala.inline
  implicit class SchemaCreativeFieldValueOps[Self <: SchemaCreativeFieldValue] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

