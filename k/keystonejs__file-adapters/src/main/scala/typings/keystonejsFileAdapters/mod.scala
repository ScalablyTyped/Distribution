package typings.keystonejsFileAdapters

import typings.keystonejsFileAdapters.anon.Filename
import typings.keystonejsFileAdapters.anon.FilenameId
import typings.keystonejsFileAdapters.anon.FilenameString
import typings.keystonejsFileAdapters.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@keystonejs/file-adapters", "CloudinaryFileAdapter")
  @js.native
  open class CloudinaryFileAdapter protected () extends StObject {
    def this(options: CloudinaryFileAdapterConfig) = this()
    
    def publicUrl(params: FilenameString): String = js.native
    
    def save(params: Filename): js.Promise[FilenameId] = js.native
  }
  
  @JSImport("@keystonejs/file-adapters", "LocalFileAdapter")
  @js.native
  open class LocalFileAdapter protected () extends StObject {
    def this(options: LocalFileAdapterConfig) = this()
    
    def publicUrl(params: FilenameString): String = js.native
    
    def save(params: Filename): js.Promise[FilenameId] = js.native
  }
  
  trait CloudinaryFileAdapterConfig extends StObject {
    
    var apiKey: String
    
    var apiSecret: String
    
    var cloudName: String
    
    var folder: js.UndefOr[String] = js.undefined
  }
  object CloudinaryFileAdapterConfig {
    
    inline def apply(apiKey: String, apiSecret: String, cloudName: String): CloudinaryFileAdapterConfig = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], apiSecret = apiSecret.asInstanceOf[js.Any], cloudName = cloudName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudinaryFileAdapterConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloudinaryFileAdapterConfig] (val x: Self) extends AnyVal {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiSecret(value: String): Self = StObject.set(x, "apiSecret", value.asInstanceOf[js.Any])
      
      inline def setCloudName(value: String): Self = StObject.set(x, "cloudName", value.asInstanceOf[js.Any])
      
      inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    }
  }
  
  trait LocalFileAdapterConfig extends StObject {
    
    var getFilename: js.UndefOr[js.Function1[/* options */ Id, String]] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var src: String
  }
  object LocalFileAdapterConfig {
    
    inline def apply(src: String): LocalFileAdapterConfig = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalFileAdapterConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocalFileAdapterConfig] (val x: Self) extends AnyVal {
      
      inline def setGetFilename(value: /* options */ Id => String): Self = StObject.set(x, "getFilename", js.Any.fromFunction1(value))
      
      inline def setGetFilenameUndefined: Self = StObject.set(x, "getFilename", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
}
