package typings.guacamoleClient.mod

import typings.guacamoleClient.guacCommonMod.Mimetype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "RawAudioFormat")
@js.native
class RawAudioFormat protected ()
  extends typings.guacamoleClient.rawAudioFormatMod.RawAudioFormat {
  /**
    * @param template The object whose properties should be copied into the corresponding
    * properties of the new Guacamole.RawAudioFormat.
    */
  def this(template: typings.guacamoleClient.rawAudioFormatMod.RawAudioFormat) = this()
}
/* static members */
object RawAudioFormat {
  
  /**
    * Parses the given mimetype, returning a new Guacamole.RawAudioFormat
    * which describes the type of raw audio data represented by that mimetype. If
    * the mimetype is not a supported raw audio data mimetype, null is returned.
    *
    * @param mimetype The audio mimetype to parse.
    * @returns
    *     A new Guacamole.RawAudioFormat which describes the type of raw
    *     audio data represented by the given mimetype, or null if the given
    *     mimetype is not supported.
    */
  @JSImport("guacamole-client", "RawAudioFormat.parse")
  @js.native
  def parse(mimetype: Mimetype): typings.guacamoleClient.rawAudioFormatMod.RawAudioFormat = js.native
}
