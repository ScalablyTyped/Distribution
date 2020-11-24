package typings.maximMazurokGapiClientChromeuxreport.gapi.client.chromeuxreport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Percentiles extends js.Object {
  
  /** 75% of users experienced the given metric at or below this value. */
  var p75: js.UndefOr[js.Any] = js.native
}
object Percentiles {
  
  @scala.inline
  def apply(): Percentiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Percentiles]
  }
  
  @scala.inline
  implicit class PercentilesOps[Self <: Percentiles] (val x: Self) extends AnyVal {
    
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
    def setP75(value: js.Any): Self = this.set("p75", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP75: Self = this.set("p75", js.undefined)
  }
}
