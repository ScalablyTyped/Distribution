package typings.jqueryGalleria

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GalleriaJS {
  
  trait GalleriaEntry extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var image: js.UndefOr[String] = js.undefined
    
    var thumbnail: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object GalleriaEntry {
    
    @scala.inline
    def apply(): GalleriaEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GalleriaEntry]
    }
    
    @scala.inline
    implicit class GalleriaEntryMutableBuilder[Self <: GalleriaEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait GalleriaFactory extends StObject {
    
    def configure(options: GalleriaOptions): GalleriaFactory = js.native
    
    def load(data: js.Array[GalleriaEntry]): GalleriaFactory = js.native
    
    def loadTheme(url: String): GalleriaFactory = js.native
    
    def ready(method: js.Function0[js.Any]): Unit = js.native
    
    def refreshImage(): GalleriaFactory = js.native
    
    def resize(): GalleriaFactory = js.native
    
    def run(): GalleriaFactory = js.native
    def run(selector: String): GalleriaFactory = js.native
    def run(selector: String, options: GalleriaOptions): GalleriaFactory = js.native
    
    def setOptions(options: GalleriaOptions): GalleriaFactory = js.native
  }
  
  trait GalleriaOptions extends StObject {
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var dataSource: js.Array[GalleriaEntry]
    
    var lightbox: js.UndefOr[Boolean] = js.undefined
  }
  object GalleriaOptions {
    
    @scala.inline
    def apply(dataSource: js.Array[GalleriaEntry]): GalleriaOptions = {
      val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
      __obj.asInstanceOf[GalleriaOptions]
    }
    
    @scala.inline
    implicit class GalleriaOptionsMutableBuilder[Self <: GalleriaOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Array[GalleriaEntry]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceVarargs(value: GalleriaEntry*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
      
      @scala.inline
      def setLightbox(value: Boolean): Self = StObject.set(x, "lightbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightboxUndefined: Self = StObject.set(x, "lightbox", js.undefined)
    }
  }
}
