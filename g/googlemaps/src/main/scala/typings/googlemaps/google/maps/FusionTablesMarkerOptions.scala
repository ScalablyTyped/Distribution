package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
@js.native
trait FusionTablesMarkerOptions extends js.Object {
  var iconName: String = js.native
}

object FusionTablesMarkerOptions {
  @scala.inline
  def apply(iconName: String): FusionTablesMarkerOptions = {
    val __obj = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusionTablesMarkerOptions]
  }
  @scala.inline
  implicit class FusionTablesMarkerOptionsOps[Self <: FusionTablesMarkerOptions] (val x: Self) extends AnyVal {
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
    def setIconName(value: String): Self = this.set("iconName", value.asInstanceOf[js.Any])
  }
  
}

