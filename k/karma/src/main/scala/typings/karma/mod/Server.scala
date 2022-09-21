package typings.karma.mod

import typings.karma.karmaStrings.run_complete
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("karma", "Server")
@js.native
open class Server () extends EventEmitter {
  def this(options: ConfigFile) = this()
  def this(options: ConfigOptions) = this()
  def this(options: Config_) = this()
  def this(options: Unit, callback: ServerCallback) = this()
  def this(options: ConfigFile, callback: ServerCallback) = this()
  def this(options: ConfigOptions, callback: ServerCallback) = this()
  def this(options: Config_, callback: ServerCallback) = this()
  
  /**
    * Get properties from the injector
    * @param token
    */
  def get(token: String): Any = js.native
  
  /**
    * Listen to the 'run_complete' event.
    */
  @JSName("on")
  def on_runcomplete(event: run_complete, listener: js.Function2[/* browsers */ Any, /* results */ TestResults, Unit]): this.type = js.native
  
  def refreshFile(path: String): js.Promise[Any] = js.native
  
  /**
    * Force a refresh of the file list
    */
  def refreshFiles(): js.Promise[Any] = js.native
  
  /**
    * Start the server
    */
  def start(): js.Promise[Unit] = js.native
  
  /**
    * Stop the server
    */
  def stop(): js.Promise[Unit] = js.native
}
