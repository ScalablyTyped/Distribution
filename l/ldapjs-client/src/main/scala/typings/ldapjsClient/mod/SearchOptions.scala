package typings.ldapjsClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  var attributes: js.UndefOr[js.Array[String]] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var sizeLimit: js.UndefOr[Double] = js.undefined
  var timeLimit: js.UndefOr[Double] = js.undefined
  var typesOnly: js.UndefOr[Boolean] = js.undefined
}

object SearchOptions {
  @scala.inline
  def apply(
    attributes: js.Array[String] = null,
    filter: String = null,
    scope: String = null,
    sizeLimit: js.UndefOr[Double] = js.undefined,
    timeLimit: js.UndefOr[Double] = js.undefined,
    typesOnly: js.UndefOr[Boolean] = js.undefined
  ): SearchOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeLimit)) __obj.updateDynamic("sizeLimit")(sizeLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeLimit)) __obj.updateDynamic("timeLimit")(timeLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(typesOnly)) __obj.updateDynamic("typesOnly")(typesOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

