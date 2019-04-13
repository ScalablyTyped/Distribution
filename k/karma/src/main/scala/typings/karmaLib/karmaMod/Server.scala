package typings
package karmaLib.karmaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("karma", "Server")
@js.native
class Server ()
  extends nodeLib.NodeJSNs.EventEmitter {
  def this(options: ConfigFile) = this()
  def this(options: ConfigOptions) = this()
  def this(options: ConfigFile, callback: ServerCallback) = this()
  def this(options: ConfigOptions, callback: ServerCallback) = this()
  /**
    * Get properties from the injector
    * @param token
    */
  def get(token: java.lang.String): js.Any = js.native
  /**
    * Listen to the 'run_complete' event.
    */
  @JSName("on")
  def on_run_complete(
    event: karmaLib.karmaLibStrings.run_complete,
    listener: js.Function2[/* browsers */ js.Any, /* results */ TestResults, scala.Unit]
  ): this.type = js.native
  /**
    * Force a refresh of the file list
    */
  def refreshFiles(): bluebirdLib.bluebirdMod.^[_] = js.native
  /**
    * Start the server
    */
  def start(): scala.Unit = js.native
}

