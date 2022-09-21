package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyInventoryFilter extends StObject {
  
  /**
    * Required. The OS short name
    */
  var osShortName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The OS version Prefix matches are supported if asterisk(*) is provided as the last character. For example, to match all versions with a major version of `7`, specify the following value for this field `7.*` An empty string matches all OS versions.
    */
  var osVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaOSPolicyInventoryFilter {
  
  inline def apply(): SchemaOSPolicyInventoryFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyInventoryFilter]
  }
  
  extension [Self <: SchemaOSPolicyInventoryFilter](x: Self) {
    
    inline def setOsShortName(value: String): Self = StObject.set(x, "osShortName", value.asInstanceOf[js.Any])
    
    inline def setOsShortNameNull: Self = StObject.set(x, "osShortName", null)
    
    inline def setOsShortNameUndefined: Self = StObject.set(x, "osShortName", js.undefined)
    
    inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionNull: Self = StObject.set(x, "osVersion", null)
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
  }
}
