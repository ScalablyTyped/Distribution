package typings.gorillaEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowMultiple extends StObject {
  
  var allowMultiple: js.UndefOr[Boolean] = js.undefined
  
  var allowedExtensions: js.UndefOr[String] = js.undefined
  
  var browseDirectory: js.UndefOr[Boolean] = js.undefined
  
  var defaultLocation: js.UndefOr[String] = js.undefined
  
  var hint: js.UndefOr[String] = js.undefined
  
  var saveDialog: js.UndefOr[Boolean] = js.undefined
  
  var warnOnOverwrite: js.UndefOr[Boolean] = js.undefined
}
object AllowMultiple {
  
  inline def apply(): AllowMultiple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowMultiple]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowMultiple] (val x: Self) extends AnyVal {
    
    inline def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleUndefined: Self = StObject.set(x, "allowMultiple", js.undefined)
    
    inline def setAllowedExtensions(value: String): Self = StObject.set(x, "allowedExtensions", value.asInstanceOf[js.Any])
    
    inline def setAllowedExtensionsUndefined: Self = StObject.set(x, "allowedExtensions", js.undefined)
    
    inline def setBrowseDirectory(value: Boolean): Self = StObject.set(x, "browseDirectory", value.asInstanceOf[js.Any])
    
    inline def setBrowseDirectoryUndefined: Self = StObject.set(x, "browseDirectory", js.undefined)
    
    inline def setDefaultLocation(value: String): Self = StObject.set(x, "defaultLocation", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocationUndefined: Self = StObject.set(x, "defaultLocation", js.undefined)
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setSaveDialog(value: Boolean): Self = StObject.set(x, "saveDialog", value.asInstanceOf[js.Any])
    
    inline def setSaveDialogUndefined: Self = StObject.set(x, "saveDialog", js.undefined)
    
    inline def setWarnOnOverwrite(value: Boolean): Self = StObject.set(x, "warnOnOverwrite", value.asInstanceOf[js.Any])
    
    inline def setWarnOnOverwriteUndefined: Self = StObject.set(x, "warnOnOverwrite", js.undefined)
  }
}
