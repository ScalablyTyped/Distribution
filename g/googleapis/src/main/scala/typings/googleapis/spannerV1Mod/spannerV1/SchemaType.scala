package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `Type` indicates the type of a Cloud Spanner value, as might be stored in a
  * table cell or returned from an SQL query.
  */
@js.native
trait SchemaType extends js.Object {
  /**
    * If code == ARRAY, then `array_element_type` is the type of the array
    * elements.
    */
  var arrayElementType: js.UndefOr[SchemaType] = js.native
  /**
    * Required. The TypeCode for this type.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * If code == STRUCT, then `struct_type` provides type information for the
    * struct&#39;s fields.
    */
  var structType: js.UndefOr[SchemaStructType] = js.native
}

object SchemaType {
  @scala.inline
  def apply(): SchemaType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaType]
  }
  @scala.inline
  implicit class SchemaTypeOps[Self <: SchemaType] (val x: Self) extends AnyVal {
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
    def setArrayElementType(value: SchemaType): Self = this.set("arrayElementType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayElementType: Self = this.set("arrayElementType", js.undefined)
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setStructType(value: SchemaStructType): Self = this.set("structType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStructType: Self = this.set("structType", js.undefined)
  }
  
}

