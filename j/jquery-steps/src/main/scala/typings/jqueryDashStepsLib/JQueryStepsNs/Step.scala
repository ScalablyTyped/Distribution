package typings
package jqueryDashStepsLib.JQueryStepsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "Callback Functions"
//#region "Step Object"
trait Step extends js.Object {
  /**
    *  The step content (HTML).
    */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates how the content will be loaded.
    * This can be html (0), iframe (1), or async (2).
    */
  var contentMode: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * The URI that refers to the content.
    */
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The step title (HTML).
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Step {
  @scala.inline
  def apply(
    content: java.lang.String = null,
    contentMode: java.lang.String | scala.Double = null,
    contentUrl: java.lang.String = null,
    title: java.lang.String = null
  ): Step = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (contentMode != null) __obj.updateDynamic("contentMode")(contentMode.asInstanceOf[js.Any])
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Step]
  }
}

