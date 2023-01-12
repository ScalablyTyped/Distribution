package typings.jsreportAssets

import typings.jsreportCore.mod.ExtensionDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExtensionDefinition]
  inline def apply(cfg: Configuration): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply(cfg.asInstanceOf[js.Any]).asInstanceOf[ExtensionDefinition]
  
  @JSImport("jsreport-assets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Configuration extends StObject {
    
    var allowedFiles: js.UndefOr[String] = js.undefined
    
    var publicAccessEnabled: js.UndefOr[Boolean] = js.undefined
    
    var rootUrlForLinks: js.UndefOr[String] = js.undefined
    
    var searchOnDiskIfNotFoundInStore: js.UndefOr[Boolean] = js.undefined
  }
  object Configuration {
    
    inline def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      inline def setAllowedFiles(value: String): Self = StObject.set(x, "allowedFiles", value.asInstanceOf[js.Any])
      
      inline def setAllowedFilesUndefined: Self = StObject.set(x, "allowedFiles", js.undefined)
      
      inline def setPublicAccessEnabled(value: Boolean): Self = StObject.set(x, "publicAccessEnabled", value.asInstanceOf[js.Any])
      
      inline def setPublicAccessEnabledUndefined: Self = StObject.set(x, "publicAccessEnabled", js.undefined)
      
      inline def setRootUrlForLinks(value: String): Self = StObject.set(x, "rootUrlForLinks", value.asInstanceOf[js.Any])
      
      inline def setRootUrlForLinksUndefined: Self = StObject.set(x, "rootUrlForLinks", js.undefined)
      
      inline def setSearchOnDiskIfNotFoundInStore(value: Boolean): Self = StObject.set(x, "searchOnDiskIfNotFoundInStore", value.asInstanceOf[js.Any])
      
      inline def setSearchOnDiskIfNotFoundInStoreUndefined: Self = StObject.set(x, "searchOnDiskIfNotFoundInStore", js.undefined)
    }
  }
}
