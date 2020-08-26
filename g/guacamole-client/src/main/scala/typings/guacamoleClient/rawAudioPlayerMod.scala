package typings.guacamoleClient

import typings.guacamoleClient.audioPlayerMod.AudioPlayer
import typings.guacamoleClient.guacCommonMod.Mimetype
import typings.guacamoleClient.inputStreamMod.InputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client/lib/RawAudioPlayer", JSImport.Namespace)
@js.native
object rawAudioPlayerMod extends js.Object {
  @js.native
  class RawAudioPlayer protected () extends AudioPlayer {
    /**
      * @param stream The Guacamole.InputStream to read audio data from.
      *
      * @param mimetype The mimetype of the audio data in the provided stream, which must be a
      * "audio/L8" or "audio/L16" mimetype with necessary parameters, such as: "audio/L16;rate=44100,channels=2".
      */
    def this(stream: InputStream, mimetype: Mimetype) = this()
  }
  
  /* static members */
  @js.native
  object RawAudioPlayer extends js.Object {
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
    def getSupportedTypes(): js.Array[Mimetype] = js.native
    /**
      * Determines whether the given mimetype is supported by
      * Guacamole.RawAudioPlayer.
      * @param mimetype The mimetype to check.
      * @returns true if the given mimetype is supported by Guacamole.RawAudioPlayer, false otherwise.
      */
    def isSupportedType(mimetype: Mimetype): Boolean = js.native
  }
  
}

