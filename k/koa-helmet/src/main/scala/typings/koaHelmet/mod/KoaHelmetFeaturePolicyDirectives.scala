package typings.koaHelmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KoaHelmetFeaturePolicyDirectives extends js.Object {
  var accelerometer: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var ambientLightSensor: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var autoplay: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var camera: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var documentDomain: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var documentWrite: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var encryptedMedia: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var fontDisplayLateSwap: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var fullscreen: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var geolocation: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var gyroscope: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var layoutAnimations: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var legacyImageFormats: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var loadingFrameDefaultEager: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var magnetometer: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var microphone: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var midi: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var oversizedImages: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var payment: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var pictureInPicture: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var serial: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var speaker: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var syncScript: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var syncXhr: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var unoptimizedImages: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var unoptimizedLosslessImages: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var unoptimizedLossyImages: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var unsizedMedia: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var usb: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var verticalScroll: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var vibrate: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var vr: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var wakeLock: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
  var xr: js.UndefOr[js.Array[KoaHelmetFeaturePolicyDirectiveValue]] = js.native
}

object KoaHelmetFeaturePolicyDirectives {
  @scala.inline
  def apply(): KoaHelmetFeaturePolicyDirectives = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KoaHelmetFeaturePolicyDirectives]
  }
  @scala.inline
  implicit class KoaHelmetFeaturePolicyDirectivesOps[Self <: KoaHelmetFeaturePolicyDirectives] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccelerometerVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("accelerometer", js.Array(value :_*))
    @scala.inline
    def setAccelerometer(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("accelerometer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccelerometer: Self = this.set("accelerometer", js.undefined)
    @scala.inline
    def setAmbientLightSensorVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("ambientLightSensor", js.Array(value :_*))
    @scala.inline
    def setAmbientLightSensor(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("ambientLightSensor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmbientLightSensor: Self = this.set("ambientLightSensor", js.undefined)
    @scala.inline
    def setAutoplayVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("autoplay", js.Array(value :_*))
    @scala.inline
    def setAutoplay(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setCameraVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("camera", js.Array(value :_*))
    @scala.inline
    def setCamera(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("camera", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCamera: Self = this.set("camera", js.undefined)
    @scala.inline
    def setDocumentDomainVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("documentDomain", js.Array(value :_*))
    @scala.inline
    def setDocumentDomain(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("documentDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentDomain: Self = this.set("documentDomain", js.undefined)
    @scala.inline
    def setDocumentWriteVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("documentWrite", js.Array(value :_*))
    @scala.inline
    def setDocumentWrite(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("documentWrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentWrite: Self = this.set("documentWrite", js.undefined)
    @scala.inline
    def setEncryptedMediaVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("encryptedMedia", js.Array(value :_*))
    @scala.inline
    def setEncryptedMedia(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("encryptedMedia", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptedMedia: Self = this.set("encryptedMedia", js.undefined)
    @scala.inline
    def setFontDisplayLateSwapVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("fontDisplayLateSwap", js.Array(value :_*))
    @scala.inline
    def setFontDisplayLateSwap(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("fontDisplayLateSwap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontDisplayLateSwap: Self = this.set("fontDisplayLateSwap", js.undefined)
    @scala.inline
    def setFullscreenVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("fullscreen", js.Array(value :_*))
    @scala.inline
    def setFullscreen(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    @scala.inline
    def setGeolocationVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("geolocation", js.Array(value :_*))
    @scala.inline
    def setGeolocation(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("geolocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeolocation: Self = this.set("geolocation", js.undefined)
    @scala.inline
    def setGyroscopeVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("gyroscope", js.Array(value :_*))
    @scala.inline
    def setGyroscope(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("gyroscope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGyroscope: Self = this.set("gyroscope", js.undefined)
    @scala.inline
    def setLayoutAnimationsVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("layoutAnimations", js.Array(value :_*))
    @scala.inline
    def setLayoutAnimations(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("layoutAnimations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutAnimations: Self = this.set("layoutAnimations", js.undefined)
    @scala.inline
    def setLegacyImageFormatsVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("legacyImageFormats", js.Array(value :_*))
    @scala.inline
    def setLegacyImageFormats(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("legacyImageFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegacyImageFormats: Self = this.set("legacyImageFormats", js.undefined)
    @scala.inline
    def setLoadingFrameDefaultEagerVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("loadingFrameDefaultEager", js.Array(value :_*))
    @scala.inline
    def setLoadingFrameDefaultEager(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("loadingFrameDefaultEager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingFrameDefaultEager: Self = this.set("loadingFrameDefaultEager", js.undefined)
    @scala.inline
    def setMagnetometerVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("magnetometer", js.Array(value :_*))
    @scala.inline
    def setMagnetometer(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("magnetometer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMagnetometer: Self = this.set("magnetometer", js.undefined)
    @scala.inline
    def setMicrophoneVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("microphone", js.Array(value :_*))
    @scala.inline
    def setMicrophone(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("microphone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMicrophone: Self = this.set("microphone", js.undefined)
    @scala.inline
    def setMidiVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("midi", js.Array(value :_*))
    @scala.inline
    def setMidi(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("midi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMidi: Self = this.set("midi", js.undefined)
    @scala.inline
    def setOversizedImagesVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("oversizedImages", js.Array(value :_*))
    @scala.inline
    def setOversizedImages(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("oversizedImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOversizedImages: Self = this.set("oversizedImages", js.undefined)
    @scala.inline
    def setPaymentVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("payment", js.Array(value :_*))
    @scala.inline
    def setPayment(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("payment", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment: Self = this.set("payment", js.undefined)
    @scala.inline
    def setPictureInPictureVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("pictureInPicture", js.Array(value :_*))
    @scala.inline
    def setPictureInPicture(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("pictureInPicture", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePictureInPicture: Self = this.set("pictureInPicture", js.undefined)
    @scala.inline
    def setSerialVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("serial", js.Array(value :_*))
    @scala.inline
    def setSerial(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("serial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerial: Self = this.set("serial", js.undefined)
    @scala.inline
    def setSpeakerVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("speaker", js.Array(value :_*))
    @scala.inline
    def setSpeaker(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("speaker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeaker: Self = this.set("speaker", js.undefined)
    @scala.inline
    def setSyncScriptVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("syncScript", js.Array(value :_*))
    @scala.inline
    def setSyncScript(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("syncScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncScript: Self = this.set("syncScript", js.undefined)
    @scala.inline
    def setSyncXhrVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("syncXhr", js.Array(value :_*))
    @scala.inline
    def setSyncXhr(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("syncXhr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncXhr: Self = this.set("syncXhr", js.undefined)
    @scala.inline
    def setUnoptimizedImagesVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("unoptimizedImages", js.Array(value :_*))
    @scala.inline
    def setUnoptimizedImages(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("unoptimizedImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnoptimizedImages: Self = this.set("unoptimizedImages", js.undefined)
    @scala.inline
    def setUnoptimizedLosslessImagesVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("unoptimizedLosslessImages", js.Array(value :_*))
    @scala.inline
    def setUnoptimizedLosslessImages(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("unoptimizedLosslessImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnoptimizedLosslessImages: Self = this.set("unoptimizedLosslessImages", js.undefined)
    @scala.inline
    def setUnoptimizedLossyImagesVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("unoptimizedLossyImages", js.Array(value :_*))
    @scala.inline
    def setUnoptimizedLossyImages(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("unoptimizedLossyImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnoptimizedLossyImages: Self = this.set("unoptimizedLossyImages", js.undefined)
    @scala.inline
    def setUnsizedMediaVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("unsizedMedia", js.Array(value :_*))
    @scala.inline
    def setUnsizedMedia(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("unsizedMedia", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsizedMedia: Self = this.set("unsizedMedia", js.undefined)
    @scala.inline
    def setUsbVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("usb", js.Array(value :_*))
    @scala.inline
    def setUsb(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("usb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsb: Self = this.set("usb", js.undefined)
    @scala.inline
    def setVerticalScrollVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("verticalScroll", js.Array(value :_*))
    @scala.inline
    def setVerticalScroll(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("verticalScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalScroll: Self = this.set("verticalScroll", js.undefined)
    @scala.inline
    def setVibrateVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("vibrate", js.Array(value :_*))
    @scala.inline
    def setVibrate(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("vibrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVibrate: Self = this.set("vibrate", js.undefined)
    @scala.inline
    def setVrVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("vr", js.Array(value :_*))
    @scala.inline
    def setVr(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("vr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVr: Self = this.set("vr", js.undefined)
    @scala.inline
    def setWakeLockVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("wakeLock", js.Array(value :_*))
    @scala.inline
    def setWakeLock(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("wakeLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWakeLock: Self = this.set("wakeLock", js.undefined)
    @scala.inline
    def setXrVarargs(value: KoaHelmetFeaturePolicyDirectiveValue*): Self = this.set("xr", js.Array(value :_*))
    @scala.inline
    def setXr(value: js.Array[KoaHelmetFeaturePolicyDirectiveValue]): Self = this.set("xr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXr: Self = this.set("xr", js.undefined)
  }
  
}

