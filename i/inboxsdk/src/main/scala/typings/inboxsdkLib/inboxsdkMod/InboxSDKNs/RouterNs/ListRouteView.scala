package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRouteView extends RouteView {
  def addCollapsibleSection(options: SectionDescriptor): CollapsibleSectionView
  // addCollapsibleSection(options: Stream<SectionDescriptor>): CollapsibleSectionView;
  def addSection(options: SectionDescriptor): SectionView
  // addSection(options: Stream<SectionDescriptor>): SectionView;
  def refresh(): scala.Unit
}

object ListRouteView {
  @scala.inline
  def apply(
    addCollapsibleSection: js.Function1[SectionDescriptor, CollapsibleSectionView],
    addSection: js.Function1[SectionDescriptor, SectionView],
    destroyed: scala.Boolean,
    getParams: js.Function0[RouteParams],
    getRouteID: js.Function0[java.lang.String],
    getRouteType: js.Function0[RouteTypes],
    on_destroy: js.Function2[inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit], scala.Unit],
    refresh: js.Function0[scala.Unit]
  ): ListRouteView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addCollapsibleSection")(addCollapsibleSection)
    __obj.updateDynamic("addSection")(addSection)
    __obj.updateDynamic("destroyed")(destroyed)
    __obj.updateDynamic("getParams")(getParams)
    __obj.updateDynamic("getRouteID")(getRouteID)
    __obj.updateDynamic("getRouteType")(getRouteType)
    __obj.updateDynamic("on")(on_destroy)
    __obj.updateDynamic("refresh")(refresh)
    __obj.asInstanceOf[ListRouteView]
  }
}

