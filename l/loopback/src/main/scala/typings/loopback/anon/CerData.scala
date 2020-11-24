package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CerData extends js.Object {
  
  var cerData: String = js.native
  
  var feedBackOptions: BatchFeedback = js.native
  
  var keyData: String = js.native
  
  var production: Boolean = js.native
  
  var pushOptions: Gateway = js.native
}
object CerData {
  
  @scala.inline
  def apply(
    cerData: String,
    feedBackOptions: BatchFeedback,
    keyData: String,
    production: Boolean,
    pushOptions: Gateway
  ): CerData = {
    val __obj = js.Dynamic.literal(cerData = cerData.asInstanceOf[js.Any], feedBackOptions = feedBackOptions.asInstanceOf[js.Any], keyData = keyData.asInstanceOf[js.Any], production = production.asInstanceOf[js.Any], pushOptions = pushOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CerData]
  }
  
  @scala.inline
  implicit class CerDataOps[Self <: CerData] (val x: Self) extends AnyVal {
    
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
    def setCerData(value: String): Self = this.set("cerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedBackOptions(value: BatchFeedback): Self = this.set("feedBackOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyData(value: String): Self = this.set("keyData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduction(value: Boolean): Self = this.set("production", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushOptions(value: Gateway): Self = this.set("pushOptions", value.asInstanceOf[js.Any])
  }
}
