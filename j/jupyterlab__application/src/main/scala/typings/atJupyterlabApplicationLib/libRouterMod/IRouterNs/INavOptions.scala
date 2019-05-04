package typings
package atJupyterlabApplicationLib.libRouterMod.IRouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options passed into a navigation request.
  */
trait INavOptions extends js.Object {
  /**
    * Whether the navigation should be hard URL change instead of an HTML
    * history API change.
    */
  var hard: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the navigation should be added to the browser's history.
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object INavOptions {
  @scala.inline
  def apply(hard: js.UndefOr[scala.Boolean] = js.undefined, silent: js.UndefOr[scala.Boolean] = js.undefined): INavOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hard)) __obj.updateDynamic("hard")(hard)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[INavOptions]
  }
}

