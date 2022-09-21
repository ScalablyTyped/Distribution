package typings.html2canvas

import typings.html2canvas.contextMod.Context
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheStorageMod {
  
  @JSImport("html2canvas/dist/types/core/cache-storage", "Cache")
  @js.native
  open class Cache protected () extends StObject {
    def this(context: Context, _options: ResourceOptions) = this()
    
    /* private */ val _cache: Any = js.native
    
    /* private */ val _options: Any = js.native
    
    def addImage(src: String): js.Promise[Unit] = js.native
    
    /* private */ val context: Any = js.native
    
    /* private */ var has: Any = js.native
    
    def keys(): js.Promise[js.Array[String]] = js.native
    
    /* private */ var loadImage: Any = js.native
    
    def `match`(src: String): js.Promise[Any] = js.native
    
    /* private */ var proxy: Any = js.native
  }
  
  @JSImport("html2canvas/dist/types/core/cache-storage", "CacheStorage")
  @js.native
  open class CacheStorage () extends StObject
  /* static members */
  object CacheStorage {
    
    @JSImport("html2canvas/dist/types/core/cache-storage", "CacheStorage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("html2canvas/dist/types/core/cache-storage", "CacheStorage._link")
    @js.native
    def _link: Any = js.native
    inline def _link_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_link")(x.asInstanceOf[js.Any])
    
    @JSImport("html2canvas/dist/types/core/cache-storage", "CacheStorage._origin")
    @js.native
    def _origin: Any = js.native
    inline def _origin_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_origin")(x.asInstanceOf[js.Any])
    
    inline def getOrigin(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrigin")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isSameOrigin(src: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSameOrigin")(src.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def setContext(window: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait ResourceOptions extends StObject {
    
    var allowTaint: Boolean
    
    var imageTimeout: Double
    
    var proxy: js.UndefOr[String] = js.undefined
    
    var useCORS: Boolean
  }
  object ResourceOptions {
    
    inline def apply(allowTaint: Boolean, imageTimeout: Double, useCORS: Boolean): ResourceOptions = {
      val __obj = js.Dynamic.literal(allowTaint = allowTaint.asInstanceOf[js.Any], imageTimeout = imageTimeout.asInstanceOf[js.Any], useCORS = useCORS.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceOptions]
    }
    
    extension [Self <: ResourceOptions](x: Self) {
      
      inline def setAllowTaint(value: Boolean): Self = StObject.set(x, "allowTaint", value.asInstanceOf[js.Any])
      
      inline def setImageTimeout(value: Double): Self = StObject.set(x, "imageTimeout", value.asInstanceOf[js.Any])
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setUseCORS(value: Boolean): Self = StObject.set(x, "useCORS", value.asInstanceOf[js.Any])
    }
  }
}
