package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The collection of fields that make up a displayed line
  */
@js.native
trait SchemaResultDisplayLine extends js.Object {
  var fields: js.UndefOr[js.Array[SchemaResultDisplayField]] = js.native
}

object SchemaResultDisplayLine {
  @scala.inline
  def apply(): SchemaResultDisplayLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultDisplayLine]
  }
  @scala.inline
  implicit class SchemaResultDisplayLineOps[Self <: SchemaResultDisplayLine] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: SchemaResultDisplayField*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[SchemaResultDisplayField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
  
}

