package typings.maximMazurokGapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerId extends js.Object {
  
  var allowedCharacterCount: js.UndefOr[Double] = js.native
  
  var layerId: js.UndefOr[String] = js.native
  
  var limitType: js.UndefOr[String] = js.native
  
  var remainingCharacterCount: js.UndefOr[Double] = js.native
  
  var updated: js.UndefOr[String] = js.native
}
object LayerId {
  
  @scala.inline
  def apply(): LayerId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerId]
  }
  
  @scala.inline
  implicit class LayerIdOps[Self <: LayerId] (val x: Self) extends AnyVal {
    
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
    def setAllowedCharacterCount(value: Double): Self = this.set("allowedCharacterCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedCharacterCount: Self = this.set("allowedCharacterCount", js.undefined)
    
    @scala.inline
    def setLayerId(value: String): Self = this.set("layerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerId: Self = this.set("layerId", js.undefined)
    
    @scala.inline
    def setLimitType(value: String): Self = this.set("limitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitType: Self = this.set("limitType", js.undefined)
    
    @scala.inline
    def setRemainingCharacterCount(value: Double): Self = this.set("remainingCharacterCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemainingCharacterCount: Self = this.set("remainingCharacterCount", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
}
