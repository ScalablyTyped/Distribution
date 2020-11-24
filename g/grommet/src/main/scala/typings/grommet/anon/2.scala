package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends js.Object {
  
  var `1`: js.UndefOr[Font] = js.native
  
  var `2`: js.UndefOr[Font] = js.native
  
  var `3`: js.UndefOr[Font] = js.native
  
  var `4`: js.UndefOr[Font] = js.native
  
  var `5`: js.UndefOr[Font] = js.native
  
  var `6`: js.UndefOr[Font] = js.native
}
object `2` {
  
  @scala.inline
  def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2Ops`[Self <: `2`] (val x: Self) extends AnyVal {
    
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
    def set1(value: Font): Self = this.set("1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete1: Self = this.set("1", js.undefined)
    
    @scala.inline
    def set2(value: Font): Self = this.set("2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete2: Self = this.set("2", js.undefined)
    
    @scala.inline
    def set3(value: Font): Self = this.set("3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete3: Self = this.set("3", js.undefined)
    
    @scala.inline
    def set4(value: Font): Self = this.set("4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete4: Self = this.set("4", js.undefined)
    
    @scala.inline
    def set5(value: Font): Self = this.set("5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete5: Self = this.set("5", js.undefined)
    
    @scala.inline
    def set6(value: Font): Self = this.set("6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete6: Self = this.set("6", js.undefined)
  }
}
