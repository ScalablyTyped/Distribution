package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The allowed types for [VALUE] in a `[KEY]:[VALUE]` attribute.
  */
@js.native
trait SchemaAttributeValue extends js.Object {
  /**
    * A Boolean value represented by `true` or `false`.
    */
  var boolValue: js.UndefOr[Boolean] = js.native
  /**
    * A 64-bit signed integer.
    */
  var intValue: js.UndefOr[String] = js.native
  /**
    * A string up to 256 bytes long.
    */
  var stringValue: js.UndefOr[SchemaTruncatableString] = js.native
}

object SchemaAttributeValue {
  @scala.inline
  def apply(): SchemaAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttributeValue]
  }
  @scala.inline
  implicit class SchemaAttributeValueOps[Self <: SchemaAttributeValue] (val x: Self) extends AnyVal {
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
    def setBoolValue(value: Boolean): Self = this.set("boolValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoolValue: Self = this.set("boolValue", js.undefined)
    @scala.inline
    def setIntValue(value: String): Self = this.set("intValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntValue: Self = this.set("intValue", js.undefined)
    @scala.inline
    def setStringValue(value: SchemaTruncatableString): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
  
}

