package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of a label.
  */
@js.native
trait SchemaLabelDescriptor extends js.Object {
  /**
    * A human-readable description for the label.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The label key.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The type of data that can be assigned to the label.
    */
  var valueType: js.UndefOr[String] = js.native
}

object SchemaLabelDescriptor {
  @scala.inline
  def apply(): SchemaLabelDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLabelDescriptor]
  }
  @scala.inline
  implicit class SchemaLabelDescriptorOps[Self <: SchemaLabelDescriptor] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setValueType(value: String): Self = this.set("valueType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueType: Self = this.set("valueType", js.undefined)
  }
  
}

