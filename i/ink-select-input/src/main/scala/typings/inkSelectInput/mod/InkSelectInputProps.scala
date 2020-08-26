package typings.inkSelectInput.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InkSelectInputProps extends js.Object {
  /**
  	 * Listen to user's input. Useful in case there are multiple input components
  	 * at the same time and input must be "routed" to a specific component.
  	 */
  var focus: js.UndefOr[Boolean] = js.native
  /**
  	 * Custom component to override the default indicator component.
  	 */
  var indicatorComponent: js.UndefOr[ComponentType[IndicatorProps]] = js.native
  /**
  	 * Index of initially-selected item in `items` array.
  	 */
  var initialIndex: js.UndefOr[Double] = js.native
  /**
  	 * Custom component to override the default item component.
  	 */
  var itemComponent: js.UndefOr[ComponentType[ItemProps]] = js.native
  /**
  	 * Items to display in a list. Each item must be an object and have `label` and `value` props,
  	 * it may also optionally have a `key` prop.
  	 * If no `key` prop is provided, `value` will be used as the item key.
  	 */
  var items: js.UndefOr[js.Array[Item]] = js.native
  /**
  	 * Number of items to display.
  	 */
  var limit: js.UndefOr[Double] = js.native
  /**
  	 * Function to call when user highlights an item.
  	 * Item object is passed to that function as an argument.
  	 */
  var onHighlight: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.native
  /**
  	 * Function to call when user selects an item.
  	 * Item object is passed to that function as an argument.
  	 */
  var onSelect: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.native
}

object InkSelectInputProps {
  @scala.inline
  def apply(): InkSelectInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkSelectInputProps]
  }
  @scala.inline
  implicit class InkSelectInputPropsOps[Self <: InkSelectInputProps] (val x: Self) extends AnyVal {
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
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setIndicatorComponent(value: ComponentType[IndicatorProps]): Self = this.set("indicatorComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicatorComponent: Self = this.set("indicatorComponent", js.undefined)
    @scala.inline
    def setInitialIndex(value: Double): Self = this.set("initialIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialIndex: Self = this.set("initialIndex", js.undefined)
    @scala.inline
    def setItemComponent(value: ComponentType[ItemProps]): Self = this.set("itemComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemComponent: Self = this.set("itemComponent", js.undefined)
    @scala.inline
    def setItemsVarargs(value: Item*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Item]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setOnHighlight(value: /* item */ Item => Unit): Self = this.set("onHighlight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHighlight: Self = this.set("onHighlight", js.undefined)
    @scala.inline
    def setOnSelect(value: /* item */ Item => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
  }
  
}

