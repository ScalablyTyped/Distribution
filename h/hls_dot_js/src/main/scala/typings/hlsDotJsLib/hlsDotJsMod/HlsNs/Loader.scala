package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loader extends js.Object {
  /**
    * Abort any loading in progress.
    */
  def abort(): scala.Unit
  /**
    * Destroy loading context.
    */
  def destroy(): scala.Unit
  /**
    * Start retrieving content located at given URL (HTTP GET).
    */
  def load(context: LoaderContext, config: LoaderConfig, callbacks: LoaderCallbacks): scala.Unit
}

