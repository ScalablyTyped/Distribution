package typings.guacamoleClient.mod

import typings.guacamoleClient.libGuacCommonMod.Mimetype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "RawAudioRecorder")
@js.native
open class RawAudioRecorder protected ()
  extends typings.guacamoleClient.libRawAudioRecorderMod.RawAudioRecorder {
  /**
    * @param stream The Guacamole.OutputStream to write audio data to.
    *
    * @param mimetype The mimetype of the audio data to send along the provided stream, which
    * must be a "audio/L8" or "audio/L16" mimetype with necessary parameters,
    * such as: "audio/L16;rate=44100,channels=2".
    */
  def this(stream: typings.guacamoleClient.libOutputStreamMod.OutputStream, mimetype: Mimetype) = this()
}
/* static members */
object RawAudioRecorder {
  
  @JSImport("guacamole-client", "RawAudioRecorder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a list of all mimetypes supported by Guacamole.RawAudioRecorder. Only
    * the core mimetypes themselves will be listed. Any mimetype parameters, even
    * required ones, will not be included in the list. For example, "audio/L8" is
    * a raw audio mimetype that may be supported, but it is invalid without
    * additional parameters. Something like "audio/L8;rate=44100" would be valid,
    * however (see https://tools.ietf.org/html/rfc4856).
    *
    * @returns
    *     A list of all mimetypes supported by Guacamole.RawAudioRecorder,
    *     excluding any parameters. If the necessary JavaScript APIs for recording
    *     raw audio are absent, this list will be empty.
    */
  inline def getSupportedTypes(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedTypes")().asInstanceOf[js.Array[String]]
  
  @JSImport("guacamole-client", "RawAudioRecorder.isSupportedType")
  @js.native
  def isSupportedType: js.Function1[/* mimetype */ Mimetype, Boolean] = js.native
  inline def isSupportedType(mimetype: Mimetype): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedType")(mimetype.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isSupportedType_=(x: js.Function1[/* mimetype */ Mimetype, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSupportedType")(x.asInstanceOf[js.Any])
}
