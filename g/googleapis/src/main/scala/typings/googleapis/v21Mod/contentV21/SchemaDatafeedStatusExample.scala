package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An example occurrence for a particular error.
  */
@js.native
trait SchemaDatafeedStatusExample extends js.Object {
  /**
    * The ID of the example item.
    */
  var itemId: js.UndefOr[String] = js.native
  /**
    * Line number in the data feed where the example is found.
    */
  var lineNumber: js.UndefOr[String] = js.native
  /**
    * The problematic value.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaDatafeedStatusExample {
  @scala.inline
  def apply(): SchemaDatafeedStatusExample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedStatusExample]
  }
  @scala.inline
  implicit class SchemaDatafeedStatusExampleOps[Self <: SchemaDatafeedStatusExample] (val x: Self) extends AnyVal {
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
    def setItemId(value: String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    @scala.inline
    def setLineNumber(value: String): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineNumber: Self = this.set("lineNumber", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

