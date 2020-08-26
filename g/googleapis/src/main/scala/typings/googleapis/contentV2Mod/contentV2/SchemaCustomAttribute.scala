package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCustomAttribute extends js.Object {
  /**
    * The name of the attribute. Underscores will be replaced by spaces upon
    * insertion.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The type of the attribute.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Free-form unit of the attribute. Unit can only be used for values of type
    * int, float, or price.
    */
  var unit: js.UndefOr[String] = js.native
  /**
    * The value of the attribute.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaCustomAttribute {
  @scala.inline
  def apply(): SchemaCustomAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomAttribute]
  }
  @scala.inline
  implicit class SchemaCustomAttributeOps[Self <: SchemaCustomAttribute] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

