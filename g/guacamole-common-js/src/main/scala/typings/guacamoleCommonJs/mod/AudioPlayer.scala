package typings.guacamoleCommonJs.mod

import typings.guacamoleCommonJs.guacCommonMod.Mimetype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-common-js", "AudioPlayer")
@js.native
open class AudioPlayer ()
  extends typings.guacamoleCommonJs.audioPlayerMod.AudioPlayer
/* static members */
object AudioPlayer {
  
  @JSImport("guacamole-common-js", "AudioPlayer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns an instance of Guacamole.AudioPlayer providing support for the given
    * audio format. If support for the given audio format is not available, null
    * is returned.
    *
    * @param stream The Guacamole.InputStream to read audio data from.
    * @param mimetype The mimetype of the audio data in the provided stream.
    * @return A Guacamole.AudioPlayer instance supporting the given mimetype and
    * reading from the given stream, or null if support for the given mimetype is absent.
    */
  inline def getInstance(stream: typings.guacamoleCommonJs.inputStreamMod.InputStream, mimetype: Mimetype): typings.guacamoleCommonJs.audioPlayerMod.AudioPlayer | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(stream.asInstanceOf[js.Any], mimetype.asInstanceOf[js.Any])).asInstanceOf[typings.guacamoleCommonJs.audioPlayerMod.AudioPlayer | Null]
  
  /**
    * Returns a list of all mimetypes supported by any built-in
    * Guacamole.AudioPlayer, in rough order of priority. Beware that only the core
    * mimetypes themselves will be listed. Any mimetype parameters, even required
    * ones, will not be included in the list. For example, "audio/L8" is a
    * supported raw audio mimetype that is supported, but it is invalid without
    * additional parameters. Something like "audio/L8;rate=44100" would be valid,
    * however (see https://tools.ietf.org/html/rfc4856).
    * @returns A list of all mimetypes supported by any built-in Guacamole.AudioPlayer, excluding any parameters.
    */
  inline def getSupportedTypes(): js.Array[Mimetype] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedTypes")().asInstanceOf[js.Array[Mimetype]]
}
