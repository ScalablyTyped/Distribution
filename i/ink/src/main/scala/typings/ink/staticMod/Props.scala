package typings.ink.staticMod

import typings.ink.stylesMod.Styles
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props[T] extends Styles {
  /**
    * Array of items of any type to render using a function you pass as a component child.
    */
  val items: js.Array[T] = js.native
  /**
    * Styles to apply to a container of child elements. See <Box> for supported properties.
    */
  val style: js.UndefOr[Styles] = js.native
  /**
    * Function that is called to render every item in `items` array.
    * First argument is an item itself and second argument is index of that item in `items` array.
    * Note that `key` must be assigned to the root component.
    */
  def children(item: T, index: Double): ReactNode = js.native
}

object Props {
  @scala.inline
  def apply[T](children: (T, Double) => ReactNode, items: js.Array[T]): Props[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props[_], T] (val x: Self with Props[T]) extends AnyVal {
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
    def setChildren(value: (T, Double) => ReactNode): Self = this.set("children", js.Any.fromFunction2(value))
    @scala.inline
    def setItemsVarargs(value: T*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[T]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: Styles): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

