package typings
package hlsDotJsLib.distHlsDotLightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls.js/dist/hls.light", JSImport.Namespace)
@js.native
/**
  * Constructor. Can be provided an HlsConfig object as default properties and or overrides
  */
class namespaced ()
  extends hlsDotJsLib.hlsDotJsMod.namespaced {
  def this(config: stdLib.Partial[hlsDotJsLib.hlsDotJsMod.HlsNs.Config]) = this()
}

/* static members */
@JSImport("hls.js/dist/hls.light", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /**
    * override Hls default configuration
    * this configuration will be applied by default to all instances
    */
  var DefaultConfig: hlsDotJsLib.hlsDotJsMod.HlsNs.Config = js.native
  /**
    * Hls error details
    */
  var ErrorDetails: hlsDotJsLib.Anon_AUDIOTRACKLOADERROR = js.native
  /**
    * Hls error types
    */
  var ErrorTypes: hlsDotJsLib.Anon_KEYSYSTEMERROR = js.native
  /**
    * Hls events
    */
  var Events: hlsDotJsLib.Anon_AUDIOTRACKLOADED = js.native
  /**
    * returns hls.js dist version number
    */
  var version: java.lang.String = js.native
  /**
    * checks whether your browser is supporting MediaSource Extensions
    */
  def isSupported(): scala.Boolean = js.native
}

