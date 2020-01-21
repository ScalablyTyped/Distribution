package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents details collected when the visitor views a page.
  */
@js.native
trait SchemaPageviewData extends js.Object {
  /**
    * The URL of the page that the visitor viewed.
    */
  var pagePath: js.UndefOr[String] = js.native
  /**
    * The title of the page that the visitor viewed.
    */
  var pageTitle: js.UndefOr[String] = js.native
}

object SchemaPageviewData {
  @scala.inline
  def apply(pagePath: String = null, pageTitle: String = null): SchemaPageviewData = {
    val __obj = js.Dynamic.literal()
    if (pagePath != null) __obj.updateDynamic("pagePath")(pagePath.asInstanceOf[js.Any])
    if (pageTitle != null) __obj.updateDynamic("pageTitle")(pageTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPageviewData]
  }
}

