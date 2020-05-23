package typings.knuddelsUserappsApi.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ascending extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.undefined
  var labelMapping: js.UndefOr[StringDictionary[String]] = js.undefined
  var sortIndex: js.UndefOr[Double] = js.undefined
}

object Ascending {
  @scala.inline
  def apply(
    ascending: js.UndefOr[Boolean] = js.undefined,
    labelMapping: StringDictionary[String] = null,
    sortIndex: js.UndefOr[Double] = js.undefined
  ): Ascending = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending.get.asInstanceOf[js.Any])
    if (labelMapping != null) __obj.updateDynamic("labelMapping")(labelMapping.asInstanceOf[js.Any])
    if (!js.isUndefined(sortIndex)) __obj.updateDynamic("sortIndex")(sortIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ascending]
  }
}

