package typings.karma.mod

import typings.karma.karmaStrings.run_complete
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("karma", "Server")
@js.native
class Server_ () extends EventEmitter {
  def this(options: ConfigFile) = this()
  def this(options: ConfigOptions) = this()
  def this(options: Unit, callback: ServerCallback) = this()
  def this(options: ConfigFile, callback: ServerCallback) = this()
  def this(options: ConfigOptions, callback: ServerCallback) = this()
  
  /**
    * Get properties from the injector
    * @param token
    */
  def get(token: String): js.Any = js.native
  
  /**
    * Listen to the 'run_complete' event.
    */
  @JSName("on")
  def on_runcomplete(
    event: run_complete,
    listener: js.Function2[/* browsers */ js.Any, /* results */ TestResults, Unit]
  ): this.type = js.native
  
  /**
    * Force a refresh of the file list
    */
  def refreshFiles(): js.Promise[js.Any] = js.native
  
  /**
    * Start the server
    */
  def start(): Unit = js.native
}
