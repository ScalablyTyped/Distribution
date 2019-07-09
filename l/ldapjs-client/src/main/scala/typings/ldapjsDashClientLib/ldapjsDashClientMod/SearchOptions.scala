package typings
package ldapjsDashClientLib.ldapjsDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  var attributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var sizeLimit: js.UndefOr[scala.Double] = js.undefined
  var timeLimit: js.UndefOr[scala.Double] = js.undefined
  var typesOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object SearchOptions {
  @scala.inline
  def apply(
    attributes: js.Array[java.lang.String] = null,
    filter: java.lang.String = null,
    scope: java.lang.String = null,
    sizeLimit: scala.Int | scala.Double = null,
    timeLimit: scala.Int | scala.Double = null,
    typesOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): SearchOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (sizeLimit != null) __obj.updateDynamic("sizeLimit")(sizeLimit.asInstanceOf[js.Any])
    if (timeLimit != null) __obj.updateDynamic("timeLimit")(timeLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(typesOnly)) __obj.updateDynamic("typesOnly")(typesOnly)
    __obj.asInstanceOf[SearchOptions]
  }
}

