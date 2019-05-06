package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonTab extends js.Object {
  var active: scala.Boolean
  /**
    * The component to display inside of the tab.
    */
  var component: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentRef */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentRef */ js.Any
  ] = js.undefined
  var delegate: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FrameworkDelegate */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FrameworkDelegate */ js.Any
  ] = js.undefined
  /**
    * A tab id must be provided for each `ion-tab`. It's used internally to reference the selected tab or by the router to switch between them.
    */
  var tab: java.lang.String
  /**
    * Set the active component for the tab
    */
  def setActive(): js.Promise[scala.Unit]
}

object IonTab {
  @scala.inline
  def apply(
    active: scala.Boolean,
    setActive: () => js.Promise[scala.Unit],
    tab: java.lang.String,
    component: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentRef */ js.Any = null,
    delegate: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FrameworkDelegate */ js.Any = null
  ): IonTab = {
    val __obj = js.Dynamic.literal(active = active, setActive = js.Any.fromFunction0(setActive), tab = tab)
    if (component != null) __obj.updateDynamic("component")(component)
    if (delegate != null) __obj.updateDynamic("delegate")(delegate)
    __obj.asInstanceOf[IonTab]
  }
}

