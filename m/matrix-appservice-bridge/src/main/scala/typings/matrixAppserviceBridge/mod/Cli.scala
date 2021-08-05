package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.cliMod.CliOpts
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "Cli")
@js.native
class Cli[ConfigType /* <: Record[String, js.Any] */] protected ()
  extends typings.matrixAppserviceBridge.cliMod.Cli[ConfigType] {
  /**
    * @constructor
    * @param opts CLI options
    * @param opts.run The function called when you should run the bridge.
    * @param opts.generateRegistration The function
    * called when you should generate a registration.
    * @param opts.bridgeConfig Bridge-specific config info. If null, no
    * --config option will be present in the CLI. Default: null.
    * @param opts.bridgeConfig.affectsRegistration True to make the
    * --config option required when generating the registration. The parsed config
    * can be accessed via <code>Cli.getConfig()</code>.
    * @param opts.bridgeConfig.schema Path to a schema YAML file
    * (string) or the parsed schema file (Object).
    * @param opts.bridgeConfig.defaults The default options for the
    * config file.
    * @param opts.noUrl Don't ask user for appservice url when generating
    * registration.
    * @param opts.enableRegistration Enable '--generate-registration'.
    * Default True.
    * @param opts.registrationPath The path to write the registration
    * file to. Users can overwrite this with -f.
    * @param opts.enableLocalpart Enable '--localpart [-l]'. Default: false.
    */
  def this(opts: CliOpts[ConfigType]) = this()
}
/* static members */
object Cli {
  
  @JSImport("matrix-appservice-bridge", "Cli")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("matrix-appservice-bridge", "Cli.DEFAULT_FILENAME")
  @js.native
  def DEFAULT_FILENAME: String = js.native
  inline def DEFAULT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_FILENAME")(x.asInstanceOf[js.Any])
  
  @JSImport("matrix-appservice-bridge", "Cli.DEFAULT_PORT")
  @js.native
  def DEFAULT_PORT: Double = js.native
  inline def DEFAULT_PORT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_PORT")(x.asInstanceOf[js.Any])
  
  @JSImport("matrix-appservice-bridge", "Cli.DEFAULT_WATCH_INTERVAL")
  @js.native
  def DEFAULT_WATCH_INTERVAL: Double = js.native
  inline def DEFAULT_WATCH_INTERVAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_WATCH_INTERVAL")(x.asInstanceOf[js.Any])
}
