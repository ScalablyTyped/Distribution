package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileRenderingEventUIParam extends js.Object {
  /**
    * Used to get a reference to the tile manager performing rendering.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Used to get a reference to the tile being rendered
    */
  var tile: js.UndefOr[js.Any] = js.native
}

object TileRenderingEventUIParam {
  @scala.inline
  def apply(): TileRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileRenderingEventUIParam]
  }
  @scala.inline
  implicit class TileRenderingEventUIParamOps[Self <: TileRenderingEventUIParam] (val x: Self) extends AnyVal {
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
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setTile(value: js.Any): Self = this.set("tile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTile: Self = this.set("tile", js.undefined)
  }
  
}

