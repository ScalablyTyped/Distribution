package typings
package hlsDotJsLib.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls.js", "Loader")
@js.native
class Loader protected () extends js.Object {
  def this(config: LoaderConfig) = this()
  /**
    * Abort any loading in progress.
    */
  def abort(): scala.Unit = js.native
  /**
    * Destroy loading context.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Start retrieving content located at given URL (HTTP GET).
    */
  def load(context: LoaderContext, config: LoaderConfig, callbacks: LoaderCallbacks): scala.Unit = js.native
}

