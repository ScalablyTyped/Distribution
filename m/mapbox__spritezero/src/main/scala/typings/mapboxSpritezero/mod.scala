package typings.mapboxSpritezero

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxSpritezero.anon.Id
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/spritezero", "extractMetadata")
  @js.native
  def extractMetadata(img: ImageObject, callback: ExtractCallback): Metadata = js.native
  
  @JSImport("@mapbox/spritezero", "generateImage")
  @js.native
  def generateImage(layout: ImgLayout, callback: GenerateImageCallback): Unit = js.native
  
  @JSImport("@mapbox/spritezero", "generateLayout")
  @js.native
  def generateLayout(options: GenerateLayoutOptions, callback: GenerateLayoutCallback): DataLayout | ImgLayout = js.native
  
  @JSImport("@mapbox/spritezero", "strongRound")
  @js.native
  def strongRound(value: Double): Double = js.native
  @JSImport("@mapbox/spritezero", "strongRound")
  @js.native
  def strongRound(value: Double, precision: Double): Double = js.native
  
  @JSImport("@mapbox/spritezero", "validateMetadata")
  @js.native
  def validateMetadata(img: ImageSize, metadata: Metadata): Null | Error = js.native
  
  type DataLayout = StringDictionary[StructuredData]
  
  type ExtractCallback = js.Function2[/* err */ Error | Null, /* metadata */ Metadata, Unit]
  
  type GenerateImageCallback = js.Function2[/* err */ Error | Null, /* img */ Buffer, Unit]
  
  type GenerateLayoutCallback = js.Function2[/* err */ Error | Null, /* layout */ DataLayout | ImgLayout, Unit]
  
  @js.native
  trait GenerateLayoutOptions extends StObject {
    
    /** If true, generate DataLayout ; if false, generate ImgLayout */
    var format: Boolean = js.native
    
    var imgs: js.Array[Id] = js.native
    
    /** overrides the max_size in mapnik */
    var maxIconSize: js.UndefOr[Double] = js.native
    
    /** Ratio of a 72dpi screen pixel to the destination pixel density */
    var pixelRatio: Double = js.native
    
    /** filters out icons that mapnik says are too big */
    var removeOversizedIcons: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait ImageItem extends ImageSize {
    
    var buffer: String = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
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
  
  @js.native
  trait ImageObject extends StObject {
    
    /** Ratio of a 72dpi screen pixel to the destination pixel density */
    var pixelRatio: js.UndefOr[Double] = js.native
    
    /** A string of the SVG. */
    var svg: js.UndefOr[Buffer | String] = js.native
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
  
  @js.native
  trait ImageSize extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
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
  
  @js.native
  trait ImgLayout extends StObject {
    
    var height: Double = js.native
    
    var items: js.Array[ImageItem] = js.native
    
    var width: Double = js.native
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
  
  @js.native
  trait StructuredData extends StObject {
    
    var height: Double = js.native
    
    var pixelRatio: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
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
