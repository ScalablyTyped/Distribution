package typings.ionicReact.ionTabsContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonTabsContextState extends js.Object {
  var activeTab: js.UndefOr[String] = js.undefined
  def selectTab(tab: String): Boolean
}

object IonTabsContextState {
  @scala.inline
  def apply(selectTab: String => Boolean, activeTab: String = null): IonTabsContextState = {
    val __obj = js.Dynamic.literal(selectTab = js.Any.fromFunction1(selectTab))
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonTabsContextState]
  }
}

