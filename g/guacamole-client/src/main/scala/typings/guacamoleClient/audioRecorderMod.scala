package typings.guacamoleClient

import typings.guacamoleClient.guacCommonMod.Mimetype
import typings.guacamoleClient.outputStreamMod.OutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client/lib/AudioRecorder", JSImport.Namespace)
@js.native
object audioRecorderMod extends js.Object {
  @js.native
  class AudioRecorder () extends js.Object {
    /**
      * Callback which is invoked when the audio recording process has stopped
      * and the underlying Guacamole stream has been closed normally. Audio will
      * only resume recording if a new Guacamole.AudioRecorder is started. This
      * Guacamole.AudioRecorder instance MAY NOT be reused.
      *
      * @event
      */
    var onclose: Null | js.Function0[Unit] = js.native
    /**
      * Callback which is invoked when the audio recording process cannot
      * continue due to an error, if it has started at all. The underlying
      * Guacamole stream is automatically closed. Future attempts to record
      * audio should not be made, and this Guacamole.AudioRecorder instance
      * MAY NOT be reused.
      *
      * @event
      */
    var onerror: Null | js.Function0[Unit] = js.native
  }
  
  /* static members */
  @js.native
  object AudioRecorder extends js.Object {
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
    def getInstance(stream: OutputStream, mimetype: Mimetype): AudioRecorder | Null = js.native
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
    def getSupportedTypes(): js.Array[String] = js.native
    /**
      * Determines whether the given mimetype is supported by any built-in
      * implementation of Guacamole.AudioRecorder, and thus will be properly handled
      * by Guacamole.AudioRecorder.getInstance().
      *
      * @param mimetype The mimetype to check.
      *
      * @returns true if the given mimetype is supported by any built-in Guacamole.AudioRecorder, false otherwise.
      */
    def isSupportedType(mimetype: Mimetype): Boolean = js.native
  }
  
}

