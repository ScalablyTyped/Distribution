package typings
package mainDashBowerDashFilesLib.mainDashBowerDashFilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var checkExistence: js.UndefOr[scala.Boolean] = js.undefined
  var debugging: js.UndefOr[scala.Boolean] = js.undefined
  var env: js.UndefOr[java.lang.String] = js.undefined
  var filter: js.UndefOr[stdLib.RegExp | IFilterFunction | java.lang.String | js.Array[java.lang.String]] = js.undefined
  var includeDev: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var includeSelf: js.UndefOr[scala.Boolean] = js.undefined
  var main: js.UndefOr[java.lang.String | js.Array[java.lang.String] | js.Object] = js.undefined
  var paths: js.UndefOr[IPaths | java.lang.String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    checkExistence: js.UndefOr[scala.Boolean] = js.undefined,
    debugging: js.UndefOr[scala.Boolean] = js.undefined,
    env: java.lang.String = null,
    filter: stdLib.RegExp | IFilterFunction | java.lang.String | js.Array[java.lang.String] = null,
    includeDev: scala.Boolean | java.lang.String = null,
    includeSelf: js.UndefOr[scala.Boolean] = js.undefined,
    main: java.lang.String | js.Array[java.lang.String] | js.Object = null,
    paths: IPaths | java.lang.String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkExistence)) __obj.updateDynamic("checkExistence")(checkExistence)
    if (!js.isUndefined(debugging)) __obj.updateDynamic("debugging")(debugging)
    if (env != null) __obj.updateDynamic("env")(env)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (includeDev != null) __obj.updateDynamic("includeDev")(includeDev.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSelf)) __obj.updateDynamic("includeSelf")(includeSelf)
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

