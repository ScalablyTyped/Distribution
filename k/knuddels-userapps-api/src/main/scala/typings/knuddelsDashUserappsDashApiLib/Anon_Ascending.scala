package typings
package knuddelsDashUserappsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ascending extends js.Object {
  var ascending: js.UndefOr[scala.Boolean] = js.undefined
  var labelMapping: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var sortIndex: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Ascending {
  @scala.inline
  def apply(
    ascending: js.UndefOr[scala.Boolean] = js.undefined,
    labelMapping: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    sortIndex: scala.Int | scala.Double = null
  ): Anon_Ascending = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending)
    if (labelMapping != null) __obj.updateDynamic("labelMapping")(labelMapping)
    if (sortIndex != null) __obj.updateDynamic("sortIndex")(sortIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Ascending]
  }
}

