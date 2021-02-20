package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactServeOptions extends ServeOptions {
  
  var ci: js.UndefOr[Boolean] = js.native
  
  var https: js.UndefOr[Boolean] = js.native
  
  var reactEditor: js.UndefOr[String] = js.native
}
object ReactServeOptions {
  
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
  ): ReactServeOptions = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], devapp = devapp.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], lab = lab.asInstanceOf[js.Any], labHost = labHost.asInstanceOf[js.Any], labPort = labPort.asInstanceOf[js.Any], livereload = livereload.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactServeOptions]
  }
  
  @scala.inline
  implicit class ReactServeOptionsMutableBuilder[Self <: ReactServeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCi(value: Boolean): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiUndefined: Self = StObject.set(x, "ci", js.undefined)
    
    @scala.inline
    def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    @scala.inline
    def setReactEditor(value: String): Self = StObject.set(x, "reactEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactEditorUndefined: Self = StObject.set(x, "reactEditor", js.undefined)
  }
}
