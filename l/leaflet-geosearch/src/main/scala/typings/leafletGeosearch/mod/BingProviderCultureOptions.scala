package typings.leafletGeosearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Bing Maps
  */
@js.native
trait BingProviderCultureOptions extends js.Object {
  
  var c: js.UndefOr[String] = js.native
  
  var culture: js.UndefOr[String] = js.native
}
object BingProviderCultureOptions {
  
  @scala.inline
  def apply(): BingProviderCultureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BingProviderCultureOptions]
  }
  
  @scala.inline
  implicit class BingProviderCultureOptionsOps[Self <: BingProviderCultureOptions] (val x: Self) extends AnyVal {
    
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
    def setC(value: String): Self = this.set("c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteC: Self = this.set("c", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
  }
}
