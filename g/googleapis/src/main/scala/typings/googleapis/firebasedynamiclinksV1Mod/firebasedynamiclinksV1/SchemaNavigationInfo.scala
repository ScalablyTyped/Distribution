package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNavigationInfo extends StObject {
  
  /**
    * If this option is on, FDL click will be forced to redirect rather than show an interstitial page.
    */
  var enableForcedRedirect: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaNavigationInfo {
  
  inline def apply(): SchemaNavigationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNavigationInfo]
  }
  
  extension [Self <: SchemaNavigationInfo](x: Self) {
    
    inline def setEnableForcedRedirect(value: Boolean): Self = StObject.set(x, "enableForcedRedirect", value.asInstanceOf[js.Any])
    
    inline def setEnableForcedRedirectNull: Self = StObject.set(x, "enableForcedRedirect", null)
    
    inline def setEnableForcedRedirectUndefined: Self = StObject.set(x, "enableForcedRedirect", js.undefined)
  }
}
