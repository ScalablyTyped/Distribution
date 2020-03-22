package typings.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.AnonPercentile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPagespeedApiLoadingExperienceV5 extends js.Object {
  /**
    * The url, pattern or origin which the metrics are on.
    */
  var id: js.UndefOr[String] = js.native
  var initial_url: js.UndefOr[String] = js.native
  var metrics: js.UndefOr[StringDictionary[AnonPercentile]] = js.native
  var overall_category: js.UndefOr[String] = js.native
}

object SchemaPagespeedApiLoadingExperienceV5 {
  @scala.inline
  def apply(
    id: String = null,
    initial_url: String = null,
    metrics: StringDictionary[AnonPercentile] = null,
    overall_category: String = null
  ): SchemaPagespeedApiLoadingExperienceV5 = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initial_url != null) __obj.updateDynamic("initial_url")(initial_url.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (overall_category != null) __obj.updateDynamic("overall_category")(overall_category.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPagespeedApiLoadingExperienceV5]
  }
}

