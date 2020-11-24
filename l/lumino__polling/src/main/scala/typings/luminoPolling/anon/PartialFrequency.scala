package typings.luminoPolling.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@lumino/polling.@lumino/polling.IPoll.Frequency> */
@js.native
trait PartialFrequency extends js.Object {
  
  var backoff: js.UndefOr[Boolean | Double] = js.native
  
  var interval: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[Double] = js.native
}
object PartialFrequency {
  
  @scala.inline
  def apply(): PartialFrequency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFrequency]
  }
  
  @scala.inline
  implicit class PartialFrequencyOps[Self <: PartialFrequency] (val x: Self) extends AnyVal {
    
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
    def setBackoff(value: Boolean | Double): Self = this.set("backoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackoff: Self = this.set("backoff", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
  }
}
