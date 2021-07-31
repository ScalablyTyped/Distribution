package typings.jimp

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.jimp.anon.AlignmentX
import typings.jimp.anon.AutoGreyscale
import typings.jimp.anon.B
import typings.jimp.anon.CropOnlyFrames
import typings.jimp.anon.Idx
import typings.jimp.anon.Image
import typings.jimp.anon.Opacity
import typings.jimp.anon.R
import typings.jimp.anon.Radius
import typings.jimp.anon.X
import typings.jimp.jimpNumbers.`-1`
import typings.jimp.jimpNumbers.`0`
import typings.jimp.jimpNumbers.`16`
import typings.jimp.jimpNumbers.`1`
import typings.jimp.jimpNumbers.`2`
import typings.jimp.jimpNumbers.`32`
import typings.jimp.jimpNumbers.`3`
import typings.jimp.jimpNumbers.`4`
import typings.jimp.jimpNumbers.`8`
import typings.jimp.jimpStrings.`before-change`
import typings.jimp.jimpStrings.`imageSlashx-ms-bmp`
import typings.jimp.jimpStrings.bezierInterpolation
import typings.jimp.jimpStrings.bicubicInterpolation
import typings.jimp.jimpStrings.bilinearInterpolation
import typings.jimp.jimpStrings.changed
import typings.jimp.jimpStrings.clone
import typings.jimp.jimpStrings.constructor
import typings.jimp.jimpStrings.hermiteInterpolation
import typings.jimp.jimpStrings.imageSlashbmp
import typings.jimp.jimpStrings.imageSlashgif
import typings.jimp.jimpStrings.imageSlashjgd
import typings.jimp.jimpStrings.imageSlashjpeg
import typings.jimp.jimpStrings.imageSlashpng
import typings.jimp.jimpStrings.imageSlashtiff
import typings.jimp.jimpStrings.nearestNeighbor
import typings.node.Buffer
import typings.std.Error
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jimp", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DepreciatedJimp = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("jimp", JSImport.Namespace)
  @js.native
  class Class protected ()
    extends StObject
       with DepreciatedJimp {
    // For custom constructors when using Jimp.appendConstructorOption
    def this(args: js.Any*) = this()
    def this(data: Bitmap) = this()
    def this(data: Buffer) = this()
    def this(image: DepreciatedJimp) = this()
    // Constructors
    def this(path: String) = this()
    def this(urlOptions: URLOptions) = this()
    def this(data: Bitmap, cb: ImageCallback[js.Any]) = this()
    def this(data: Buffer, cb: ImageCallback[js.Any]) = this()
    def this(image: DepreciatedJimp, cb: ImageCallback[js.Any]) = this()
    def this(path: String, cb: ImageCallback[js.Any]) = this()
    def this(urlOptions: URLOptions, cb: ImageCallback[js.Any]) = this()
    def this(w: Double, h: Double) = this()
    def this(w: Double, h: Double, background: String) = this()
    def this(w: Double, h: Double, background: Double) = this()
    def this(w: Double, h: Double, cb: ImageCallback[js.Any]) = this()
    def this(w: Double, h: Double, background: String, cb: ImageCallback[js.Any]) = this()
    def this(w: Double, h: Double, background: Double, cb: ImageCallback[js.Any]) = this()
    def this(w: Double, h: Double, background: Unit, cb: ImageCallback[js.Any]) = this()
  }
  
  /**
    * @deprecated Jimp typings for TS <3.1 are being depreciated. Please upgrade your TypeScript version
    */
  trait Bitmap extends StObject {
    
    var data: Buffer
    
    var height: Double
    
    var width: Double
  }
  object Bitmap {
    
    @scala.inline
    def apply(data: Buffer, height: Double, width: Double): Bitmap = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bitmap]
    }
    
    @scala.inline
    implicit class BitmapMutableBuilder[Self <: Bitmap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait BlendMode extends StObject {
    
    var mode: String
    
    var opacityDest: Double
    
    var opacitySource: Double
  }
  object BlendMode {
    
    @scala.inline
    def apply(mode: String, opacityDest: Double, opacitySource: Double): BlendMode = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], opacityDest = opacityDest.asInstanceOf[js.Any], opacitySource = opacitySource.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlendMode]
    }
    
    @scala.inline
    implicit class BlendModeMutableBuilder[Self <: BlendMode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityDest(value: Double): Self = StObject.set(x, "opacityDest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacitySource(value: Double): Self = StObject.set(x, "opacitySource", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jimp.jimpStrings.background
    - typings.jimp.jimpStrings.scan
    - typings.jimp.jimpStrings.crop
  */
  trait ChangeName extends StObject
  object ChangeName {
    
    @scala.inline
    def background: typings.jimp.jimpStrings.background = "background".asInstanceOf[typings.jimp.jimpStrings.background]
    
    @scala.inline
    def crop: typings.jimp.jimpStrings.crop = "crop".asInstanceOf[typings.jimp.jimpStrings.crop]
    
    @scala.inline
    def scan: typings.jimp.jimpStrings.scan = "scan".asInstanceOf[typings.jimp.jimpStrings.scan]
  }
  
  trait ColorAction extends StObject {
    
    @JSName("apply")
    var apply: ColorActionName
    
    var params: js.Any
  }
  object ColorAction {
    
    @scala.inline
    def apply(apply: ColorActionName, params: js.Any): ColorAction = {
      val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorAction]
    }
    
    @scala.inline
    implicit class ColorActionMutableBuilder[Self <: ColorAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: ColorActionName): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jimp.jimpStrings.mix
    - typings.jimp.jimpStrings.tint
    - typings.jimp.jimpStrings.shade
    - typings.jimp.jimpStrings.xor
    - typings.jimp.jimpStrings.red
    - typings.jimp.jimpStrings.green
    - typings.jimp.jimpStrings.blue
    - typings.jimp.jimpStrings.hue
  */
  trait ColorActionName extends StObject
  object ColorActionName {
    
    @scala.inline
    def blue: typings.jimp.jimpStrings.blue = "blue".asInstanceOf[typings.jimp.jimpStrings.blue]
    
    @scala.inline
    def green: typings.jimp.jimpStrings.green = "green".asInstanceOf[typings.jimp.jimpStrings.green]
    
    @scala.inline
    def hue: typings.jimp.jimpStrings.hue = "hue".asInstanceOf[typings.jimp.jimpStrings.hue]
    
    @scala.inline
    def mix: typings.jimp.jimpStrings.mix = "mix".asInstanceOf[typings.jimp.jimpStrings.mix]
    
    @scala.inline
    def red: typings.jimp.jimpStrings.red = "red".asInstanceOf[typings.jimp.jimpStrings.red]
    
    @scala.inline
    def shade: typings.jimp.jimpStrings.shade = "shade".asInstanceOf[typings.jimp.jimpStrings.shade]
    
    @scala.inline
    def tint: typings.jimp.jimpStrings.tint = "tint".asInstanceOf[typings.jimp.jimpStrings.tint]
    
    @scala.inline
    def xor: typings.jimp.jimpStrings.xor = "xor".asInstanceOf[typings.jimp.jimpStrings.xor]
  }
  
  /**
    * @deprecated Jimp typings for TS <3.1 are being depreciated. Please upgrade your TypeScript version
    */
  @js.native
  trait DepreciatedJimp
    extends StObject
       with // Constructors
  // For custom constructors when using Jimp.appendConstructorOption
  Instantiable1[
          (/* args (repeated) */ js.Any) | (/* data */ Bitmap) | (/* data */ Buffer) | (/* image */ DepreciatedJimp) | (/* path */ String) | (/* urlOptions */ URLOptions), 
          DepreciatedJimp
        ]
       with Instantiable2[
          (/* data */ Bitmap) | (/* data */ Buffer) | (/* image */ DepreciatedJimp) | (/* w */ Double) | (/* path */ String) | (/* urlOptions */ URLOptions), 
          (/* h */ Double) | (/* cb */ ImageCallback[js.Any]), 
          DepreciatedJimp
        ]
       with Instantiable3[
          /* w */ Double, 
          /* h */ Double, 
          (/* background */ Double) | (/* cb */ ImageCallback[js.Any]) | (/* background */ String), 
          DepreciatedJimp
        ]
       with Instantiable4[
          /* w */ Double, 
          /* h */ Double, 
          (/* background */ Double) | (/* background */ String) | (/* background */ Unit), 
          /* cb */ ImageCallback[js.Any], 
          DepreciatedJimp
        ] {
    
    // Constants
    var AUTO: `-1` = js.native
    
    var BLEND_DARKEN: String = js.native
    
    var BLEND_DESTINATION_OVER: String = js.native
    
    var BLEND_DIFFERENCE: String = js.native
    
    var BLEND_EXCLUSION: String = js.native
    
    var BLEND_HARDLIGHT: String = js.native
    
    var BLEND_LIGHTEN: String = js.native
    
    var BLEND_MULTIPLY: String = js.native
    
    var BLEND_OVERLAY: String = js.native
    
    var BLEND_SCREEN: String = js.native
    
    // blend modes
    var BLEND_SOURCE_OVER: String = js.native
    
    var EDGE_CROP: `3` = js.native
    
    // Edge Handling
    var EDGE_EXTEND: `1` = js.native
    
    var EDGE_WRAP: `2` = js.native
    
    var FONT_SANS_10_BLACK: String = js.native
    
    var FONT_SANS_128_BLACK: String = js.native
    
    var FONT_SANS_128_WHITE: String = js.native
    
    var FONT_SANS_12_BLACK: String = js.native
    
    var FONT_SANS_14_BLACK: String = js.native
    
    var FONT_SANS_16_BLACK: String = js.native
    
    var FONT_SANS_16_WHITE: String = js.native
    
    var FONT_SANS_32_BLACK: String = js.native
    
    var FONT_SANS_32_WHITE: String = js.native
    
    var FONT_SANS_64_BLACK: String = js.native
    
    var FONT_SANS_64_WHITE: String = js.native
    
    // Font locations
    var FONT_SANS_8_BLACK: String = js.native
    
    var FONT_SANS_8_WHITE: String = js.native
    
    var HORIZONTAL_ALIGN_CENTER: `2` = js.native
    
    // Align modes for cover, contain, bit masks
    var HORIZONTAL_ALIGN_LEFT: `1` = js.native
    
    var HORIZONTAL_ALIGN_RIGHT: `4` = js.native
    
    var MIME_BMP: imageSlashbmp = js.native
    
    var MIME_GIF: imageSlashgif = js.native
    
    var MIME_JGD: imageSlashjgd = js.native
    
    var MIME_JPEG: imageSlashjpeg = js.native
    
    // supported mime types
    var MIME_PNG: imageSlashpng = js.native
    
    var MIME_TIFF: imageSlashtiff = js.native
    
    var MIME_X_MS_BMP: `imageSlashx-ms-bmp` = js.native
    
    // PNG filter types
    var PNG_FILTER_AUTO: `-1` = js.native
    
    var PNG_FILTER_AVERAGE: `3` = js.native
    
    var PNG_FILTER_NONE: `0` = js.native
    
    var PNG_FILTER_PATH: `4` = js.native
    
    var PNG_FILTER_SUB: `1` = js.native
    
    var PNG_FILTER_UP: `2` = js.native
    
    var RESIZE_BEZIER: bezierInterpolation = js.native
    
    var RESIZE_BICUBIC: bicubicInterpolation = js.native
    
    var RESIZE_BILINEAR: bilinearInterpolation = js.native
    
    var RESIZE_HERMITE: hermiteInterpolation = js.native
    
    // resize methods
    var RESIZE_NEAREST_NEIGHBOR: nearestNeighbor = js.native
    
    var VERTICAL_ALIGN_BOTTOM: `32` = js.native
    
    var VERTICAL_ALIGN_MIDDLE: `16` = js.native
    
    var VERTICAL_ALIGN_TOP: `8` = js.native
    
    var _background: Double = js.native
    
    var _deflateLevel: Double = js.native
    
    var _deflateStrategy: Double = js.native
    
    var _filterType: Double = js.native
    
    var _originalMime: String = js.native
    
    var _quality: Double = js.native
    
    var _rgba: Boolean = js.native
    
    // Functions
    /**
      * I'd like to make `Args` generic and used in `run` and `test` but alas,
      * it's not possible RN:
      * https://github.com/microsoft/TypeScript/issues/26113
      */
    def appendConstructorOption[Args /* <: js.Array[js.Any] */](
      name: String,
      test: js.Function1[/* repeated */ js.Any, Boolean],
      run: js.ThisFunction3[
          /* this */ this.type, 
          /* resolve */ js.Function1[/* jimp */ js.UndefOr[this.type], js.Any], 
          /* reject */ js.Function1[/* reason */ Error, js.Any], 
          /* repeated */ js.Any, 
          js.Any
        ]
    ): Unit = js.native
    
    def autocrop(): this.type = js.native
    def autocrop(cropOnlyFrames: Boolean): this.type = js.native
    def autocrop(cropOnlyFrames: Boolean, cb: ImageCallback[js.Any]): this.type = js.native
    def autocrop(options: CropOnlyFrames): this.type = js.native
    def autocrop(options: CropOnlyFrames, cb: ImageCallback[js.Any]): this.type = js.native
    def autocrop(tolerance: Double): this.type = js.native
    def autocrop(tolerance: Double, cb: ImageCallback[js.Any]): this.type = js.native
    def autocrop(tolerance: Double, cropOnlyFrames: Boolean): this.type = js.native
    def autocrop(tolerance: Double, cropOnlyFrames: Boolean, cb: ImageCallback[js.Any]): this.type = js.native
    def autocrop(tolerance: Double, cropOnlyFrames: Unit, cb: ImageCallback[js.Any]): this.type = js.native
    def autocrop(tolerance: Unit, cb: ImageCallback[js.Any]): this.type = js.native
    def autocrop(tolerance: Unit, cropOnlyFrames: Boolean): this.type = js.native
    def autocrop(tolerance: Unit, cropOnlyFrames: Boolean, cb: ImageCallback[js.Any]): this.type = js.native
    def autocrop(tolerance: Unit, cropOnlyFrames: Unit, cb: ImageCallback[js.Any]): this.type = js.native
    
    def background(hex: Double): this.type = js.native
    def background(hex: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    def backgroundQuiet(hex: Double): this.type = js.native
    def backgroundQuiet(hex: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    // Properties
    var bitmap: Bitmap = js.native
    
    def blit(src: DepreciatedJimp, x: Double, y: Double): this.type = js.native
    def blit(src: DepreciatedJimp, x: Double, y: Double, cb: ImageCallback[js.Any]): this.type = js.native
    def blit(src: DepreciatedJimp, x: Double, y: Double, srcx: Double, srcy: Double, srcw: Double, srch: Double): this.type = js.native
    def blit(
      src: DepreciatedJimp,
      x: Double,
      y: Double,
      srcx: Double,
      srcy: Double,
      srcw: Double,
      srch: Double,
      cb: ImageCallback[js.Any]
    ): this.type = js.native
    
    // Effect methods
    def blur(r: Double): this.type = js.native
    def blur(r: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    // Color methods
    def brightness(`val`: Double): this.type = js.native
    def brightness(`val`: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    def circle(): this.type = js.native
    def circle(cb: ImageCallback[js.Any]): this.type = js.native
    def circle(options: Unit, cb: ImageCallback[js.Any]): this.type = js.native
    def circle(options: Radius): this.type = js.native
    def circle(options: Radius, cb: ImageCallback[js.Any]): this.type = js.native
    
    def clone(cb: ImageCallback[js.Any]): this.type = js.native
    
    def cloneQuiet(): this.type = js.native
    def cloneQuiet(cb: ImageCallback[js.Any]): this.type = js.native
    
    def color(actions: js.Array[ColorAction]): this.type = js.native
    def color(actions: js.Array[ColorAction], cb: ImageCallback[js.Any]): this.type = js.native
    
    def colorDiff(rgba1: RGBA, rgba2: RGBA): Double = js.native
    def colorDiff(rgba1: RGB, rgba2: RGB): Double = js.native
    
    def colorType(s: Double): this.type = js.native
    def colorType(s: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    def colour(actions: js.Array[ColorAction]): this.type = js.native
    def colour(actions: js.Array[ColorAction], cb: ImageCallback[js.Any]): this.type = js.native
    
    def compareHashes(hash1: String, hash2: String): Double = js.native
    
    def composite(src: DepreciatedJimp, x: Double, y: Double): this.type = js.native
    def composite(src: DepreciatedJimp, x: Double, y: Double, options: Unit, cb: ImageCallback[js.Any]): this.type = js.native
    def composite(src: DepreciatedJimp, x: Double, y: Double, options: BlendMode): this.type = js.native
    def composite(src: DepreciatedJimp, x: Double, y: Double, options: BlendMode, cb: ImageCallback[js.Any]): this.type = js.native
    
    def contain(w: Double, h: Double): this.type = js.native
    def contain(w: Double, h: Double, alignBits: Double): this.type = js.native
    def contain(w: Double, h: Double, alignBits: Double, cb: ImageCallback[js.Any]): this.type = js.native
    def contain(w: Double, h: Double, alignBits: Double, mode: String): this.type = js.native
    def contain(w: Double, h: Double, alignBits: Double, mode: String, cb: ImageCallback[js.Any]): this.type = js.native
    def contain(w: Double, h: Double, alignBits: Double, mode: Unit, cb: ImageCallback[js.Any]): this.type = js.native
    def contain(w: Double, h: Double, alignBits: Unit, mode: String): this.type = js.native
    def contain(w: Double, h: Double, alignBits: Unit, mode: String, cb: ImageCallback[js.Any]): this.type = js.native
    def contain(w: Double, h: Double, alignBits: Unit, mode: Unit, cb: ImageCallback[js.Any]): this.type = js.native
    def contain(w: Double, h: Double, cb: ImageCallback[js.Any]): this.type = js.native
    def contain(w: Double, h: Double, mode: String): this.type = js.native
    def contain(w: Double, h: Double, mode: String, cb: ImageCallback[js.Any]): this.type = js.native
    def contain(w: Double, h: Double, mode: Unit, cb: ImageCallback[js.Any]): this.type = js.native
    
    def contrast(`val`: Double): this.type = js.native
    def contrast(`val`: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    def convolute(kernel: js.Array[js.Array[Double]]): this.type = js.native
    def convolute(kernel: js.Array[js.Array[Double]], cb: ImageCallback[js.Any]): this.type = js.native
    def convolute(kernel: js.Array[js.Array[Double]], x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def convolute(
      kernel: js.Array[js.Array[Double]],
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      cb: ImageCallback[js.Any]
    ): this.type = js.native
    
    def convolution(kernel: js.Array[js.Array[Double]]): this.type = js.native
    def convolution(kernel: js.Array[js.Array[Double]], cb: ImageCallback[js.Any]): this.type = js.native
    def convolution[T](kernel: js.Array[js.Array[Double]], edgeHandling: String): this.type = js.native
    def convolution[T](kernel: js.Array[js.Array[Double]], edgeHandling: String, cb: ImageCallback[js.Any]): this.type = js.native
    
    def cover(w: Double, h: Double): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Double): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Double, cb: ImageCallback[js.Any]): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Double, mode: String): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Double, mode: String, cb: ImageCallback[js.Any]): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Double, mode: Unit, cb: ImageCallback[js.Any]): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Unit, cb: ImageCallback[js.Any]): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Unit, mode: String): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Unit, mode: String, cb: ImageCallback[js.Any]): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Unit, mode: Unit, cb: ImageCallback[js.Any]): this.type = js.native
    def cover(w: Double, h: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    def create(data: Buffer): js.Promise[this.type] = js.native
    def create(image: this.type): js.Promise[this.type] = js.native
    def create(path: String): js.Promise[this.type] = js.native
    def create(w: Double, h: Double): js.Promise[this.type] = js.native
    def create(w: Double, h: Double, background: String): js.Promise[this.type] = js.native
    def create(w: Double, h: Double, background: Double): js.Promise[this.type] = js.native
    
    def crop(x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def crop(x: Double, y: Double, w: Double, h: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    def cropQuiet(x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def cropQuiet(x: Double, y: Double, w: Double, h: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    def cssColorToHex(cssColor: String): Double = js.native
    
    def deflateLevel(l: Double): this.type = js.native
    def deflateLevel(l: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    def deflateStrategy(s: Double): this.type = js.native
    def deflateStrategy(s: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    def diff(img1: this.type, img2: this.type): Image = js.native
    def diff(img1: this.type, img2: this.type, threshold: Double): Image = js.native
    
    def displace(map: DepreciatedJimp, offset: Double): this.type = js.native
    def displace(map: DepreciatedJimp, offset: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    def distance(img1: this.type, img2: this.type): Double = js.native
    
    def distanceFromHash(hash: String): Double = js.native
    
    def dither16(): this.type = js.native
    def dither16(cb: ImageCallback[js.Any]): this.type = js.native
    
    def dither565(): this.type = js.native
    def dither565(cb: ImageCallback[js.Any]): this.type = js.native
    
    def fade(f: Double): this.type = js.native
    def fade(f: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    def filterType(f: Double): this.type = js.native
    def filterType(f: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    def fishEye(): this.type = js.native
    def fishEye(cb: ImageCallback[js.Any]): this.type = js.native
    def fishEye(opts: Unit, cb: ImageCallback[js.Any]): this.type = js.native
    def fishEye(opts: R): this.type = js.native
    def fishEye(opts: R, cb: ImageCallback[js.Any]): this.type = js.native
    
    def flip(horizontal: Boolean, vertical: Boolean): this.type = js.native
    def flip(horizontal: Boolean, vertical: Boolean, cb: ImageCallback[js.Any]): this.type = js.native
    
    def gaussian(r: Double): this.type = js.native
    def gaussian(r: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    def getBase64(mime: String, cb: GenericCallback[String, js.Any, this.type]): this.type = js.native
    
    def getBase64Async(mime: String): js.Promise[String] = js.native
    
    def getBuffer(mime: String, cb: GenericCallback[Buffer, js.Any, js.Any]): this.type = js.native
    
    def getBufferAsync(mime: String): js.Promise[Buffer] = js.native
    
    def getExtension(): String = js.native
    
    def getHeight(): Double = js.native
    
    def getMIME(): String = js.native
    
    def getPixelColor(x: Double, y: Double): Double = js.native
    def getPixelColor(x: Double, y: Double, cb: GenericCallback[Double, js.Any, this.type]): Double = js.native
    
    def getPixelColour(x: Double, y: Double): Double = js.native
    def getPixelColour(x: Double, y: Double, cb: GenericCallback[Double, js.Any, this.type]): Double = js.native
    
    def getPixelIndex(x: Double, y: Double): Double = js.native
    def getPixelIndex(x: Double, y: Double, cb: GenericCallback[Double, js.Any, this.type]): Double = js.native
    def getPixelIndex(x: Double, y: Double, edgeHandling: String): Double = js.native
    def getPixelIndex(x: Double, y: Double, edgeHandling: String, cb: GenericCallback[Double, js.Any, this.type]): Double = js.native
    
    def getWidth(): Double = js.native
    
    def grayscale(): this.type = js.native
    def grayscale(cb: ImageCallback[js.Any]): this.type = js.native
    
    def greyscale(): this.type = js.native
    def greyscale(cb: ImageCallback[js.Any]): this.type = js.native
    
    def hasAlpha(): Boolean = js.native
    
    def hash(): String = js.native
    def hash(base: Double): String = js.native
    def hash(base: Double, cb: GenericCallback[String, js.Any, this.type]): String = js.native
    def hash(base: Null, cb: GenericCallback[String, js.Any, this.type]): String = js.native
    def hash(base: Unit, cb: GenericCallback[String, js.Any, this.type]): String = js.native
    def hash(cb: GenericCallback[String, js.Any, this.type]): String = js.native
    
    def histogram(): B = js.native
    
    def inspect(): String = js.native
    
    def intToRGBA(i: Double): RGBA = js.native
    def intToRGBA(i: Double, cb: GenericCallback[RGBA, js.Any, js.Any]): RGBA = js.native
    
    def invert(): this.type = js.native
    def invert(cb: ImageCallback[js.Any]): this.type = js.native
    
    def limit255(n: Double): Double = js.native
    
    def loadFont(file: String): js.Promise[Font] = js.native
    def loadFont(file: String, cb: GenericCallback[Font, js.Any, js.Any]): js.Promise[scala.Nothing] = js.native
    
    def mask(src: this.type, x: Double, y: Double): this.type = js.native
    def mask(src: this.type, x: Double, y: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    def measureText(font: Font, text: PrintableText): Double = js.native
    
    def measureTextHeight(font: Font, text: PrintableText, maxWidth: Double): Double = js.native
    
    def mirror(horizontal: Boolean, vertical: Boolean): this.type = js.native
    def mirror(horizontal: Boolean, vertical: Boolean, cb: ImageCallback[js.Any]): this.type = js.native
    
    def normalize(): this.type = js.native
    def normalize(cb: ImageCallback[js.Any]): this.type = js.native
    
    // Methods
    def on[T /* <: ListenableName */](event: T, cb: js.Function1[/* data */ ListenerData[T], js.Any]): js.Any = js.native
    
    def opacity(f: Double): this.type = js.native
    def opacity(f: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    def opaque(): this.type = js.native
    def opaque(cb: ImageCallback[js.Any]): this.type = js.native
    
    def parseBitmap(data: Buffer): Unit = js.native
    def parseBitmap(data: Buffer, path: String): Unit = js.native
    def parseBitmap(data: Buffer, path: String, cb: ImageCallback[js.Any]): Unit = js.native
    def parseBitmap(data: Buffer, path: Null, cb: ImageCallback[js.Any]): Unit = js.native
    def parseBitmap(data: Buffer, path: Unit, cb: ImageCallback[js.Any]): Unit = js.native
    
    def pixelate(size: Double): this.type = js.native
    def pixelate(size: Double, cb: ImageCallback[js.Any]): this.type = js.native
    def pixelate(size: Double, x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def pixelate(size: Double, x: Double, y: Double, w: Double, h: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    def posterize(n: Double): this.type = js.native
    def posterize(n: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    // Text methods
    def print(font: Font, x: Double, y: Double, text: PrintableText): this.type = js.native
    def print(font: Font, x: Double, y: Double, text: PrintableText, cb: ImageCallback[js.Any]): this.type = js.native
    def print(font: Font, x: Double, y: Double, text: PrintableText, maxWidth: Double): this.type = js.native
    def print(font: Font, x: Double, y: Double, text: PrintableText, maxWidth: Double, cb: ImageCallback[js.Any]): this.type = js.native
    def print(font: Font, x: Double, y: Double, text: PrintableText, maxWidth: Double, maxHeight: Double): this.type = js.native
    def print(
      font: Font,
      x: Double,
      y: Double,
      text: PrintableText,
      maxWidth: Double,
      maxHeight: Double,
      cb: ImageCallback[js.Any]
    ): this.type = js.native
    def print(
      font: Font,
      x: Double,
      y: Double,
      text: PrintableText,
      maxWidth: Double,
      maxHeight: Unit,
      cb: ImageCallback[js.Any]
    ): this.type = js.native
    def print(font: Font, x: Double, y: Double, text: PrintableText, maxWidth: Unit, cb: ImageCallback[js.Any]): this.type = js.native
    def print(font: Font, x: Double, y: Double, text: PrintableText, maxWidth: Unit, maxHeight: Double): this.type = js.native
    def print(
      font: Font,
      x: Double,
      y: Double,
      text: PrintableText,
      maxWidth: Unit,
      maxHeight: Double,
      cb: ImageCallback[js.Any]
    ): this.type = js.native
    def print(
      font: Font,
      x: Double,
      y: Double,
      text: PrintableText,
      maxWidth: Unit,
      maxHeight: Unit,
      cb: ImageCallback[js.Any]
    ): this.type = js.native
    
    def quality(n: Double): this.type = js.native
    def quality(n: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    def read(data: Buffer): js.Promise[this.type] = js.native
    def read(data: Buffer, cb: ImageCallback[js.Any]): js.Promise[this.type] = js.native
    def read(image: this.type): js.Promise[this.type] = js.native
    def read(image: this.type, cb: ImageCallback[js.Any]): js.Promise[this.type] = js.native
    def read(path: String): js.Promise[this.type] = js.native
    def read(path: String, cb: ImageCallback[js.Any]): js.Promise[this.type] = js.native
    def read(w: Double, h: Double): js.Promise[this.type] = js.native
    def read(w: Double, h: Double, background: String): js.Promise[this.type] = js.native
    def read(w: Double, h: Double, background: String, cb: ImageCallback[js.Any]): js.Promise[this.type] = js.native
    def read(w: Double, h: Double, background: Double): js.Promise[this.type] = js.native
    def read(w: Double, h: Double, background: Double, cb: ImageCallback[js.Any]): js.Promise[this.type] = js.native
    def read(w: Double, h: Double, background: Unit, cb: ImageCallback[js.Any]): js.Promise[this.type] = js.native
    
    def resize(w: Double, h: Double): this.type = js.native
    def resize(w: Double, h: Double, cb: ImageCallback[js.Any]): this.type = js.native
    def resize(w: Double, h: Double, mode: String): this.type = js.native
    def resize(w: Double, h: Double, mode: String, cb: ImageCallback[js.Any]): this.type = js.native
    def resize(w: Double, h: Double, mode: Unit, cb: ImageCallback[js.Any]): this.type = js.native
    
    def rgba(bool: Boolean): this.type = js.native
    def rgba(bool: Boolean, cb: ImageCallback[js.Any]): this.type = js.native
    
    def rgbaToInt(r: Double, g: Double, b: Double, a: Double, cb: GenericCallback[Double, js.Any, this.type]): Double = js.native
    
    // Shape methods
    def rotate(deg: Double): this.type = js.native
    def rotate(deg: Double, cb: ImageCallback[js.Any]): this.type = js.native
    def rotate(deg: Double, mode: String): this.type = js.native
    def rotate(deg: Double, mode: String, cb: ImageCallback[js.Any]): this.type = js.native
    def rotate(deg: Double, mode: Boolean): this.type = js.native
    def rotate(deg: Double, mode: Boolean, cb: ImageCallback[js.Any]): this.type = js.native
    
    def scale(f: Double): this.type = js.native
    def scale(f: Double, cb: ImageCallback[js.Any]): this.type = js.native
    def scale(f: Double, mode: String): this.type = js.native
    def scale(f: Double, mode: String, cb: ImageCallback[js.Any]): this.type = js.native
    def scale(f: Double, mode: Unit, cb: ImageCallback[js.Any]): this.type = js.native
    
    def scaleToFit(w: Double, h: Double): this.type = js.native
    def scaleToFit(w: Double, h: Double, cb: ImageCallback[js.Any]): this.type = js.native
    def scaleToFit(w: Double, h: Double, mode: String): this.type = js.native
    def scaleToFit(w: Double, h: Double, mode: String, cb: ImageCallback[js.Any]): this.type = js.native
    def scaleToFit(w: Double, h: Double, mode: Unit, cb: ImageCallback[js.Any]): this.type = js.native
    
    def scan(
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      f: js.ThisFunction3[/* this */ this.type, /* x */ Double, /* y */ Double, /* idx */ Double, js.Any]
    ): this.type = js.native
    def scan(
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      f: js.ThisFunction3[/* this */ this.type, /* x */ Double, /* y */ Double, /* idx */ Double, js.Any],
      cb: ImageCallback[js.Any]
    ): this.type = js.native
    
    def scanIterator(x: Double, y: Double, w: Double, h: Double): IterableIterator[Idx] = js.native
    
    def scanQuiet(
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      f: js.ThisFunction3[/* this */ this.type, /* x */ Double, /* y */ Double, /* idx */ Double, js.Any]
    ): this.type = js.native
    def scanQuiet(
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      f: js.ThisFunction3[/* this */ this.type, /* x */ Double, /* y */ Double, /* idx */ Double, js.Any],
      cb: ImageCallback[js.Any]
    ): this.type = js.native
    
    def sepia(): this.type = js.native
    def sepia(cb: ImageCallback[js.Any]): this.type = js.native
    
    def setPixelColor(hex: Double, x: Double, y: Double): this.type = js.native
    def setPixelColor(hex: Double, x: Double, y: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    def setPixelColour(hex: Double, x: Double, y: Double): this.type = js.native
    def setPixelColour(hex: Double, x: Double, y: Double, cb: ImageCallback[js.Any]): this.type = js.native
    
    def shadow(): this.type = js.native
    def shadow(cb: ImageCallback[js.Any]): this.type = js.native
    def shadow(options: Unit, cb: ImageCallback[js.Any]): this.type = js.native
    def shadow(options: Opacity): this.type = js.native
    def shadow(options: Opacity, cb: ImageCallback[js.Any]): this.type = js.native
    
    def threshold(opts: AutoGreyscale): this.type = js.native
    def threshold(opts: AutoGreyscale, cb: ImageCallback[js.Any]): this.type = js.native
    
    def write(path: String): this.type = js.native
    def write(path: String, cb: ImageCallback[js.Any]): this.type = js.native
    
    def writeAsync(path: String): js.Promise[this.type] = js.native
  }
  
  /**
    * @deprecated Jimp typings for TS <3.1 are being depreciated. Please upgrade your TypeScript version
    */
  trait Font extends StObject {
    
    var chars: StringDictionary[FontChar]
    
    var common: FontCommon
    
    var info: FontInfo
    
    var kernings: StringDictionary[StringDictionary[Double]]
    
    var pages: js.Array[String]
  }
  object Font {
    
    @scala.inline
    def apply(
      chars: StringDictionary[FontChar],
      common: FontCommon,
      info: FontInfo,
      kernings: StringDictionary[StringDictionary[Double]],
      pages: js.Array[String]
    ): Font = {
      val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], kernings = kernings.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Font]
    }
    
    @scala.inline
    implicit class FontMutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChars(value: StringDictionary[FontChar]): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommon(value: FontCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: FontInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernings(value: StringDictionary[StringDictionary[Double]]): Self = StObject.set(x, "kernings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPages(value: js.Array[String]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagesVarargs(value: String*): Self = StObject.set(x, "pages", js.Array(value :_*))
    }
  }
  
  /**
    * @deprecated Jimp typings for TS <3.1 are being depreciated. Please upgrade your TypeScript version
    */
  trait FontChar extends StObject {
    
    var chnl: Double
    
    var height: Double
    
    var id: Double
    
    var page: Double
    
    var width: Double
    
    var x: Double
    
    var xadvance: Double
    
    var xoffset: Double
    
    var y: Double
    
    var yoffset: Double
  }
  object FontChar {
    
    @scala.inline
    def apply(
      chnl: Double,
      height: Double,
      id: Double,
      page: Double,
      width: Double,
      x: Double,
      xadvance: Double,
      xoffset: Double,
      y: Double,
      yoffset: Double
    ): FontChar = {
      val __obj = js.Dynamic.literal(chnl = chnl.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xadvance = xadvance.asInstanceOf[js.Any], xoffset = xoffset.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yoffset = yoffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontChar]
    }
    
    @scala.inline
    implicit class FontCharMutableBuilder[Self <: FontChar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChnl(value: Double): Self = StObject.set(x, "chnl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXadvance(value: Double): Self = StObject.set(x, "xadvance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXoffset(value: Double): Self = StObject.set(x, "xoffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYoffset(value: Double): Self = StObject.set(x, "yoffset", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @deprecated Jimp typings for TS <3.1 are being depreciated. Please upgrade your TypeScript version
    */
  trait FontCommon extends StObject {
    
    var alphaChnl: Double
    
    var base: Double
    
    var blueChnl: Double
    
    var greenChnl: Double
    
    var lineHeight: Double
    
    var packed: Double
    
    var pages: Double
    
    var redChnl: Double
    
    var scaleH: Double
    
    var scaleW: Double
  }
  object FontCommon {
    
    @scala.inline
    def apply(
      alphaChnl: Double,
      base: Double,
      blueChnl: Double,
      greenChnl: Double,
      lineHeight: Double,
      packed: Double,
      pages: Double,
      redChnl: Double,
      scaleH: Double,
      scaleW: Double
    ): FontCommon = {
      val __obj = js.Dynamic.literal(alphaChnl = alphaChnl.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], blueChnl = blueChnl.asInstanceOf[js.Any], greenChnl = greenChnl.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], redChnl = redChnl.asInstanceOf[js.Any], scaleH = scaleH.asInstanceOf[js.Any], scaleW = scaleW.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontCommon]
    }
    
    @scala.inline
    implicit class FontCommonMutableBuilder[Self <: FontCommon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlphaChnl(value: Double): Self = StObject.set(x, "alphaChnl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlueChnl(value: Double): Self = StObject.set(x, "blueChnl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreenChnl(value: Double): Self = StObject.set(x, "greenChnl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPacked(value: Double): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedChnl(value: Double): Self = StObject.set(x, "redChnl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleH(value: Double): Self = StObject.set(x, "scaleH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleW(value: Double): Self = StObject.set(x, "scaleW", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @deprecated Jimp typings for TS <3.1 are being depreciated. Please upgrade your TypeScript version
    */
  trait FontInfo extends StObject {
    
    var aa: Double
    
    var bold: Double
    
    var charset: String
    
    var face: String
    
    var italic: Double
    
    var padding: js.Tuple4[Double, Double, Double, Double]
    
    var size: Double
    
    var smooth: Double
    
    var spacing: js.Tuple2[Double, Double]
    
    var stretchH: Double
    
    var unicode: Double
  }
  object FontInfo {
    
    @scala.inline
    def apply(
      aa: Double,
      bold: Double,
      charset: String,
      face: String,
      italic: Double,
      padding: js.Tuple4[Double, Double, Double, Double],
      size: Double,
      smooth: Double,
      spacing: js.Tuple2[Double, Double],
      stretchH: Double,
      unicode: Double
    ): FontInfo = {
      val __obj = js.Dynamic.literal(aa = aa.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], charset = charset.asInstanceOf[js.Any], face = face.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], smooth = smooth.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], stretchH = stretchH.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontInfo]
    }
    
    @scala.inline
    implicit class FontInfoMutableBuilder[Self <: FontInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAa(value: Double): Self = StObject.set(x, "aa", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBold(value: Double): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFace(value: String): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalic(value: Double): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmooth(value: Double): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacing(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretchH(value: Double): Self = StObject.set(x, "stretchH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicode(value: Double): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    }
  }
  
  type GenericCallback[T, U, TThis] = js.ThisFunction2[/* this */ TThis, /* err */ Error | Null, /* value */ T, U]
  
  type ImageCallback[U] = js.ThisFunction3[
    /* this */ DepreciatedJimp, 
    /* err */ Error | Null, 
    /* value */ DepreciatedJimp, 
    /* coords */ X, 
    U
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jimp.jimpStrings.any
    - typings.jimp.jimpStrings.initialized
    - typings.jimp.jimpStrings.`before-change`
    - typings.jimp.jimpStrings.changed
    - typings.jimp.jimpStrings.`before-clone`
    - typings.jimp.jimpStrings.cloned
    - typings.jimp.jimpStrings.background
    - typings.jimp.jimpStrings.scan
    - typings.jimp.jimpStrings.crop
  */
  trait ListenableName extends StObject
  object ListenableName {
    
    @scala.inline
    def any: typings.jimp.jimpStrings.any = "any".asInstanceOf[typings.jimp.jimpStrings.any]
    
    @scala.inline
    def background: typings.jimp.jimpStrings.background = "background".asInstanceOf[typings.jimp.jimpStrings.background]
    
    @scala.inline
    def `before-change`: typings.jimp.jimpStrings.`before-change` = "before-change".asInstanceOf[typings.jimp.jimpStrings.`before-change`]
    
    @scala.inline
    def `before-clone`: typings.jimp.jimpStrings.`before-clone` = "before-clone".asInstanceOf[typings.jimp.jimpStrings.`before-clone`]
    
    @scala.inline
    def changed: typings.jimp.jimpStrings.changed = "changed".asInstanceOf[typings.jimp.jimpStrings.changed]
    
    @scala.inline
    def cloned: typings.jimp.jimpStrings.cloned = "cloned".asInstanceOf[typings.jimp.jimpStrings.cloned]
    
    @scala.inline
    def crop: typings.jimp.jimpStrings.crop = "crop".asInstanceOf[typings.jimp.jimpStrings.crop]
    
    @scala.inline
    def initialized: typings.jimp.jimpStrings.initialized = "initialized".asInstanceOf[typings.jimp.jimpStrings.initialized]
    
    @scala.inline
    def scan: typings.jimp.jimpStrings.scan = "scan".asInstanceOf[typings.jimp.jimpStrings.scan]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jimp.anon.EventName[T]
    - typings.jimp.anon.Dictkey[T]
  */
  trait ListenerData[T /* <: ListenableName */] extends StObject
  object ListenerData {
    
    @scala.inline
    def Dictkey[T /* <: ListenableName */](eventName: `before-change` | changed, methodName: T): typings.jimp.anon.Dictkey[T] = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jimp.anon.Dictkey[T]]
    }
    
    @scala.inline
    def EventName[T /* <: ListenableName */](eventName: T, methodName: clone | ChangeName | constructor): typings.jimp.anon.EventName[T] = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jimp.anon.EventName[T]]
    }
  }
  
  type PrintableText = js.Any | AlignmentX
  
  /**
    * @deprecated Jimp typings for TS <3.1 are being depreciated. Please upgrade your TypeScript version
    */
  trait RGB extends StObject {
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object RGB {
    
    @scala.inline
    def apply(b: Double, g: Double, r: Double): RGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGB]
    }
    
    @scala.inline
    implicit class RGBMutableBuilder[Self <: RGB] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @deprecated Jimp typings for TS <3.1 are being depreciated. Please upgrade your TypeScript version
    */
  trait RGBA extends StObject {
    
    var a: Double
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object RGBA {
    
    @scala.inline
    def apply(a: Double, b: Double, g: Double, r: Double): RGBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBA]
    }
    
    @scala.inline
    implicit class RGBAMutableBuilder[Self <: RGBA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait URLOptions extends StObject {
    
    var compression: js.UndefOr[Boolean] = js.undefined
    
    var headers: StringDictionary[js.Any]
    
    var url: String
  }
  object URLOptions {
    
    @scala.inline
    def apply(headers: StringDictionary[js.Any], url: String): URLOptions = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLOptions]
    }
    
    @scala.inline
    implicit class URLOptionsMutableBuilder[Self <: URLOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Object & DepreciatedJimp
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & DepreciatedJimp = ^
}
