package typings.atIonicCore.distTypesComponentsMod.ComponentsNs

import typings.atIonicCore.distTypesInterfaceMod.ComponentRef
import typings.atIonicCore.distTypesInterfaceMod.FrameworkDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonTab extends js.Object {
  var active: Boolean
  /**
    * The component to display inside of the tab.
    */
  var component: js.UndefOr[ComponentRef] = js.undefined
  var delegate: js.UndefOr[FrameworkDelegate] = js.undefined
  /**
    * A tab id must be provided for each `ion-tab`. It's used internally to reference the selected tab or by the router to switch between them.
    */
  var tab: String
  /**
    * Set the active component for the tab
    */
  def setActive(): js.Promise[Unit]
}

object IonTab {
  @scala.inline
  def apply(
    active: Boolean,
    setActive: () => js.Promise[Unit],
    tab: String,
    component: ComponentRef = null,
    delegate: FrameworkDelegate = null
  ): IonTab = {
    val __obj = js.Dynamic.literal(active = active, setActive = js.Any.fromFunction0(setActive), tab = tab)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (delegate != null) __obj.updateDynamic("delegate")(delegate)
    __obj.asInstanceOf[IonTab]
  }
}

