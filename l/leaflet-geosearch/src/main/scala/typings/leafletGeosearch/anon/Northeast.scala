package typings.leafletGeosearch.anon

import typings.leafletGeosearch.mod.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Northeast extends js.Object {
  
  var northeast: LatLngLiteral = js.native
  
  var southwest: LatLngLiteral = js.native
}
object Northeast {
  
  @scala.inline
  def apply(northeast: LatLngLiteral, southwest: LatLngLiteral): Northeast = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Northeast]
  }
  
  @scala.inline
  implicit class NortheastOps[Self <: Northeast] (val x: Self) extends AnyVal {
    
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
    def setNortheast(value: LatLngLiteral): Self = this.set("northeast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouthwest(value: LatLngLiteral): Self = this.set("southwest", value.asInstanceOf[js.Any])
  }
}
