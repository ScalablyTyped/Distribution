package typings.maximMazurokGapiClientChromeuxreport.gapi.client.chromeuxreport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bin extends js.Object {
  
  /** The proportion of users that experienced this bin's value for the given metric. */
  var density: js.UndefOr[Double] = js.native
  
  /** End is the end of the data bin. If end is not populated, then the bin has no end and is valid from start to +inf. */
  var end: js.UndefOr[js.Any] = js.native
  
  /** Start is the beginning of the data bin. */
  var start: js.UndefOr[js.Any] = js.native
}
object Bin {
  
  @scala.inline
  def apply(): Bin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bin]
  }
  
  @scala.inline
  implicit class BinOps[Self <: Bin] (val x: Self) extends AnyVal {
    
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
    def setDensity(value: Double): Self = this.set("density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDensity: Self = this.set("density", js.undefined)
    
    @scala.inline
    def setEnd(value: js.Any): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setStart(value: js.Any): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
