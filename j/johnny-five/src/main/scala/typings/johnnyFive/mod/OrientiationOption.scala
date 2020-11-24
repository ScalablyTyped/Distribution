package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrientiationOption extends js.Object {
  
  var controller: js.UndefOr[String] = js.native
  
  var freq: js.UndefOr[Double] = js.native
}
object OrientiationOption {
  
  @scala.inline
  def apply(): OrientiationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrientiationOption]
  }
  
  @scala.inline
  implicit class OrientiationOptionOps[Self <: OrientiationOption] (val x: Self) extends AnyVal {
    
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
    def setController(value: String): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    
    @scala.inline
    def setFreq(value: Double): Self = this.set("freq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreq: Self = this.set("freq", js.undefined)
  }
}
