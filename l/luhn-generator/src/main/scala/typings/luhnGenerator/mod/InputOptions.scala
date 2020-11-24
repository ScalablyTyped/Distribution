package typings.luhnGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputOptions extends js.Object {
  
  /** @default 0 */
  var pad: js.UndefOr[Double] = js.native
  
  /** @default 2 */
  var weightFactor: js.UndefOr[Double] = js.native
}
object InputOptions {
  
  @scala.inline
  def apply(): InputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputOptions]
  }
  
  @scala.inline
  implicit class InputOptionsOps[Self <: InputOptions] (val x: Self) extends AnyVal {
    
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
    def setPad(value: Double): Self = this.set("pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    
    @scala.inline
    def setWeightFactor(value: Double): Self = this.set("weightFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeightFactor: Self = this.set("weightFactor", js.undefined)
  }
}
