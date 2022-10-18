package typings.guacamoleClient

import typings.guacamoleClient.libGuacCommonMod.Mimetype
import typings.guacamoleClient.libOutputStreamMod.OutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAudioRecorderMod {
  
  @JSImport("guacamole-client/lib/AudioRecorder", "AudioRecorder")
  @js.native
  open class AudioRecorder () extends StObject {
    
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
  object AudioRecorder {
    
    @JSImport("guacamole-client/lib/AudioRecorder", "AudioRecorder")
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
    inline def getInstance(stream: OutputStream, mimetype: Mimetype): AudioRecorder | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(stream.asInstanceOf[js.Any], mimetype.asInstanceOf[js.Any])).asInstanceOf[AudioRecorder | Null]
    
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
}
