package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AngularServeOptions extends ServeOptions {
  
  var configuration: js.UndefOr[String] = js.native
  
  var consolelogs: js.UndefOr[Boolean] = js.native
  
  var consolelogsPort: js.UndefOr[Double] = js.native
  
  var sourcemaps: js.UndefOr[Boolean] = js.native
  
  var ssl: js.UndefOr[Boolean] = js.native
}
object AngularServeOptions {
  
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
  ): AngularServeOptions = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], devapp = devapp.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], lab = lab.asInstanceOf[js.Any], labHost = labHost.asInstanceOf[js.Any], labPort = labPort.asInstanceOf[js.Any], livereload = livereload.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularServeOptions]
  }
  
  @scala.inline
  implicit class AngularServeOptionsMutableBuilder[Self <: AngularServeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setConsolelogs(value: Boolean): Self = StObject.set(x, "consolelogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsolelogsPort(value: Double): Self = StObject.set(x, "consolelogsPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsolelogsPortUndefined: Self = StObject.set(x, "consolelogsPort", js.undefined)
    
    @scala.inline
    def setConsolelogsUndefined: Self = StObject.set(x, "consolelogs", js.undefined)
    
    @scala.inline
    def setSourcemaps(value: Boolean): Self = StObject.set(x, "sourcemaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcemapsUndefined: Self = StObject.set(x, "sourcemaps", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
  }
}
