package typings.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryOptions extends js.Object {
  
  var factor: js.UndefOr[Double] = js.native
  
  var maxTimeout: js.UndefOr[Double] = js.native
  
  var minTimeout: js.UndefOr[Double] = js.native
  
  var randomize: js.UndefOr[Boolean] = js.native
  
  var retries: js.UndefOr[Double] = js.native
}
object RetryOptions {
  
  @scala.inline
  def apply(): RetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryOptions]
  }
  
  @scala.inline
  implicit class RetryOptionsOps[Self <: RetryOptions] (val x: Self) extends AnyVal {
    
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
    def setFactor(value: Double): Self = this.set("factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFactor: Self = this.set("factor", js.undefined)
    
    @scala.inline
    def setMaxTimeout(value: Double): Self = this.set("maxTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTimeout: Self = this.set("maxTimeout", js.undefined)
    
    @scala.inline
    def setMinTimeout(value: Double): Self = this.set("minTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinTimeout: Self = this.set("minTimeout", js.undefined)
    
    @scala.inline
    def setRandomize(value: Boolean): Self = this.set("randomize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRandomize: Self = this.set("randomize", js.undefined)
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
  }
}
