package typings.atIonicCore.distTypesComponentsMod.LocalJSXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonButtons extends js.Object {
  /**
    * If true, buttons will disappear when its parent toolbar has fully collapsed if the toolbar is not the first toolbar. If the toolbar is the first toolbar, the buttons will be hidden and will only be shown once all toolbars have fully collapsed.  Only applies in `ios` mode with `collapse` set to `true` on `ion-header`.  Typically used for [Collapsible Large Titles](https://ionicframework.com/docs/api/title#collapsible-large-titles)
    */
  var collapse: js.UndefOr[Boolean] = js.undefined
}

object IonButtons {
  @scala.inline
  def apply(collapse: js.UndefOr[Boolean] = js.undefined): IonButtons = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapse)) __obj.updateDynamic("collapse")(collapse)
    __obj.asInstanceOf[IonButtons]
  }
}

