package typings.karmaMaterialReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaterialReporterOptions extends js.Object {
  
  /**
    * whether to open the reporter UI automatically in the default browser
    * @default true
    */
  var autoOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * expand all the expandable suite menus
    * @default true
    */
  var expandSuites: js.UndefOr[Boolean] = js.native
  
  /**
    * port in which the reporter startes a express server
    * @default 3000
    */
  var serverPort: js.UndefOr[Double] = js.native
}
object MaterialReporterOptions {
  
  @scala.inline
  def apply(): MaterialReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaterialReporterOptions]
  }
  
  @scala.inline
  implicit class MaterialReporterOptionsOps[Self <: MaterialReporterOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoOpen(value: Boolean): Self = this.set("autoOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoOpen: Self = this.set("autoOpen", js.undefined)
    
    @scala.inline
    def setExpandSuites(value: Boolean): Self = this.set("expandSuites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandSuites: Self = this.set("expandSuites", js.undefined)
    
    @scala.inline
    def setServerPort(value: Double): Self = this.set("serverPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerPort: Self = this.set("serverPort", js.undefined)
  }
}
