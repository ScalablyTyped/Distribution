package typings.jsreportAssets

import typings.jsreportCore.mod.ExtensionDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsreport-assets", JSImport.Namespace)
  @js.native
  def apply(): ExtensionDefinition = js.native
  @JSImport("jsreport-assets", JSImport.Namespace)
  @js.native
  def apply(cfg: Configuration): ExtensionDefinition = js.native
  
  @js.native
  trait Configuration extends StObject {
    
    var allowedFiles: js.UndefOr[String] = js.native
    
    var publicAccessEnabled: js.UndefOr[Boolean] = js.native
    
    var rootUrlForLinks: js.UndefOr[String] = js.native
    
    var searchOnDiskIfNotFoundInStore: js.UndefOr[Boolean] = js.native
  }
  object Configuration {
    
    @scala.inline
    def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedFiles(value: String): Self = StObject.set(x, "allowedFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedFilesUndefined: Self = StObject.set(x, "allowedFiles", js.undefined)
      
      @scala.inline
      def setPublicAccessEnabled(value: Boolean): Self = StObject.set(x, "publicAccessEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicAccessEnabledUndefined: Self = StObject.set(x, "publicAccessEnabled", js.undefined)
      
      @scala.inline
      def setRootUrlForLinks(value: String): Self = StObject.set(x, "rootUrlForLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUrlForLinksUndefined: Self = StObject.set(x, "rootUrlForLinks", js.undefined)
      
      @scala.inline
      def setSearchOnDiskIfNotFoundInStore(value: Boolean): Self = StObject.set(x, "searchOnDiskIfNotFoundInStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchOnDiskIfNotFoundInStoreUndefined: Self = StObject.set(x, "searchOnDiskIfNotFoundInStore", js.undefined)
    }
  }
}
