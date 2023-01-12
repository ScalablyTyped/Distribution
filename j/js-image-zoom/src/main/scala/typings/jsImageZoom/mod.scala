package typings.jsImageZoom

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-image-zoom", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ImageZoom {
    /**
      * Creates an instance of ImageZoom.
      * @param container container DOM element, which contains an image to be zoomed
      * @param opts js-image-zoom options
      */
    def this(container: HTMLElement, opts: Options) = this()
  }
  
  trait ImageZoom extends StObject
  
  trait Offset extends StObject {
    
    var horizontal: js.UndefOr[Double] = js.undefined
    
    var vertical: js.UndefOr[Double] = js.undefined
  }
  object Offset {
    
    inline def apply(): Offset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      inline def setHorizontal(value: Double): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setVertical(value: Double): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * height of the source image
      * @default 0
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * url of the source image. Provided if container does not contain img element as a tag
      */
    var img: js.UndefOr[String] = js.undefined
    
    /**
      * Zoomed image offset
      */
    var offset: js.UndefOr[Offset] = js.undefined
    
    /**
      * zoom scale. if not provided, scale is calculated as natural image size / image size,
      * provided in params (optional if zoomWidth param is provided)
      */
    var scale: js.UndefOr[Double] = js.undefined
    
    /**
      * width of the source image
      * @default 0
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * DOM node reference where zoomedImage will be appended to (default to the container element of image)
      */
    var zoomContainer: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * custom style applied to to zoom lents (i.e. 'opacity: 0.1;background-color: white;')
      */
    var zoomLensStyle: js.UndefOr[String] = js.undefined
    
    /**
      * position of zoomed image.
      * @default 'right'
      */
    var zoomPosition: js.UndefOr[ZoomPosition] = js.undefined
    
    /**
      * custom style applied to the zoomed image (i.e. 'opacity: 0.1;background-color: white;')
      */
    var zoomStyle: js.UndefOr[String] = js.undefined
    
    /**
      * width of the zoomed image. Zoomed image height equals source image height
      */
    var zoomWidth: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZoomContainer(value: HTMLElement): Self = StObject.set(x, "zoomContainer", value.asInstanceOf[js.Any])
      
      inline def setZoomContainerUndefined: Self = StObject.set(x, "zoomContainer", js.undefined)
      
      inline def setZoomLensStyle(value: String): Self = StObject.set(x, "zoomLensStyle", value.asInstanceOf[js.Any])
      
      inline def setZoomLensStyleUndefined: Self = StObject.set(x, "zoomLensStyle", js.undefined)
      
      inline def setZoomPosition(value: ZoomPosition): Self = StObject.set(x, "zoomPosition", value.asInstanceOf[js.Any])
      
      inline def setZoomPositionUndefined: Self = StObject.set(x, "zoomPosition", js.undefined)
      
      inline def setZoomStyle(value: String): Self = StObject.set(x, "zoomStyle", value.asInstanceOf[js.Any])
      
      inline def setZoomStyleUndefined: Self = StObject.set(x, "zoomStyle", js.undefined)
      
      inline def setZoomWidth(value: Double): Self = StObject.set(x, "zoomWidth", value.asInstanceOf[js.Any])
      
      inline def setZoomWidthUndefined: Self = StObject.set(x, "zoomWidth", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsImageZoom.jsImageZoomStrings.top
    - typings.jsImageZoom.jsImageZoomStrings.left
    - typings.jsImageZoom.jsImageZoomStrings.bottom
    - typings.jsImageZoom.jsImageZoomStrings.right
    - typings.jsImageZoom.jsImageZoomStrings.original
  */
  trait ZoomPosition extends StObject
  object ZoomPosition {
    
    inline def bottom: typings.jsImageZoom.jsImageZoomStrings.bottom = "bottom".asInstanceOf[typings.jsImageZoom.jsImageZoomStrings.bottom]
    
    inline def left: typings.jsImageZoom.jsImageZoomStrings.left = "left".asInstanceOf[typings.jsImageZoom.jsImageZoomStrings.left]
    
    inline def original: typings.jsImageZoom.jsImageZoomStrings.original = "original".asInstanceOf[typings.jsImageZoom.jsImageZoomStrings.original]
    
    inline def right: typings.jsImageZoom.jsImageZoomStrings.right = "right".asInstanceOf[typings.jsImageZoom.jsImageZoomStrings.right]
    
    inline def top: typings.jsImageZoom.jsImageZoomStrings.top = "top".asInstanceOf[typings.jsImageZoom.jsImageZoomStrings.top]
  }
}
