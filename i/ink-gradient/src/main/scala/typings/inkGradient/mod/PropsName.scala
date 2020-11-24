package typings.inkGradient.mod

import typings.inkGradient.inkGradientStrings.atlas
import typings.inkGradient.inkGradientStrings.cristal
import typings.inkGradient.inkGradientStrings.fruit
import typings.inkGradient.inkGradientStrings.instagram
import typings.inkGradient.inkGradientStrings.mind
import typings.inkGradient.inkGradientStrings.morning
import typings.inkGradient.inkGradientStrings.passion
import typings.inkGradient.inkGradientStrings.pastel
import typings.inkGradient.inkGradientStrings.rainbow
import typings.inkGradient.inkGradientStrings.retro
import typings.inkGradient.inkGradientStrings.summer
import typings.inkGradient.inkGradientStrings.teen
import typings.inkGradient.inkGradientStrings.vice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsName extends js.Object {
  
  var name: cristal | teen | mind | morning | vice | passion | fruit | instagram | atlas | retro | summer | pastel | rainbow = js.native
}
object PropsName {
  
  @scala.inline
  def apply(
    name: cristal | teen | mind | morning | vice | passion | fruit | instagram | atlas | retro | summer | pastel | rainbow
  ): PropsName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsName]
  }
  
  @scala.inline
  implicit class PropsNameOps[Self <: PropsName] (val x: Self) extends AnyVal {
    
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
    def setName(
      value: cristal | teen | mind | morning | vice | passion | fruit | instagram | atlas | retro | summer | pastel | rainbow
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
