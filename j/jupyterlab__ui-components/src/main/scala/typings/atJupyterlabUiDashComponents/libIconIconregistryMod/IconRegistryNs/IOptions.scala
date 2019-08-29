package typings.atJupyterlabUiDashComponents.libIconIconregistryMod.IconRegistryNs

import typings.atJupyterlabUiDashComponents.libIconInterfacesMod.IconNs.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create an icon registry.
  */
trait IOptions extends js.Object {
  /**
    * If the debug flag is set, missing icons will raise a warning
    * and be visually marked with an "X". Otherwise, missing icons
    * will fail silently.
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * The initial icons for the registry.
    * The [[Icon.defaultIcons]] will be used if not given.
    */
  var initialIcons: js.UndefOr[js.Array[IModel]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(debug: js.UndefOr[Boolean] = js.undefined, initialIcons: js.Array[IModel] = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (initialIcons != null) __obj.updateDynamic("initialIcons")(initialIcons)
    __obj.asInstanceOf[IOptions]
  }
}

