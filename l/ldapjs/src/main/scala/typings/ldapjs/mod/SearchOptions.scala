package typings.ldapjs.mod

import typings.ldapjs.anon.PagePause
import typings.ldapjs.ldapjsStrings.base
import typings.ldapjs.ldapjsStrings.one
import typings.ldapjs.ldapjsStrings.sub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  /** Defaults to the empty set, which means all attributes */
  var attributes: js.UndefOr[String | js.Array[String]] = js.undefined
  var derefAliases: js.UndefOr[Double] = js.undefined
  /**  Defaults to (objectclass=*) */
  var filter: js.UndefOr[String | Filter] = js.undefined
  var paged: js.UndefOr[Boolean | PagePause] = js.undefined
  /** Defaults to base */
  var scope: js.UndefOr[base | one | sub] = js.undefined
  /** Defaults to 0 (unlimited) */
  var sizeLimit: js.UndefOr[Double] = js.undefined
  /** Timeout in seconds. Defaults to 10. Lots of servers will ignore this! */
  var timeLimit: js.UndefOr[Double] = js.undefined
  var typesOnly: js.UndefOr[Boolean] = js.undefined
}

object SearchOptions {
  @scala.inline
  def apply(
    attributes: String | js.Array[String] = null,
    derefAliases: js.UndefOr[Double] = js.undefined,
    filter: String | Filter = null,
    paged: Boolean | PagePause = null,
    scope: base | one | sub = null,
    sizeLimit: js.UndefOr[Double] = js.undefined,
    timeLimit: js.UndefOr[Double] = js.undefined,
    typesOnly: js.UndefOr[Boolean] = js.undefined
  ): SearchOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(derefAliases)) __obj.updateDynamic("derefAliases")(derefAliases.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (paged != null) __obj.updateDynamic("paged")(paged.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeLimit)) __obj.updateDynamic("sizeLimit")(sizeLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeLimit)) __obj.updateDynamic("timeLimit")(timeLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(typesOnly)) __obj.updateDynamic("typesOnly")(typesOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

