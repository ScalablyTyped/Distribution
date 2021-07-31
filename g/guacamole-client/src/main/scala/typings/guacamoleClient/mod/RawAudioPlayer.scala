package typings.guacamoleClient.mod

import typings.guacamoleClient.guacCommonMod.Mimetype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "RawAudioPlayer")
@js.native
class RawAudioPlayer protected ()
  extends typings.guacamoleClient.rawAudioPlayerMod.RawAudioPlayer {
  /**
    * @param stream The Guacamole.InputStream to read audio data from.
    *
    * @param mimetype The mimetype of the audio data in the provided stream, which must be a
    * "audio/L8" or "audio/L16" mimetype with necessary parameters, such as: "audio/L16;rate=44100,channels=2".
    */
  def this(stream: typings.guacamoleClient.inputStreamMod.InputStream, mimetype: Mimetype) = this()
}
/* static members */
object RawAudioPlayer {
  
  @JSImport("guacamole-client", "RawAudioPlayer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a list of all mimetypes supported by Guacamole.RawAudioPlayer. Only
    * the core mimetypes themselves will be listed. Any mimetype parameters, even
    * required ones, will not be included in the list. For example, "audio/L8" is
    * a raw audio mimetype that may be supported, but it is invalid without
    * additional parameters. Something like "audio/L8;rate=44100" would be valid,
    * however (see https://tools.ietf.org/html/rfc4856).
    *
    * @returns
    *     A list of all mimetypes supported by Guacamole.RawAudioPlayer, excluding
    *     any parameters. If the necessary JavaScript APIs for playing raw audio
    *     are absent, this list will be empty.
    */
  @scala.inline
  def getSupportedTypes(): js.Array[Mimetype] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedTypes")().asInstanceOf[js.Array[Mimetype]]
  
  /**
    * Determines whether the given mimetype is supported by
    * Guacamole.RawAudioPlayer.
    * @param mimetype The mimetype to check.
    * @returns true if the given mimetype is supported by Guacamole.RawAudioPlayer, false otherwise.
    */
  @scala.inline
  def isSupportedType(mimetype: Mimetype): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedType")(mimetype.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
