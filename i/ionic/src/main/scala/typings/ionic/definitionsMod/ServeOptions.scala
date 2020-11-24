package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServeOptions extends js.Object {
  
  var `--`: js.Array[String] = js.native
  
  var address: String = js.native
  
  var browser: js.UndefOr[String] = js.native
  
  var browserOption: js.UndefOr[String] = js.native
  
  var devapp: Boolean = js.native
  
  var engine: String = js.native
  
  var externalAddressRequired: js.UndefOr[Boolean] = js.native
  
  var lab: Boolean = js.native
  
  var labHost: String = js.native
  
  var labPort: Double = js.native
  
  var livereload: Boolean = js.native
  
  var open: Boolean = js.native
  
  var platform: js.UndefOr[String] = js.native
  
  var port: Double = js.native
  
  var project: js.UndefOr[String] = js.native
  
  var proxy: Boolean = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
object ServeOptions {
  
  @scala.inline
  def apply(
    `--`: js.Array[String],
    address: String,
    devapp: Boolean,
    engine: String,
    lab: Boolean,
    labHost: String,
    labPort: Double,
    livereload: Boolean,
    open: Boolean,
    port: Double,
    proxy: Boolean
  ): ServeOptions = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], devapp = devapp.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], lab = lab.asInstanceOf[js.Any], labHost = labHost.asInstanceOf[js.Any], labPort = labPort.asInstanceOf[js.Any], livereload = livereload.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServeOptions]
  }
  
  @scala.inline
  implicit class ServeOptionsOps[Self <: ServeOptions] (val x: Self) extends AnyVal {
    
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
    def `set--Varargs`(value: String*): Self = this.set("--", js.Array(value :_*))
    
    @scala.inline
    def `set--`(value: js.Array[String]): Self = this.set("--", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevapp(value: Boolean): Self = this.set("devapp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: String): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLab(value: Boolean): Self = this.set("lab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabHost(value: String): Self = this.set("labHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabPort(value: Double): Self = this.set("labPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivereload(value: Boolean): Self = this.set("livereload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxy(value: Boolean): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser(value: String): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    
    @scala.inline
    def setBrowserOption(value: String): Self = this.set("browserOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowserOption: Self = this.set("browserOption", js.undefined)
    
    @scala.inline
    def setExternalAddressRequired(value: Boolean): Self = this.set("externalAddressRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalAddressRequired: Self = this.set("externalAddressRequired", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
