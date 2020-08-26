package typings.ionicCore.componentsMod.LocalJSX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonGrid extends js.Object {
  /**
    * If `true`, the grid will have a fixed width based on the screen size.
    */
  var fixed: js.UndefOr[Boolean] = js.native
}

object IonGrid {
  @scala.inline
  def apply(): IonGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonGrid]
  }
  @scala.inline
  implicit class IonGridOps[Self <: IonGrid] (val x: Self) extends AnyVal {
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
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
  }
  
}

