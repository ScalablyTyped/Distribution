package typings.knuddelsUserappsApi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAscending extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.undefined
  var labelMapping: js.UndefOr[StringDictionary[String]] = js.undefined
  var sortIndex: js.UndefOr[Double] = js.undefined
}

object AnonAscending {
  @scala.inline
  def apply(
    ascending: js.UndefOr[Boolean] = js.undefined,
    labelMapping: StringDictionary[String] = null,
    sortIndex: Int | Double = null
  ): AnonAscending = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending.asInstanceOf[js.Any])
    if (labelMapping != null) __obj.updateDynamic("labelMapping")(labelMapping.asInstanceOf[js.Any])
    if (sortIndex != null) __obj.updateDynamic("sortIndex")(sortIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAscending]
  }
}

