package typings.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filter on a specific property.
  */
@js.native
trait SchemaPropertyFilter extends js.Object {
  /**
    * The operator to filter by.
    */
  var op: js.UndefOr[String] = js.native
  /**
    * The property to filter by.
    */
  var property: js.UndefOr[SchemaPropertyReference] = js.native
  /**
    * The value to compare the property to.
    */
  var value: js.UndefOr[SchemaValue] = js.native
}

object SchemaPropertyFilter {
  @scala.inline
  def apply(): SchemaPropertyFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPropertyFilter]
  }
  @scala.inline
  implicit class SchemaPropertyFilterOps[Self <: SchemaPropertyFilter] (val x: Self) extends AnyVal {
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
    def setOp(value: String): Self = this.set("op", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOp: Self = this.set("op", js.undefined)
    @scala.inline
    def setProperty(value: SchemaPropertyReference): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    @scala.inline
    def setValue(value: SchemaValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

