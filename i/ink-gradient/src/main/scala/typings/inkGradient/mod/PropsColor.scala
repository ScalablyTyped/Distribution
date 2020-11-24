package typings.inkGradient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// note, object[] in this case refers to objects interpretable by tinycolor2
@js.native
trait PropsColor extends js.Object {
  
  var colors: js.Array[js.Object | String] = js.native
}
object PropsColor {
  
  @scala.inline
  def apply(colors: js.Array[js.Object | String]): PropsColor = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsColor]
  }
  
  @scala.inline
  implicit class PropsColorOps[Self <: PropsColor] (val x: Self) extends AnyVal {
    
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
    def setColorsVarargs(value: (js.Object | String)*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[js.Object | String]): Self = this.set("colors", value.asInstanceOf[js.Any])
  }
}
