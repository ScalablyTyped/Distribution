package typings.iconGen.mod

import typings.iconGen.anon.Ico
import typings.iconGen.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var favicon: js.UndefOr[Ico | js.Object] = js.native
  
  var icns: js.UndefOr[Name | js.Object] = js.native
  
  var ico: js.UndefOr[Name | js.Object] = js.native
  
  var report: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setFavicon(value: Ico | js.Object): Self = this.set("favicon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFavicon: Self = this.set("favicon", js.undefined)
    
    @scala.inline
    def setIcns(value: Name | js.Object): Self = this.set("icns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcns: Self = this.set("icns", js.undefined)
    
    @scala.inline
    def setIco(value: Name | js.Object): Self = this.set("ico", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIco: Self = this.set("ico", js.undefined)
    
    @scala.inline
    def setReport(value: Boolean): Self = this.set("report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReport: Self = this.set("report", js.undefined)
  }
}
