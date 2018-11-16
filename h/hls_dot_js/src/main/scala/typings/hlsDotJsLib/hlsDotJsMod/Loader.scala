package typings
package hlsDotJsLib.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls.js", "Loader")
@js.native
class Loader protected ()
  extends hlsDotJsLib.hlsDotJsMod.HlsNs.Loader {
  def this(config: hlsDotJsLib.hlsDotJsMod.HlsNs.LoaderConfig) = this()
  /**
           * Abort any loading in progress.
           */
  /* CompleteClass */
  override def abort(): scala.Unit = js.native
  /**
           * Destroy loading context.
           */
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /**
           * Start retrieving content located at given URL (HTTP GET).
           */
  /* CompleteClass */
  override def load(
    context: hlsDotJsLib.hlsDotJsMod.HlsNs.LoaderContext,
    config: hlsDotJsLib.hlsDotJsMod.HlsNs.LoaderConfig,
    callbacks: hlsDotJsLib.hlsDotJsMod.HlsNs.LoaderCallbacks
  ): scala.Unit = js.native
}

