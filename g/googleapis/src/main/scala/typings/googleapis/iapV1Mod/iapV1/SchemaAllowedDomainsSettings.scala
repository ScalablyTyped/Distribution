package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAllowedDomainsSettings extends StObject {
  
  /**
    * List of trusted domains.
    */
  var domains: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Configuration for customers to opt in for the feature.
    */
  var enable: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAllowedDomainsSettings {
  
  inline def apply(): SchemaAllowedDomainsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllowedDomainsSettings]
  }
  
  extension [Self <: SchemaAllowedDomainsSettings](x: Self) {
    
    inline def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsNull: Self = StObject.set(x, "domains", null)
    
    inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    inline def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value*))
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableNull: Self = StObject.set(x, "enable", null)
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
  }
}
