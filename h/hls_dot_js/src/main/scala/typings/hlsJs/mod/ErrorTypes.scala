package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hls error types
  */
/* static member */
object ErrorTypes {
  
  @JSImport("hls.js", "ErrorTypes")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * EME (encrypted media extensions) errors
    */
  @JSImport("hls.js", "ErrorTypes.KEY_SYSTEM_ERROR")
  @js.native
  def KEY_SYSTEM_ERROR: K_KEY_SYSTEM_ERROR = js.native
  inline def KEY_SYSTEM_ERROR_=(x: K_KEY_SYSTEM_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEY_SYSTEM_ERROR")(x.asInstanceOf[js.Any])
  
  /**
    * Identifier for a media Error (video/parsing/mediasource error)
    */
  @JSImport("hls.js", "ErrorTypes.MEDIA_ERROR")
  @js.native
  def MEDIA_ERROR: K_MEDIA_ERROR = js.native
  inline def MEDIA_ERROR_=(x: K_MEDIA_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_ERROR")(x.asInstanceOf[js.Any])
  
  /**
    * Identifier for a mux Error (demuxing/remuxing)
    */
  @JSImport("hls.js", "ErrorTypes.MUX_ERROR")
  @js.native
  def MUX_ERROR: K_MUX_ERROR = js.native
  inline def MUX_ERROR_=(x: K_MUX_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MUX_ERROR")(x.asInstanceOf[js.Any])
  
  /**
    * Identifier for a network error (loading error / timeout ...)
    */
  @JSImport("hls.js", "ErrorTypes.NETWORK_ERROR")
  @js.native
  def NETWORK_ERROR: K_NETWORK_ERROR = js.native
  inline def NETWORK_ERROR_=(x: K_NETWORK_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NETWORK_ERROR")(x.asInstanceOf[js.Any])
  
  /**
    * Identifier for all other errors
    */
  @JSImport("hls.js", "ErrorTypes.OTHER_ERROR")
  @js.native
  def OTHER_ERROR: K_OTHER_ERROR = js.native
  inline def OTHER_ERROR_=(x: K_OTHER_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OTHER_ERROR")(x.asInstanceOf[js.Any])
}
