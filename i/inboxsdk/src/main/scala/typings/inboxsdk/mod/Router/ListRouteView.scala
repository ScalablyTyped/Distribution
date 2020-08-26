package typings.inboxsdk.mod.Router

import typings.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRouteView extends RouteView {
  def addCollapsibleSection(options: SectionDescriptor): CollapsibleSectionView = js.native
  // addCollapsibleSection(options: Stream<SectionDescriptor>): CollapsibleSectionView;
  def addSection(options: SectionDescriptor): SectionView = js.native
  // addSection(options: Stream<SectionDescriptor>): SectionView;
  def refresh(): Unit = js.native
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
  @scala.inline
  implicit class ListRouteViewOps[Self <: ListRouteView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddCollapsibleSection(value: SectionDescriptor => CollapsibleSectionView): Self = this.set("addCollapsibleSection", js.Any.fromFunction1(value))
    @scala.inline
    def setAddSection(value: SectionDescriptor => SectionView): Self = this.set("addSection", js.Any.fromFunction1(value))
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
  }
  
}

