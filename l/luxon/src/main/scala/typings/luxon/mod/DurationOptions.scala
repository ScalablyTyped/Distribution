package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurationOptions extends js.Object {
  
  var conversionAccuracy: js.UndefOr[ConversionAccuracy] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var numberingSystem: js.UndefOr[NumberingSystem] = js.native
}
object DurationOptions {
  
  @scala.inline
  def apply(): DurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationOptions]
  }
  
  @scala.inline
  implicit class DurationOptionsOps[Self <: DurationOptions] (val x: Self) extends AnyVal {
    
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
    def setConversionAccuracy(value: ConversionAccuracy): Self = this.set("conversionAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversionAccuracy: Self = this.set("conversionAccuracy", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setNumberingSystem(value: NumberingSystem): Self = this.set("numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberingSystem: Self = this.set("numberingSystem", js.undefined)
  }
}
