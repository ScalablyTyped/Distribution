package typings.leaflet.anon

import typings.leaflet.mod.Coords
import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Active extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var coords: Coords = js.native
  var current: Boolean = js.native
  var el: HTMLElement = js.native
  var loaded: js.UndefOr[Date] = js.native
  var retain: js.UndefOr[Boolean] = js.native
}

object Active {
  @scala.inline
  def apply(coords: Coords, current: Boolean, el: HTMLElement): Active = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  @scala.inline
  implicit class ActiveOps[Self <: Active] (val x: Self) extends AnyVal {
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
    def setCoords(value: Coords): Self = this.set("coords", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrent(value: Boolean): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setEl(value: HTMLElement): Self = this.set("el", value.asInstanceOf[js.Any])
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setLoaded(value: Date): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    @scala.inline
    def setRetain(value: Boolean): Self = this.set("retain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetain: Self = this.set("retain", js.undefined)
  }
  
}

