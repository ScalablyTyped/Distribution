package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdBlockingConfiguration extends StObject {
  
  /**
    * Whether this campaign has enabled ad blocking. When true, ad blocking is enabled for placements in the campaign, but this may be overridden by site and placement settings. When false, ad blocking is disabled for all placements under the campaign, regardless of site and placement settings.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAdBlockingConfiguration {
  
  inline def apply(): SchemaAdBlockingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdBlockingConfiguration]
  }
  
  extension [Self <: SchemaAdBlockingConfiguration](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
