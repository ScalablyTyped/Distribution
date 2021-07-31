package typings.mapboxSpritezero

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxSpritezero.anon.Id
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/spritezero", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def extractMetadata(img: ImageObject, callback: ExtractCallback): Metadata = (^.asInstanceOf[js.Dynamic].applyDynamic("extractMetadata")(img.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Metadata]
  
  @scala.inline
  def generateImage(layout: ImgLayout, callback: GenerateImageCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateImage")(layout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def generateLayout(options: GenerateLayoutOptions, callback: GenerateLayoutCallback): DataLayout | ImgLayout = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLayout")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[DataLayout | ImgLayout]
  
  @scala.inline
  def strongRound(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("strongRound")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def strongRound(value: Double, precision: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("strongRound")(value.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def validateMetadata(img: ImageSize, metadata: Metadata): Null | Error = (^.asInstanceOf[js.Dynamic].applyDynamic("validateMetadata")(img.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Null | Error]
  
  type DataLayout = StringDictionary[StructuredData]
  
  type ExtractCallback = js.Function2[/* err */ Error | Null, /* metadata */ Metadata, Unit]
  
  type GenerateImageCallback = js.Function2[/* err */ Error | Null, /* img */ Buffer, Unit]
  
  type GenerateLayoutCallback = js.Function2[/* err */ Error | Null, /* layout */ DataLayout | ImgLayout, Unit]
  
  trait GenerateLayoutOptions extends StObject {
    
    /** If true, generate DataLayout ; if false, generate ImgLayout */
    var format: Boolean
    
    var imgs: js.Array[Id]
    
    /** overrides the max_size in mapnik */
    var maxIconSize: js.UndefOr[Double] = js.undefined
    
    /** Ratio of a 72dpi screen pixel to the destination pixel density */
    var pixelRatio: Double
    
    /** filters out icons that mapnik says are too big */
    var removeOversizedIcons: js.UndefOr[Boolean] = js.undefined
  }
  object GenerateLayoutOptions {
    
    @scala.inline
    def apply(format: Boolean, imgs: js.Array[Id], pixelRatio: Double): GenerateLayoutOptions = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], imgs = imgs.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateLayoutOptions]
    }
    
    @scala.inline
    implicit class GenerateLayoutOptionsMutableBuilder[Self <: GenerateLayoutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgs(value: js.Array[Id]): Self = StObject.set(x, "imgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgsVarargs(value: Id*): Self = StObject.set(x, "imgs", js.Array(value :_*))
      
      @scala.inline
      def setMaxIconSize(value: Double): Self = StObject.set(x, "maxIconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxIconSizeUndefined: Self = StObject.set(x, "maxIconSize", js.undefined)
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveOversizedIcons(value: Boolean): Self = StObject.set(x, "removeOversizedIcons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveOversizedIconsUndefined: Self = StObject.set(x, "removeOversizedIcons", js.undefined)
    }
  }
  
  trait ImageItem
    extends StObject
       with ImageSize {
    
    var buffer: String
    
    var x: Double
    
    var y: Double
  }
  object ImageItem {
    
    @scala.inline
    def apply(buffer: String, height: Double, width: Double, x: Double, y: Double): ImageItem = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageItem]
    }
    
    @scala.inline
    implicit class ImageItemMutableBuilder[Self <: ImageItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: String): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImageObject extends StObject {
    
    /** Ratio of a 72dpi screen pixel to the destination pixel density */
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    /** A string of the SVG. */
    var svg: js.UndefOr[Buffer | String] = js.undefined
  }
  object ImageObject {
    
    @scala.inline
    def apply(): ImageObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageObject]
    }
    
    @scala.inline
    implicit class ImageObjectMutableBuilder[Self <: ImageObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      @scala.inline
      def setSvg(value: Buffer | String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    }
  }
  
  trait ImageSize extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object ImageSize {
    
    @scala.inline
    def apply(height: Double, width: Double): ImageSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageSize]
    }
    
    @scala.inline
    implicit class ImageSizeMutableBuilder[Self <: ImageSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImgLayout extends StObject {
    
    var height: Double
    
    var items: js.Array[ImageItem]
    
    var width: Double
  }
  object ImgLayout {
    
    @scala.inline
    def apply(height: Double, items: js.Array[ImageItem], width: Double): ImgLayout = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImgLayout]
    }
    
    @scala.inline
    implicit class ImgLayoutMutableBuilder[Self <: ImgLayout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[ImageItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: ImageItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type Metadata = StringDictionary[js.Array[Double | js.Array[Double]]]
  
  trait StructuredData extends StObject {
    
    var height: Double
    
    var pixelRatio: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object StructuredData {
    
    @scala.inline
    def apply(height: Double, pixelRatio: Double, width: Double, x: Double, y: Double): StructuredData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[StructuredData]
    }
    
    @scala.inline
    implicit class StructuredDataMutableBuilder[Self <: StructuredData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
