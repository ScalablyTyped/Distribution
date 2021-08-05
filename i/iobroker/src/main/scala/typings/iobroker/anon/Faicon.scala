package typings.iobroker.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Faicon extends StObject {
  
  /** Icon name for FontAwesome */
  var `fa-icon`: js.UndefOr[String] = js.undefined
  
  /** If true, the Tab is not reloaded when the configuration changes */
  var ignoreConfigUpdate: js.UndefOr[Boolean] = js.undefined
  
  /** Which URL should be loaded in the tab. Supports placeholders like http://%ip%:%port% */
  var link: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  /** If true, only one instance of this tab will be created for all instances */
  var singleton: js.UndefOr[Boolean] = js.undefined
}
object Faicon {
  
  inline def apply(): Faicon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Faicon]
  }
  
  extension [Self <: Faicon](x: Self) {
    
    inline def `setFa-icon`(value: String): Self = StObject.set(x, "fa-icon", value.asInstanceOf[js.Any])
    
    inline def `setFa-iconUndefined`: Self = StObject.set(x, "fa-icon", js.undefined)
    
    inline def setIgnoreConfigUpdate(value: Boolean): Self = StObject.set(x, "ignoreConfigUpdate", value.asInstanceOf[js.Any])
    
    inline def setIgnoreConfigUpdateUndefined: Self = StObject.set(x, "ignoreConfigUpdate", js.undefined)
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSingleton(value: Boolean): Self = StObject.set(x, "singleton", value.asInstanceOf[js.Any])
    
    inline def setSingletonUndefined: Self = StObject.set(x, "singleton", js.undefined)
  }
}
