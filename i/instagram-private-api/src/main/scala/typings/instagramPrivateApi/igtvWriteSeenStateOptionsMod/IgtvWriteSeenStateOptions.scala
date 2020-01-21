package typings.instagramPrivateApi.igtvWriteSeenStateOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.instagramPrivateApi.AnonViewprogresss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvWriteSeenStateOptions extends js.Object {
  var grid_impressions: js.UndefOr[js.Array[String]] = js.undefined
  var impressions: js.UndefOr[StringDictionary[AnonViewprogresss]] = js.undefined
}

object IgtvWriteSeenStateOptions {
  @scala.inline
  def apply(grid_impressions: js.Array[String] = null, impressions: StringDictionary[AnonViewprogresss] = null): IgtvWriteSeenStateOptions = {
    val __obj = js.Dynamic.literal()
    if (grid_impressions != null) __obj.updateDynamic("grid_impressions")(grid_impressions.asInstanceOf[js.Any])
    if (impressions != null) __obj.updateDynamic("impressions")(impressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvWriteSeenStateOptions]
  }
}

