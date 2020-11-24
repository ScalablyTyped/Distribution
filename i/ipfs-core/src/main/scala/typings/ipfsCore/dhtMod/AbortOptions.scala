package typings.ipfsCore.dhtMod

import typings.std.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbortOptions extends js.Object {
  
  /**
    * - Can be used to cancel any long running requests started as a result of this call
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  
  /**
    * - A timeout in ms
    */
  var timeout: js.UndefOr[Double] = js.native
}
object AbortOptions {
  
  @scala.inline
  def apply(): AbortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbortOptions]
  }
  
  @scala.inline
  implicit class AbortOptionsOps[Self <: AbortOptions] (val x: Self) extends AnyVal {
    
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
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
