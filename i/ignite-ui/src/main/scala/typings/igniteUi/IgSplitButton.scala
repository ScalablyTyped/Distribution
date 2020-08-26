package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgSplitButton
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Event fired when the button is clicked.
    *
    *             Function takes arguments evt and ui.
    * Use ui.item to get a reference the igSplitButton element.
    */
  var click: js.UndefOr[ClickEvent] = js.native
  /**
    * Event fired after the button is collapsed.
    *
    *             Function takes arguments evt and ui.
    * Use ui.owner to get a reference the igSplitButton.
    */
  var collapsed: js.UndefOr[CollapsedEvent] = js.native
  /**
    * Event fired before a button item is collapsed.
    *
    *             Function takes arguments evt and ui.
    * Use ui.owner to get a reference the igSplitButton.
    */
  var collapsing: js.UndefOr[CollapsingEvent] = js.native
  /**
    * Default button item name.
    *
    */
  var defaultItemName: js.UndefOr[String] = js.native
  /**
    * Event fired after the button is expanded.
    *
    *             Function takes arguments evt and ui.
    * Use ui.owner to get a reference the igSplitButton.
    */
  var expanded: js.UndefOr[ExpandedEvent] = js.native
  /**
    * Event fired before a button item is expanded.
    *
    *             Function takes arguments evt and ui.
    * Use ui.owner to get a reference the igSplitButton.
    */
  var expanding: js.UndefOr[ExpandingEvent] = js.native
  /**
    * Button items.
    *
    */
  var items: js.UndefOr[js.Array[IgSplitButtonItem]] = js.native
  /**
    * Specifies whether the default button will be switched when another button is selected.
    *
    */
  var swapDefaultEnabled: js.UndefOr[Boolean] = js.native
}

object IgSplitButton {
  @scala.inline
  def apply(): IgSplitButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSplitButton]
  }
  @scala.inline
  implicit class IgSplitButtonOps[Self <: IgSplitButton] (val x: Self) extends AnyVal {
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
    def setClick(value: (/* event */ Event, /* ui */ ClickEventUIParam) => Unit): Self = this.set("click", js.Any.fromFunction2(value))
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setCollapsed(value: (/* event */ Event, /* ui */ CollapsedEventUIParam) => Unit): Self = this.set("collapsed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setCollapsing(value: (/* event */ Event, /* ui */ CollapsingEventUIParam) => Unit): Self = this.set("collapsing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCollapsing: Self = this.set("collapsing", js.undefined)
    @scala.inline
    def setDefaultItemName(value: String): Self = this.set("defaultItemName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultItemName: Self = this.set("defaultItemName", js.undefined)
    @scala.inline
    def setExpanded(value: (/* event */ Event, /* ui */ ExpandedEventUIParam) => Unit): Self = this.set("expanded", js.Any.fromFunction2(value))
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setExpanding(value: (/* event */ Event, /* ui */ ExpandingEventUIParam) => Unit): Self = this.set("expanding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteExpanding: Self = this.set("expanding", js.undefined)
    @scala.inline
    def setItemsVarargs(value: IgSplitButtonItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[IgSplitButtonItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setSwapDefaultEnabled(value: Boolean): Self = this.set("swapDefaultEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwapDefaultEnabled: Self = this.set("swapDefaultEnabled", js.undefined)
  }
  
}

