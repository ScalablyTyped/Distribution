package typings.jquerySteps.JQuerySteps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "Callback Functions"
//#region "Step Object"
@js.native
trait Step extends js.Object {
  /**
    *  The step content (HTML).
    */
  var content: js.UndefOr[String] = js.native
  /**
    * Indicates how the content will be loaded.
    * This can be html (0), iframe (1), or async (2).
    */
  var contentMode: js.UndefOr[String | Double] = js.native
  /**
    * The URI that refers to the content.
    */
  var contentUrl: js.UndefOr[String] = js.native
  /**
    * The step title (HTML).
    */
  var title: js.UndefOr[String] = js.native
}

object Step {
  @scala.inline
  def apply(): Step = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Step]
  }
  @scala.inline
  implicit class StepOps[Self <: Step] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentMode(value: String | Double): Self = this.set("contentMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentMode: Self = this.set("contentMode", js.undefined)
    @scala.inline
    def setContentUrl(value: String): Self = this.set("contentUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentUrl: Self = this.set("contentUrl", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

