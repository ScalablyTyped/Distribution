package typings.jsreportReports.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends js.Object {
  
  var cleanInterval: js.UndefOr[String] = js.native
  
  var cleanTreshold: js.UndefOr[String] = js.native
}
object Configuration {
  
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    
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
    def setCleanInterval(value: String): Self = this.set("cleanInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleanInterval: Self = this.set("cleanInterval", js.undefined)
    
    @scala.inline
    def setCleanTreshold(value: String): Self = this.set("cleanTreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleanTreshold: Self = this.set("cleanTreshold", js.undefined)
  }
}
