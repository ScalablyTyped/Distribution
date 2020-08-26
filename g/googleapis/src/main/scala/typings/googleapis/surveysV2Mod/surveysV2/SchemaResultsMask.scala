package typings.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResultsMask extends js.Object {
  var fields: js.UndefOr[js.Array[SchemaFieldMask]] = js.native
  var projection: js.UndefOr[String] = js.native
}

object SchemaResultsMask {
  @scala.inline
  def apply(): SchemaResultsMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultsMask]
  }
  @scala.inline
  implicit class SchemaResultsMaskOps[Self <: SchemaResultsMask] (val x: Self) extends AnyVal {
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
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
  }
  
}

