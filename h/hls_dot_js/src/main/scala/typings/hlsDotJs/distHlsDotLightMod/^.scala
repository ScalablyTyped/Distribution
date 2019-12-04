package typings.hlsDotJs.distHlsDotLightMod

import typings.hlsDotJs.Anon_AUDIOTRACKLOADED
import typings.hlsDotJs.Anon_AUDIOTRACKLOADERROR
import typings.hlsDotJs.Anon_KEYSYSTEMERROR
import typings.hlsDotJs.hlsDotJsMod.Config
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls.js/dist/hls.light", JSImport.Namespace)
@js.native
/**
  * Constructor. Can be provided an HlsConfig object as default properties and or overrides
  */
class ^ ()
  extends typings.hlsDotJs.hlsDotJsMod.^ {
  def this(config: Partial[Config]) = this()
}

@JSImport("hls.js/dist/hls.light", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * override Hls default configuration
    * this configuration will be applied by default to all instances
    */
  var DefaultConfig: Config = js.native
  /**
    * Hls error details
    */
  var ErrorDetails: Anon_AUDIOTRACKLOADERROR = js.native
  /**
    * Hls error types
    */
  var ErrorTypes: Anon_KEYSYSTEMERROR = js.native
  /**
    * Hls events
    */
  var Events: Anon_AUDIOTRACKLOADED = js.native
  /**
    * returns hls.js dist version number
    */
  var version: String = js.native
  /**
    * checks whether your browser is supporting MediaSource Extensions
    */
  def isSupported(): Boolean = js.native
}

