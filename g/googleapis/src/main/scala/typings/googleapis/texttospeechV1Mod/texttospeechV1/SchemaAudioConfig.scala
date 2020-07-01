package typings.googleapis.texttospeechV1Mod.texttospeechV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of audio data to be synthesized.
  */
@js.native
trait SchemaAudioConfig extends js.Object {
  /**
    * Required. The format of the requested audio byte stream.
    */
  var audioEncoding: js.UndefOr[String] = js.native
  /**
    * An identifier which selects &#39;audio effects&#39; profiles that are
    * applied on (post synthesized) text to speech. Effects are applied on top
    * of each other in the order they are given. See  [audio-profiles](https:
    * //cloud.google.com/text-to-speech/docs/audio-profiles) for current
    * supported profile ids.
    */
  var effectsProfileId: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional speaking pitch, in the range [-20.0, 20.0]. 20 means increase 20
    * semitones from the original pitch. -20 means decrease 20 semitones from
    * the original pitch.
    */
  var pitch: js.UndefOr[Double] = js.native
  /**
    * The synthesis sample rate (in hertz) for this audio. Optional.  If this
    * is different from the voice&#39;s natural sample rate, then the
    * synthesizer will honor this request by converting to the desired sample
    * rate (which might result in worse audio quality), unless the specified
    * sample rate is not supported for the encoding chosen, in which case it
    * will fail the request and return google.rpc.Code.INVALID_ARGUMENT.
    */
  var sampleRateHertz: js.UndefOr[Double] = js.native
  /**
    * Optional speaking rate/speed, in the range [0.25, 4.0]. 1.0 is the normal
    * native speed supported by the specific voice. 2.0 is twice as fast, and
    * 0.5 is half as fast. If unset(0.0), defaults to the native 1.0 speed. Any
    * other values &lt; 0.25 or &gt; 4.0 will return an error.
    */
  var speakingRate: js.UndefOr[Double] = js.native
  /**
    * Optional volume gain (in dB) of the normal native volume supported by the
    * specific voice, in the range [-96.0, 16.0]. If unset, or set to a value
    * of 0.0 (dB), will play at normal native signal amplitude. A value of -6.0
    * (dB) will play at approximately half the amplitude of the normal native
    * signal amplitude. A value of +6.0 (dB) will play at approximately twice
    * the amplitude of the normal native signal amplitude. Strongly recommend
    * not to exceed +10 (dB) as there&#39;s usually no effective increase in
    * loudness for any value greater than that.
    */
  var volumeGainDb: js.UndefOr[Double] = js.native
}

object SchemaAudioConfig {
  @scala.inline
  def apply(
    audioEncoding: String = null,
    effectsProfileId: js.Array[String] = null,
    pitch: js.UndefOr[Double] = js.undefined,
    sampleRateHertz: js.UndefOr[Double] = js.undefined,
    speakingRate: js.UndefOr[Double] = js.undefined,
    volumeGainDb: js.UndefOr[Double] = js.undefined
  ): SchemaAudioConfig = {
    val __obj = js.Dynamic.literal()
    if (audioEncoding != null) __obj.updateDynamic("audioEncoding")(audioEncoding.asInstanceOf[js.Any])
    if (effectsProfileId != null) __obj.updateDynamic("effectsProfileId")(effectsProfileId.asInstanceOf[js.Any])
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRateHertz)) __obj.updateDynamic("sampleRateHertz")(sampleRateHertz.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speakingRate)) __obj.updateDynamic("speakingRate")(speakingRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(volumeGainDb)) __obj.updateDynamic("volumeGainDb")(volumeGainDb.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAudioConfig]
  }
}

