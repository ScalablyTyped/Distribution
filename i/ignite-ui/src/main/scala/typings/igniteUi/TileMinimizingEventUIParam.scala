package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileMinimizingEventUIParam extends js.Object {
  /**
    * Used to get reference to the tile that is maximizing simultaneously or null if no tile is maximizing.
    */
  var maximizingTile: js.UndefOr[js.Any] = js.native
  /**
    * Used to get a reference to the tile manager performing the minimizing the tile belongs to.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Used to get the jQuery element of the tile being minimized
    */
  var tile: js.UndefOr[js.Any] = js.native
}

object TileMinimizingEventUIParam {
  @scala.inline
  def apply(): TileMinimizingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileMinimizingEventUIParam]
  }
  @scala.inline
  implicit class TileMinimizingEventUIParamOps[Self <: TileMinimizingEventUIParam] (val x: Self) extends AnyVal {
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
    def setMaximizingTile(value: js.Any): Self = this.set("maximizingTile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximizingTile: Self = this.set("maximizingTile", js.undefined)
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

