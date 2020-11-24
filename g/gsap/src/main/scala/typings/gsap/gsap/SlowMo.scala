package typings.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlowMo extends Ease {
  
  def config(linearRatio: Double, power: Double, yoyoMode: Boolean): SlowMo = js.native
}
object SlowMo {
  
  @scala.inline
  def apply(config: (Double, Double, Boolean) => SlowMo, getRatio: Double => Double): SlowMo = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction3(config), getRatio = js.Any.fromFunction1(getRatio))
    __obj.asInstanceOf[SlowMo]
  }
  
  @scala.inline
  implicit class SlowMoOps[Self <: SlowMo] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: (Double, Double, Boolean) => SlowMo): Self = this.set("config", js.Any.fromFunction3(value))
  }
}
