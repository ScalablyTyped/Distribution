package typings.laravelVapor

import org.scalablytyped.runtime.Shortcut
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("laravel-vapor", JSImport.Namespace)
  @js.native
  val ^ : Vapor = js.native
  
  @js.native
  trait Vapor extends StObject {
    
    def asset(path: String): String = js.native
    
    def store(file: File): js.Promise[Any] = js.native
    def store(file: File, options: VaporStoreOptions): js.Promise[Any] = js.native
    
    def withBaseAssetUrl(): Unit = js.native
    def withBaseAssetUrl(url: String): Unit = js.native
  }
  
  trait VaporStoreOptions extends StObject {
    
    var baseURL: js.UndefOr[String] = js.undefined
    
    var bucket: js.UndefOr[String] = js.undefined
    
    var cancelToken: js.UndefOr[String] = js.undefined
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var expires: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[Any] = js.undefined
    
    var options: js.UndefOr[Any] = js.undefined
    
    var progress: js.UndefOr[js.Function1[/* value */ Double, js.UndefOr[Unit]]] = js.undefined
    
    var visibility: js.UndefOr[String] = js.undefined
  }
  object VaporStoreOptions {
    
    inline def apply(): VaporStoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VaporStoreOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VaporStoreOptions] (val x: Self) extends AnyVal {
      
      inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      inline def setCancelToken(value: String): Self = StObject.set(x, "cancelToken", value.asInstanceOf[js.Any])
      
      inline def setCancelTokenUndefined: Self = StObject.set(x, "cancelToken", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setProgress(value: /* value */ Double => js.UndefOr[Unit]): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    }
  }
  
  type _To = Vapor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Vapor = ^
}
