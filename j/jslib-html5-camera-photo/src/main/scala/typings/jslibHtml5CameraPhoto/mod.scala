package typings.jslibHtml5CameraPhoto

import typings.jslibHtml5CameraPhoto.jslibHtml5CameraPhotoStrings.environment
import typings.jslibHtml5CameraPhoto.jslibHtml5CameraPhotoStrings.jpg
import typings.jslibHtml5CameraPhoto.jslibHtml5CameraPhotoStrings.png
import typings.jslibHtml5CameraPhoto.jslibHtml5CameraPhotoStrings.user
import typings.std.ConstrainULong
import typings.std.HTMLVideoElement
import typings.std.MediaDeviceInfo
import typings.std.MediaDevices
import typings.std.MediaStream
import typings.std.MediaTrackSettings
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jslib-html5-camera-photo", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CameraPhoto {
    def this(videoElement: HTMLVideoElement) = this()
  }
  
  @JSImport("jslib-html5-camera-photo", "FACING_MODES")
  @js.native
  val FACING_MODES: FacingModes = js.native
  
  @JSImport("jslib-html5-camera-photo", "IMAGE_TYPES")
  @js.native
  val IMAGE_TYPES: ImageTypes = js.native
  
  @js.native
  trait CameraPhoto extends StObject {
    
    def getCameraSettings(): MediaTrackSettings | Null = js.native
    
    def getDataUri(userConfig: CaptureConfigOption): String = js.native
    
    def getInputVideoDeviceInfos(): js.Array[MediaDeviceInfo] = js.native
    
    var inputVideoDeviceInfos: js.Array[MediaDeviceInfo] = js.native
    
    var mediaDevices: MediaDevices | Null = js.native
    
    var numberOfMaxResolutionTry: Double = js.native
    
    var settings: MediaTrackSettings | Null = js.native
    
    def startCamera(): js.Promise[MediaStream] = js.native
    def startCamera(idealFacingMode: Unit, idealResolution: Resolution): js.Promise[MediaStream] = js.native
    def startCamera(idealFacingMode: FacingMode): js.Promise[MediaStream] = js.native
    def startCamera(idealFacingMode: FacingMode, idealResolution: Resolution): js.Promise[MediaStream] = js.native
    
    def startCameraMaxResolution(): js.Promise[MediaStream] = js.native
    def startCameraMaxResolution(idealFacingMode: js.Object): js.Promise[MediaStream] = js.native
    def startCameraMaxResolution(idealFacingMode: FacingMode): js.Promise[MediaStream] = js.native
    
    def stopCamera(): js.Promise[Unit] = js.native
    
    var stream: MediaStream | Null = js.native
    
    var videoElement: HTMLVideoElement = js.native
    
    var windowURL: URL = js.native
  }
  
  trait CaptureConfigOption extends StObject {
    
    /**
      * Used to get the desired compression when `jpg` is selected. choose a
      * compression between `[0, 1]`, 1 is maximum, 0 is minimum. The default
      * value imageCompression is `0.92`.
      */
    var imageCompression: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Used to get the desired image type between `jpg` or `png`. to specify
      * the imageType use the constant IMAGE_TYPES, for example to specify jpg
      * format use IMAGE_TYPES.JPG. The default imageType is `png`
      */
    var imageType: js.UndefOr[ImageType] = js.undefined
    
    /**
      * Used to get an image mirror when is set to `true`, the result of the
      * `dataUri` is the mirror of the actual camera data. Many software that use
      * camera mirror like hangout etc... Please note if you want to enable this
      * option, for consistency with the camera video, you need to use css
      * `transform: rotateY(180deg)` to the **&lt;video&gt;** tag to mirror the
      * stream, because the stream is not mirrored. It's only apply to the canvas
      * dataUri. The default value is `false` (no mirror).
      */
    var isImageMirror: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used to get a desired resolution. Example, a sizeFactor of `1` get the
      * same resolution of the camera while sizeFactor of `0.5` get the half
      * resolution of the camera. The sizeFactor can be between range of `]0, 1]`
      * and the default value is `1`.
      */
    var sizeFactor: js.UndefOr[Double] = js.undefined
  }
  object CaptureConfigOption {
    
    inline def apply(): CaptureConfigOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptureConfigOption]
    }
    
    extension [Self <: CaptureConfigOption](x: Self) {
      
      inline def setImageCompression(value: Double): Self = StObject.set(x, "imageCompression", value.asInstanceOf[js.Any])
      
      inline def setImageCompressionNull: Self = StObject.set(x, "imageCompression", null)
      
      inline def setImageCompressionUndefined: Self = StObject.set(x, "imageCompression", js.undefined)
      
      inline def setImageType(value: ImageType): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
      
      inline def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
      
      inline def setIsImageMirror(value: Boolean): Self = StObject.set(x, "isImageMirror", value.asInstanceOf[js.Any])
      
      inline def setIsImageMirrorUndefined: Self = StObject.set(x, "isImageMirror", js.undefined)
      
      inline def setSizeFactor(value: Double): Self = StObject.set(x, "sizeFactor", value.asInstanceOf[js.Any])
      
      inline def setSizeFactorUndefined: Self = StObject.set(x, "sizeFactor", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jslibHtml5CameraPhoto.jslibHtml5CameraPhotoStrings.user
    - typings.jslibHtml5CameraPhoto.jslibHtml5CameraPhotoStrings.environment
  */
  trait FacingMode extends StObject
  object FacingMode {
    
    inline def environment: typings.jslibHtml5CameraPhoto.jslibHtml5CameraPhotoStrings.environment = "environment".asInstanceOf[typings.jslibHtml5CameraPhoto.jslibHtml5CameraPhotoStrings.environment]
    
    inline def user: typings.jslibHtml5CameraPhoto.jslibHtml5CameraPhotoStrings.user = "user".asInstanceOf[typings.jslibHtml5CameraPhoto.jslibHtml5CameraPhotoStrings.user]
  }
  
  trait FacingModes extends StObject {
    
    var ENVIRONMENT: environment
    
    var USER: user
  }
  object FacingModes {
    
    inline def apply(): FacingModes = {
      val __obj = js.Dynamic.literal(ENVIRONMENT = "environment", USER = "user")
      __obj.asInstanceOf[FacingModes]
    }
    
    extension [Self <: FacingModes](x: Self) {
      
      inline def setENVIRONMENT(value: environment): Self = StObject.set(x, "ENVIRONMENT", value.asInstanceOf[js.Any])
      
      inline def setUSER(value: user): Self = StObject.set(x, "USER", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jslibHtml5CameraPhoto.jslibHtml5CameraPhotoStrings.png
    - typings.jslibHtml5CameraPhoto.jslibHtml5CameraPhotoStrings.jpg
  */
  trait ImageType extends StObject
  object ImageType {
    
    inline def jpg: typings.jslibHtml5CameraPhoto.jslibHtml5CameraPhotoStrings.jpg = "jpg".asInstanceOf[typings.jslibHtml5CameraPhoto.jslibHtml5CameraPhotoStrings.jpg]
    
    inline def png: typings.jslibHtml5CameraPhoto.jslibHtml5CameraPhotoStrings.png = "png".asInstanceOf[typings.jslibHtml5CameraPhoto.jslibHtml5CameraPhotoStrings.png]
  }
  
  trait ImageTypes extends StObject {
    
    var JPG: jpg
    
    var PNG: png
  }
  object ImageTypes {
    
    inline def apply(): ImageTypes = {
      val __obj = js.Dynamic.literal(JPG = "jpg", PNG = "png")
      __obj.asInstanceOf[ImageTypes]
    }
    
    extension [Self <: ImageTypes](x: Self) {
      
      inline def setJPG(value: jpg): Self = StObject.set(x, "JPG", value.asInstanceOf[js.Any])
      
      inline def setPNG(value: png): Self = StObject.set(x, "PNG", value.asInstanceOf[js.Any])
    }
  }
  
  trait Resolution extends StObject {
    
    var height: js.UndefOr[ConstrainULong] = js.undefined
    
    var width: js.UndefOr[ConstrainULong] = js.undefined
  }
  object Resolution {
    
    inline def apply(): Resolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Resolution]
    }
    
    extension [Self <: Resolution](x: Self) {
      
      inline def setHeight(value: ConstrainULong): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: ConstrainULong): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
