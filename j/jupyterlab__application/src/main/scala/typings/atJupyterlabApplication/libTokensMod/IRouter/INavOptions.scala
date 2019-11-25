package typings.atJupyterlabApplication.libTokensMod.IRouter

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
  var hard: js.UndefOr[Boolean] = js.undefined
}

object INavOptions {
  @scala.inline
  def apply(hard: js.UndefOr[Boolean] = js.undefined): INavOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hard)) __obj.updateDynamic("hard")(hard.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavOptions]
  }
}

