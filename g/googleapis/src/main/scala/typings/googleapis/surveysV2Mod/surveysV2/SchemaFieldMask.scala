package typings.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFieldMask extends js.Object {
  var fields: js.UndefOr[js.Array[SchemaFieldMask]] = js.native
  var id: js.UndefOr[Double] = js.native
}

object SchemaFieldMask {
  @scala.inline
  def apply(): SchemaFieldMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldMask]
  }
  @scala.inline
  implicit class SchemaFieldMaskOps[Self <: SchemaFieldMask] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: SchemaFieldMask*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[SchemaFieldMask]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

