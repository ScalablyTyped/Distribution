package typings.i18nJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToNumberOptions extends js.Object {
  
  var delimiter: js.UndefOr[String] = js.native
  
  var precision: js.UndefOr[Double] = js.native
  
  var separator: js.UndefOr[String] = js.native
  
  var strip_insignificant_zeros: js.UndefOr[Boolean] = js.native
}
object ToNumberOptions {
  
  @scala.inline
  def apply(): ToNumberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToNumberOptions]
  }
  
  @scala.inline
  implicit class ToNumberOptionsOps[Self <: ToNumberOptions] (val x: Self) extends AnyVal {
    
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
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setStrip_insignificant_zeros(value: Boolean): Self = this.set("strip_insignificant_zeros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrip_insignificant_zeros: Self = this.set("strip_insignificant_zeros", js.undefined)
  }
}
