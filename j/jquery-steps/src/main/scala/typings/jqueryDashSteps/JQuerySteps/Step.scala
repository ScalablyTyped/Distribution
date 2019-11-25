package typings.jqueryDashSteps.JQuerySteps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "Callback Functions"
//#region "Step Object"
trait Step extends js.Object {
  /**
    *  The step content (HTML).
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    * Indicates how the content will be loaded.
    * This can be html (0), iframe (1), or async (2).
    */
  var contentMode: js.UndefOr[String | Double] = js.undefined
  /**
    * The URI that refers to the content.
    */
  var contentUrl: js.UndefOr[String] = js.undefined
  /**
    * The step title (HTML).
    */
  var title: js.UndefOr[String] = js.undefined
}

object Step {
  @scala.inline
  def apply(
    content: String = null,
    contentMode: String | Double = null,
    contentUrl: String = null,
    title: String = null
  ): Step = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentMode != null) __obj.updateDynamic("contentMode")(contentMode.asInstanceOf[js.Any])
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
}

