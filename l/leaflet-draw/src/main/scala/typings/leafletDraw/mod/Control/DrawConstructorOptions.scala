package typings.leafletDraw.mod.Control

import typings.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawConstructorOptions extends js.Object {
  /**
    * The options used to configure the draw toolbar.
    *
    * @default {}
    */
  var draw: js.UndefOr[DrawOptions] = js.native
  /**
    * The options used to configure the edit toolbar.
    *
    * @default false
    */
  var edit: js.UndefOr[EditOptions] = js.native
  /**
    * The initial position of the control (one of the map corners).
    *
    * @default 'topleft'
    */
  var position: js.UndefOr[ControlPosition] = js.native
}

object DrawConstructorOptions {
  @scala.inline
  def apply(): DrawConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawConstructorOptions]
  }
  @scala.inline
  implicit class DrawConstructorOptionsOps[Self <: DrawConstructorOptions] (val x: Self) extends AnyVal {
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
    def setDraw(value: DrawOptions): Self = this.set("draw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraw: Self = this.set("draw", js.undefined)
    @scala.inline
    def setEdit(value: EditOptions): Self = this.set("edit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    @scala.inline
    def setPosition(value: ControlPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

