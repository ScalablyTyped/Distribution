package typings.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional details about the URL, set only when calling get().
  */
@js.native
trait SchemaUrlSampleDetails extends js.Object {
  /**
    * List of sitemaps pointing at this URL.
    */
  var containingSitemaps: js.UndefOr[js.Array[String]] = js.native
  /**
    * A sample set of URLs linking to this URL.
    */
  var linkedFromUrls: js.UndefOr[js.Array[String]] = js.native
}

object SchemaUrlSampleDetails {
  @scala.inline
  def apply(containingSitemaps: js.Array[String] = null, linkedFromUrls: js.Array[String] = null): SchemaUrlSampleDetails = {
    val __obj = js.Dynamic.literal()
    if (containingSitemaps != null) __obj.updateDynamic("containingSitemaps")(containingSitemaps.asInstanceOf[js.Any])
    if (linkedFromUrls != null) __obj.updateDynamic("linkedFromUrls")(linkedFromUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUrlSampleDetails]
  }
}

