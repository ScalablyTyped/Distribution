package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.mod.ComponentRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonTab extends js.Object {
  /**
    * The component to display inside of the tab.
    */
  var component: js.UndefOr[ComponentRef] = js.undefined
  /**
    * A tab id must be provided for each `ion-tab`. It's used internally to reference the selected tab or by the router to switch between them.
    */
  var tab: String
}

object IonTab {
  @scala.inline
  def apply(tab: String, component: js.UndefOr[Null | ComponentRef] = js.undefined): IonTab = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    if (!js.isUndefined(component)) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonTab]
  }
}

