package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error occurring in the feed, like &quot;invalid price&quot;.
  */
@js.native
trait SchemaDatafeedStatusError extends js.Object {
  /**
    * The code of the error, e.g., &quot;validation/invalid_value&quot;.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * The number of occurrences of the error in the feed.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * A list of example occurrences of the error, grouped by product.
    */
  var examples: js.UndefOr[js.Array[SchemaDatafeedStatusExample]] = js.native
  /**
    * The error message, e.g., &quot;Invalid price&quot;.
    */
  var message: js.UndefOr[String] = js.native
}

object SchemaDatafeedStatusError {
  @scala.inline
  def apply(): SchemaDatafeedStatusError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedStatusError]
  }
  @scala.inline
  implicit class SchemaDatafeedStatusErrorOps[Self <: SchemaDatafeedStatusError] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setExamplesVarargs(value: SchemaDatafeedStatusExample*): Self = this.set("examples", js.Array(value :_*))
    @scala.inline
    def setExamples(value: js.Array[SchemaDatafeedStatusExample]): Self = this.set("examples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExamples: Self = this.set("examples", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

