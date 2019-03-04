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
    val __obj = js.Dynamic.literal(addCollapsibleSection = addCollapsibleSection, addSection = addSection, destroyed = destroyed, getParams = getParams, getRouteID = getRouteID, getRouteType = getRouteType, refresh = refresh)
    __obj.updateDynamic("on")(on_destroy)
    __obj.asInstanceOf[ListRouteView]
  }
}

