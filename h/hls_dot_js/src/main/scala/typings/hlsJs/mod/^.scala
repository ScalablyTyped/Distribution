package typings.hlsJs.mod

import typings.hlsJs.anon.AUDIOTRACKLOADED
import typings.hlsJs.anon.AUDIOTRACKLOADERROR
import typings.hlsJs.anon.KEYSYSTEMERROR
import typings.hlsJs.anon.PartialConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", JSImport.Namespace)
@js.native
/**
  * Constructor. Can be provided an HlsConfig object as default properties and or overrides
  */
class ^ () extends Hls {
  def this(config: PartialConfig) = this()
}
@JSImport("hls.js", JSImport.Namespace)
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
  var ErrorDetails: AUDIOTRACKLOADERROR = js.native
  
  /**
    * Hls error types
    */
  var ErrorTypes: KEYSYSTEMERROR = js.native
  
  /**
    * Hls events
    */
  var Events: AUDIOTRACKLOADED = js.native
  
  /**
    * checks whether your browser is supporting MediaSource Extensions
    */
  def isSupported(): Boolean = js.native
  
  /**
    * returns hls.js dist version number
    */
  var version: String = js.native
}
