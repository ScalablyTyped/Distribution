package typings.imagemagick

import typings.node.childProcessMod.ChildProcess
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("imagemagick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object convert {
    
    inline def apply(args: js.Any, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): ChildProcess = (^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
    inline def apply(args: js.Any, timeout: Double, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): ChildProcess = (^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
    
    @JSImport("imagemagick", "convert")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("imagemagick", "convert.path")
    @js.native
    def path: String = js.native
    inline def path_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
  }
  
  inline def crop(options: Options, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("crop")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  object identify {
    
    inline def apply(path: String, callback: js.Function2[/* err */ Error, /* features */ Features, Unit]): ChildProcess = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
    inline def apply(path: js.Array[js.Any], callback: js.Function2[/* err */ Error, /* result */ String, Unit]): ChildProcess = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
    
    @JSImport("imagemagick", "identify")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("imagemagick", "identify.path")
    @js.native
    def path: String = js.native
    inline def path_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
  }
  
  inline def readMetadata(path: String, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("readMetadata")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  inline def resize(options: Options, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  inline def resizeArgs(options: Options): ResizeArgs_ = ^.asInstanceOf[js.Dynamic].applyDynamic("resizeArgs")(options.asInstanceOf[js.Any]).asInstanceOf[ResizeArgs_]
  
  trait Features extends StObject {
    
    var depth: js.UndefOr[Double] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Features {
    
    inline def apply(): Features = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Features]
    }
    
    extension [Self <: Features](x: Self) {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    //: false,
    var colorspace: js.UndefOr[js.Any] = js.undefined
    
    //: 0.2,
    var customArgs: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    //: null,
    var dstPath: js.UndefOr[String] = js.undefined
    
    //: true,
    var filter: js.UndefOr[String] = js.undefined
    
    //: 0.8,
    var format: js.UndefOr[String] = js.undefined
    
    //: 0,
    var height: js.UndefOr[Double] = js.undefined
    
    //: 'jpg',
    var progressive: js.UndefOr[Boolean] = js.undefined
    
    //: null,
    var quality: js.UndefOr[Double] = js.undefined
    
    //: 'Lagrange',
    var sharpening: js.UndefOr[Double] = js.undefined
    
    //: null,
    var srcData: js.UndefOr[String] = js.undefined
    
    //: null,
    var srcFormat: js.UndefOr[String] = js.undefined
    
    var srcPath: js.UndefOr[String] = js.undefined
    
    //: 0,
    var strip: js.UndefOr[Boolean] = js.undefined
    
    //: [],
    var timeout: js.UndefOr[Double] = js.undefined
    
    //: null,
    var width: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setColorspace(value: js.Any): Self = StObject.set(x, "colorspace", value.asInstanceOf[js.Any])
      
      inline def setColorspaceUndefined: Self = StObject.set(x, "colorspace", js.undefined)
      
      inline def setCustomArgs(value: js.Array[js.Any]): Self = StObject.set(x, "customArgs", value.asInstanceOf[js.Any])
      
      inline def setCustomArgsUndefined: Self = StObject.set(x, "customArgs", js.undefined)
      
      inline def setCustomArgsVarargs(value: js.Any*): Self = StObject.set(x, "customArgs", js.Array(value :_*))
      
      inline def setDstPath(value: String): Self = StObject.set(x, "dstPath", value.asInstanceOf[js.Any])
      
      inline def setDstPathUndefined: Self = StObject.set(x, "dstPath", js.undefined)
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setProgressive(value: Boolean): Self = StObject.set(x, "progressive", value.asInstanceOf[js.Any])
      
      inline def setProgressiveUndefined: Self = StObject.set(x, "progressive", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setSharpening(value: Double): Self = StObject.set(x, "sharpening", value.asInstanceOf[js.Any])
      
      inline def setSharpeningUndefined: Self = StObject.set(x, "sharpening", js.undefined)
      
      inline def setSrcData(value: String): Self = StObject.set(x, "srcData", value.asInstanceOf[js.Any])
      
      inline def setSrcDataUndefined: Self = StObject.set(x, "srcData", js.undefined)
      
      inline def setSrcFormat(value: String): Self = StObject.set(x, "srcFormat", value.asInstanceOf[js.Any])
      
      inline def setSrcFormatUndefined: Self = StObject.set(x, "srcFormat", js.undefined)
      
      inline def setSrcPath(value: String): Self = StObject.set(x, "srcPath", value.asInstanceOf[js.Any])
      
      inline def setSrcPathUndefined: Self = StObject.set(x, "srcPath", js.undefined)
      
      inline def setStrip(value: Boolean): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      inline def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ResizeArgs_ extends StObject {
    
    var args: js.Array[String]
    
    var opt: Options
  }
  object ResizeArgs_ {
    
    inline def apply(args: js.Array[String], opt: Options): ResizeArgs_ = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], opt = opt.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeArgs_]
    }
    
    extension [Self <: ResizeArgs_](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setOpt(value: Options): Self = StObject.set(x, "opt", value.asInstanceOf[js.Any])
    }
  }
}
