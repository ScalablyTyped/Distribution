package typings.imagemagick

import typings.node.childProcessMod.ChildProcess
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object convert {
    
    @JSImport("imagemagick", "convert")
    @js.native
    def apply(args: js.Any, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): ChildProcess = js.native
    @JSImport("imagemagick", "convert")
    @js.native
    def apply(args: js.Any, timeout: Double, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): ChildProcess = js.native
    @JSImport("imagemagick", "convert")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("imagemagick", "convert.path")
    @js.native
    def path: String = js.native
    @scala.inline
    def path_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("imagemagick", "crop")
  @js.native
  def crop(options: Options, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): ChildProcess = js.native
  
  object identify {
    
    @JSImport("imagemagick", "identify")
    @js.native
    def apply(path: String, callback: js.Function2[/* err */ Error, /* features */ Features, Unit]): ChildProcess = js.native
    @JSImport("imagemagick", "identify")
    @js.native
    def apply(path: js.Array[_], callback: js.Function2[/* err */ Error, /* result */ String, Unit]): ChildProcess = js.native
    @JSImport("imagemagick", "identify")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("imagemagick", "identify.path")
    @js.native
    def path: String = js.native
    @scala.inline
    def path_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("imagemagick", "readMetadata")
  @js.native
  def readMetadata(path: String, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): ChildProcess = js.native
  
  @JSImport("imagemagick", "resize")
  @js.native
  def resize(options: Options, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): ChildProcess = js.native
  
  @JSImport("imagemagick", "resizeArgs")
  @js.native
  def resizeArgs(options: Options): ResizeArgs_ = js.native
  
  @js.native
  trait Features extends StObject {
    
    var depth: js.UndefOr[Double] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object Features {
    
    @scala.inline
    def apply(): Features = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Features]
    }
    
    @scala.inline
    implicit class FeaturesMutableBuilder[Self <: Features] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    //: false,
    var colorspace: js.UndefOr[js.Any] = js.native
    
    //: 0.2,
    var customArgs: js.UndefOr[js.Array[_]] = js.native
    
    //: null,
    var dstPath: js.UndefOr[String] = js.native
    
    //: true,
    var filter: js.UndefOr[String] = js.native
    
    //: 0.8,
    var format: js.UndefOr[String] = js.native
    
    //: 0,
    var height: js.UndefOr[Double] = js.native
    
    //: 'jpg',
    var progressive: js.UndefOr[Boolean] = js.native
    
    //: null,
    var quality: js.UndefOr[Double] = js.native
    
    //: 'Lagrange',
    var sharpening: js.UndefOr[Double] = js.native
    
    //: null,
    var srcData: js.UndefOr[String] = js.native
    
    //: null,
    var srcFormat: js.UndefOr[String] = js.native
    
    var srcPath: js.UndefOr[String] = js.native
    
    //: 0,
    var strip: js.UndefOr[Boolean] = js.native
    
    //: [],
    var timeout: js.UndefOr[Double] = js.native
    
    //: null,
    var width: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorspace(value: js.Any): Self = StObject.set(x, "colorspace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorspaceUndefined: Self = StObject.set(x, "colorspace", js.undefined)
      
      @scala.inline
      def setCustomArgs(value: js.Array[_]): Self = StObject.set(x, "customArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomArgsUndefined: Self = StObject.set(x, "customArgs", js.undefined)
      
      @scala.inline
      def setCustomArgsVarargs(value: js.Any*): Self = StObject.set(x, "customArgs", js.Array(value :_*))
      
      @scala.inline
      def setDstPath(value: String): Self = StObject.set(x, "dstPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDstPathUndefined: Self = StObject.set(x, "dstPath", js.undefined)
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setProgressive(value: Boolean): Self = StObject.set(x, "progressive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressiveUndefined: Self = StObject.set(x, "progressive", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setSharpening(value: Double): Self = StObject.set(x, "sharpening", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharpeningUndefined: Self = StObject.set(x, "sharpening", js.undefined)
      
      @scala.inline
      def setSrcData(value: String): Self = StObject.set(x, "srcData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcDataUndefined: Self = StObject.set(x, "srcData", js.undefined)
      
      @scala.inline
      def setSrcFormat(value: String): Self = StObject.set(x, "srcFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcFormatUndefined: Self = StObject.set(x, "srcFormat", js.undefined)
      
      @scala.inline
      def setSrcPath(value: String): Self = StObject.set(x, "srcPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcPathUndefined: Self = StObject.set(x, "srcPath", js.undefined)
      
      @scala.inline
      def setStrip(value: Boolean): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ResizeArgs_ extends StObject {
    
    var args: js.Array[String] = js.native
    
    var opt: Options = js.native
  }
  object ResizeArgs_ {
    
    @scala.inline
    def apply(args: js.Array[String], opt: Options): ResizeArgs_ = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], opt = opt.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeArgs_]
    }
    
    @scala.inline
    implicit class ResizeArgs_MutableBuilder[Self <: ResizeArgs_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setOpt(value: Options): Self = StObject.set(x, "opt", value.asInstanceOf[js.Any])
    }
  }
}
