package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.constructedOptionsMod.ConstructedOptions
import typings.licenseWebpackPlugin.pluginOptionsMod.PluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginOptionsReaderMod {
  
  @JSImport("license-webpack-plugin/dist/PluginOptionsReader", "PluginOptionsReader")
  @js.native
  open class PluginOptionsReader protected () extends StObject {
    def this(context: String) = this()
    
    /* private */ var context: Any = js.native
    
    def readOptions(options: PluginOptions): ConstructedOptions = js.native
  }
}
