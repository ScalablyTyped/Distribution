package typings.guacamoleClient.mod

import typings.guacamoleClient.libGuacCommonMod.Mimetype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "AudioRecorder")
@js.native
open class AudioRecorder ()
  extends typings.guacamoleClient.libAudioRecorderMod.AudioRecorder
/* static members */
object AudioRecorder {
  
  @JSImport("guacamole-client", "AudioRecorder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns an instance of Guacamole.AudioRecorder providing support for the
    * given audio format. If support for the given audio format is not available,
    * null is returned.
    *
    * @param stream The Guacamole.OutputStream to send audio data through.
    *
    * @param mimetype The mimetype of the audio data to be sent along the provided stream.
    * @return A Guacamole.AudioRecorder instance supporting the given mimetype and
    * writing to the given stream, or null if support for the given mimetype is absent.
    */
  inline def getInstance(stream: typings.guacamoleClient.libOutputStreamMod.OutputStream, mimetype: Mimetype): typings.guacamoleClient.libAudioRecorderMod.AudioRecorder | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(stream.asInstanceOf[js.Any], mimetype.asInstanceOf[js.Any])).asInstanceOf[typings.guacamoleClient.libAudioRecorderMod.AudioRecorder | Null]
  
  /**
    * Returns a list of all mimetypes supported by any built-in
    * Guacamole.AudioRecorder, in rough order of priority. Beware that only the
    * core mimetypes themselves will be listed. Any mimetype parameters, even
    * required ones, will not be included in the list. For example, "audio/L8" is
    * a supported raw audio mimetype that is supported, but it is invalid without
    * additional parameters. Something like "audio/L8;rate=44100" would be valid,
    * however (see https://tools.ietf.org/html/rfc4856).
    *
    * A list of all mimetypes supported by any built-in
    * Guacamole.AudioRecorder, excluding any parameters.
    */
  inline def getSupportedTypes(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedTypes")().asInstanceOf[js.Array[String]]
  
  /**
    * Determines whether the given mimetype is supported by any built-in
    * implementation of Guacamole.AudioRecorder, and thus will be properly handled
    * by Guacamole.AudioRecorder.getInstance().
    *
    * @param mimetype The mimetype to check.
    *
    * @returns true if the given mimetype is supported by any built-in Guacamole.AudioRecorder, false otherwise.
    */
  inline def isSupportedType(mimetype: Mimetype): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedType")(mimetype.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
