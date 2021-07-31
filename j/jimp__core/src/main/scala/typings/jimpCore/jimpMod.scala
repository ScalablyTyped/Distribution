package typings.jimpCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.jimpCore.etcMod.Bitmap
import typings.jimpCore.etcMod.BlendMode
import typings.jimpCore.etcMod.GenericCallback
import typings.jimpCore.etcMod.ImageCallback
import typings.jimpCore.etcMod.ListenableName
import typings.jimpCore.etcMod.ListenerData
import typings.jimpCore.etcMod.RGB
import typings.jimpCore.etcMod.RGBA
import typings.jimpCore.etcMod.URLOptions
import typings.jimpCore.jimpCoreNumbers.`-1`
import typings.jimpCore.jimpCoreNumbers.`16`
import typings.jimpCore.jimpCoreNumbers.`1`
import typings.jimpCore.jimpCoreNumbers.`2`
import typings.jimpCore.jimpCoreNumbers.`32`
import typings.jimpCore.jimpCoreNumbers.`3`
import typings.jimpCore.jimpCoreNumbers.`4`
import typings.jimpCore.jimpCoreNumbers.`8`
import typings.node.Buffer
import typings.std.Error
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jimpMod {
  
  trait DiffReturn[This] extends StObject {
    
    var image: This
    
    var percent: Double
  }
  object DiffReturn {
    
    @scala.inline
    def apply[This](image: This, percent: Double): DiffReturn[This] = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffReturn[This]]
    }
    
    @scala.inline
    implicit class DiffReturnMutableBuilder[Self <: DiffReturn[?], This] (val x: Self & DiffReturn[This]) extends AnyVal {
      
      @scala.inline
      def setImage(value: This): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Jimp extends StObject {
    
    var _background: Double = js.native
    
    var _originalMime: String = js.native
    
    var _rgba: Boolean = js.native
    
    def background(hex: Double): this.type = js.native
    def background(hex: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    def backgroundQuiet(hex: Double): this.type = js.native
    def backgroundQuiet(hex: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    // Properties
    var bitmap: Bitmap = js.native
    
    def clone(cb: ImageCallback[this.type]): this.type = js.native
    
    def cloneQuiet(): this.type = js.native
    def cloneQuiet(cb: ImageCallback[this.type]): this.type = js.native
    
    // Effect methods
    def composite(src: Jimp, x: Double, y: Double): this.type = js.native
    def composite(src: Jimp, x: Double, y: Double, options: Unit, cb: ImageCallback[this.type]): this.type = js.native
    def composite(src: Jimp, x: Double, y: Double, options: BlendMode): this.type = js.native
    def composite(src: Jimp, x: Double, y: Double, options: BlendMode, cb: ImageCallback[this.type]): this.type = js.native
    
    def distanceFromHash(hash: String): Double = js.native
    
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
    
    def hasAlpha(): Boolean = js.native
    
    def hash(): String = js.native
    def hash(base: Double): String = js.native
    def hash(base: Double, cb: GenericCallback[String, js.Any, this.type]): String = js.native
    def hash(base: Null, cb: GenericCallback[String, js.Any, this.type]): String = js.native
    def hash(base: Unit, cb: GenericCallback[String, js.Any, this.type]): String = js.native
    def hash(cb: GenericCallback[String, js.Any, this.type]): String = js.native
    
    def inspect(): String = js.native
    
    // Methods
    def on[T /* <: ListenableName */](event: T, cb: js.Function1[/* data */ ListenerData[T], js.Any]): js.Any = js.native
    
    def parseBitmap(data: Buffer): Unit = js.native
    def parseBitmap(data: Buffer, path: String): Unit = js.native
    def parseBitmap(data: Buffer, path: String, cb: ImageCallback[this.type]): Unit = js.native
    def parseBitmap(data: Buffer, path: Null, cb: ImageCallback[this.type]): Unit = js.native
    def parseBitmap(data: Buffer, path: Unit, cb: ImageCallback[this.type]): Unit = js.native
    
    def rgba(bool: Boolean): this.type = js.native
    def rgba(bool: Boolean, cb: ImageCallback[this.type]): this.type = js.native
    
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
      cb: ImageCallback[this.type]
    ): this.type = js.native
    
    def scanIterator(x: Double, y: Double, w: Double, h: Double): IterableIterator[ScanIteratorReturn[this.type]] = js.native
    
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
      cb: ImageCallback[this.type]
    ): this.type = js.native
    
    def setPixelColor(hex: Double, x: Double, y: Double): this.type = js.native
    def setPixelColor(hex: Double, x: Double, y: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    def setPixelColour(hex: Double, x: Double, y: Double): this.type = js.native
    def setPixelColour(hex: Double, x: Double, y: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    def write(path: String): this.type = js.native
    def write(path: String, cb: ImageCallback[this.type]): this.type = js.native
    
    def writeAsync(path: String): js.Promise[this.type] = js.native
  }
  
  @js.native
  trait JimpConstructors
    extends StObject
       with // Constructors
  // For custom constructors when using Jimp.appendConstructorOption
  Instantiable1[
          (/* args (repeated) */ js.Any) | (/* data */ Bitmap) | (/* data */ Buffer) | (/* image */ Jimp) | (/* path */ String) | (/* urlOptions */ URLOptions), 
          /* import warning: importer.ImportType#apply Failed type conversion: @jimp/core.@jimp/core/types/jimp.JimpConstructors['prototype'] */ js.Any
        ]
       with Instantiable2[
          (/* data */ Bitmap) | (/* data */ Buffer) | (/* w */ Double) | (/* image */ Jimp) | (/* path */ String) | (/* urlOptions */ URLOptions), 
          (/* h */ Double) | (/* cb */ ImageCallback[
            /* import warning: importer.ImportType#apply Failed type conversion: @jimp/core.@jimp/core/types/jimp.JimpConstructors['prototype'] */ js.Any
          ]), 
          /* import warning: importer.ImportType#apply Failed type conversion: @jimp/core.@jimp/core/types/jimp.JimpConstructors['prototype'] */ js.Any
        ]
       with Instantiable3[
          /* w */ Double, 
          /* h */ Double, 
          (/* background */ Double) | (/* cb */ ImageCallback[
            /* import warning: importer.ImportType#apply Failed type conversion: @jimp/core.@jimp/core/types/jimp.JimpConstructors['prototype'] */ js.Any
          ]) | (/* background */ String), 
          /* import warning: importer.ImportType#apply Failed type conversion: @jimp/core.@jimp/core/types/jimp.JimpConstructors['prototype'] */ js.Any
        ]
       with Instantiable4[
          /* w */ Double, 
          /* h */ Double, 
          (/* background */ Double) | (/* background */ String) | (/* background */ Unit), 
          /* cb */ ImageCallback[
            /* import warning: importer.ImportType#apply Failed type conversion: @jimp/core.@jimp/core/types/jimp.JimpConstructors['prototype'] */ js.Any
          ], 
          /* import warning: importer.ImportType#apply Failed type conversion: @jimp/core.@jimp/core/types/jimp.JimpConstructors['prototype'] */ js.Any
        ] {
    
    // Constants
    var AUTO: `-1` = js.native
    
    var BLEND_ADD: String = js.native
    
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
    
    var HORIZONTAL_ALIGN_CENTER: `2` = js.native
    
    // Align modes for cover, contain, bit masks
    var HORIZONTAL_ALIGN_LEFT: `1` = js.native
    
    var HORIZONTAL_ALIGN_RIGHT: `4` = js.native
    
    var VERTICAL_ALIGN_BOTTOM: `32` = js.native
    
    var VERTICAL_ALIGN_MIDDLE: `16` = js.native
    
    var VERTICAL_ALIGN_TOP: `8` = js.native
    
    // Functions
    /**
      * I'd like to make `Args` generic and used in `run` and `test` but alas,
      * it's not possible RN:
      * https://github.com/microsoft/TypeScript/issues/26113
      */
    def appendConstructorOption[Args /* <: js.Array[js.Any] */, J /* <: Jimp */](
      name: String,
      test: js.Function1[/* repeated */ js.Any, Boolean],
      run: js.ThisFunction3[
          /* this */ J, 
          /* resolve */ js.Function1[/* jimp */ js.UndefOr[J], js.Any], 
          /* reject */ js.Function1[/* reason */ Error, js.Any], 
          /* repeated */ js.Any, 
          js.Any
        ]
    ): Unit = js.native
    
    def colorDiff(rgba1: RGBA, rgba2: RGBA): Double = js.native
    def colorDiff(rgba1: RGB, rgba2: RGB): Double = js.native
    
    def compareHashes(hash1: String, hash2: String): Double = js.native
    
    def create(data: Buffer): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
      ] = js.native
    def create(image: Jimp): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
      ] = js.native
    def create(path: String): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
      ] = js.native
    def create(w: Double, h: Double): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
      ] = js.native
    def create(w: Double, h: Double, background: String): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
      ] = js.native
    def create(w: Double, h: Double, background: Double): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
      ] = js.native
    
    def cssColorToHex(cssColor: String): Double = js.native
    
    def diff(img1: Jimp, img2: Jimp): DiffReturn[
        /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
      ] = js.native
    def diff(img1: Jimp, img2: Jimp, threshold: Double): DiffReturn[
        /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
      ] = js.native
    
    def distance(img1: Jimp, img2: Jimp): Double = js.native
    
    def intToRGBA(i: Double): RGBA = js.native
    def intToRGBA(i: Double, cb: GenericCallback[RGBA, js.Any, js.Any]): RGBA = js.native
    
    def limit255(n: Double): Double = js.native
    
    def read(data: Buffer): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
      ] = js.native
    def read(image: Jimp): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
      ] = js.native
    def read(path: String): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
      ] = js.native
    def read(w: Double, h: Double): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
      ] = js.native
    def read(w: Double, h: Double, background: String): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
      ] = js.native
    def read(w: Double, h: Double, background: Double): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
      ] = js.native
    @JSName("read")
    def read_prototype(
      data: Buffer,
      cb: ImageCallback[
          /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
        ]
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
      ] = js.native
    @JSName("read")
    def read_prototype(
      image: Jimp,
      cb: ImageCallback[
          /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
        ]
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
      ] = js.native
    @JSName("read")
    def read_prototype(
      path: String,
      cb: ImageCallback[
          /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
        ]
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
      ] = js.native
    @JSName("read")
    def read_prototype(
      w: Double,
      h: Double,
      background: String,
      cb: ImageCallback[
          /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
        ]
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
      ] = js.native
    @JSName("read")
    def read_prototype(
      w: Double,
      h: Double,
      background: Double,
      cb: ImageCallback[
          /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
        ]
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
      ] = js.native
    @JSName("read")
    def read_prototype(
      w: Double,
      h: Double,
      background: Unit,
      cb: ImageCallback[
          /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
        ]
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
      ] = js.native
    
    def rgbaToInt(r: Double, g: Double, b: Double, a: Double): Double = js.native
    @JSName("rgbaToInt")
    def rgbaToInt_prototype(
      r: Double,
      g: Double,
      b: Double,
      a: Double,
      cb: GenericCallback[
          Double, 
          js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: this['prototype'] */ js.Any
        ]
    ): Double = js.native
  }
  
  trait ScanIteratorReturn[This] extends StObject {
    
    var idx: Double
    
    var image: This
    
    var x: Double
    
    var y: Double
  }
  object ScanIteratorReturn {
    
    @scala.inline
    def apply[This](idx: Double, image: This, x: Double, y: Double): ScanIteratorReturn[This] = {
      val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScanIteratorReturn[This]]
    }
    
    @scala.inline
    implicit class ScanIteratorReturnMutableBuilder[Self <: ScanIteratorReturn[?], This] (val x: Self & ScanIteratorReturn[This]) extends AnyVal {
      
      @scala.inline
      def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: This): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
