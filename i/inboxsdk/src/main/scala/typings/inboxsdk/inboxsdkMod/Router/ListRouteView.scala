package typings.inboxsdk.inboxsdkMod.Router

import typings.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRouteView extends RouteView {
  def addCollapsibleSection(options: SectionDescriptor): CollapsibleSectionView
  // addCollapsibleSection(options: Stream<SectionDescriptor>): CollapsibleSectionView;
  def addSection(options: SectionDescriptor): SectionView
  // addSection(options: Stream<SectionDescriptor>): SectionView;
  def refresh(): Unit
}

object ListRouteView {
  @scala.inline
  def apply(
    addCollapsibleSection: SectionDescriptor => CollapsibleSectionView,
    addSection: SectionDescriptor => SectionView,
    destroyed: Boolean,
    getParams: () => RouteParams,
    getRouteID: () => String,
    getRouteType: () => RouteTypes,
    on: (destroy, js.Function0[Unit]) => Unit,
    refresh: () => Unit
  ): ListRouteView = {
    val __obj = js.Dynamic.literal(addCollapsibleSection = js.Any.fromFunction1(addCollapsibleSection), addSection = js.Any.fromFunction1(addSection), destroyed = destroyed.asInstanceOf[js.Any], getParams = js.Any.fromFunction0(getParams), getRouteID = js.Any.fromFunction0(getRouteID), getRouteType = js.Any.fromFunction0(getRouteType), on = js.Any.fromFunction2(on), refresh = js.Any.fromFunction0(refresh))
  
    __obj.asInstanceOf[ListRouteView]
  }
}

