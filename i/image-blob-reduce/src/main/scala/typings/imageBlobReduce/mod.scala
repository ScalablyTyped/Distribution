package typings.imageBlobReduce

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.pica.mod.Pica
import typings.pica.mod.PicaOptions
import typings.pica.mod.PicaStatic
import typings.std.Blob
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("image-blob-reduce", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ImageBlobReduce {
    def this(options: Options) = this()
  }
  @JSImport("image-blob-reduce", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ImageBlobReduceStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("image-blob-reduce", "pica")
  @js.native
  open class pica ()
    extends StObject
       with Pica {
    def this(config: PicaOptions) = this()
  }
  
  trait Env
    extends StObject
       with InternalProperties {
    
    var blob: Blob
    
    var opts: ResizeOptions
  }
  object Env {
    
    inline def apply(
      blob: Blob,
      image: HTMLImageElement,
      image_url: String,
      opts: ResizeOptions,
      scale_factor: Double,
      transform_height: Double,
      transform_width: Double
    ): Env = {
      val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], scale_factor = scale_factor.asInstanceOf[js.Any], transform_height = transform_height.asInstanceOf[js.Any], transform_width = transform_width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Env]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Env] (val x: Self) extends AnyVal {
      
      inline def setBlob(value: Blob): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
      
      inline def setOpts(value: ResizeOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ImageBlobReduce extends StObject {
    
    def after(methodName: MethodNames, callback: js.Function1[/* env */ Env, js.Promise[Env]]): Unit = js.native
    
    def before(methodName: MethodNames, callback: js.Function1[/* env */ Env, js.Promise[Env]]): Unit = js.native
    
    def init(): Unit = js.native
    
    def toBlob(blob: Blob): js.Promise[Blob] = js.native
    def toBlob(blob: Blob, options: ResizeOptions): js.Promise[Blob] = js.native
    
    def toCanvas(blob: Blob): js.Promise[HTMLCanvasElement] = js.native
    def toCanvas(blob: Blob, options: ResizeOptions): js.Promise[HTMLCanvasElement] = js.native
    
    def use(plugin: js.Function1[/* args */ js.Array[Any], Any], args: Any*): ImageBlobReduce = js.native
  }
  
  @js.native
  trait ImageBlobReduceStatic
    extends StObject
       with Instantiable0[ImageBlobReduce]
       with Instantiable1[/* options */ Options, ImageBlobReduce] {
    
    def apply(): ImageBlobReduce = js.native
    def apply(options: Options): ImageBlobReduce = js.native
    
    def pica(): Pica = js.native
    def pica(config: PicaOptions): Pica = js.native
    @JSName("pica")
    var pica_Original: PicaStatic = js.native
  }
  
  trait InternalProperties extends StObject {
    
    var image: HTMLImageElement
    
    var image_url: String
    
    var out_blob: js.UndefOr[Blob] = js.undefined
    
    var out_canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
    
    var scale_factor: Double
    
    var transform_height: Double
    
    var transform_width: Double
  }
  object InternalProperties {
    
    inline def apply(
      image: HTMLImageElement,
      image_url: String,
      scale_factor: Double,
      transform_height: Double,
      transform_width: Double
    ): InternalProperties = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any], scale_factor = scale_factor.asInstanceOf[js.Any], transform_height = transform_height.asInstanceOf[js.Any], transform_width = transform_width.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalProperties] (val x: Self) extends AnyVal {
      
      inline def setImage(value: HTMLImageElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
      
      inline def setOut_blob(value: Blob): Self = StObject.set(x, "out_blob", value.asInstanceOf[js.Any])
      
      inline def setOut_blobUndefined: Self = StObject.set(x, "out_blob", js.undefined)
      
      inline def setOut_canvas(value: HTMLCanvasElement): Self = StObject.set(x, "out_canvas", value.asInstanceOf[js.Any])
      
      inline def setOut_canvasUndefined: Self = StObject.set(x, "out_canvas", js.undefined)
      
      inline def setScale_factor(value: Double): Self = StObject.set(x, "scale_factor", value.asInstanceOf[js.Any])
      
      inline def setTransform_height(value: Double): Self = StObject.set(x, "transform_height", value.asInstanceOf[js.Any])
      
      inline def setTransform_width(value: Double): Self = StObject.set(x, "transform_width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.imageBlobReduce.imageBlobReduceStrings._blob_to_image
    - typings.imageBlobReduce.imageBlobReduceStrings._calculate_size
    - typings.imageBlobReduce.imageBlobReduceStrings._transform
    - typings.imageBlobReduce.imageBlobReduceStrings._create_blob
    - typings.imageBlobReduce.imageBlobReduceStrings._cleanup
  */
  trait MethodNames extends StObject
  object MethodNames {
    
    inline def _blob_to_image: typings.imageBlobReduce.imageBlobReduceStrings._blob_to_image = "_blob_to_image".asInstanceOf[typings.imageBlobReduce.imageBlobReduceStrings._blob_to_image]
    
    inline def _calculate_size: typings.imageBlobReduce.imageBlobReduceStrings._calculate_size = "_calculate_size".asInstanceOf[typings.imageBlobReduce.imageBlobReduceStrings._calculate_size]
    
    inline def _cleanup: typings.imageBlobReduce.imageBlobReduceStrings._cleanup = "_cleanup".asInstanceOf[typings.imageBlobReduce.imageBlobReduceStrings._cleanup]
    
    inline def _create_blob: typings.imageBlobReduce.imageBlobReduceStrings._create_blob = "_create_blob".asInstanceOf[typings.imageBlobReduce.imageBlobReduceStrings._create_blob]
    
    inline def _transform: typings.imageBlobReduce.imageBlobReduceStrings._transform = "_transform".asInstanceOf[typings.imageBlobReduce.imageBlobReduceStrings._transform]
  }
  
  trait Options extends StObject {
    
    var pica: js.UndefOr[Pica] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setPica(value: Pica): Self = StObject.set(x, "pica", value.asInstanceOf[js.Any])
      
      inline def setPicaUndefined: Self = StObject.set(x, "pica", js.undefined)
    }
  }
  
  trait ResizeOptions extends StObject {
    
    var alpha: js.UndefOr[Boolean] = js.undefined
    
    var cancelToken: js.UndefOr[js.Promise[Any]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var unsharpAmount: js.UndefOr[Double] = js.undefined
    
    var unsharpRadius: js.UndefOr[Double] = js.undefined
    
    var unsharpThreshold: js.UndefOr[Double] = js.undefined
  }
  object ResizeOptions {
    
    inline def apply(): ResizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizeOptions] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setCancelToken(value: js.Promise[Any]): Self = StObject.set(x, "cancelToken", value.asInstanceOf[js.Any])
      
      inline def setCancelTokenUndefined: Self = StObject.set(x, "cancelToken", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setUnsharpAmount(value: Double): Self = StObject.set(x, "unsharpAmount", value.asInstanceOf[js.Any])
      
      inline def setUnsharpAmountUndefined: Self = StObject.set(x, "unsharpAmount", js.undefined)
      
      inline def setUnsharpRadius(value: Double): Self = StObject.set(x, "unsharpRadius", value.asInstanceOf[js.Any])
      
      inline def setUnsharpRadiusUndefined: Self = StObject.set(x, "unsharpRadius", js.undefined)
      
      inline def setUnsharpThreshold(value: Double): Self = StObject.set(x, "unsharpThreshold", value.asInstanceOf[js.Any])
      
      inline def setUnsharpThresholdUndefined: Self = StObject.set(x, "unsharpThreshold", js.undefined)
    }
  }
  
  type _To = js.Object & ImageBlobReduceStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & ImageBlobReduceStatic = ^
}
