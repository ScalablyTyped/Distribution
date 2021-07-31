package typings.inboxsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// // Undocummented
// var IMPL_VERSION: string;
// var LOADER_VERSION: string;
// var destroyed: boolean; //: false
// var Logger: {
//   error: () => any;
//   event: () => any;
// };
trait LoadOptions extends StObject {
  
  var appIconUrl: js.UndefOr[String] = js.undefined
  
  var appName: js.UndefOr[String] = js.undefined
  
  var suppressAddonTitle: js.UndefOr[String] = js.undefined
}
object LoadOptions {
  
  @scala.inline
  def apply(): LoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadOptions]
  }
  
  @scala.inline
  implicit class LoadOptionsMutableBuilder[Self <: LoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppIconUrl(value: String): Self = StObject.set(x, "appIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIconUrlUndefined: Self = StObject.set(x, "appIconUrl", js.undefined)
    
    @scala.inline
    def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    @scala.inline
    def setSuppressAddonTitle(value: String): Self = StObject.set(x, "suppressAddonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressAddonTitleUndefined: Self = StObject.set(x, "suppressAddonTitle", js.undefined)
  }
}
