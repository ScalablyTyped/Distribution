package typings.ibmMobilefirst.WL.Geo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceOptions extends js.Object {
  
  var bufferZoneWidth: Double = js.native
}
object DistanceOptions {
  
  @scala.inline
  def apply(bufferZoneWidth: Double): DistanceOptions = {
    val __obj = js.Dynamic.literal(bufferZoneWidth = bufferZoneWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceOptions]
  }
  
  @scala.inline
  implicit class DistanceOptionsOps[Self <: DistanceOptions] (val x: Self) extends AnyVal {
    
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
    def setBufferZoneWidth(value: Double): Self = this.set("bufferZoneWidth", value.asInstanceOf[js.Any])
  }
}
