package typings.guacamoleClient

import typings.guacamoleClient.guacCommonMod.Mimetype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client/lib/RawAudioFormat", JSImport.Namespace)
@js.native
object rawAudioFormatMod extends js.Object {
  
  @js.native
  class RawAudioFormat protected () extends js.Object {
    /**
      * @param template The object whose properties should be copied into the corresponding
      * properties of the new Guacamole.RawAudioFormat.
      */
    def this(template: RawAudioFormat) = this()
    
    /**
      * The number of bytes in each sample of audio data. This value is
      * independent of the number of channels.
      */
    var bytesPerSample: Double = js.native
    
    /**
      * The number of audio channels (ie: 1 for mono, 2 for stereo).
      *
      */
    var channels: Double = js.native
    
    /**
      * The number of samples per second, per channel.
      */
    var rate: Double = js.native
  }
  /* static members */
  @js.native
  object RawAudioFormat extends js.Object {
    
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
    def parse(mimetype: Mimetype): RawAudioFormat = js.native
  }
}
