package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServeOptions extends StObject {
  
  var `--`: js.Array[String]
  
  var address: String
  
  var browser: js.UndefOr[String] = js.undefined
  
  var browserOption: js.UndefOr[String] = js.undefined
  
  var devapp: Boolean
  
  var engine: String
  
  var externalAddressRequired: js.UndefOr[Boolean] = js.undefined
  
  var lab: Boolean
  
  var labHost: String
  
  var labPort: Double
  
  var livereload: Boolean
  
  var open: Boolean
  
  var platform: js.UndefOr[String] = js.undefined
  
  var port: Double
  
  var project: js.UndefOr[String] = js.undefined
  
  var proxy: Boolean
  
  var verbose: js.UndefOr[Boolean] = js.undefined
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
  implicit class ServeOptionsMutableBuilder[Self <: ServeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `set--`(value: js.Array[String]): Self = StObject.set(x, "--", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set--Varargs`(value: String*): Self = StObject.set(x, "--", js.Array(value :_*))
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserOption(value: String): Self = StObject.set(x, "browserOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserOptionUndefined: Self = StObject.set(x, "browserOption", js.undefined)
    
    @scala.inline
    def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    @scala.inline
    def setDevapp(value: Boolean): Self = StObject.set(x, "devapp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalAddressRequired(value: Boolean): Self = StObject.set(x, "externalAddressRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalAddressRequiredUndefined: Self = StObject.set(x, "externalAddressRequired", js.undefined)
    
    @scala.inline
    def setLab(value: Boolean): Self = StObject.set(x, "lab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabHost(value: String): Self = StObject.set(x, "labHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabPort(value: Double): Self = StObject.set(x, "labPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivereload(value: Boolean): Self = StObject.set(x, "livereload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setProxy(value: Boolean): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
