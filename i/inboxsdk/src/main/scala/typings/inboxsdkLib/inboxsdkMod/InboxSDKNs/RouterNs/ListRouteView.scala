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
    addCollapsibleSection: SectionDescriptor => CollapsibleSectionView,
    addSection: SectionDescriptor => SectionView,
    destroyed: scala.Boolean,
    getParams: () => RouteParams,
    getRouteID: () => java.lang.String,
    getRouteType: () => RouteTypes,
    on_destroy: (inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit]) => scala.Unit,
    refresh: () => scala.Unit
  ): ListRouteView = {
    val __obj = js.Dynamic.literal(addCollapsibleSection = js.Any.fromFunction1(addCollapsibleSection), addSection = js.Any.fromFunction1(addSection), destroyed = destroyed, getParams = js.Any.fromFunction0(getParams), getRouteID = js.Any.fromFunction0(getRouteID), getRouteType = js.Any.fromFunction0(getRouteType), refresh = js.Any.fromFunction0(refresh))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_destroy))
    __obj.asInstanceOf[ListRouteView]
  }
}

