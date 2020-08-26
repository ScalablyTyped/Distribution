package typings.ionicCore.componentsMod.Components

import typings.ionicCore.ionicCoreStrings.full
import typings.ionicCore.ionicCoreStrings.inset
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.ionicCoreStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonList extends js.Object {
  /**
    * If `true`, the list will have margin around it and rounded corners.
    */
  var inset: Boolean = js.native
  /**
    * How the bottom border should be displayed on all items.
    */
  var lines: js.UndefOr[full | inset | none] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  /**
    * If `ion-item-sliding` are used inside the list, this method closes any open sliding item.  Returns `true` if an actual `ion-item-sliding` is closed.
    */
  def closeSlidingItems(): js.Promise[Boolean] = js.native
}

object IonList {
  @scala.inline
  def apply(closeSlidingItems: () => js.Promise[Boolean], inset: Boolean): IonList = {
    val __obj = js.Dynamic.literal(closeSlidingItems = js.Any.fromFunction0(closeSlidingItems), inset = inset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonList]
  }
  @scala.inline
  implicit class IonListOps[Self <: IonList] (val x: Self) extends AnyVal {
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
    def setCloseSlidingItems(value: () => js.Promise[Boolean]): Self = this.set("closeSlidingItems", js.Any.fromFunction0(value))
    @scala.inline
    def setInset(value: Boolean): Self = this.set("inset", value.asInstanceOf[js.Any])
    @scala.inline
    def setLines(value: full | inset | none): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
    @scala.inline
    def setMode(value: ios | md): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

