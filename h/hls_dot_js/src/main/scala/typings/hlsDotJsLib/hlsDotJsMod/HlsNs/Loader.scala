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

object Loader {
  @scala.inline
  def apply(
    abort: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    load: js.Function3[LoaderContext, LoaderConfig, LoaderCallbacks, scala.Unit]
  ): Loader = {
    val __obj = js.Dynamic.literal(abort = abort, destroy = destroy, load = load)
  
    __obj.asInstanceOf[Loader]
  }
}

