package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Features extends js.Object {
  
  var intl: Boolean = js.native
  
  var intlTokens: Boolean = js.native
  
  var relative: Boolean = js.native
  
  var zones: Boolean = js.native
}
object Features {
  
  @scala.inline
  def apply(intl: Boolean, intlTokens: Boolean, relative: Boolean, zones: Boolean): Features = {
    val __obj = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any], intlTokens = intlTokens.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
  
  @scala.inline
  implicit class FeaturesOps[Self <: Features] (val x: Self) extends AnyVal {
    
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
    def setIntl(value: Boolean): Self = this.set("intl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntlTokens(value: Boolean): Self = this.set("intlTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelative(value: Boolean): Self = this.set("relative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZones(value: Boolean): Self = this.set("zones", value.asInstanceOf[js.Any])
  }
}
