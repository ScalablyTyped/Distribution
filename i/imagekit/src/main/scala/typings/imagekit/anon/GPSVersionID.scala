package typings.imagekit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPSVersionID extends js.Object {
  
  var GPSVersionID: js.Array[Double] = js.native
}
object GPSVersionID {
  
  @scala.inline
  def apply(GPSVersionID: js.Array[Double]): GPSVersionID = {
    val __obj = js.Dynamic.literal(GPSVersionID = GPSVersionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPSVersionID]
  }
  
  @scala.inline
  implicit class GPSVersionIDOps[Self <: GPSVersionID] (val x: Self) extends AnyVal {
    
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
    def setGPSVersionIDVarargs(value: Double*): Self = this.set("GPSVersionID", js.Array(value :_*))
    
    @scala.inline
    def setGPSVersionID(value: js.Array[Double]): Self = this.set("GPSVersionID", value.asInstanceOf[js.Any])
  }
}
