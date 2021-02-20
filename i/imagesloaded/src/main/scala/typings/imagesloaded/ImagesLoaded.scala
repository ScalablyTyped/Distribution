package typings.imagesloaded

import org.scalablytyped.runtime.Instantiable2
import typings.imagesloaded.imagesloadedBooleans.`true`
import typings.std.Element
import typings.std.HTMLImageElement
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImagesLoaded {
  
  type ElementSelector = Element | NodeList | js.Array[Element] | String
  
  @js.native
  trait ImagesLoaded
    extends Instantiable2[
          /* elem */ ElementSelector, 
          /* callback */ ImagesLoadedCallback, 
          typings.imagesloaded.ImagesLoaded.ImagesLoaded
        ] {
    
    var images: js.Array[LoadingImage] = js.native
    
    def off(event: String, listener: ImagesLoadedListener): Unit = js.native
    
    // event listeners
    def on(event: String, listener: ImagesLoadedListener): Unit = js.native
    
    def once(event: String, listener: ImagesLoadedListener): Unit = js.native
  }
  
  type ImagesLoadedCallback = js.Function1[/* instance */ js.UndefOr[typings.imagesloaded.ImagesLoaded.ImagesLoaded], Unit]
  
  @js.native
  trait ImagesLoadedConstructor extends StObject {
    
    def apply(elem: ElementSelector): typings.imagesloaded.ImagesLoaded.ImagesLoaded = js.native
    def apply(elem: ElementSelector, callback: ImagesLoadedCallback): typings.imagesloaded.ImagesLoaded.ImagesLoaded = js.native
    /**
      * Creates a new ImagesLoaded object with the provided callback
      * @param elem Element, NodeList, Element array, or selector string for images to watch
      * @param options object that can tell imagesloaded to watch background images as well
      * @param callback function triggered after all images have been loaded
      */
    def apply(elem: ElementSelector, options: ImagesLoadedOptions): typings.imagesloaded.ImagesLoaded.ImagesLoaded = js.native
    def apply(elem: ElementSelector, options: ImagesLoadedOptions, callback: ImagesLoadedCallback): typings.imagesloaded.ImagesLoaded.ImagesLoaded = js.native
  }
  
  type ImagesLoadedListener = js.Function2[
    /* instance */ typings.imagesloaded.ImagesLoaded.ImagesLoaded, 
    /* image */ js.UndefOr[LoadingImage], 
    Unit
  ]
  
  @js.native
  trait ImagesLoadedOptions extends StObject {
    
    var background: `true` | String = js.native
  }
  object ImagesLoadedOptions {
    
    @scala.inline
    def apply(background: `true` | String): ImagesLoadedOptions = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImagesLoadedOptions]
    }
    
    @scala.inline
    implicit class ImagesLoadedOptionsMutableBuilder[Self <: ImagesLoadedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: `true` | String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    }
  }
  
  /** interface for an image currently loading or completed */
  @js.native
  trait LoadingImage extends StObject {
    
    var img: HTMLImageElement = js.native
    
    var isLoaded: Boolean = js.native
  }
  object LoadingImage {
    
    @scala.inline
    def apply(img: HTMLImageElement, isLoaded: Boolean): LoadingImage = {
      val __obj = js.Dynamic.literal(img = img.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadingImage]
    }
    
    @scala.inline
    implicit class LoadingImageMutableBuilder[Self <: LoadingImage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImg(value: HTMLImageElement): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoaded(value: Boolean): Self = StObject.set(x, "isLoaded", value.asInstanceOf[js.Any])
    }
  }
}
