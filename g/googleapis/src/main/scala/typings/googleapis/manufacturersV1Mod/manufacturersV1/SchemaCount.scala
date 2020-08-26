package typings.googleapis.manufacturersV1Mod.manufacturersV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of products in a single package. For more information, see
  * https://support.google.com/manufacturers/answer/6124116#count.
  */
@js.native
trait SchemaCount extends js.Object {
  /**
    * The unit in which these products are counted.
    */
  var unit: js.UndefOr[String] = js.native
  /**
    * The numeric value of the number of products in a package.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaCount {
  @scala.inline
  def apply(): SchemaCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCount]
  }
  @scala.inline
  implicit class SchemaCountOps[Self <: SchemaCount] (val x: Self) extends AnyVal {
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
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

