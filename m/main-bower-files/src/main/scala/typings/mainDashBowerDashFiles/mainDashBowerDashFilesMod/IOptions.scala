package typings.mainDashBowerDashFiles.mainDashBowerDashFilesMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var checkExistence: js.UndefOr[Boolean] = js.undefined
  var debugging: js.UndefOr[Boolean] = js.undefined
  var env: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[RegExp | IFilterFunction | String | js.Array[String]] = js.undefined
  var includeDev: js.UndefOr[Boolean | String] = js.undefined
  var includeSelf: js.UndefOr[Boolean] = js.undefined
  var main: js.UndefOr[String | js.Array[String] | js.Object] = js.undefined
  var paths: js.UndefOr[IPaths | String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    checkExistence: js.UndefOr[Boolean] = js.undefined,
    debugging: js.UndefOr[Boolean] = js.undefined,
    env: String = null,
    filter: RegExp | IFilterFunction | String | js.Array[String] = null,
    includeDev: Boolean | String = null,
    includeSelf: js.UndefOr[Boolean] = js.undefined,
    main: String | js.Array[String] | js.Object = null,
    paths: IPaths | String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkExistence)) __obj.updateDynamic("checkExistence")(checkExistence.asInstanceOf[js.Any])
    if (!js.isUndefined(debugging)) __obj.updateDynamic("debugging")(debugging.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (includeDev != null) __obj.updateDynamic("includeDev")(includeDev.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSelf)) __obj.updateDynamic("includeSelf")(includeSelf.asInstanceOf[js.Any])
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

