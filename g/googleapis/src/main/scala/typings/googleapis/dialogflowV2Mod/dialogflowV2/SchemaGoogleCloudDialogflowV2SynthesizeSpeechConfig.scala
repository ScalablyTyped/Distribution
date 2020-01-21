package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of how speech should be synthesized.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2SynthesizeSpeechConfig extends js.Object {
  /**
    * Optional. An identifier which selects &#39;audio effects&#39; profiles
    * that are applied on (post synthesized) text to speech. Effects are
    * applied on top of each other in the order they are given.
    */
  var effectsProfileId: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. Speaking pitch, in the range [-20.0, 20.0]. 20 means increase
    * 20 semitones from the original pitch. -20 means decrease 20 semitones
    * from the original pitch.
    */
  var pitch: js.UndefOr[Double] = js.native
  /**
    * Optional. Speaking rate/speed, in the range [0.25, 4.0]. 1.0 is the
    * normal native speed supported by the specific voice. 2.0 is twice as
    * fast, and 0.5 is half as fast. If unset(0.0), defaults to the native 1.0
    * speed. Any other values &lt; 0.25 or &gt; 4.0 will return an error.
    */
  var speakingRate: js.UndefOr[Double] = js.native
  /**
    * Optional. The desired voice of the synthesized audio.
    */
  var voice: js.UndefOr[SchemaGoogleCloudDialogflowV2VoiceSelectionParams] = js.native
  /**
    * Optional. Volume gain (in dB) of the normal native volume supported by
    * the specific voice, in the range [-96.0, 16.0]. If unset, or set to a
    * value of 0.0 (dB), will play at normal native signal amplitude. A value
    * of -6.0 (dB) will play at approximately half the amplitude of the normal
    * native signal amplitude. A value of +6.0 (dB) will play at approximately
    * twice the amplitude of the normal native signal amplitude. We strongly
    * recommend not to exceed +10 (dB) as there&#39;s usually no effective
    * increase in loudness for any value greater than that.
    */
  var volumeGainDb: js.UndefOr[Double] = js.native
}

object SchemaGoogleCloudDialogflowV2SynthesizeSpeechConfig {
  @scala.inline
  def apply(
    effectsProfileId: js.Array[String] = null,
    pitch: Int | Double = null,
    speakingRate: Int | Double = null,
    voice: SchemaGoogleCloudDialogflowV2VoiceSelectionParams = null,
    volumeGainDb: Int | Double = null
  ): SchemaGoogleCloudDialogflowV2SynthesizeSpeechConfig = {
    val __obj = js.Dynamic.literal()
    if (effectsProfileId != null) __obj.updateDynamic("effectsProfileId")(effectsProfileId.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (speakingRate != null) __obj.updateDynamic("speakingRate")(speakingRate.asInstanceOf[js.Any])
    if (voice != null) __obj.updateDynamic("voice")(voice.asInstanceOf[js.Any])
    if (volumeGainDb != null) __obj.updateDynamic("volumeGainDb")(volumeGainDb.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2SynthesizeSpeechConfig]
  }
}

