package typings
package karmaLib.karmaMod.karmaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server
  extends nodeLib.NodeJSNs.EventEmitter
     with // TODO: Figure out how to convert Server to class and remove suppression
// tslint:disable-next-line:no-misused-new
ScalablyTyped.runtime.Instantiable1[(/* options */ ConfigOptions) | (/* options */ ConfigFile), Server]
     with // TODO: Figure out how to convert Server to class and remove suppression
// tslint:disable-next-line:no-misused-new
ScalablyTyped.runtime.Instantiable2[
      (/* options */ ConfigOptions) | (/* options */ ConfigFile), 
      /* callback */ ServerCallback, 
      Server
    ]
     with // TODO: Figure out how to convert Server to class and remove suppression
// tslint:disable-next-line:no-misused-new
ScalablyTyped.runtime.Instantiable0[Server] {
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
  def refreshFiles(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
           * Start the server
           */
  def start(): scala.Unit = js.native
}

